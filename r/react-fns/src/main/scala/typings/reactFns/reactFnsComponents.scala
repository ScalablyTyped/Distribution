package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.scrollScrollMod.ScrollConfig
import typings.reactFns.scrollScrollMod.ScrollProps
import typings.reactFns.typesMod.SharedRenderProps
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeConfig
import typings.reactFns.windowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactFnsComponents extends reactFnsProps {
  @scala.inline
  def DeviceMotion: ComponentType[
    DeviceMotionProps[typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps]
  ] = js.constructorOf[typings.reactFns.mod.DeviceMotion].asInstanceOf[ComponentType[
    DeviceMotionProps[typings.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps]
  ]]
  @scala.inline
  def DeviceOrientation: ComponentType[
    DeviceOrientationProps[typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps]
  ] = js.constructorOf[typings.reactFns.mod.DeviceOrientation].asInstanceOf[ComponentType[
    DeviceOrientationProps[typings.reactFns.deviceOrientationDeviceOrientationMod.DeviceOrientationProps]
  ]]
  @scala.inline
  def GeoPosition: ComponentType[GeoPositionProps[typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps]] = js.constructorOf[typings.reactFns.mod.GeoPosition].asInstanceOf[ComponentType[GeoPositionProps[typings.reactFns.geoPositionGeoPositionMod.GeoPositionProps]]]
  @scala.inline
  def Locales: ComponentType[LocalesProps[typings.reactFns.localesLocalesMod.LocalesProps]] = js.constructorOf[typings.reactFns.mod.Locales].asInstanceOf[ComponentType[LocalesProps[typings.reactFns.localesLocalesMod.LocalesProps]]]
  @scala.inline
  def Mailto: ComponentType[MailtoProps] = typings.reactFns.mailtoMod.Mailto.asInstanceOf[ComponentType[MailtoProps]]
  @scala.inline
  def Media: ComponentType[MediaProps[typings.reactFns.mediaMediaMod.MediaProps]] = typings.reactFns.mod.Media.asInstanceOf[ComponentType[MediaProps[typings.reactFns.mediaMediaMod.MediaProps]]]
  @scala.inline
  def Network: ComponentType[NetworkProps[typings.reactFns.networkNetworkMod.NetworkProps]] = js.constructorOf[typings.reactFns.mod.Network].asInstanceOf[ComponentType[NetworkProps[typings.reactFns.networkNetworkMod.NetworkProps]]]
  @scala.inline
  def ReducerComponent[P, S, A]: ComponentType[P] = (js.constructorOf[typings.reactFns.reducerComponentMod.ReducerComponent[P, S, A]]).asInstanceOf[ComponentType[P]]
  @scala.inline
  def Scroll: ComponentType[ScrollConfig with SharedRenderProps[ScrollProps]] = js.constructorOf[typings.reactFns.mod.Scroll].asInstanceOf[ComponentType[ScrollConfig with SharedRenderProps[ScrollProps]]]
  @scala.inline
  def Sms: ComponentType[SmsProps] = typings.reactFns.smsMod.Sms.asInstanceOf[ComponentType[SmsProps]]
  @scala.inline
  def WindowSize: ComponentType[WindowSizeConfig with SharedRenderProps[WindowSizeProps]] = js.constructorOf[typings.reactFns.mod.WindowSize].asInstanceOf[ComponentType[WindowSizeConfig with SharedRenderProps[WindowSizeProps]]]
}


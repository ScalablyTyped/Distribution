package typings.reactDashFns.reactDashFnsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.SFC
import typings.reactDashFns.distDeviceMotionDeviceMotionMod.DeviceMotionProps
import typings.reactDashFns.distDeviceOrientationDeviceOrientationMod.DeviceOrientationProps
import typings.reactDashFns.distGeoPositionGeoPositionMod.GeoPositionProps
import typings.reactDashFns.distLocalesLocalesMod.LocalesProps
import typings.reactDashFns.distMediaMediaMod.MediaProps
import typings.reactDashFns.distNetworkNetworkMod.NetworkProps
import typings.reactDashFns.distScrollScrollMod.ScrollProps
import typings.reactDashFns.distTypesMod.SharedRenderProps
import typings.reactDashFns.distWindowSizeWindowSizeMod.WindowSizeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Media: SFC[SharedRenderProps[MediaProps]] = js.native
  def withDeviceMotion[Props](Component: ComponentType[Props with DeviceMotionProps]): ComponentType[Props] = js.native
  def withDeviceOrientation[Props](Component: ComponentType[Props with DeviceOrientationProps]): ComponentType[Props] = js.native
  def withGeoPosition[Props](Component: ComponentType[Props with GeoPositionProps]): ComponentType[Props] = js.native
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
  def withNetwork[Props](Component: ComponentType[Props with NetworkProps]): ComponentType[Props] = js.native
  def withScroll[Props](Component: ComponentType[Props with ScrollProps]): ComponentType[Props] = js.native
  def withWindowSize[Props](Component: ComponentType[Props with WindowSizeProps]): ComponentType[Props] = js.native
}


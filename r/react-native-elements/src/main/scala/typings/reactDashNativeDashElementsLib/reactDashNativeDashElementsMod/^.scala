package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val colors: reactDashNativeDashElementsLib.reactDashNativeDashElementsMod.Colors = js.native
  def getIconType(`type`: reactDashNativeDashElementsLib.reactDashNativeDashElementsMod.IconType): js.Any = js.native
  def normalize(size: scala.Double): scala.Double = js.native
  def registerCustomIconType(id: java.lang.String, font: js.Any): scala.Unit = js.native
  def withBadge(): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[reactLib.reactMod.ReactNs.ReactNode]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[reactLib.reactMod.ReactNs.ReactNode],
    /**
    * Options to configure the badge
    */
  options: reactDashNativeDashElementsLib.Anon_Bottom with reactDashNativeDashElementsLib.reactDashNativeDashElementsMod.BadgeProps
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: reactLib.reactMod.ReactNs.ReactNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: reactLib.reactMod.ReactNs.ReactNode,
    /**
    * Options to configure the badge
    */
  options: reactDashNativeDashElementsLib.Anon_Bottom with reactDashNativeDashElementsLib.reactDashNativeDashElementsMod.BadgeProps
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_]
  ] = js.native
  def withTheme[P, T](
    component: reactLib.reactMod.ReactNs.ComponentType[
      P with reactDashNativeDashElementsLib.reactDashNativeDashElementsMod.ThemeProps[T]
    ]
  ): reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] = js.native
}


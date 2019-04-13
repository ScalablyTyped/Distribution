package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val colors: Colors = js.native
  def getIconType(`type`: IconType): js.Any = js.native
  def normalize(size: scala.Double): scala.Double = js.native
  def registerCustomIconType(id: java.lang.String, font: js.Any): scala.Unit = js.native
  def withBadge(): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: js.Function0[reactLib.reactMod.ReactNode]): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[reactLib.reactMod.ReactNode],
    /**
    * Options to configure the badge
    */
  options: reactDashNativeDashElementsLib.Anon_Bottom with BadgeProps
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: reactLib.reactMod.ReactNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: reactLib.reactMod.ReactNode,
    /**
    * Options to configure the badge
    */
  options: reactDashNativeDashElementsLib.Anon_Bottom with BadgeProps
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def withTheme[P, T](component: reactLib.reactMod.ComponentType[P with ThemeProps[T]]): reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState] = js.native
}


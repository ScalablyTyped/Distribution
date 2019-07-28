package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashNativeDashElements.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val colors: Colors = js.native
  def getIconType(`type`: IconType): js.Any = js.native
  def normalize(size: Double): Double = js.native
  def registerCustomIconType(id: String, font: js.Any): Unit = js.native
  def withBadge(): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode]): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode],
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def withBadge(/**
    * Text value to be displayed by badge
    */
  value: ReactNode): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def withBadge(
    /**
    * Text value to be displayed by badge
    */
  value: ReactNode,
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def withTheme[P, T](component: ComponentType[P with ThemeProps[T]]): ComponentClass[P, ComponentState] = js.native
}


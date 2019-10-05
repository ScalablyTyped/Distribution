package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.ReactNode
import typings.reactDashNativeDashElements.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-elements", "withBadge")
@js.native
object withBadge extends js.Object {
  def apply(): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def apply(/**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode]): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def apply(
    /**
    * Text value to be displayed by badge
    */
  value: js.Function0[ReactNode],
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def apply(/**
    * Text value to be displayed by badge
    */
  value: ReactNode): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
  def apply(
    /**
    * Text value to be displayed by badge
    */
  value: ReactNode,
    /**
    * Options to configure the badge
    */
  options: Anon_Bottom with BadgeProps
  ): js.Function1[/* WrappedComponent */ ComponentType[_], ComponentType[_]] = js.native
}


package typings.reactDashHyperscript

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashHyperscriptComponents extends reactDashHyperscriptProps {
  @scala.inline
  def apply: ComponentType[
    (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object] | String
  ] = typings.reactDashHyperscript.reactDashHyperscriptMod.^.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[
  (typings.react.reactMod.ComponentClass[js.Object, typings.react.reactMod.ComponentState]) | typings.react.reactMod.StatelessComponent[js.Object] | java.lang.String]]
}


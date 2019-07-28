package typings.reactDashHyperscript.reactDashHyperscriptMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ReactElement
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hyperscript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    componentOrTag: (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object] | String
  ): ReactElement = js.native
  def apply(
    componentOrTag: (ComponentClass[js.Object, ComponentState]) | StatelessComponent[js.Object] | String,
    children: js.Array[Element] | Element
  ): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](
    componentOrTag: (ComponentClass[P, ComponentState]) | StatelessComponent[P] | String,
    properties: P
  ): ReactElement = js.native
  def apply[P /* <: StringDictionary[js.Any] */](
    componentOrTag: (ComponentClass[P, ComponentState]) | StatelessComponent[P] | String,
    properties: P,
    children: js.Array[Element] | Element
  ): ReactElement = js.native
}


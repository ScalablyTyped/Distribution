package typings
package reactDashHyperscriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hyperscript", JSImport.Namespace)
@js.native
object reactDashHyperscriptMod extends js.Object {
  def apply(
    componentOrTag: (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[js.Object] | java.lang.String
  ): reactLib.reactMod.ReactElement[_] = js.native
  def apply(
    componentOrTag: (reactLib.reactMod.ComponentClass[js.Object, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[js.Object] | java.lang.String,
    children: js.Array[reactDashHyperscriptLib.Element] | reactDashHyperscriptLib.Element
  ): reactLib.reactMod.ReactElement[_] = js.native
  def apply[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    componentOrTag: (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[P] | java.lang.String,
    properties: P
  ): reactLib.reactMod.ReactElement[P] = js.native
  def apply[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    componentOrTag: (reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]) | reactLib.reactMod.StatelessComponent[P] | java.lang.String,
    properties: P,
    children: js.Array[reactDashHyperscriptLib.Element] | reactDashHyperscriptLib.Element
  ): reactLib.reactMod.ReactElement[P] = js.native
}


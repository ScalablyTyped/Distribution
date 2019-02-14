package typings
package reactDashHyperscriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-hyperscript", JSImport.Namespace)
@js.native
object reactDashHyperscriptMod extends js.Object {
  def apply(
    componentOrTag: (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[js.Object] | java.lang.String
  ): reactLib.reactMod.ReactNs.ReactElement = js.native
  def apply(
    componentOrTag: (reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[js.Object] | java.lang.String,
    children: js.Array[reactDashHyperscriptLib.Element] | reactDashHyperscriptLib.Element
  ): reactLib.reactMod.ReactNs.ReactElement = js.native
  def apply[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    componentOrTag: (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[P] | java.lang.String,
    properties: P
  ): reactLib.reactMod.ReactNs.ReactElement = js.native
  def apply[P /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    componentOrTag: (reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[P] | java.lang.String,
    properties: P,
    children: js.Array[reactDashHyperscriptLib.Element] | reactDashHyperscriptLib.Element
  ): reactLib.reactMod.ReactNs.ReactElement = js.native
}


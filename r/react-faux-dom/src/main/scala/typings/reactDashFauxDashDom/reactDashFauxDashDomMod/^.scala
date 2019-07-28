package typings.reactDashFauxDashDom.reactDashFauxDashDomMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compareDocumentPosition(): Double = js.native
  def createElement(nodeName: String): Element = js.native
  def createElementNS(namespace: String, nodeName: String): Element = js.native
  def withFauxDOM[P](WrappedComponent: ComponentClass[P, ComponentState]): ComponentClass[Pick[P, Exclude[String, String]], ComponentState] = js.native
}


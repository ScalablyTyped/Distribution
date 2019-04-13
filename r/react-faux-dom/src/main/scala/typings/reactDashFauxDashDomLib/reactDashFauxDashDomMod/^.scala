package typings
package reactDashFauxDashDomLib.reactDashFauxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compareDocumentPosition(): scala.Double = js.native
  def createElement(nodeName: java.lang.String): Element = js.native
  def createElementNS(namespace: java.lang.String, nodeName: java.lang.String): Element = js.native
  def withFauxDOM[P](WrappedComponent: reactLib.reactMod.ComponentClass[P, reactLib.reactMod.ComponentState]): reactLib.reactMod.ComponentClass[
    stdLib.Pick[P, stdLib.Exclude[java.lang.String, java.lang.String]], 
    reactLib.reactMod.ComponentState
  ] = js.native
}


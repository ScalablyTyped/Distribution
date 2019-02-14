package typings
package reactDashFauxDashDomLib.reactDashFauxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-faux-dom", "Element")
@js.native
class Element protected ()
  extends reactLib.HTMLElement {
  def this(nodeName: java.lang.String) = this()
  def this(nodeName: java.lang.String, parentNode: Element) = this()
  var style: js.Any = js.native
  def toReact(): reactLib.reactMod.ReactNs.ReactElement = js.native
}


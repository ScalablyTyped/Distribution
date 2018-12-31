package typings
package reactDashSwfLib.reactDashSwfMod.rswfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSWF
  extends reactLib.reactMod.Component[Props, State, js.Any] {
  /**
    * Returns the Flash Player object DOM node.
    * Should be prefered over `React.findDOMNode`.
    * @return {?DOMNode} Flash Player object DOM node.
    */
  def getFPDOMNode(): stdLib.Node = js.native
}


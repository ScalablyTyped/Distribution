package typings.reactSwf.mod.rswf

import typings.react.mod.Component
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSWF
  extends Component[Props, State, js.Any] {
  /**
    * Returns the Flash Player object DOM node.
    * Should be prefered over `React.findDOMNode`.
    * @return {?DOMNode} Flash Player object DOM node.
    */
  def getFPDOMNode(): Node = js.native
}


package typings.stardustUiReactComponentRef

import typings.react.mod.RefObject
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stardust-ui/react-component-ref/dist/es/toRefObject", JSImport.Namespace)
@js.native
object toRefObjectMod extends js.Object {
  /** Creates a React ref object from existing DOM node. */
  def default[T /* <: Node */](node: T): RefObject[T] = js.native
}


package typings.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExoticComponent[P] extends js.Object {
  @JSName("$$typeof")
  val DollarDollartypeof: js.Symbol = js.native
  /**
    * **NOTE**: Exotic components are not callable.
    */
  def apply(props: P): (RaxElement[_, String | JSXElementConstructor[_]]) | Null = js.native
}


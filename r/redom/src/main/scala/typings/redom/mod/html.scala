package typings.redom.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redom", "html")
@js.native
object html extends js.Object {
  def apply(query: String, args: RedomQueryArgument*): RedomElementOfElQuery[String] = js.native
  def apply(query: RedomComponentClass, args: RedomQueryArgument*): RedomElementOfElQuery[RedomComponentClass] = js.native
  def apply(query: Node, args: RedomQueryArgument*): RedomElementOfElQuery[Node] = js.native
  def apply[Q /* <: js.Function0[RedomComponent] */](query: Q, args: RedomQueryArgument*): RedomElementOfElQuery[Q] = js.native
}


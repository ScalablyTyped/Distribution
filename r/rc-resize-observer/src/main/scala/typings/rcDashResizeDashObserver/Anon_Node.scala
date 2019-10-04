package typings.rcDashResizeDashObserver

import typings.rcDashResizeDashObserver.esMod.RefNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Node extends js.Object {
  def ref(node: RefNode): Unit
}

object Anon_Node {
  @scala.inline
  def apply(ref: RefNode => Unit): Anon_Node = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
  
    __obj.asInstanceOf[Anon_Node]
  }
}


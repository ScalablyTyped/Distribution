package typings.rcDashResizeDashObserver

import typings.rcDashResizeDashObserver.libMod.RefNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NodeRef extends js.Object {
  def ref(node: RefNode): Unit
}

object Anon_NodeRef {
  @scala.inline
  def apply(ref: RefNode => Unit): Anon_NodeRef = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
  
    __obj.asInstanceOf[Anon_NodeRef]
  }
}


package typings.rcAlign.alignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefAlign extends js.Object {
  def forceAlign(): Unit
}

object RefAlign {
  @scala.inline
  def apply(forceAlign: () => Unit): RefAlign = {
    val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
  
    __obj.asInstanceOf[RefAlign]
  }
}


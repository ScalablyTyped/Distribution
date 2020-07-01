package typings.simperium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sync extends js.Object {
  var sync: Boolean
}

object Sync {
  @scala.inline
  def apply(sync: Boolean): Sync = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sync]
  }
}


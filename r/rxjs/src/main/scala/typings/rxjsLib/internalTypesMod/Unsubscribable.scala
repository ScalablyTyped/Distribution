package typings
package rxjsLib.internalTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribable extends js.Object {
  def unsubscribe(): scala.Unit
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: js.Function0[scala.Unit]): Unsubscribable = {
    val __obj = js.Dynamic.literal(unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[Unsubscribable]
  }
}


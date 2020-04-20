package typings.reactAce.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBindKey extends js.Object {
  var mac: String
  var win: String
}

object ICommandBindKey {
  @scala.inline
  def apply(mac: String, win: String): ICommandBindKey = {
    val __obj = js.Dynamic.literal(mac = mac.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBindKey]
  }
}


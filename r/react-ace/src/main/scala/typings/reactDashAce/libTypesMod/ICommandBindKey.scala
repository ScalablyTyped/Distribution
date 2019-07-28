package typings.reactDashAce.libTypesMod

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
    val __obj = js.Dynamic.literal(mac = mac, win = win)
  
    __obj.asInstanceOf[ICommandBindKey]
  }
}


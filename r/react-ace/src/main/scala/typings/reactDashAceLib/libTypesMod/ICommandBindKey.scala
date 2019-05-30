package typings
package reactDashAceLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBindKey extends js.Object {
  var mac: java.lang.String
  var win: java.lang.String
}

object ICommandBindKey {
  @scala.inline
  def apply(mac: java.lang.String, win: java.lang.String): ICommandBindKey = {
    val __obj = js.Dynamic.literal(mac = mac, win = win)
  
    __obj.asInstanceOf[ICommandBindKey]
  }
}


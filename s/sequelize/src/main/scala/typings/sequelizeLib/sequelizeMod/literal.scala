package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait literal extends js.Object {
  var `val`: js.Any
}

object literal {
  @scala.inline
  def apply(`val`: js.Any): literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[literal]
  }
}


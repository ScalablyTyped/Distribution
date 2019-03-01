package typings
package screepsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  /**
    * The name of the shard.
    */
  var name: java.lang.String
  /**
    * Whether this shard belongs to the PTR.
    */
  var ptr: scala.Boolean
  /**
    * Currently always equals to normal.
    */
  var `type`: screepsLib.screepsLibStrings.normal
}

object Shard {
  @scala.inline
  def apply(name: java.lang.String, ptr: scala.Boolean, `type`: screepsLib.screepsLibStrings.normal): Shard = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("ptr")(ptr)
    __obj.asInstanceOf[Shard]
  }
}


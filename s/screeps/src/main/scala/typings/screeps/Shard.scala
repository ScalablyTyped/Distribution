package typings.screeps

import typings.screeps.screepsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shard extends js.Object {
  /**
    * The name of the shard.
    */
  var name: String
  /**
    * Whether this shard belongs to the PTR.
    */
  var ptr: Boolean
  /**
    * Currently always equals to normal.
    */
  var `type`: normal
}

object Shard {
  @scala.inline
  def apply(name: String, ptr: Boolean, `type`: normal): Shard = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ptr = ptr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shard]
  }
}


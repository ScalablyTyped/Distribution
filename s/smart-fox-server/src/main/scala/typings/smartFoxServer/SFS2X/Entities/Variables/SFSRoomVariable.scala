package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSRoomVariable extends SFSUserVariable {
  /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
  var isPersistent: Boolean
  /** @type {boolean} Indicates whether this Room Variable is private or not. */
  var isPrivate: Boolean
}

object SFSRoomVariable {
  @scala.inline
  def apply(
    getTypeName: Double => String,
    isNull: () => Boolean,
    isPersistent: Boolean,
    isPrivate: Boolean,
    name: String,
    value: Double
  ): SFSRoomVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isPersistent = isPersistent.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSRoomVariable]
  }
}


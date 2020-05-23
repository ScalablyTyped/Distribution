package typings.smartFoxServer.SFS2X.Entities.Variables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSBuddyVariable extends SFSUserVariable {
  /**
    * Indicates whether the Buddy Variable is persistent or not.
    * @return {boolean} Returns: true if the Buddy Variable is persistent.
    */
  def isOffline(): Boolean
}

object SFSBuddyVariable {
  @scala.inline
  def apply(
    getTypeName: Double => String,
    isNull: () => Boolean,
    isOffline: () => Boolean,
    name: String,
    value: Double
  ): SFSBuddyVariable = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = js.Any.fromFunction0(isNull), isOffline = js.Any.fromFunction0(isOffline), name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSBuddyVariable]
  }
}


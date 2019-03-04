package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppGroupCreationContent extends js.Object {
  /**
    * The description of the group.
    */
  var description: java.lang.String
  /**
    * The name of the group.
    */
  var name: java.lang.String
  /**
    * The privacy for the group.
    */
  var privacy: AppGroupPrivacy
}

object AppGroupCreationContent {
  @scala.inline
  def apply(description: java.lang.String, name: java.lang.String, privacy: AppGroupPrivacy): AppGroupCreationContent = {
    val __obj = js.Dynamic.literal(description = description, name = name, privacy = privacy)
  
    __obj.asInstanceOf[AppGroupCreationContent]
  }
}


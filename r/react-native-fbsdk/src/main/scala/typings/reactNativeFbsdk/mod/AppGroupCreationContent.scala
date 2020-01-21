package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppGroupCreationContent extends js.Object {
  /**
    * The description of the group.
    */
  var description: String
  /**
    * The name of the group.
    */
  var name: String
  /**
    * The privacy for the group.
    */
  var privacy: AppGroupPrivacy
}

object AppGroupCreationContent {
  @scala.inline
  def apply(description: String, name: String, privacy: AppGroupPrivacy): AppGroupCreationContent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AppGroupCreationContent]
  }
}


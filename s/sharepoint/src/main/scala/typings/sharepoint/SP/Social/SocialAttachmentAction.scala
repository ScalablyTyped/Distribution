package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the user actions that are allowed for the attachment object. */
@JSGlobal("SP.Social.SocialAttachmentAction")
@js.native
class SocialAttachmentAction () extends ClientValueObject {
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def get_actionKind(): SocialAttachmentActionKind = js.native
  /** Specifies the URI associated with the action. */
  def get_actionUri(): String = js.native
  /** Specifies whether the action is to navigate to a URI or an action that is dependent on the context in which the object is presented to the user. */
  def set_actionKind(value: SocialAttachmentActionKind): SocialAttachmentActionKind = js.native
  /** Specifies the URI associated with the action. */
  def set_actionUri(value: String): String = js.native
}


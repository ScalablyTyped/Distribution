package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Returns information about a request to follow an item. */
trait FollowResult extends ClientValueObject {
  /** Contains the item being followed. */
  def get_item(): FollowedItem
  /** Provides information about the attempt to follow an item. */
  def get_resultType(): FollowResultType
}

object FollowResult {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_item: () => FollowedItem,
    get_resultType: () => FollowResultType,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FollowResult = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_item = js.Any.fromFunction0(get_item), get_resultType = js.Any.fromFunction0(get_resultType), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FollowResult]
  }
}


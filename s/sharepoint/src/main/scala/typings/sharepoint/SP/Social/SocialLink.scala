package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a link that includes a URI and text representation.
  This class is used to represent the location of a web site.  */
trait SocialLink extends ClientValueObject {
  def get_text(): String
  def get_uri(): String
  def set_text(value: String): String
  def set_uri(value: String): String
}

object SocialLink {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_text: () => String,
    get_typeId: () => String,
    get_uri: () => String,
    set_text: String => String,
    set_uri: String => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialLink = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_text = js.Any.fromFunction0(get_text), get_typeId = js.Any.fromFunction0(get_typeId), get_uri = js.Any.fromFunction0(get_uri), set_text = js.Any.fromFunction1(set_text), set_uri = js.Any.fromFunction1(set_uri), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialLink]
  }
}


package typings.sharepoint.SP.Social

import typings.sharepoint.SP.ClientValueObject
import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
trait SocialPostActorInfo extends ClientValueObject {
  def get_includesCurrentUser(): Boolean
  /** Specifies an array of indexes into the SocialThreadActors array.
    The server can choose to return a limited set of actors. For example, the server can choose to return a subset of the users that like a post. */
  def get_indexes(): js.Array[Double]
  def get_totalCount(): Double
}

object SocialPostActorInfo {
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_includesCurrentUser: () => Boolean,
    get_indexes: () => js.Array[Double],
    get_totalCount: () => Double,
    get_typeId: () => String,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): SocialPostActorInfo = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_includesCurrentUser = js.Any.fromFunction0(get_includesCurrentUser), get_indexes = js.Any.fromFunction0(get_indexes), get_totalCount = js.Any.fromFunction0(get_totalCount), get_typeId = js.Any.fromFunction0(get_typeId), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[SocialPostActorInfo]
  }
}


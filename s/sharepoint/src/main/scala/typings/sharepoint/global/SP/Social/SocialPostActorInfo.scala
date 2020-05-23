package typings.sharepoint.global.SP.Social

import typings.sharepoint.SP.SerializationContext
import typings.sharepoint.SP.XmlWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a set of users, documents, sites, and tags by an index into the SocialThreadActors array  */
@JSGlobal("SP.Social.SocialPostActorInfo")
@js.native
class SocialPostActorInfo ()
  extends typings.sharepoint.SP.Social.SocialPostActorInfo {
  /* CompleteClass */
  override def customFromJson(obj: js.Any): Boolean = js.native
  /* CompleteClass */
  override def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean = js.native
  /* CompleteClass */
  override def fromJson(obj: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_includesCurrentUser(): Boolean = js.native
  /** Specifies an array of indexes into the SocialThreadActors array.
    The server can choose to return a limited set of actors. For example, the server can choose to return a subset of the users that like a post. */
  /* CompleteClass */
  override def get_indexes(): js.Array[Double] = js.native
  /* CompleteClass */
  override def get_totalCount(): Double = js.native
  /* CompleteClass */
  override def get_typeId(): String = js.native
  /* CompleteClass */
  override def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit = js.native
}


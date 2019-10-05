package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataItemType extends js.Object

/** Specifies whether the item being inserted is a user, document, site, tag, or link. */
@JSGlobal("SP.Social.SocialDataItemType")
@js.native
object SocialDataItemType extends js.Object {
  @js.native
  sealed trait document extends SocialDataItemType
  
  @js.native
  sealed trait link extends SocialDataItemType
  
  @js.native
  sealed trait site extends SocialDataItemType
  
  @js.native
  sealed trait tag extends SocialDataItemType
  
  @js.native
  sealed trait user extends SocialDataItemType
  
  /* 1 */ val document: typings.sharepoint.SP.Social.SocialDataItemType.document with Double = js.native
  /* 4 */ val link: typings.sharepoint.SP.Social.SocialDataItemType.link with Double = js.native
  /* 2 */ val site: typings.sharepoint.SP.Social.SocialDataItemType.site with Double = js.native
  /* 3 */ val tag: typings.sharepoint.SP.Social.SocialDataItemType.tag with Double = js.native
  /* 0 */ val user: typings.sharepoint.SP.Social.SocialDataItemType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataItemType with Double] = js.native
}


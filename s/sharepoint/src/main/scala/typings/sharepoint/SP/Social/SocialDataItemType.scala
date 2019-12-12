package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.Social.SocialDataItemType.document
import typings.sharepoint.SP.Social.SocialDataItemType.link
import typings.sharepoint.SP.Social.SocialDataItemType.site
import typings.sharepoint.SP.Social.SocialDataItemType.tag
import typings.sharepoint.SP.Social.SocialDataItemType.user
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataItemType with Double] = js.native
  /* 1 */ @js.native
  object document extends TopLevel[document with Double]
  
  /* 4 */ @js.native
  object link extends TopLevel[link with Double]
  
  /* 2 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 3 */ @js.native
  object tag extends TopLevel[tag with Double]
  
  /* 0 */ @js.native
  object user extends TopLevel[user with Double]
  
}


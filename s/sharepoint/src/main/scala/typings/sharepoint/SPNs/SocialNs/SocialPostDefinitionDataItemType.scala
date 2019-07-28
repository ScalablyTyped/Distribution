package typings.sharepoint.SPNs.SocialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialPostDefinitionDataItemType extends js.Object

/** Defines the type of item being specified in the SocialPostDefinitionDataItem.
  This type is only available in server-to-server calls. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItemType")
@js.native
object SocialPostDefinitionDataItemType extends js.Object {
  @js.native
  sealed trait document extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait link extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait site extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait tag extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait text extends SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait user extends SocialPostDefinitionDataItemType
  
  /* 2 */ val document: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.document with Double = js.native
  /* 5 */ val link: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.link with Double = js.native
  /* 3 */ val site: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.site with Double = js.native
  /* 4 */ val tag: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.tag with Double = js.native
  /* 0 */ val text: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.text with Double = js.native
  /* 1 */ val user: typings.sharepoint.SPNs.SocialNs.SocialPostDefinitionDataItemType.user with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialPostDefinitionDataItemType with Double] = js.native
}


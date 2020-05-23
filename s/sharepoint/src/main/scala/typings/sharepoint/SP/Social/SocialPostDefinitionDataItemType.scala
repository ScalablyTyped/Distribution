package typings.sharepoint.SP.Social

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
  
}


package typings.sharepoint.SP.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

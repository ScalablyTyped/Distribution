package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialPostDefinitionDataItemType extends StObject
/** Defines the type of item being specified in the SocialPostDefinitionDataItem.
  This type is only available in server-to-server calls. */
@JSGlobal("SP.Social.SocialPostDefinitionDataItemType")
@js.native
object SocialPostDefinitionDataItemType extends StObject {
  
  @js.native
  sealed trait document
    extends StObject
       with SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait link
    extends StObject
       with SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait site
    extends StObject
       with SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait tag
    extends StObject
       with SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait text
    extends StObject
       with SocialPostDefinitionDataItemType
  
  @js.native
  sealed trait user
    extends StObject
       with SocialPostDefinitionDataItemType
}

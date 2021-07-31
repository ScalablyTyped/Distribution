package typings.sharepoint.SP.Social

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialPostType extends StObject
@JSGlobal("SP.Social.SocialPostType")
@js.native
object SocialPostType extends StObject {
  
  @js.native
  sealed trait reply
    extends StObject
       with SocialPostType
  
  @js.native
  sealed trait root
    extends StObject
       with SocialPostType
}

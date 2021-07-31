package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocialDataStoreExceptionCode extends StObject
@JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
@js.native
object SocialDataStoreExceptionCode extends StObject {
  
  @js.native
  sealed trait cannotCreatePersonalSite
    extends StObject
       with SocialDataStoreExceptionCode
  
  @js.native
  sealed trait noSocialFeatures
    extends StObject
       with SocialDataStoreExceptionCode
  
  @js.native
  sealed trait personalSiteNotFound
    extends StObject
       with SocialDataStoreExceptionCode
  
  @js.native
  sealed trait socialListNotFound
    extends StObject
       with SocialDataStoreExceptionCode
}

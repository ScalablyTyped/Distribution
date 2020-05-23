package typings.sharepoint.SP.UserProfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataStoreExceptionCode extends js.Object

@JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
@js.native
object SocialDataStoreExceptionCode extends js.Object {
  @js.native
  sealed trait cannotCreatePersonalSite extends SocialDataStoreExceptionCode
  
  @js.native
  sealed trait noSocialFeatures extends SocialDataStoreExceptionCode
  
  @js.native
  sealed trait personalSiteNotFound extends SocialDataStoreExceptionCode
  
  @js.native
  sealed trait socialListNotFound extends SocialDataStoreExceptionCode
  
}


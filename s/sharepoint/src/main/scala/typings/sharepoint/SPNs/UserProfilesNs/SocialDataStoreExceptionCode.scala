package typings.sharepoint.SPNs.UserProfilesNs

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
  
  /* 2 */ val cannotCreatePersonalSite: typings.sharepoint.SPNs.UserProfilesNs.SocialDataStoreExceptionCode.cannotCreatePersonalSite with Double = js.native
  /* 3 */ val noSocialFeatures: typings.sharepoint.SPNs.UserProfilesNs.SocialDataStoreExceptionCode.noSocialFeatures with Double = js.native
  /* 1 */ val personalSiteNotFound: typings.sharepoint.SPNs.UserProfilesNs.SocialDataStoreExceptionCode.personalSiteNotFound with Double = js.native
  /* 0 */ val socialListNotFound: typings.sharepoint.SPNs.UserProfilesNs.SocialDataStoreExceptionCode.socialListNotFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataStoreExceptionCode with Double] = js.native
}


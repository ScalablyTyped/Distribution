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
  
  /* 2 */ val cannotCreatePersonalSite: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.cannotCreatePersonalSite with Double = js.native
  /* 3 */ val noSocialFeatures: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.noSocialFeatures with Double = js.native
  /* 1 */ val personalSiteNotFound: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.personalSiteNotFound with Double = js.native
  /* 0 */ val socialListNotFound: typings.sharepoint.SP.UserProfiles.SocialDataStoreExceptionCode.socialListNotFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataStoreExceptionCode with Double] = js.native
}


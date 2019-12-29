package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocialDataStoreExceptionCode with Double] = js.native
  /* 2 */ @js.native
  object cannotCreatePersonalSite extends TopLevel[cannotCreatePersonalSite with Double]
  
  /* 3 */ @js.native
  object noSocialFeatures extends TopLevel[noSocialFeatures with Double]
  
  /* 1 */ @js.native
  object personalSiteNotFound extends TopLevel[personalSiteNotFound with Double]
  
  /* 0 */ @js.native
  object socialListNotFound extends TopLevel[socialListNotFound with Double]
  
}


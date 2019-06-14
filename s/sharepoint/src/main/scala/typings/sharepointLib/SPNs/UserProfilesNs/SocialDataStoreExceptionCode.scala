package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SocialDataStoreExceptionCode extends js.Object

@JSGlobal("SP.UserProfiles.SocialDataStoreExceptionCode")
@js.native
object SocialDataStoreExceptionCode extends js.Object {
  @js.native
  sealed trait cannotCreatePersonalSite
    extends sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode
  
  @js.native
  sealed trait noSocialFeatures
    extends sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode
  
  @js.native
  sealed trait personalSiteNotFound
    extends sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode
  
  @js.native
  sealed trait socialListNotFound
    extends sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode
  
  /* 2 */ val cannotCreatePersonalSite: cannotCreatePersonalSite with scala.Double = js.native
  /* 3 */ val noSocialFeatures: noSocialFeatures with scala.Double = js.native
  /* 1 */ val personalSiteNotFound: personalSiteNotFound with scala.Double = js.native
  /* 0 */ val socialListNotFound: socialListNotFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode with scala.Double] = js.native
}


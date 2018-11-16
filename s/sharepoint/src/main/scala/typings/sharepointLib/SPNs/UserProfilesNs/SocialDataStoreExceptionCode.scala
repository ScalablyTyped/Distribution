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
  
  val cannotCreatePersonalSite: cannotCreatePersonalSite with java.lang.String = js.native
  val noSocialFeatures: noSocialFeatures with java.lang.String = js.native
  val personalSiteNotFound: personalSiteNotFound with java.lang.String = js.native
  val socialListNotFound: socialListNotFound with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    sharepointLib.SPNs.UserProfilesNs.SocialDataStoreExceptionCode with java.lang.String
  ] = js.native
}


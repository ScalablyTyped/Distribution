package typings
package sharepointLib.SPNs.UserProfilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an alternate entry point to user profiles rather than calling methods directly. */
@JSGlobal("SP.UserProfiles.ProfileLoader")
@js.native
class ProfileLoader ()
  extends sharepointLib.SPNs.ClientObject {
  def getUserProfile(): UserProfile = js.native
}

/* static members */
@JSGlobal("SP.UserProfiles.ProfileLoader")
@js.native
object ProfileLoader extends js.Object {
  def getProfileLoader(context: sharepointLib.SPNs.ClientRuntimeContext): sharepointLib.SPNs.UserProfilesNs.ProfileLoader = js.native
}


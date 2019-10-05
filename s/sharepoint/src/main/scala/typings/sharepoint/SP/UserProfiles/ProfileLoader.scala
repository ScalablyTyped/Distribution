package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.ClientRuntimeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an alternate entry point to user profiles rather than calling methods directly. */
@JSGlobal("SP.UserProfiles.ProfileLoader")
@js.native
class ProfileLoader () extends ClientObject {
  def getUserProfile(): UserProfile = js.native
}

/* static members */
@JSGlobal("SP.UserProfiles.ProfileLoader")
@js.native
object ProfileLoader extends js.Object {
  def getProfileLoader(context: ClientRuntimeContext): ProfileLoader = js.native
}


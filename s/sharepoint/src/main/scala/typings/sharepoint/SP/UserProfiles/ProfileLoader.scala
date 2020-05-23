package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an alternate entry point to user profiles rather than calling methods directly. */
@js.native
trait ProfileLoader extends ClientObject {
  def getUserProfile(): UserProfile = js.native
}


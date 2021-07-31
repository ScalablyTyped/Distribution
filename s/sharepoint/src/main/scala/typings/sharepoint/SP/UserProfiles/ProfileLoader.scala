package typings.sharepoint.SP.UserProfiles

import typings.sharepoint.SP.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides an alternate entry point to user profiles rather than calling methods directly. */
@js.native
trait ProfileLoader
  extends StObject
     with ClientObject {
  
  def getUserProfile(): UserProfile = js.native
}

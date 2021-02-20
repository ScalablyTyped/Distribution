package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FollowedStatus extends StObject
@JSGlobal("SP.UserProfiles.FollowedStatus")
@js.native
object FollowedStatus extends StObject {
  
  @js.native
  sealed trait followed extends FollowedStatus
  
  @js.native
  sealed trait notFollowable extends FollowedStatus
  
  @js.native
  sealed trait notFollowed extends FollowedStatus
}

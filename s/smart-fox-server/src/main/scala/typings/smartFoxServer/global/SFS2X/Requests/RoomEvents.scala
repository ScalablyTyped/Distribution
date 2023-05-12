package typings.smartFoxServer.global.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.RoomEvents")
@js.native
/**
  * Creates a new RoomEvents instance.
  */
open class RoomEvents ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.RoomEvents {
  
  /** Sets whether or not the userCountChange event should be dispatched whenever the users (or players+spectators) count changes in the Room. */
  /* CompleteClass */
  var allowUserCountChance: Boolean = js.native
  
  /** Sets whether the userEnterRoom event should be dispatched whenever a user joins the Room or not. */
  /* CompleteClass */
  var allowUserEnter: Boolean = js.native
  
  /** Sets whether the userExitRoom event should be dispatched whenever a user leaves the Room or not. */
  /* CompleteClass */
  var allowUserExit: Boolean = js.native
  
  /** Sets whether or not the userVariablesUpdate event should be dispatched whenever a user in the Room updates their User Variables */
  /* CompleteClass */
  var allowUserVariablesUpdate: Boolean = js.native
}

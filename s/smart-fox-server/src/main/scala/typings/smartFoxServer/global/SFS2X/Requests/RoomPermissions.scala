package typings.smartFoxServer.global.SFS2X.Requests

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SFS2X.Requests.RoomPermissions")
@js.native
/**
  * Creates a new RoomPermissions instance.
  */
open class RoomPermissions ()
  extends StObject
     with typings.smartFoxServer.SFS2X.Requests.RoomPermissions {
  
  /** Sets whether changing the Room name after its creation is allowed or not. */
  /* CompleteClass */
  var allowNameChange: Boolean = js.native
  
  /** Sets whether changing (or removing) the Room password after its creation is allowed or not. */
  /* CompleteClass */
  var allowPasswordStateChange: Boolean = js.native
  
  /** Sets whether users inside the Room are allowed to send public messages or not. */
  /* CompleteClass */
  var allowPublicMessages: Boolean = js.native
  
  /** Sets whether the Room capacity can be changed after its creation or not. */
  /* CompleteClass */
  var aloowResizing: Boolean = js.native
}

package typings.smartFoxServer.global.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typings.smartFoxServer.SFS2X.Entities.MMORoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region MMO
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.MMO.html
object MMO {
  
  @JSGlobal("SFS2X.Requests.MMO.MMORoomSettings")
  @js.native
  open class MMORoomSettings protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.MMO.MMORoomSettings {
    /**
      * Creates a new MMORoomSettings instance.
      * @param {string} name The name of the MMORoom to be created.
      */
    def this(name: String) = this()
    
    /** Defines the Area of Interest (AoI) for the MMORoom. */
    /* CompleteClass */
    var defaultAOI: Vec3D = js.native
    
    /** Defines the limits of the virtual environment represented by the MMORoom. */
    /* CompleteClass */
    var mapLimits: typings.smartFoxServer.SFS2X.Requests.MMO.MapLimits = js.native
    
    /** Configures the speed at which the SFSEvent.PROXIMITY_LIST_UPDATE event is sent by the server. */
    /* CompleteClass */
    var proximityListUpdateMillis: Double = js.native
    
    /** Sets if the users entry points in the current user's Area of Interest should be transmitted in the SFSEvent.PROXIMITY_LIST_UPDATE event. */
    /* CompleteClass */
    var sendAOIEntryPoint: Boolean = js.native
    
    /** Defines the time limit before a user without a physical position set inside the MMORoom is kicked from the Room. */
    /* CompleteClass */
    var userMaxLimboSeconds: Double = js.native
  }
  
  @JSGlobal("SFS2X.Requests.MMO.MapLimits")
  @js.native
  open class MapLimits protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.MMO.MapLimits {
    /**
      * Creates a new MapLimits instance.
      * @param {Entities.Data.Vec3D} lowerLimit
      * @param {Entities.Data.Vec3D} higherLimit
      */
    def this(lowerLimit: Vec3D, higherLimit: Vec3D) = this()
    
    /** Returns the higher coordinates limit of the virtual environment along the X,Y,Z axes. */
    /* CompleteClass */
    var higherLimit: Vec3D = js.native
    
    /** Returns the lower coordinates limit of the virtual environment along the X,Y,Z axes. */
    /* CompleteClass */
    var lowerLimit: Vec3D = js.native
  }
  
  @JSGlobal("SFS2X.Requests.MMO.SetUserPositionRequest")
  @js.native
  open class SetUserPositionRequest protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Requests.MMO.SetUserPositionRequest {
    /**
      * Creates a new SetUserPositionRequest instance.
      * @param {Entities.Data.Vec3D} pos        The user position.
      * @param {Entities.MMORoom}    [targetRoom=null] The MMORoom object corresponding to the Room where the position should be set; if null, the last Room joined by the user is used.
      */
    def this(pos: Vec3D) = this()
    def this(pos: Vec3D, targetRoom: MMORoom) = this()
  }
}

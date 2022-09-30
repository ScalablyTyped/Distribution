package typings.snapchatLensStudio

import typings.snapchatLensStudio.SnapchatLensStudio.ScriptApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CreateEvent[Api /* <: js.Object */] extends StObject {
    
    /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
    var api: Api = js.native
    
    /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
    @JSName("createEvent")
    def createEvent_BrowsLoweredEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent): BrowsLoweredEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsRaisedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent): BrowsRaisedEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsReturnedToNormalEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent): BrowsReturnedToNormalEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraBackEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent): CameraBackEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraFrontEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent): CameraFrontEvent = js.native
    @JSName("createEvent")
    def createEvent_DelayedCallbackEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent): DelayedCallbackEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceFoundEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent): FaceFoundEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceLostEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent): FaceLostEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceTrackingEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent): FaceTrackingEvent = js.native
    @JSName("createEvent")
    def createEvent_KissFinishedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent): KissFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_KissStartedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent): KissStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_LateUpdateEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent): LateUpdateEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateEndEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent): ManipulateEndEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateStartEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent): ManipulateStartEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthClosedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent): MouthClosedEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthOpenedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent): MouthOpenedEvent = js.native
    @JSName("createEvent")
    def createEvent_SceneEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent): SceneEvent[Any] = js.native
    @JSName("createEvent")
    def createEvent_SceneObjectEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent): SceneObjectEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileFinishedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent): SmileFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileStartedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent): SmileStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_SurfaceTrackingResetEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent): SurfaceTrackingResetEvent = js.native
    @JSName("createEvent")
    def createEvent_TapEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TapEvent): TapEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchEndEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent): TouchEndEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchMoveEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent): TouchMoveEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchStartEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent): TouchStartEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOffEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent): TurnOffEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOnEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent): TurnOnEvent = js.native
    @JSName("createEvent")
    def createEvent_UpdateEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent): UpdateEvent = js.native
    
    /** Removes a previously added SceneEvent from the ScriptComponent. */
    def removeEvent(event: SceneEvent[Any]): Unit = js.native
  }
  
  /* Inlined snapchat-lens-studio.Component.ScriptComponent<snapchat-lens-studio.SnapchatLensStudio.ScriptInputs, snapchat-lens-studio.SnapchatLensStudio.ScriptApi> */
  @js.native
  trait ScriptComponentScriptInpu extends StObject {
    
    /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
    var api: ScriptApi = js.native
    
    /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
    @JSName("createEvent")
    def createEvent_BrowsLoweredEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent): BrowsLoweredEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsRaisedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent): BrowsRaisedEvent = js.native
    @JSName("createEvent")
    def createEvent_BrowsReturnedToNormalEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent): BrowsReturnedToNormalEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraBackEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent): CameraBackEvent = js.native
    @JSName("createEvent")
    def createEvent_CameraFrontEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent): CameraFrontEvent = js.native
    @JSName("createEvent")
    def createEvent_DelayedCallbackEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent): DelayedCallbackEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceFoundEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent): FaceFoundEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceLostEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent): FaceLostEvent = js.native
    @JSName("createEvent")
    def createEvent_FaceTrackingEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent): FaceTrackingEvent = js.native
    @JSName("createEvent")
    def createEvent_KissFinishedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent): KissFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_KissStartedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent): KissStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_LateUpdateEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent): LateUpdateEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateEndEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent): ManipulateEndEvent = js.native
    @JSName("createEvent")
    def createEvent_ManipulateStartEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent): ManipulateStartEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthClosedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent): MouthClosedEvent = js.native
    @JSName("createEvent")
    def createEvent_MouthOpenedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent): MouthOpenedEvent = js.native
    @JSName("createEvent")
    def createEvent_SceneEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent): SceneEvent[Any] = js.native
    @JSName("createEvent")
    def createEvent_SceneObjectEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent): SceneObjectEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileFinishedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent): SmileFinishedEvent = js.native
    @JSName("createEvent")
    def createEvent_SmileStartedEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent): SmileStartedEvent = js.native
    @JSName("createEvent")
    def createEvent_SurfaceTrackingResetEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent): SurfaceTrackingResetEvent = js.native
    @JSName("createEvent")
    def createEvent_TapEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TapEvent): TapEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchEndEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent): TouchEndEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchMoveEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent): TouchMoveEvent = js.native
    @JSName("createEvent")
    def createEvent_TouchStartEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent): TouchStartEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOffEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent): TurnOffEvent = js.native
    @JSName("createEvent")
    def createEvent_TurnOnEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent): TurnOnEvent = js.native
    @JSName("createEvent")
    def createEvent_UpdateEvent(eventType: typings.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent): UpdateEvent = js.native
    
    /** Destroys the component. */
    def destroy(): Unit = js.native
    
    /** If disabled, the Component will stop enacting its behavior. */
    var enabled: Boolean = js.native
    
    /** Returns the SceneObject the component is attached to. */
    def getSceneObject(): SceneObject = js.native
    
    /** Returns the Transform this component is attached to. */
    def getTransform(): Transform = js.native
    
    /** Returns the name of this object’s type. */
    def getTypeName(): String = js.native
    
    /** Returns true if the object matches or derives from the passed in type. */
    def isOfType(`type`: String): Boolean = js.native
    
    /** Returns true if this object is the same as other. Useful for checking if two references point to the same thing. */
    def isSame(other: SerializableWithUID): Boolean = js.native
    
    /** Removes a previously added SceneEvent from the ScriptComponent. */
    def removeEvent(event: SceneEvent[Any]): Unit = js.native
  }
}

package typings.snapchatLensStudio.global

import typings.snapchatLensStudio.SceneObject
import typings.snapchatLensStudio.SerializableWithUID
import typings.snapchatLensStudio.SnapchatLensStudio.ScriptApi
import typings.snapchatLensStudio.Transform
import typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsLoweredEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsRaisedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.BrowsReturnedToNormalEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.CameraBackEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.CameraFrontEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.DelayedCallbackEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.FaceFoundEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.FaceLostEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.FaceTrackingEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.KissFinishedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.KissStartedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.LateUpdateEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateEndEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.ManipulateStartEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.MouthClosedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.MouthOpenedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.SceneEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.SceneObjectEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.SmileFinishedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.SmileStartedEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.SurfaceTrackingResetEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TapEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchEndEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchMoveEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchStartEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOffEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.TurnOnEvent
import typings.snapchatLensStudio.snapchatLensStudioStrings.UpdateEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Binds scripts to Events and executes them when triggered. Any script can access the ScriptComponent executing them through the variable script. See also: Scripting Overview, Script Events Guide.
  * ```
  * // Bind a function to the MouthOpened event
  * function onMouthOpen(eventData)
  * {
  *     print("mouth was opened");
  * }
  * var event = script.createEvent("MouthOpenedEvent");
  * event.bind(onMouthOpen);
  * ```
  */
/* Inlined snapchat-lens-studio.Component.ScriptComponent<snapchat-lens-studio.SnapchatLensStudio.ScriptInputs, snapchat-lens-studio.SnapchatLensStudio.ScriptApi> */
object script {
  
  @JSGlobal("script")
  @js.native
  val ^ : js.Any = js.native
  
  /** Generic object accessible by other instances of ScriptComponent. Use this object to store references to properties and methods that need to be accessible from other ScriptComponents. */
  @JSGlobal("script.api")
  @js.native
  def api: ScriptApi = js.native
  inline def api_=(x: ScriptApi): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("api")(x.asInstanceOf[js.Any])
  
  /** Adds a new SceneEvent, triggered by eventType events, to the ScriptComponent. */
  inline def createEvent_BrowsLoweredEvent(eventType: BrowsLoweredEvent): typings.snapchatLensStudio.BrowsLoweredEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.BrowsLoweredEvent]
  
  inline def createEvent_BrowsRaisedEvent(eventType: BrowsRaisedEvent): typings.snapchatLensStudio.BrowsRaisedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.BrowsRaisedEvent]
  
  inline def createEvent_BrowsReturnedToNormalEvent(eventType: BrowsReturnedToNormalEvent): typings.snapchatLensStudio.BrowsReturnedToNormalEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.BrowsReturnedToNormalEvent]
  
  inline def createEvent_CameraBackEvent(eventType: CameraBackEvent): typings.snapchatLensStudio.CameraBackEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.CameraBackEvent]
  
  inline def createEvent_CameraFrontEvent(eventType: CameraFrontEvent): typings.snapchatLensStudio.CameraFrontEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.CameraFrontEvent]
  
  inline def createEvent_DelayedCallbackEvent(eventType: DelayedCallbackEvent): typings.snapchatLensStudio.DelayedCallbackEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.DelayedCallbackEvent]
  
  inline def createEvent_FaceFoundEvent(eventType: FaceFoundEvent): typings.snapchatLensStudio.FaceFoundEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.FaceFoundEvent]
  
  inline def createEvent_FaceLostEvent(eventType: FaceLostEvent): typings.snapchatLensStudio.FaceLostEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.FaceLostEvent]
  
  inline def createEvent_FaceTrackingEvent(eventType: FaceTrackingEvent): typings.snapchatLensStudio.FaceTrackingEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.FaceTrackingEvent]
  
  inline def createEvent_KissFinishedEvent(eventType: KissFinishedEvent): typings.snapchatLensStudio.KissFinishedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.KissFinishedEvent]
  
  inline def createEvent_KissStartedEvent(eventType: KissStartedEvent): typings.snapchatLensStudio.KissStartedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.KissStartedEvent]
  
  inline def createEvent_LateUpdateEvent(eventType: LateUpdateEvent): typings.snapchatLensStudio.LateUpdateEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.LateUpdateEvent]
  
  inline def createEvent_ManipulateEndEvent(eventType: ManipulateEndEvent): typings.snapchatLensStudio.ManipulateEndEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.ManipulateEndEvent]
  
  inline def createEvent_ManipulateStartEvent(eventType: ManipulateStartEvent): typings.snapchatLensStudio.ManipulateStartEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.ManipulateStartEvent]
  
  inline def createEvent_MouthClosedEvent(eventType: MouthClosedEvent): typings.snapchatLensStudio.MouthClosedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.MouthClosedEvent]
  
  inline def createEvent_MouthOpenedEvent(eventType: MouthOpenedEvent): typings.snapchatLensStudio.MouthOpenedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.MouthOpenedEvent]
  
  inline def createEvent_SceneEvent(eventType: SceneEvent): typings.snapchatLensStudio.SceneEvent[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.SceneEvent[Any]]
  
  inline def createEvent_SceneObjectEvent(eventType: SceneObjectEvent): typings.snapchatLensStudio.SceneObjectEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.SceneObjectEvent]
  
  inline def createEvent_SmileFinishedEvent(eventType: SmileFinishedEvent): typings.snapchatLensStudio.SmileFinishedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.SmileFinishedEvent]
  
  inline def createEvent_SmileStartedEvent(eventType: SmileStartedEvent): typings.snapchatLensStudio.SmileStartedEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.SmileStartedEvent]
  
  inline def createEvent_SurfaceTrackingResetEvent(eventType: SurfaceTrackingResetEvent): typings.snapchatLensStudio.SurfaceTrackingResetEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.SurfaceTrackingResetEvent]
  
  inline def createEvent_TapEvent(eventType: TapEvent): typings.snapchatLensStudio.TapEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TapEvent]
  
  inline def createEvent_TouchEndEvent(eventType: TouchEndEvent): typings.snapchatLensStudio.TouchEndEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TouchEndEvent]
  
  inline def createEvent_TouchMoveEvent(eventType: TouchMoveEvent): typings.snapchatLensStudio.TouchMoveEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TouchMoveEvent]
  
  inline def createEvent_TouchStartEvent(eventType: TouchStartEvent): typings.snapchatLensStudio.TouchStartEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TouchStartEvent]
  
  inline def createEvent_TurnOffEvent(eventType: TurnOffEvent): typings.snapchatLensStudio.TurnOffEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TurnOffEvent]
  
  inline def createEvent_TurnOnEvent(eventType: TurnOnEvent): typings.snapchatLensStudio.TurnOnEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.TurnOnEvent]
  
  inline def createEvent_UpdateEvent(eventType: UpdateEvent): typings.snapchatLensStudio.UpdateEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("createEvent")(eventType.asInstanceOf[js.Any]).asInstanceOf[typings.snapchatLensStudio.UpdateEvent]
  
  /** Destroys the component. */
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  /** If disabled, the Component will stop enacting its behavior. */
  @JSGlobal("script.enabled")
  @js.native
  def enabled: Boolean = js.native
  inline def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  /** Returns the SceneObject the component is attached to. */
  inline def getSceneObject(): SceneObject = ^.asInstanceOf[js.Dynamic].applyDynamic("getSceneObject")().asInstanceOf[SceneObject]
  
  /** Returns the Transform this component is attached to. */
  inline def getTransform(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("getTransform")().asInstanceOf[Transform]
  
  /** Returns the name of this object’s type. */
  inline def getTypeName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeName")().asInstanceOf[String]
  
  /** Returns true if the object matches or derives from the passed in type. */
  inline def isOfType(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOfType")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Returns true if this object is the same as other. Useful for checking if two references point to the same thing. */
  inline def isSame(other: SerializableWithUID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSame")(other.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Removes a previously added SceneEvent from the ScriptComponent. */
  inline def removeEvent(event: typings.snapchatLensStudio.SceneEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

package typings.snapchatLensStudio

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** The base class for animation tracks. */
type AnimationTrack = ScriptObject

/** Provider for AudioEffectAsset. */
type AudioEffectProvider = Provider

/** Triggered when eyebrows are lowered on the tracked face. */
type BrowsLoweredEvent = FaceTrackingEvent

/** Triggered when eyebrows are raised on the tracked face. */
type BrowsRaisedEvent = FaceTrackingEvent

/** Triggered when eyebrows are returned to normal on the tracked face. */
type BrowsReturnedToNormalEvent = FaceTrackingEvent

/**
  * Expression names used with FaceRenderObjectProvider.getExpressionWeightByName() and returned by FaceRenderObjectProvider.getExpressionNames().
  * ```
  * // @input Asset.RenderMesh faceMesh
  * var mouthCloseWeight = script.faceMesh.control.getExpressionWeightByName(Expressions.MouthClose);
  * ```
  */
type Expressions = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ E in / * template literal string: Brows${Down${Left|Right}|Up${Center|Left|Right}} * / string | 'Puff' ]: E}
  */ typings.snapchatLensStudio.snapchatLensStudioStrings.Expressions & TopLevel[Any]

/** Triggered when a new face is detected and starts being tracked. */
type FaceFoundEvent = FaceTrackingEvent

/** Triggered when a face can no longer be tracked. For example, if a face gets blocked from the camera’s view, or gets too far away. */
type FaceLostEvent = FaceTrackingEvent

/** A TextureProvider for textures originating from files. */
type FileTextureProvider = TextureProvider

/** The base class for animation tracks using float values. */
type FloatAnimationTrack = AnimationTrack

/** The base class for parameter objects passed into event callbacks. */
type IEventParameters = ScriptObject

/** The base class for animation tracks using integer values. */
type IntAnimationTrack = AnimationTrack

/** Triggered when the tracked face ends a kiss. */
type KissFinishedEvent = FaceTrackingEvent

/** Triggered when the tracked face starts a kiss. */
type KissStartedEvent = FaceTrackingEvent

/** This event is triggered when manipulation on the object ends. */
type ManipulateEndEvent = SceneObjectEvent

/** This event is triggered when manipulation on the object begins. */
type ManipulateStartEvent = SceneObjectEvent

/** Base class for marker providers. For more information, see the Marker Tracking guide. */
type MarkerProvider = Provider

/** Triggered when the tracked face’s mouth closes. */
type MouthClosedEvent = FaceTrackingEvent

/** Triggered when the tracked face’s mouth opens. */
type MouthOpenedEvent = FaceTrackingEvent

/** RenderObjectProvider for mesh objects generated procedurally. */
type ProceduralMeshRenderObjectProvider = RenderObjectProvider

/** Base class for all resource providers. */
type Provider = ScriptObject

/** The base class for animation tracks using quaternion values. */
type QuaternionAnimationTrack = AnimationTrack

/** Provider for RenderMesh data. */
type RenderObjectProvider = Provider

/** Controls a segmentation texture resource. Can be accessed through Texture.control on a Segmentation texture. For more information, see the Segmentation guide. Lens Studio v1.7.0+ */
type SegmentationTextureProvider = TextureProvider

/** Triggered when a smile ends on the tracked face. */
type SmileFinishedEvent = FaceTrackingEvent

/** Triggered when a smile begins on the tracked face. */
type SmileStartedEvent = FaceTrackingEvent

/** Triggered when a touch event ends. */
type TouchEndEvent = TouchEvent

/** Triggered when a touch position on the screen is moved. */
type TouchMoveEvent = TouchEvent

/** Triggered when a touch event starts. */
type TouchStartEvent = TouchEvent

type TouchTypeException = /* template literal string: TouchType${None|Touch|Tap|DoubleTap|Scale|Pan|Swipe} */ String

/** Represents an animation track using vec2 value keyframes. */
type Vec2AnimationTrack = AnimationTrack

/** Represents an animation track using vec3 value keyframes. */
type Vec3AnimationTrack = AnimationTrack

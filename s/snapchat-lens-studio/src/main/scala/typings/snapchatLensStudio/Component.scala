package typings.snapchatLensStudio

import typings.snapchatLensStudio.Asset.AnimationLayer
import typings.snapchatLensStudio.Asset.AudioTrackAsset
import typings.snapchatLensStudio.Asset.Font
import typings.snapchatLensStudio.Asset.MLAsset
import typings.snapchatLensStudio.Asset.MarkerAsset
import typings.snapchatLensStudio.Asset.Material
import typings.snapchatLensStudio.Asset.RenderMesh
import typings.snapchatLensStudio.Asset.Texture
import typings.snapchatLensStudio.Camera.DepthBufferMode
import typings.snapchatLensStudio.Camera.DeviceProperty
import typings.snapchatLensStudio.Camera.Type
import typings.snapchatLensStudio.LookAtComponent.AimVectors
import typings.snapchatLensStudio.LookAtComponent.LookAtMode
import typings.snapchatLensStudio.LookAtComponent.WorldUpVector
import typings.snapchatLensStudio.MachineLearning.FrameTiming
import typings.snapchatLensStudio.MachineLearning.InferenceMode
import typings.snapchatLensStudio.MachineLearning.ModelState
import typings.snapchatLensStudio.PinToMeshComponent.Orientation
import typings.snapchatLensStudio.anon.CreateEvent
import typings.snapchatLensStudio.snapchatLensStudioInts.`0`
import typings.snapchatLensStudio.snapchatLensStudioInts.`1`
import typings.snapchatLensStudio.snapchatLensStudioInts.`2`
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeDoubleTap
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeNone
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypePan
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeScale
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeSwipe
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeTap
import typings.snapchatLensStudio.snapchatLensStudioStrings.TouchTypeTouch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class for all components. Components are attached to SceneObjects.
  */
trait Component
  extends StObject
     with SerializableWithUID {
  
  /** Destroys the component. */
  def destroy(): Unit
  
  /** If disabled, the Component will stop enacting its behavior. */
  var enabled: Boolean
  
  /** Returns the SceneObject the component is attached to. */
  def getSceneObject(): SceneObject
  
  /** Returns the Transform this component is attached to. */
  def getTransform(): Transform
}
object Component {
  
  inline def apply(
    destroy: () => Unit,
    enabled: Boolean,
    getSceneObject: () => SceneObject,
    getTransform: () => Transform,
    getTypeName: () => String,
    isOfType: String => Boolean,
    isSame: SerializableWithUID => Boolean
  ): Component = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame))
    __obj.asInstanceOf[Component]
  }
  
  /**
    * Used by AnimationMixer to animate a single object in the hierarchy. These are automatically added to SceneObjects when importing animated FBX files. See also: Playing 3D Animation Guide,
    * AnimationMixer, AnimationLayer.
    */
  trait Animation
    extends StObject
       with Component {
    
    /** Returns the AnimationLayer under the name layerName. */
    def getAnimationLayerByName(layerName: String): AnimationLayer
    
    /** Removes the AnimationLayer under the name layerName. */
    def removeAnimationLayerByName(layerName: String): Unit
    
    /** Adds an AnimationLayer under the name layerName. */
    def setAnimationLayerByName(layerName: String, animationLayer: AnimationLayer): Unit
  }
  object Animation {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      getAnimationLayerByName: String => AnimationLayer,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      removeAnimationLayerByName: String => Unit,
      setAnimationLayerByName: (String, AnimationLayer) => Unit
    ): Animation = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getAnimationLayerByName = js.Any.fromFunction1(getAnimationLayerByName), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), removeAnimationLayerByName = js.Any.fromFunction1(removeAnimationLayerByName), setAnimationLayerByName = js.Any.fromFunction2(setAnimationLayerByName))
      __obj.asInstanceOf[Animation]
    }
    
    extension [Self <: Animation](x: Self) {
      
      inline def setGetAnimationLayerByName(value: String => AnimationLayer): Self = StObject.set(x, "getAnimationLayerByName", js.Any.fromFunction1(value))
      
      inline def setRemoveAnimationLayerByName(value: String => Unit): Self = StObject.set(x, "removeAnimationLayerByName", js.Any.fromFunction1(value))
      
      inline def setSetAnimationLayerByName(value: (String, AnimationLayer) => Unit): Self = StObject.set(x, "setAnimationLayerByName", js.Any.fromFunction2(value))
    }
  }
  
  /** Controls playback of animations on the attached SceneObject and its child objects. Please refer to the Playing 3D Animation Guide for setting up and playing animations. */
  trait AnimationMixer
    extends StObject
       with Component {
    
    /** Whether this AnimationMixer is set to automatically play animations on start. */
    var autoplay: Boolean
    
    /** Makes a copy of the layer name and stores it as newName. */
    def cloneLayer(name: String, newName: String): AnimationMixerLayer
    
    /** Adds a new AnimationMixerLayer to this AnimationMixer. */
    def createClip(name: String): AnimationMixerLayer
    
    /** Returns a list of names of AnimationLayers in this AnimationMixer. */
    def getAnimationLayerNames(): js.Array[String]
    
    /** Returns the AnimationMixerLayer with the name name. */
    def getLayer(name: String): AnimationMixerLayer
    
    /** Returns the current time ( seconds: in) of the layer named name. */
    def getLayerTime(name: String): Double
    
    /** Returns a list of all AnimationMixerLayers controlled by the AnimationMixer. */
    def getLayers(): js.Array[AnimationMixerLayer]
    
    /** Pauses animation layers named name, or all layers if name is empty. */
    def pause(name: String): Unit
    
    /** Rebuild the animation hierarchy by finding all Animation components in the SceneObject and its children. */
    def resetAnimations(): Unit
    
    /** Resumes any paused animation layer with name name, or all layers if name is empty. */
    def resume(name: String): Unit
    
    /**
      * A multiplying value for the speed of all animations being controlled by the AnimationMixer. For example, a value of 2.0 will double animation speed, while a value of 0.5 will cut the speed
      * in half.
      */
    var speedRatio: Double
    
    /**
      * Starts playing animation layers named name, or all layers if name is empty. The animation will start with an offset of offset seconds. The animation will play cycles times, or loop forever
      * if cycles is -1.
      */
    def start(name: String, offset: Double, cycles: Double): Unit
    
    /**
      * Starts playing animation layers named name, or all layers if name is empty. The animation will start with an offset of offset seconds. The animation will play cycles times, or loop forever
      * if cycles is -1. eventCallback will be called after any animation layer finishes playing.
      */
    def startWithCallback(
      name: String,
      offset: Double,
      cycles: Double,
      eventCallback: js.Function2[/* name */ String, /* animationMixer */ this.type, Unit]
    ): Unit
    
    /** Stops any animation layer with name name, or all layers if name is empty. */
    def stop(name: String): Unit
  }
  object AnimationMixer {
    
    inline def apply(
      autoplay: Boolean,
      cloneLayer: (String, String) => AnimationMixerLayer,
      createClip: String => AnimationMixerLayer,
      destroy: () => Unit,
      enabled: Boolean,
      getAnimationLayerNames: () => js.Array[String],
      getLayer: String => AnimationMixerLayer,
      getLayerTime: String => Double,
      getLayers: () => js.Array[AnimationMixerLayer],
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      pause: String => Unit,
      resetAnimations: () => Unit,
      resume: String => Unit,
      speedRatio: Double,
      start: (String, Double, Double) => Unit,
      startWithCallback: (String, Double, Double, js.Function2[/* name */ String, AnimationMixer, Unit]) => Unit,
      stop: String => Unit
    ): AnimationMixer = {
      val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], cloneLayer = js.Any.fromFunction2(cloneLayer), createClip = js.Any.fromFunction1(createClip), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getAnimationLayerNames = js.Any.fromFunction0(getAnimationLayerNames), getLayer = js.Any.fromFunction1(getLayer), getLayerTime = js.Any.fromFunction1(getLayerTime), getLayers = js.Any.fromFunction0(getLayers), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), pause = js.Any.fromFunction1(pause), resetAnimations = js.Any.fromFunction0(resetAnimations), resume = js.Any.fromFunction1(resume), speedRatio = speedRatio.asInstanceOf[js.Any], start = js.Any.fromFunction3(start), startWithCallback = js.Any.fromFunction4(startWithCallback), stop = js.Any.fromFunction1(stop))
      __obj.asInstanceOf[AnimationMixer]
    }
    
    extension [Self <: AnimationMixer](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setCloneLayer(value: (String, String) => AnimationMixerLayer): Self = StObject.set(x, "cloneLayer", js.Any.fromFunction2(value))
      
      inline def setCreateClip(value: String => AnimationMixerLayer): Self = StObject.set(x, "createClip", js.Any.fromFunction1(value))
      
      inline def setGetAnimationLayerNames(value: () => js.Array[String]): Self = StObject.set(x, "getAnimationLayerNames", js.Any.fromFunction0(value))
      
      inline def setGetLayer(value: String => AnimationMixerLayer): Self = StObject.set(x, "getLayer", js.Any.fromFunction1(value))
      
      inline def setGetLayerTime(value: String => Double): Self = StObject.set(x, "getLayerTime", js.Any.fromFunction1(value))
      
      inline def setGetLayers(value: () => js.Array[AnimationMixerLayer]): Self = StObject.set(x, "getLayers", js.Any.fromFunction0(value))
      
      inline def setPause(value: String => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction1(value))
      
      inline def setResetAnimations(value: () => Unit): Self = StObject.set(x, "resetAnimations", js.Any.fromFunction0(value))
      
      inline def setResume(value: String => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction1(value))
      
      inline def setSpeedRatio(value: Double): Self = StObject.set(x, "speedRatio", value.asInstanceOf[js.Any])
      
      inline def setStart(value: (String, Double, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStartWithCallback(value: (String, Double, Double, js.Function2[/* name */ String, AnimationMixer, Unit]) => Unit): Self = StObject.set(x, "startWithCallback", js.Any.fromFunction4(value))
      
      inline def setStop(value: String => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Used to play audio in a Lens. You can assign an AudioTrackAsset to play through script or through the AudioComponent’s inspector in Lens Studio. See the Playing Audio guide for more
    * information.
    */
  trait AudioComponent
    extends StObject
       with Component {
    
    /** The audio asset currently assigned to play. */
    var audioTrack: AudioTrackAsset
    
    /** The length ( seconds: in) of the current sound assigned to play. */
    var duration: Double
    
    /** Length ( seconds: in) of a volume fade in applied to the beginning of sound playback. */
    var fadeInTime: Double
    
    /** Length ( seconds: in) of a volume fade out applied to the end of sound playback. */
    var fadeOutTime: Double
    
    /** Returns whether the sound is currently paused. */
    def isPaused(): Boolean
    
    /** Returns whether the AudioComponent is currently playing sound. */
    def isPlaying(): Boolean
    
    /** Pauses the sound. */
    def pause(): Boolean
    
    /** Plays the current sound loops number of times. If loops is -1, the sound will repeat forever. */
    def play(loops: Double): Unit
    
    /** The current playback time in seconds */
    var position: Double
    
    /** Resumes a paused sound. */
    def resume(): Boolean
    
    /** Sets the callback function to be called whenever this sound stops playing. */
    def setOnFinish(eventCallback: js.Function1[/* audioComponent */ this.type, Unit]): Unit
    
    /** Stops the current sound if already playing. */
    def stop(fade: Boolean): Unit
    
    /** A volume multiplier for any sounds played by this AudioComponent. */
    var volume: Double
  }
  object AudioComponent {
    
    inline def apply(
      audioTrack: AudioTrackAsset,
      destroy: () => Unit,
      duration: Double,
      enabled: Boolean,
      fadeInTime: Double,
      fadeOutTime: Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isPaused: () => Boolean,
      isPlaying: () => Boolean,
      isSame: SerializableWithUID => Boolean,
      pause: () => Boolean,
      play: Double => Unit,
      position: Double,
      resume: () => Boolean,
      setOnFinish: js.Function1[AudioComponent, Unit] => Unit,
      stop: Boolean => Unit,
      volume: Double
    ): AudioComponent = {
      val __obj = js.Dynamic.literal(audioTrack = audioTrack.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), duration = duration.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fadeInTime = fadeInTime.asInstanceOf[js.Any], fadeOutTime = fadeOutTime.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isPaused = js.Any.fromFunction0(isPaused), isPlaying = js.Any.fromFunction0(isPlaying), isSame = js.Any.fromFunction1(isSame), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction1(play), position = position.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), setOnFinish = js.Any.fromFunction1(setOnFinish), stop = js.Any.fromFunction1(stop), volume = volume.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioComponent]
    }
    
    extension [Self <: AudioComponent](x: Self) {
      
      inline def setAudioTrack(value: AudioTrackAsset): Self = StObject.set(x, "audioTrack", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFadeInTime(value: Double): Self = StObject.set(x, "fadeInTime", value.asInstanceOf[js.Any])
      
      inline def setFadeOutTime(value: Double): Self = StObject.set(x, "fadeOutTime", value.asInstanceOf[js.Any])
      
      inline def setIsPaused(value: () => Boolean): Self = StObject.set(x, "isPaused", js.Any.fromFunction0(value))
      
      inline def setIsPlaying(value: () => Boolean): Self = StObject.set(x, "isPlaying", js.Any.fromFunction0(value))
      
      inline def setPause(value: () => Boolean): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPlay(value: Double => Unit): Self = StObject.set(x, "play", js.Any.fromFunction1(value))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setResume(value: () => Boolean): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
      
      inline def setSetOnFinish(value: js.Function1[AudioComponent, Unit] => Unit): Self = StObject.set(x, "setOnFinish", js.Any.fromFunction1(value))
      
      inline def setStop(value: Boolean => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Used to add an audio effect to a Lens. When present in the scene, it will automatically apply the selected audio effect to recordings made with the Lens. See the Audio Effect guide for more
    * information.
    */
  type AudioEffectComponent = Component
  
  /**
    * The base class for all mesh rendering components. Comparable to the former class “MeshVisual”, which was split into the classes: BaseMeshVisual, MaterialMeshVisual, and RenderMeshVisual. Lens
    * Studio v2.3+
    */
  trait BaseMeshVisual
    extends StObject
       with Visual {
    
    /**
      * When a ScreenTransform is present on this SceneObject, and extentsTarget is a child of this SceneObject, extentsTarget will be repositioned to match the exact area this MeshVisual is being
      * rendered. Very useful for Image and Text components.
      */
    var extentsTarget: ScreenTransform
    
    /** When a ScreenTransform is attached to the same SceneObject, this controls how the mesh will be positioned horizontally depending on stretchMode. */
    var horizontalAlignment: HorizontalAlignment
    
    /** None = 0, Caster = 1, Receiver = 2 */
    var meshShadowMode: Double
    
    /**
      * Affects the color of shadows being cast by this MeshVisual. The color of the cast shadow is a mix between shadowColor and the material’s base texture color. The alpha value of shadowColor
      * controls the mixing of these two colors, with 0 = shadowColor and 1 = shadowColor * textureColor.
      */
    var shadowColor: vec4
    
    /** Density of shadows cast by this MeshVisual. */
    var shadowDensity: Double
    
    /**
      * Projects screen positions from camera’s view onto the mesh’s UVs. If the MeshVisual’s material uses the same texture as the camera input, the MeshVisual will look identical to the part of
      * the screen it covers.
      */
    def snap(camera: typings.snapchatLensStudio.Component.Camera): Unit
    
    /** When a ScreenTransform is attached to the same SceneObject, this controls how the mesh will be stretched relative to the ScreenTransform’s boundaries. */
    var stretchMode: StretchMode
    
    /** When a ScreenTransform is attached to the same SceneObject, this controls how the mesh will be positioned vertically depending on stretchMode. */
    var verticalAlignment: VerticalAlignment
  }
  object BaseMeshVisual {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      meshShadowMode: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): BaseMeshVisual = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMeshVisual]
    }
    
    extension [Self <: BaseMeshVisual](x: Self) {
      
      inline def setExtentsTarget(value: ScreenTransform): Self = StObject.set(x, "extentsTarget", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setMeshShadowMode(value: Double): Self = StObject.set(x, "meshShadowMode", value.asInstanceOf[js.Any])
      
      inline def setShadowColor(value: vec4): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowDensity(value: Double): Self = StObject.set(x, "shadowDensity", value.asInstanceOf[js.Any])
      
      inline def setSnap(value: typings.snapchatLensStudio.Component.Camera => Unit): Self = StObject.set(x, "snap", js.Any.fromFunction1(value))
      
      inline def setStretchMode(value: StretchMode): Self = StObject.set(x, "stretchMode", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    }
  }
  
  /** Controls blend shapes connected to imported animation content. */
  trait BlendShapes
    extends StObject
       with Component {
    
    /** If enabled, normal directions are also blended by blend shapes. */
    var blendNormals: Boolean
    
    /** Removes all blend shapes from the BlendShapesVisual. */
    def clearBlendShapes(): Unit
    
    /** Returns the weight of blend shape name. */
    def getBlendShape(name: String): Double
    
    /** Returns whether this BlendShapesVisual has a blend shape named name. */
    def hasBlendShape(name: String): Boolean
    
    /** Sets the weight of blend shape name. */
    def setBlendShape(name: String, weight: Double): Unit
    
    /** Clears the blendshape with the matching name from the BlendShapes component. */
    def unsetBlendShape(name: String): Unit
  }
  object BlendShapes {
    
    inline def apply(
      blendNormals: Boolean,
      clearBlendShapes: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      getBlendShape: String => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      hasBlendShape: String => Boolean,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      setBlendShape: (String, Double) => Unit,
      unsetBlendShape: String => Unit
    ): BlendShapes = {
      val __obj = js.Dynamic.literal(blendNormals = blendNormals.asInstanceOf[js.Any], clearBlendShapes = js.Any.fromFunction0(clearBlendShapes), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getBlendShape = js.Any.fromFunction1(getBlendShape), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), hasBlendShape = js.Any.fromFunction1(hasBlendShape), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), setBlendShape = js.Any.fromFunction2(setBlendShape), unsetBlendShape = js.Any.fromFunction1(unsetBlendShape))
      __obj.asInstanceOf[BlendShapes]
    }
    
    extension [Self <: BlendShapes](x: Self) {
      
      inline def setBlendNormals(value: Boolean): Self = StObject.set(x, "blendNormals", value.asInstanceOf[js.Any])
      
      inline def setClearBlendShapes(value: () => Unit): Self = StObject.set(x, "clearBlendShapes", js.Any.fromFunction0(value))
      
      inline def setGetBlendShape(value: String => Double): Self = StObject.set(x, "getBlendShape", js.Any.fromFunction1(value))
      
      inline def setHasBlendShape(value: String => Boolean): Self = StObject.set(x, "hasBlendShape", js.Any.fromFunction1(value))
      
      inline def setSetBlendShape(value: (String, Double) => Unit): Self = StObject.set(x, "setBlendShape", js.Any.fromFunction2(value))
      
      inline def setUnsetBlendShape(value: String => Unit): Self = StObject.set(x, "unsetBlendShape", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Renders the scene to a Render Target texture. A Camera will only render a SceneObject if the SceneObject’s render layer is enabled on the Camera. For more information, see the Camera and
    * Layers guide.
    */
  trait Camera
    extends StObject
       with Component {
    
    /** The aspect ratio of the camera (width/height). */
    var aspect: Double
    
    /** When enableClearColor is true and inputTexture is null, this color is used to clear this Camera’s renderTarget before drawing to it. */
    var clearColor: vec4
    
    /** Determines the way depth is handled on this Camera. Changing this can help sort objects at different distance ranges. */
    var depthBufferMode: DepthBufferMode
    
    /**
      * Controls which Camera settings will be overridden by physical device properties. For example, this can be used to override the fov property to match the device camera’s actual field of
      * view.
      */
    var devicePropertyUsage: DeviceProperty
    
    /**
      * If enabled, this Camera will clear the color on its renderTarget before drawing to it. inputTexture will be used to clear it unless it is null, in which case clearColor is used
      * instead.
      */
    var enableClearColor: Boolean
    
    /** If enabled, this Camera will clear the depth buffer on its renderTarget before drawing to it. */
    var enableClearDepth: Boolean
    
    /** The distance of the far clipping plane. */
    var far: Double
    
    /** The Camera’s field of view in radians. */
    var fov: Double
    
    /** For orthographic cameras, returns the camera size as (width, height). */
    def getOrthographicSize(): vec2
    
    /** When enableClearColor is true, this texture is used to clear this Camera’s renderTarget before drawing. If this texture is null, clearColor will be used instead. */
    var inputTexture: Texture
    
    /** Returns true if a sphere with the specified world space center position and radius is visible within the camera frustum, false otherwise. */
    def isSphereVisible(center: vec3, radius: Double): Boolean
    
    /**
      * A texture controlling which parts of the output texture the camera will draw to. The “red” value of each pixel determines how strongly the camera will draw to that part of the image. For
      * example, a completely black section will cause the camera to not draw there at all. A completely white ( red: or) section will cause the camera to draw normally. Colors in  like:
      * between, gray, will be semitransparent.
      */
    var maskTexture: Texture
    
    /** The distance of the near clipping plane. */
    var near: Double
    
    /**
      * Converts a world space position to a raw screen space position. The screen space position will be returned as a vec3 with x,y representing normalized screen space, and z representing a raw
      * depth value not directly convertible to world units. This returned value will mostly be useful for passing into unproject().
      */
    def project(worldSpacePoint: vec3): vec3
    
    /** Controls the set of layers this Camera will render. */
    var renderLayer: LayerSet
    
    /** The sorting order the Camera renders in. Every frame, Cameras render in ascending order determined by their renderOrder properties. */
    var renderOrder: Double
    
    /** The RenderTarget this Camera will draw to. */
    var renderTarget: Texture
    
    /**
      * Converts a screen space position to a world space position, given an absolute depth. The screen space position should be provided as a vec2 in the range ([0-1], [0-1]), (0,0) being the
      * top-left of the screen and (1,1) being the bottom-right. The returned world space position will be the point absoluteDepth units away from the Camera’s near plane at the point specified
      * in screen space.
      */
    def screenSpaceToWorldSpace(normalizedScreenSpacePoint: vec2, absoluteDepth: Double): vec3
    
    /** The orthographic size of the camera. */
    var size: Double
    
    /** Read-only property describing which type of rendering the camera uses. */
    var `type`: Type
    
    /**
      * Converts a raw screen space position to a world space position. clipSpacePoint should be a vec3 returned from a previous project() call, since the z value represents a raw depth value not
      * directly convertible to world units.
      */
    def unproject(clipSpacePoint: vec3): vec3
    
    /**
      * Converts the world space position worldSpacePoint to a screen space position. Screen positions are represented in the range ([0-1], [0-1]), (0,0) being the top-left of the screen and (1,1)
      * being the bottom-right.
      */
    def worldSpaceToScreenSpace(worldSpacePoint: vec3): vec2
  }
  object Camera {
    
    inline def apply(
      aspect: Double,
      clearColor: vec4,
      depthBufferMode: DepthBufferMode,
      destroy: () => Unit,
      devicePropertyUsage: DeviceProperty,
      enableClearColor: Boolean,
      enableClearDepth: Boolean,
      enabled: Boolean,
      far: Double,
      fov: Double,
      getOrthographicSize: () => vec2,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      inputTexture: Texture,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      isSphereVisible: (vec3, Double) => Boolean,
      maskTexture: Texture,
      near: Double,
      project: vec3 => vec3,
      renderLayer: LayerSet,
      renderOrder: Double,
      renderTarget: Texture,
      screenSpaceToWorldSpace: (vec2, Double) => vec3,
      size: Double,
      `type`: Type,
      unproject: vec3 => vec3,
      worldSpaceToScreenSpace: vec3 => vec2
    ): typings.snapchatLensStudio.Component.Camera = {
      val __obj = js.Dynamic.literal(aspect = aspect.asInstanceOf[js.Any], clearColor = clearColor.asInstanceOf[js.Any], depthBufferMode = depthBufferMode.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), devicePropertyUsage = devicePropertyUsage.asInstanceOf[js.Any], enableClearColor = enableClearColor.asInstanceOf[js.Any], enableClearDepth = enableClearDepth.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any], getOrthographicSize = js.Any.fromFunction0(getOrthographicSize), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), inputTexture = inputTexture.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), isSphereVisible = js.Any.fromFunction2(isSphereVisible), maskTexture = maskTexture.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), renderLayer = renderLayer.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], renderTarget = renderTarget.asInstanceOf[js.Any], screenSpaceToWorldSpace = js.Any.fromFunction2(screenSpaceToWorldSpace), size = size.asInstanceOf[js.Any], unproject = js.Any.fromFunction1(unproject), worldSpaceToScreenSpace = js.Any.fromFunction1(worldSpaceToScreenSpace))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.snapchatLensStudio.Component.Camera]
    }
    
    extension [Self <: typings.snapchatLensStudio.Component.Camera](x: Self) {
      
      inline def setAspect(value: Double): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setClearColor(value: vec4): Self = StObject.set(x, "clearColor", value.asInstanceOf[js.Any])
      
      inline def setDepthBufferMode(value: DepthBufferMode): Self = StObject.set(x, "depthBufferMode", value.asInstanceOf[js.Any])
      
      inline def setDevicePropertyUsage(value: DeviceProperty): Self = StObject.set(x, "devicePropertyUsage", value.asInstanceOf[js.Any])
      
      inline def setEnableClearColor(value: Boolean): Self = StObject.set(x, "enableClearColor", value.asInstanceOf[js.Any])
      
      inline def setEnableClearDepth(value: Boolean): Self = StObject.set(x, "enableClearDepth", value.asInstanceOf[js.Any])
      
      inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
      
      inline def setFov(value: Double): Self = StObject.set(x, "fov", value.asInstanceOf[js.Any])
      
      inline def setGetOrthographicSize(value: () => vec2): Self = StObject.set(x, "getOrthographicSize", js.Any.fromFunction0(value))
      
      inline def setInputTexture(value: Texture): Self = StObject.set(x, "inputTexture", value.asInstanceOf[js.Any])
      
      inline def setIsSphereVisible(value: (vec3, Double) => Boolean): Self = StObject.set(x, "isSphereVisible", js.Any.fromFunction2(value))
      
      inline def setMaskTexture(value: Texture): Self = StObject.set(x, "maskTexture", value.asInstanceOf[js.Any])
      
      inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      inline def setProject(value: vec3 => vec3): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
      
      inline def setRenderLayer(value: LayerSet): Self = StObject.set(x, "renderLayer", value.asInstanceOf[js.Any])
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRenderTarget(value: Texture): Self = StObject.set(x, "renderTarget", value.asInstanceOf[js.Any])
      
      inline def setScreenSpaceToWorldSpace(value: (vec2, Double) => vec3): Self = StObject.set(x, "screenSpaceToWorldSpace", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUnproject(value: vec3 => vec3): Self = StObject.set(x, "unproject", js.Any.fromFunction1(value))
      
      inline def setWorldSpaceToScreenSpace(value: vec3 => vec2): Self = StObject.set(x, "worldSpaceToScreenSpace", js.Any.fromFunction1(value))
    }
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setGetSceneObject(value: () => SceneObject): Self = StObject.set(x, "getSceneObject", js.Any.fromFunction0(value))
    
    inline def setGetTransform(value: () => Transform): Self = StObject.set(x, "getTransform", js.Any.fromFunction0(value))
  }
  
  /**
    * Writes video feed depth information to the depth buffer, which automatically sets up depth occlusion for 3D visuals. Only works in some cases, such as in Lenses for Spectacles 3. See the
    * Lenses for Spectacles guide for more information.
    */
  type DepthSetter = PostEffectVisual
  
  /** Used to track a landmarker in the camera. Moves the SceneObject’s transform to match the detected landmarker scene. See the Landmarker guide for more information. */
  trait DeviceLocationTrackingComponent
    extends StObject
       with Component {
    
    /** Returns the  in: distance, meters, to the location. If the distance is unavailable, -1 is returned. */
    var distanceToLocation: Double
    
    /** Returns whether the location landmarker is currently being tracked. */
    def isTracking(): Boolean
    
    /** Returns the user’s current LocationProximityStatus. Useful for telling if a user is close enough to the location to track it. */
    var locationProximityStatus: LocationProximityStatus
    
    /** A function that gets called when location data fails to download. */
    def onLocationDataDownloadFailed(): Unit
    
    /** A function that gets called when location data is downloaded. */
    def onLocationDataDownloaded(): Unit
    
    /** A function that gets called when location is found. */
    def onLocationFound(): Unit
    
    /** A function that gets called when location is lost. Note this will also happen when the user flips the camera. */
    def onLocationLost(): Unit
  }
  object DeviceLocationTrackingComponent {
    
    inline def apply(
      destroy: () => Unit,
      distanceToLocation: Double,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      isTracking: () => Boolean,
      locationProximityStatus: LocationProximityStatus,
      onLocationDataDownloadFailed: () => Unit,
      onLocationDataDownloaded: () => Unit,
      onLocationFound: () => Unit,
      onLocationLost: () => Unit
    ): DeviceLocationTrackingComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), distanceToLocation = distanceToLocation.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), isTracking = js.Any.fromFunction0(isTracking), locationProximityStatus = locationProximityStatus.asInstanceOf[js.Any], onLocationDataDownloadFailed = js.Any.fromFunction0(onLocationDataDownloadFailed), onLocationDataDownloaded = js.Any.fromFunction0(onLocationDataDownloaded), onLocationFound = js.Any.fromFunction0(onLocationFound), onLocationLost = js.Any.fromFunction0(onLocationLost))
      __obj.asInstanceOf[DeviceLocationTrackingComponent]
    }
    
    extension [Self <: DeviceLocationTrackingComponent](x: Self) {
      
      inline def setDistanceToLocation(value: Double): Self = StObject.set(x, "distanceToLocation", value.asInstanceOf[js.Any])
      
      inline def setIsTracking(value: () => Boolean): Self = StObject.set(x, "isTracking", js.Any.fromFunction0(value))
      
      inline def setLocationProximityStatus(value: LocationProximityStatus): Self = StObject.set(x, "locationProximityStatus", value.asInstanceOf[js.Any])
      
      inline def setOnLocationDataDownloadFailed(value: () => Unit): Self = StObject.set(x, "onLocationDataDownloadFailed", js.Any.fromFunction0(value))
      
      inline def setOnLocationDataDownloaded(value: () => Unit): Self = StObject.set(x, "onLocationDataDownloaded", js.Any.fromFunction0(value))
      
      inline def setOnLocationFound(value: () => Unit): Self = StObject.set(x, "onLocationFound", js.Any.fromFunction0(value))
      
      inline def setOnLocationLost(value: () => Unit): Self = StObject.set(x, "onLocationLost", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Moves or rotates the SceneObject to match device orientation.
    *
    * If using “Surface” tracking mode, adding this to a SceneObject enables surface
    * tracking for the scene, and moves the object to a position and rotation that
    * matches the physical camera’s pose in the world. Surface tracking can also be
    * enhanced with native AR by enabling the “Use Native AR” option in the
    * Inspector panel, or through script by setting the component’s
    * surfaceOptions.enhanceWithNativeAR property.
    *
    * If using “Rotation” tracking mode, adding this to a SceneObject will apply the
    * device’s real world rotation to the object.
    *
    * If using “World” tracking mode, adding this to a SceneObject enables native AR
    * tracking for the scene, and moves the object to a position and rotation that
    * matches the physical camera’s pose in the world.
    *
    * See the Tracking Modes guide for more information.
    *
    * Note: This component was named “WorldTracking” in previous versions of Lens
    * Studio.
    */
  trait DeviceTracking
    extends StObject
       with Component {
    
    /** Calculates a histogram of world mesh surfaces within a sphere at the given world position and radius. Only available when world mesh tracking is supported and enabled. */
    def calculateWorldMeshHistogram(center: vec3, radius: Double): TrackedMeshHistogramResult
    
    /** Returns the actual DeviceTrackingMode being used. This may be different from the requested DeviceTrackingMode. */
    def getActualDeviceTrackingMode(): DeviceTrackingMode
    
    /**
      * Returns an array of BasicTransform objects describing each point that the camera travels through. Each item in the array matches the camera’s basic transform in the corresponding frame of
      * the video feed that the Lens is applied to. Only available in some cases, such as in Lenses for Spectacles 3. When not available, it will return an empty array. See the Lenses
      * for Spectacles guide for more information.
      */
    def getDevicePath(): js.Array[BasicTransform]
    
    /**
      * Returns the current frame index of the video feed that the Lens is being applied to. This can be used as an index to access the current BasicTransform in getDevicePath(). Only available in
      * some cases, such as in Lenses for Spectacles 3. When not available, it will return -1. See the Lenses for Spectacles guide for more information.
      */
    def getDevicePathIndex(): Double
    
    /** Returns the DeviceTrackingMode currently requested to be used. This may be different from the actual DeviceTrackingMode being used. */
    def getRequestedDeviceTrackingMode(): DeviceTrackingMode
    
    /** Returns an array of TrackedMeshHitTestResult that intersect with a ray cast from screen position screenPos. Only available when world mesh tracking is supported and enabled. */
    def hitTestWorldMesh(screenPos: vec2): js.Array[TrackedMeshHitTestResult]
    
    /** Returns whether the DeviceTrackingMode is supported. */
    def isDeviceTrackingModeSupported(mode: DeviceTrackingMode): Boolean
    
    /**
      * Returns an array of TrackedMeshHitTestResult that intersect with a ray cast from the world position from and continuing through the world position to. Only available when world mesh
      * tracking is supported and enabled.
      */
    def raycastWorldMesh(from: vec3, to: vec3): js.Array[TrackedMeshHitTestResult]
    
    /** Requests that a DeviceTrackingMode be used. This requested change may not happen immediately. */
    def requestDeviceTrackingMode(`val`: DeviceTrackingMode): Unit
    
    /**
      * Resets the World Tracking origin to the point on the surface plane aligned with the screen position position. Screen positions are represented in the range ([0-1], [0-1]), (0,0) being the
      * top-left of the screen and (1,1) being the bottom-right.
      */
    def resetTracking(position: vec2): Unit
    
    /** Used to access rotation tracking settings. */
    var rotationOptions: RotationOptions
    
    /**
      * Offsets the default position of the World Tracking surface origin by offset. Avoid using a y value of zero in offset, because it may cause problems with tracking. If used outside of
      * Initialized or TurnOnEvent, you will need to call resetTracking() to apply the offset. Note: calling resetTracking() will overwrite the x and z components of the offset.
      */
    def setWorldOriginOffset(offset: vec3): Unit
    
    /** Used to access surface tracking settings. */
    var surfaceOptions: SurfaceOptions
    
    /** Helps to improve surface tracking accuracy while the target SceneObject is being moved. */
    var surfaceTrackingTarget: SceneObject
    
    /** Returns the WorldOptions object of this component, which can be used to control World Tracking settings. */
    var worldOptions: WorldOptions
    
    /** Returns the World Tracking Capabilities of the current device. */
    var worldTrackingCapabilities: WorldTrackingCapabilities
  }
  object DeviceTracking {
    
    inline def apply(
      calculateWorldMeshHistogram: (vec3, Double) => TrackedMeshHistogramResult,
      destroy: () => Unit,
      enabled: Boolean,
      getActualDeviceTrackingMode: () => DeviceTrackingMode,
      getDevicePath: () => js.Array[BasicTransform],
      getDevicePathIndex: () => Double,
      getRequestedDeviceTrackingMode: () => DeviceTrackingMode,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      hitTestWorldMesh: vec2 => js.Array[TrackedMeshHitTestResult],
      isDeviceTrackingModeSupported: DeviceTrackingMode => Boolean,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      raycastWorldMesh: (vec3, vec3) => js.Array[TrackedMeshHitTestResult],
      requestDeviceTrackingMode: DeviceTrackingMode => Unit,
      resetTracking: vec2 => Unit,
      rotationOptions: RotationOptions,
      setWorldOriginOffset: vec3 => Unit,
      surfaceOptions: SurfaceOptions,
      surfaceTrackingTarget: SceneObject,
      worldOptions: WorldOptions,
      worldTrackingCapabilities: WorldTrackingCapabilities
    ): DeviceTracking = {
      val __obj = js.Dynamic.literal(calculateWorldMeshHistogram = js.Any.fromFunction2(calculateWorldMeshHistogram), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getActualDeviceTrackingMode = js.Any.fromFunction0(getActualDeviceTrackingMode), getDevicePath = js.Any.fromFunction0(getDevicePath), getDevicePathIndex = js.Any.fromFunction0(getDevicePathIndex), getRequestedDeviceTrackingMode = js.Any.fromFunction0(getRequestedDeviceTrackingMode), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), hitTestWorldMesh = js.Any.fromFunction1(hitTestWorldMesh), isDeviceTrackingModeSupported = js.Any.fromFunction1(isDeviceTrackingModeSupported), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), raycastWorldMesh = js.Any.fromFunction2(raycastWorldMesh), requestDeviceTrackingMode = js.Any.fromFunction1(requestDeviceTrackingMode), resetTracking = js.Any.fromFunction1(resetTracking), rotationOptions = rotationOptions.asInstanceOf[js.Any], setWorldOriginOffset = js.Any.fromFunction1(setWorldOriginOffset), surfaceOptions = surfaceOptions.asInstanceOf[js.Any], surfaceTrackingTarget = surfaceTrackingTarget.asInstanceOf[js.Any], worldOptions = worldOptions.asInstanceOf[js.Any], worldTrackingCapabilities = worldTrackingCapabilities.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceTracking]
    }
    
    extension [Self <: DeviceTracking](x: Self) {
      
      inline def setCalculateWorldMeshHistogram(value: (vec3, Double) => TrackedMeshHistogramResult): Self = StObject.set(x, "calculateWorldMeshHistogram", js.Any.fromFunction2(value))
      
      inline def setGetActualDeviceTrackingMode(value: () => DeviceTrackingMode): Self = StObject.set(x, "getActualDeviceTrackingMode", js.Any.fromFunction0(value))
      
      inline def setGetDevicePath(value: () => js.Array[BasicTransform]): Self = StObject.set(x, "getDevicePath", js.Any.fromFunction0(value))
      
      inline def setGetDevicePathIndex(value: () => Double): Self = StObject.set(x, "getDevicePathIndex", js.Any.fromFunction0(value))
      
      inline def setGetRequestedDeviceTrackingMode(value: () => DeviceTrackingMode): Self = StObject.set(x, "getRequestedDeviceTrackingMode", js.Any.fromFunction0(value))
      
      inline def setHitTestWorldMesh(value: vec2 => js.Array[TrackedMeshHitTestResult]): Self = StObject.set(x, "hitTestWorldMesh", js.Any.fromFunction1(value))
      
      inline def setIsDeviceTrackingModeSupported(value: DeviceTrackingMode => Boolean): Self = StObject.set(x, "isDeviceTrackingModeSupported", js.Any.fromFunction1(value))
      
      inline def setRaycastWorldMesh(value: (vec3, vec3) => js.Array[TrackedMeshHitTestResult]): Self = StObject.set(x, "raycastWorldMesh", js.Any.fromFunction2(value))
      
      inline def setRequestDeviceTrackingMode(value: DeviceTrackingMode => Unit): Self = StObject.set(x, "requestDeviceTrackingMode", js.Any.fromFunction1(value))
      
      inline def setResetTracking(value: vec2 => Unit): Self = StObject.set(x, "resetTracking", js.Any.fromFunction1(value))
      
      inline def setRotationOptions(value: RotationOptions): Self = StObject.set(x, "rotationOptions", value.asInstanceOf[js.Any])
      
      inline def setSetWorldOriginOffset(value: vec3 => Unit): Self = StObject.set(x, "setWorldOriginOffset", js.Any.fromFunction1(value))
      
      inline def setSurfaceOptions(value: SurfaceOptions): Self = StObject.set(x, "surfaceOptions", value.asInstanceOf[js.Any])
      
      inline def setSurfaceTrackingTarget(value: SceneObject): Self = StObject.set(x, "surfaceTrackingTarget", value.asInstanceOf[js.Any])
      
      inline def setWorldOptions(value: WorldOptions): Self = StObject.set(x, "worldOptions", value.asInstanceOf[js.Any])
      
      inline def setWorldTrackingCapabilities(value: WorldTrackingCapabilities): Self = StObject.set(x, "worldTrackingCapabilities", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Applies an eye color effect to a face.
    * ```
    * // Prints the eye property `faceIndex`, the face the eye color effect is applied to
    * var face = script.getSceneObject().getFirstComponent("Component.EyeColorVisual").faceIndex;
    *
    * print("faceIndex = " + face.toString())
    * ```
    */
  trait EyeColorVisual
    extends StObject
       with MaterialMeshVisual {
    
    /** The index of the face this EyeColorVisual is attached to. */
    var faceIndex: Double
  }
  object EyeColorVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      faceIndex: Double,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): EyeColorVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[EyeColorVisual]
    }
    
    extension [Self <: EyeColorVisual](x: Self) {
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Draws a section of a tracked face.
    */
  trait FaceInsetVisual
    extends StObject
       with MaterialMeshVisual {
    
    /** The index of the face this FaceInsetVisual uses. */
    var faceIndex: Double
    
    /** The region of the face this FaceInsetVisual draws. */
    var faceRegion: FaceInsetRegion
    
    /** Flips the drawn face region horizontally if enabled. */
    var flipX: Boolean
    
    /** Flips the drawn face region vertically if enabled. */
    var flipY: Boolean
    
    /** The amount of alpha fading applied from the border of the face inset inward. This value must be in the range 0-1. */
    var innerBorderRadius: Double
    
    /** The amount of alpha fading applied from the border of the face inset outward. This value must be in the range 0-1. */
    var outerBorderRadius: Double
    
    /**
      * The x and y scaling used to draw the face region. Think of scaling as meaning how many times the face region could fit into the drawing area. Higher values will zoom away from the face
      * region, and lower values will zoom into it. The normal, unzoomed scaling value is (1,1).
      */
    var sourceScale: vec2
    
    /** Determines the quality of the face inset’s borders. A higher value means better looking borders but lower performance. This value must be greater than 10 and less than 100. */
    var subdivisionsCount: Double
  }
  object FaceInsetVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      faceIndex: Double,
      faceRegion: FaceInsetRegion,
      flipX: Boolean,
      flipY: Boolean,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      innerBorderRadius: Double,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      outerBorderRadius: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      sourceScale: vec2,
      stretchMode: StretchMode,
      subdivisionsCount: Double,
      verticalAlignment: VerticalAlignment
    ): FaceInsetVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], faceRegion = faceRegion.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], innerBorderRadius = innerBorderRadius.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], outerBorderRadius = outerBorderRadius.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), sourceScale = sourceScale.asInstanceOf[js.Any], stretchMode = stretchMode.asInstanceOf[js.Any], subdivisionsCount = subdivisionsCount.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceInsetVisual]
    }
    
    extension [Self <: FaceInsetVisual](x: Self) {
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setFaceRegion(value: FaceInsetRegion): Self = StObject.set(x, "faceRegion", value.asInstanceOf[js.Any])
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setInnerBorderRadius(value: Double): Self = StObject.set(x, "innerBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setOuterBorderRadius(value: Double): Self = StObject.set(x, "outerBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setSourceScale(value: vec2): Self = StObject.set(x, "sourceScale", value.asInstanceOf[js.Any])
      
      inline def setSubdivisionsCount(value: Double): Self = StObject.set(x, "subdivisionsCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Applies a face mask effect. See the Face Mask Guide for more information.
    * ```
    * // Run this in the "Frame Updated" event to switch between drawn faces twice a second
    * // Make sure "Use Orig. Face" is enabled on the FaceMask
    *
    * //@input Component.FaceMaskVisual faceMask
    * //@input Component.Head head
    *
    * var numFaces = script.head.getFacesCount();
    * script.faceMask.originalFaceIndex = Math.floor(getTime() * 2.0) % numFaces;
    * ```
    */
  trait FaceMaskVisual
    extends StObject
       with MaterialMeshVisual {
    
    var customMaskOnMouthClosed: Texture
    
    /** The index of the face this effect is attached to. */
    var faceIndex: Double
    
    var hidesMaskOnMouthClosed: Boolean
    
    /** If “Use Orig. Face” is enabled for this FaceMaskVisual in the Inspector panel, this property specifies the face index to use for drawing the mask. */
    var originalFaceIndex: Double
    
    var swapsMaskOnMouthClosed: Boolean
    
    var teethAlpha: Double
  }
  object FaceMaskVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      customMaskOnMouthClosed: Texture,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      faceIndex: Double,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      hidesMaskOnMouthClosed: Boolean,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      originalFaceIndex: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      swapsMaskOnMouthClosed: Boolean,
      teethAlpha: Double,
      verticalAlignment: VerticalAlignment
    ): FaceMaskVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), customMaskOnMouthClosed = customMaskOnMouthClosed.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), hidesMaskOnMouthClosed = hidesMaskOnMouthClosed.asInstanceOf[js.Any], horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], originalFaceIndex = originalFaceIndex.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], swapsMaskOnMouthClosed = swapsMaskOnMouthClosed.asInstanceOf[js.Any], teethAlpha = teethAlpha.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceMaskVisual]
    }
    
    extension [Self <: FaceMaskVisual](x: Self) {
      
      inline def setCustomMaskOnMouthClosed(value: Texture): Self = StObject.set(x, "customMaskOnMouthClosed", value.asInstanceOf[js.Any])
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setHidesMaskOnMouthClosed(value: Boolean): Self = StObject.set(x, "hidesMaskOnMouthClosed", value.asInstanceOf[js.Any])
      
      inline def setOriginalFaceIndex(value: Double): Self = StObject.set(x, "originalFaceIndex", value.asInstanceOf[js.Any])
      
      inline def setSwapsMaskOnMouthClosed(value: Boolean): Self = StObject.set(x, "swapsMaskOnMouthClosed", value.asInstanceOf[js.Any])
      
      inline def setTeethAlpha(value: Double): Self = StObject.set(x, "teethAlpha", value.asInstanceOf[js.Any])
    }
  }
  
  /** Applies a face stretch effect. Face stretch features can be added to a FaceStretchVisual through the Inspector panel in Lens Studio. See the Face Stretch Guide for more information. */
  trait FaceStretchVisual
    extends StObject
       with BaseMeshVisual {
    
    /** The index of the face the stretch will be applied to. */
    var faceIndex: Double
    
    /** Returns the weight of the face stretch feature named feature. */
    def getFeatureWeight(feature: String): Double
    
    /** Sets the weight of the face stretch feature named feature to intensity. The intensity must be greater than -0.5 and less than 2. */
    def setFeatureWeight(feature: String, intensity: Double): Unit
  }
  object FaceStretchVisual {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      faceIndex: Double,
      getFeatureWeight: String => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      meshShadowMode: Double,
      setFeatureWeight: (String, Double) => Unit,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): FaceStretchVisual = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getFeatureWeight = js.Any.fromFunction1(getFeatureWeight), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setFeatureWeight = js.Any.fromFunction2(setFeatureWeight), setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[FaceStretchVisual]
    }
    
    extension [Self <: FaceStretchVisual](x: Self) {
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setGetFeatureWeight(value: String => Double): Self = StObject.set(x, "getFeatureWeight", js.Any.fromFunction1(value))
      
      inline def setSetFeatureWeight(value: (String, Double) => Unit): Self = StObject.set(x, "setFeatureWeight", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * @deprecated
    * This class has been Deprecated. Please instead use the DeviceTracking component with Tracking Mode set to Rotation. See the Tracking Modes guide for more information. Applies the device’s
    * gyroscope rotation to the SceneObject it is attached to.
    */
  type Gyroscope = Component
  
  /** Binds the SceneObject to a tracked face. See the Head Attached 3D Objects Guide for more information. */
  trait Head
    extends StObject
       with Component {
    
    /** The index of the face this head is attached to. */
    var faceIndex: Double
    
    /** Returns the total number of faces currently being tracked. */
    def getFacesCount(): Double
    
    /** Returns the screen position of the face landmark at the passed in index. */
    def getLandmark(index: Double): vec2
    
    /** Returns the number of face landmarks being tracked. */
    def getLandmarkCount(): Double
    
    /** Returns a list of screen positions of all tracked landmarks. */
    def getLandmarks(): js.Array[vec2]
    
    /** Changes the attachment point type used to anchor this object to a face. */
    def setAttachmentPointType(attachmentPointType: AttachmentPointType): Unit
  }
  object Head {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      faceIndex: Double,
      getFacesCount: () => Double,
      getLandmark: Double => vec2,
      getLandmarkCount: () => Double,
      getLandmarks: () => js.Array[vec2],
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      setAttachmentPointType: AttachmentPointType => Unit
    ): Head = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getFacesCount = js.Any.fromFunction0(getFacesCount), getLandmark = js.Any.fromFunction1(getLandmark), getLandmarkCount = js.Any.fromFunction0(getLandmarkCount), getLandmarks = js.Any.fromFunction0(getLandmarks), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), setAttachmentPointType = js.Any.fromFunction1(setAttachmentPointType))
      __obj.asInstanceOf[Head]
    }
    
    extension [Self <: Head](x: Self) {
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setGetFacesCount(value: () => Double): Self = StObject.set(x, "getFacesCount", js.Any.fromFunction0(value))
      
      inline def setGetLandmark(value: Double => vec2): Self = StObject.set(x, "getLandmark", js.Any.fromFunction1(value))
      
      inline def setGetLandmarkCount(value: () => Double): Self = StObject.set(x, "getLandmarkCount", js.Any.fromFunction0(value))
      
      inline def setGetLandmarks(value: () => js.Array[vec2]): Self = StObject.set(x, "getLandmarks", js.Any.fromFunction0(value))
      
      inline def setSetAttachmentPointType(value: AttachmentPointType => Unit): Self = StObject.set(x, "setAttachmentPointType", js.Any.fromFunction1(value))
    }
  }
  
  /** Used to show and hide hints to the user. For more information and useful helper scripts, see the Scripting Hints Guide. */
  trait HintsComponent
    extends StObject
       with Component {
    
    /** Hides the hint with id hintID. */
    @JSName("hideHint")
    def hideHint_0(
      hintID: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(hintID : / * template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} * / string, time : number): boolean>[0] */ js.Any
    ): Boolean
    
    /** Shows the hint with id hintID for a duration of duration seconds. Use a duration of -1 to keep the hint onscreen forever. */
    def showHint(
      hintID: /* template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} */ String,
      time: Double
    ): Boolean
  }
  object HintsComponent {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      hideHint: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(hintID : / * template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} * / string, time : number): boolean>[0] */ js.Any => Boolean,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      showHint: (/* template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} */ String, Double) => Boolean
    ): HintsComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), hideHint = js.Any.fromFunction1(hideHint), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), showHint = js.Any.fromFunction2(showHint))
      __obj.asInstanceOf[HintsComponent]
    }
    
    extension [Self <: HintsComponent](x: Self) {
      
      inline def setHideHint(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(hintID : / * template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} * / string, time : number): boolean>[0] */ js.Any => Boolean
      ): Self = StObject.set(x, "hideHint", js.Any.fromFunction1(value))
      
      inline def setShowHint(
        value: (/* template literal string: lens_hint_${|blow_a_kiss|come_closer|do_not_${smile|try_with_a_friend}|find_face|keep_raising_your_eyebrows|kiss|kiss_again|look_${around|down|left|right|up}|make_some_noise|nod_your_head|now_${kiss|open_your_mouth|raise_your_eyebrows|smile}|open_your_${mouth|mouth_again}|raise_${eyebrows_or_open_mouth|your_eyebrows|your_eyebrows_again}|smile|smile_again|swap_camera|tap|tap_${a_surface|ground|ground_to_place|surface_to_place}|try_${friend|rear_camera}|turn_around|walk_through_the_door} */ String, Double) => Boolean
      ): Self = StObject.set(x, "showHint", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * A 2D visual used for drawing texture assets. Commonly used with ScreenTransform for drawing images on the screen.
    * ```
    * //@input Component.Image image
    * //@input Asset.Texture texture
    *
    * // Set the Image component's texture
    * script.image.mainPass.baseTex = script.texture;
    *
    * // Set the Image's pivot point
    * script.image.pivot = new vec2(1, 1);
    * ```
    */
  trait Image
    extends StObject
       with MaterialMeshVisual {
    
    /** If enabled, the drawn image will be flipped horizontally. */
    var flipX: Boolean
    
    /** If enabled, the drawn image will be flipped vertically. */
    var flipY: Boolean
    
    /** The location of the Image’s pivot point relative to its boundaries. Where (-1, -1) is the bottom left corner, (0, 0) is the center, and (1, 1) is the top right corner of the Image. */
    var pivot: vec2
  }
  object Image {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      flipX: Boolean,
      flipY: Boolean,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      pivot: vec2,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): Image = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setPivot(value: vec2): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    }
  }
  
  /** Acts as a source of light in the scene. See the Light and Shadows guide for more information about lighting. */
  trait LightSource
    extends StObject
       with Component {
    
    /** If enabled, the LightSource will be automatically positioned based on its orientation relative to any shadow casting meshes in the scene. */
    var autoLightSourcePosition: Boolean
    
    /** If enabled, shadowFrustumSize will be automatically updated based on its orientation relative to any shadow casting meshes in the scene. */
    var autoShadowFrustumSize: Boolean
    
    /** If enabled, the LightSource will be able to cast shadows. */
    var castsShadows: Boolean
    
    /** The color of the light. */
    var color: vec3
    
    /** A color image applied to an imaginary skybox the LightSource will use for color information. */
    var diffuseEnvmapTexture: Texture
    
    /** A value used to increase the intensity of light information derived from the diffuseEnvmapTexture exponentially. */
    var envmapExposure: Double
    
    /** Controls the amount of rotation applied to the diffuseEnvmapTexture. */
    var envmapRotation: Double
    
    /** The strength of the light on a scale of 0.0 – 1.0. */
    var intensity: Double
    
    /** The set of layers this LightSource will affect. */
    var renderLayer: LayerSet
    
    /** Controls the blurring size used when casting shadows from this LightSource. */
    var shadowBlurRadius: Double
    
    /** Controls the color used when casting shadows from this LightSource. */
    var shadowColor: vec4
    
    /** The lightness and darkness value of the shadow cast by objects from this light source. */
    var shadowDensity: Double
    
    /** The maximum distance at which shadows will be calculated for this LightSource. */
    var shadowFrustumFarClipPlane: Double
    
    /** The minimum distance at which shadows will be calculated for this LightSource. */
    var shadowFrustumNearClipPlane: Double
    
    /** The simulated distance of the light source from objects to calculate the softness of the shadow. */
    var shadowFrustumSize: Double
    
    /** A color image applied to an imaginary skybox the light source will use for specular and reflection information. */
    var specularEnvmapTexture: Texture
    
    /** Enable if you would like the LightSource to use information from the diffuseEnvmapTexture for light color information. */
    var useEnvmap: Boolean
  }
  object LightSource {
    
    inline def apply(
      autoLightSourcePosition: Boolean,
      autoShadowFrustumSize: Boolean,
      castsShadows: Boolean,
      color: vec3,
      destroy: () => Unit,
      diffuseEnvmapTexture: Texture,
      enabled: Boolean,
      envmapExposure: Double,
      envmapRotation: Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      intensity: Double,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      renderLayer: LayerSet,
      shadowBlurRadius: Double,
      shadowColor: vec4,
      shadowDensity: Double,
      shadowFrustumFarClipPlane: Double,
      shadowFrustumNearClipPlane: Double,
      shadowFrustumSize: Double,
      specularEnvmapTexture: Texture,
      useEnvmap: Boolean
    ): LightSource = {
      val __obj = js.Dynamic.literal(autoLightSourcePosition = autoLightSourcePosition.asInstanceOf[js.Any], autoShadowFrustumSize = autoShadowFrustumSize.asInstanceOf[js.Any], castsShadows = castsShadows.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), diffuseEnvmapTexture = diffuseEnvmapTexture.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], envmapExposure = envmapExposure.asInstanceOf[js.Any], envmapRotation = envmapRotation.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), intensity = intensity.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), renderLayer = renderLayer.asInstanceOf[js.Any], shadowBlurRadius = shadowBlurRadius.asInstanceOf[js.Any], shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], shadowFrustumFarClipPlane = shadowFrustumFarClipPlane.asInstanceOf[js.Any], shadowFrustumNearClipPlane = shadowFrustumNearClipPlane.asInstanceOf[js.Any], shadowFrustumSize = shadowFrustumSize.asInstanceOf[js.Any], specularEnvmapTexture = specularEnvmapTexture.asInstanceOf[js.Any], useEnvmap = useEnvmap.asInstanceOf[js.Any])
      __obj.asInstanceOf[LightSource]
    }
    
    extension [Self <: LightSource](x: Self) {
      
      inline def setAutoLightSourcePosition(value: Boolean): Self = StObject.set(x, "autoLightSourcePosition", value.asInstanceOf[js.Any])
      
      inline def setAutoShadowFrustumSize(value: Boolean): Self = StObject.set(x, "autoShadowFrustumSize", value.asInstanceOf[js.Any])
      
      inline def setCastsShadows(value: Boolean): Self = StObject.set(x, "castsShadows", value.asInstanceOf[js.Any])
      
      inline def setColor(value: vec3): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDiffuseEnvmapTexture(value: Texture): Self = StObject.set(x, "diffuseEnvmapTexture", value.asInstanceOf[js.Any])
      
      inline def setEnvmapExposure(value: Double): Self = StObject.set(x, "envmapExposure", value.asInstanceOf[js.Any])
      
      inline def setEnvmapRotation(value: Double): Self = StObject.set(x, "envmapRotation", value.asInstanceOf[js.Any])
      
      inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
      
      inline def setRenderLayer(value: LayerSet): Self = StObject.set(x, "renderLayer", value.asInstanceOf[js.Any])
      
      inline def setShadowBlurRadius(value: Double): Self = StObject.set(x, "shadowBlurRadius", value.asInstanceOf[js.Any])
      
      inline def setShadowColor(value: vec4): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      inline def setShadowDensity(value: Double): Self = StObject.set(x, "shadowDensity", value.asInstanceOf[js.Any])
      
      inline def setShadowFrustumFarClipPlane(value: Double): Self = StObject.set(x, "shadowFrustumFarClipPlane", value.asInstanceOf[js.Any])
      
      inline def setShadowFrustumNearClipPlane(value: Double): Self = StObject.set(x, "shadowFrustumNearClipPlane", value.asInstanceOf[js.Any])
      
      inline def setShadowFrustumSize(value: Double): Self = StObject.set(x, "shadowFrustumSize", value.asInstanceOf[js.Any])
      
      inline def setSpecularEnvmapTexture(value: Texture): Self = StObject.set(x, "specularEnvmapTexture", value.asInstanceOf[js.Any])
      
      inline def setUseEnvmap(value: Boolean): Self = StObject.set(x, "useEnvmap", value.asInstanceOf[js.Any])
    }
  }
  
  /** Applies a liquify effect to anything rendered behind it. */
  trait LiquifyVisual
    extends StObject
       with BaseMeshVisual {
    
    /** How strong the liquify effect is. */
    var intensity: Double
    
    /** The radius of the liquify effect circle. */
    var radius: Double
  }
  object LiquifyVisual {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      intensity: Double,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      meshShadowMode: Double,
      radius: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): LiquifyVisual = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), meshShadowMode = meshShadowMode.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiquifyVisual]
    }
    
    extension [Self <: LiquifyVisual](x: Self) {
      
      inline def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  /** Every frame, LookAtComponent rotates its SceneObject to face towards a target SceneObject. */
  trait LookAtComponent
    extends StObject
       with Component {
    
    /**
      * The “aim” and “up” vectors used when determining rotation. LookAtComponent will try to point the Aim axis of the SceneObject towards the target, while keeping the Up axis of the
      * SceneObject pointing towards worldUpVector.
      */
    var aimVectors: AimVectors
    
    /** Controls the method of rotation being used. */
    var lookAtMode: LookAtMode
    
    /** Adds an additional rotation offset. */
    var offsetRotation: quat
    
    /** The SceneObject this LookAtComponent targets. */
    var target: SceneObject
    
    /** The vector to be considered the “up” vector when determining rotation. */
    var worldUpVector: WorldUpVector
  }
  object LookAtComponent {
    
    inline def apply(
      aimVectors: AimVectors,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      lookAtMode: LookAtMode,
      offsetRotation: quat,
      target: SceneObject,
      worldUpVector: WorldUpVector
    ): typings.snapchatLensStudio.Component.LookAtComponent = {
      val __obj = js.Dynamic.literal(aimVectors = aimVectors.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), lookAtMode = lookAtMode.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], worldUpVector = worldUpVector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.snapchatLensStudio.Component.LookAtComponent]
    }
    
    extension [Self <: typings.snapchatLensStudio.Component.LookAtComponent](x: Self) {
      
      inline def setAimVectors(value: AimVectors): Self = StObject.set(x, "aimVectors", value.asInstanceOf[js.Any])
      
      inline def setLookAtMode(value: LookAtMode): Self = StObject.set(x, "lookAtMode", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotation(value: quat): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: SceneObject): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setWorldUpVector(value: WorldUpVector): Self = StObject.set(x, "worldUpVector", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Transforms inputs (Textures or Float32Array) into outputs (Textures or Float32Array) using a neural network. The neural network is represented by an MLAsset, which is set as the model
    * property. For more information, see the MLComponent Overview.
    */
  trait MLComponent
    extends StObject
       with Component {
    
    /** Builds the MLComponent model when all placeholders are determined. Config is an array of Input and Output placeholders. */
    def build(placeholders: js.Array[BasePlaceholder]): Unit
    
    /** Stops running the MLComponent. The onRunningFinished callback will not be executed. */
    def cancel(): Unit
    
    /** Returns the InputPlaceholder with the matching name. */
    def getInput(name: String): InputPlaceholder
    
    /** Returns the OutputPlaceholder with the matching name. */
    def getOutput(name: String): OutputPlaceholder
    
    /** Returns the end time of the scheduled MLComponent run. */
    def getScheduledEnd(): FrameTiming
    
    /** Returns the start time of the scheduled MLComponent run. */
    def getScheduledStart(): FrameTiming
    
    /** Controls the inference mode that MLComponent will run in. For example, GPU, CPU, etc. */
    var inferenceMode: InferenceMode
    
    /** Returns true if running is requested on each frame. */
    def isRecurring(): Boolean
    
    /** Binary ML model supplied by the user. */
    var model: MLAsset
    
    /** Function that gets called when model loading is finished. */
    def onLoadingFinished(): Unit
    
    /** Function that gets called when the model stops running. */
    def onRunningFinished(): Unit
    
    /** Render order of the MLComponent. */
    var renderOrder: Double
    
    /** Runs the MLComponent once. */
    def runImmediate(sync: Boolean): Unit
    
    /** Schedules the MLComponent to run at the start timing and terminate at the end timing. The scheduled running will recur if recurring is true. */
    def runScheduled(recurring: Boolean, startTiming: FrameTiming, endTiming: FrameTiming): Unit
    
    /** Returns the current status of the neural network model. */
    var state: ModelState
    
    /** Stops running the MLComponent. */
    def stop(): Unit
    
    /** If loading asynchronously, makes the entire system wait until loading is finished. */
    def waitOnLoading(): Unit
    
    /** If running asynchronously, makes the entire system wait until the last run is finished. */
    def waitOnRunning(): Unit
  }
  object MLComponent {
    
    inline def apply(
      build: js.Array[BasePlaceholder] => Unit,
      cancel: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      getInput: String => InputPlaceholder,
      getOutput: String => OutputPlaceholder,
      getSceneObject: () => SceneObject,
      getScheduledEnd: () => FrameTiming,
      getScheduledStart: () => FrameTiming,
      getTransform: () => Transform,
      getTypeName: () => String,
      inferenceMode: InferenceMode,
      isOfType: String => Boolean,
      isRecurring: () => Boolean,
      isSame: SerializableWithUID => Boolean,
      model: MLAsset,
      onLoadingFinished: () => Unit,
      onRunningFinished: () => Unit,
      renderOrder: Double,
      runImmediate: Boolean => Unit,
      runScheduled: (Boolean, FrameTiming, FrameTiming) => Unit,
      state: ModelState,
      stop: () => Unit,
      waitOnLoading: () => Unit,
      waitOnRunning: () => Unit
    ): MLComponent = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getInput = js.Any.fromFunction1(getInput), getOutput = js.Any.fromFunction1(getOutput), getSceneObject = js.Any.fromFunction0(getSceneObject), getScheduledEnd = js.Any.fromFunction0(getScheduledEnd), getScheduledStart = js.Any.fromFunction0(getScheduledStart), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), inferenceMode = inferenceMode.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isRecurring = js.Any.fromFunction0(isRecurring), isSame = js.Any.fromFunction1(isSame), model = model.asInstanceOf[js.Any], onLoadingFinished = js.Any.fromFunction0(onLoadingFinished), onRunningFinished = js.Any.fromFunction0(onRunningFinished), renderOrder = renderOrder.asInstanceOf[js.Any], runImmediate = js.Any.fromFunction1(runImmediate), runScheduled = js.Any.fromFunction3(runScheduled), state = state.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop), waitOnLoading = js.Any.fromFunction0(waitOnLoading), waitOnRunning = js.Any.fromFunction0(waitOnRunning))
      __obj.asInstanceOf[MLComponent]
    }
    
    extension [Self <: MLComponent](x: Self) {
      
      inline def setBuild(value: js.Array[BasePlaceholder] => Unit): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setGetInput(value: String => InputPlaceholder): Self = StObject.set(x, "getInput", js.Any.fromFunction1(value))
      
      inline def setGetOutput(value: String => OutputPlaceholder): Self = StObject.set(x, "getOutput", js.Any.fromFunction1(value))
      
      inline def setGetScheduledEnd(value: () => FrameTiming): Self = StObject.set(x, "getScheduledEnd", js.Any.fromFunction0(value))
      
      inline def setGetScheduledStart(value: () => FrameTiming): Self = StObject.set(x, "getScheduledStart", js.Any.fromFunction0(value))
      
      inline def setInferenceMode(value: InferenceMode): Self = StObject.set(x, "inferenceMode", value.asInstanceOf[js.Any])
      
      inline def setIsRecurring(value: () => Boolean): Self = StObject.set(x, "isRecurring", js.Any.fromFunction0(value))
      
      inline def setModel(value: MLAsset): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setOnLoadingFinished(value: () => Unit): Self = StObject.set(x, "onLoadingFinished", js.Any.fromFunction0(value))
      
      inline def setOnRunningFinished(value: () => Unit): Self = StObject.set(x, "onRunningFinished", js.Any.fromFunction0(value))
      
      inline def setRenderOrder(value: Double): Self = StObject.set(x, "renderOrder", value.asInstanceOf[js.Any])
      
      inline def setRunImmediate(value: Boolean => Unit): Self = StObject.set(x, "runImmediate", js.Any.fromFunction1(value))
      
      inline def setRunScheduled(value: (Boolean, FrameTiming, FrameTiming) => Unit): Self = StObject.set(x, "runScheduled", js.Any.fromFunction3(value))
      
      inline def setState(value: ModelState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setWaitOnLoading(value: () => Unit): Self = StObject.set(x, "waitOnLoading", js.Any.fromFunction0(value))
      
      inline def setWaitOnRunning(value: () => Unit): Self = StObject.set(x, "waitOnRunning", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Handles input information from user touch input via the TouchComponent to control Scale, Rotation, and Translation of objects.
    * ```
    * // Disables the scale functionality on a manipulate component when a user taps
    * //@input Component.ManipulateComponent manip
    *
    * function onTap(eventData)
    * {
    *     script.manip.enableManipulateType(ManipulateType.Scale, false);
    * }
    * var tapEvent = script.createEvent("TapEvent");
    * tapEvent.bind(onTap);
    * ```
    */
  trait ManipulateComponent
    extends StObject
       with Component {
    
    /** Repositions the object to be within the bounds of minDistance, maxDistance. */
    def clampWorldPosition(): Unit
    
    /** Enables or disables the specified ManipulateType for this ManipulateComponent. */
    def enableManipulateType(`type`: ManipulateType, enable: Boolean): Unit
    
    /**
      * Checks for an intersection point between the manipulation plane and a line extending from the camera through the specified screen space point. The screen point is passed in as (x, y) with
      * both values ranging from ([0-1], [0-1]), (0,0) being left-top and (1,1) being right-bottom. The result is returned as a ManipulateFrameIntersectResult object.
      */
    def intersectManipulateFrame(screenSpacePoint: vec2): ManipulateFrameIntersectResult
    
    /** Changes swivel behavior based on the object’s height relative to the camera. */
    var isContextualSwivel: Boolean
    
    /** Returns whether the specified ManipulateType is enabled for this ManipulateComponent. */
    def isManipulateTypeEnabled(`type`: ManipulateType): Boolean
    
    /** The maximum distance the object can travel from the user. */
    var maxDistance: Double
    
    /** The maximum height of the object. */
    var maxHeight: Double
    
    /** The maximum size the object can scale to. */
    var maxScale: Double
    
    /** The minimum distance the object can be from the user. */
    var minDistance: Double
    
    /** The minimum height of the object. */
    var minHeight: Double
    
    /** The minimum size the object can shrink to. */
    var minScale: Double
    
    /** Multiplier for swivel rotation speed. For example, a value of 0.5 will cut rotation speed in half, and a value of 2.0 will double rotation speed. */
    var rotationScale: Double
  }
  object ManipulateComponent {
    
    inline def apply(
      clampWorldPosition: () => Unit,
      destroy: () => Unit,
      enableManipulateType: (ManipulateType, Boolean) => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      intersectManipulateFrame: vec2 => ManipulateFrameIntersectResult,
      isContextualSwivel: Boolean,
      isManipulateTypeEnabled: ManipulateType => Boolean,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      maxDistance: Double,
      maxHeight: Double,
      maxScale: Double,
      minDistance: Double,
      minHeight: Double,
      minScale: Double,
      rotationScale: Double
    ): ManipulateComponent = {
      val __obj = js.Dynamic.literal(clampWorldPosition = js.Any.fromFunction0(clampWorldPosition), destroy = js.Any.fromFunction0(destroy), enableManipulateType = js.Any.fromFunction2(enableManipulateType), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), intersectManipulateFrame = js.Any.fromFunction1(intersectManipulateFrame), isContextualSwivel = isContextualSwivel.asInstanceOf[js.Any], isManipulateTypeEnabled = js.Any.fromFunction1(isManipulateTypeEnabled), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), maxDistance = maxDistance.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minDistance = minDistance.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], rotationScale = rotationScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ManipulateComponent]
    }
    
    extension [Self <: ManipulateComponent](x: Self) {
      
      inline def setClampWorldPosition(value: () => Unit): Self = StObject.set(x, "clampWorldPosition", js.Any.fromFunction0(value))
      
      inline def setEnableManipulateType(value: (ManipulateType, Boolean) => Unit): Self = StObject.set(x, "enableManipulateType", js.Any.fromFunction2(value))
      
      inline def setIntersectManipulateFrame(value: vec2 => ManipulateFrameIntersectResult): Self = StObject.set(x, "intersectManipulateFrame", js.Any.fromFunction1(value))
      
      inline def setIsContextualSwivel(value: Boolean): Self = StObject.set(x, "isContextualSwivel", value.asInstanceOf[js.Any])
      
      inline def setIsManipulateTypeEnabled(value: ManipulateType => Boolean): Self = StObject.set(x, "isManipulateTypeEnabled", js.Any.fromFunction1(value))
      
      inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
      
      inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setRotationScale(value: Double): Self = StObject.set(x, "rotationScale", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Used to track images in the camera. Moves the containing object’s transform to match the detected image. For more information, see the Marker Tracking guide.
    * ```
    * //@input Component.MarkerTrackingComponent markerTrackingComponent
    *
    * // Get whether or not the marker image is being tracked
    * var isMarkerTracking = markerTrackingComponent.isTracking();
    *
    * // Print current status.
    * if (isMarkerTracking) {
    *     print("Image is in Camera feed.");
    * } else {
    *     print("Image is NOT in Camera feed.");
    * }
    * ```
    */
  trait MarkerTrackingComponent
    extends StObject
       with Component {
    
    /** If true, child objects of this Component’s SceneObject will be disabled when the marker image is not being tracked. */
    var autoEnableWhenTracking: Boolean
    
    /** Returns whether the marker image is currently being tracked in camera. */
    def isTracking(): Boolean
    
    /** The marker asset describing the tracking target. */
    var marker: MarkerAsset
    
    /** A function that gets called when marker tracking begins. */
    def onMarkerFound(): Unit
    
    /** A function that gets called when marker tracking is lost. */
    def onMarkerLost(): Unit
  }
  object MarkerTrackingComponent {
    
    inline def apply(
      autoEnableWhenTracking: Boolean,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      isTracking: () => Boolean,
      marker: MarkerAsset,
      onMarkerFound: () => Unit,
      onMarkerLost: () => Unit
    ): MarkerTrackingComponent = {
      val __obj = js.Dynamic.literal(autoEnableWhenTracking = autoEnableWhenTracking.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), isTracking = js.Any.fromFunction0(isTracking), marker = marker.asInstanceOf[js.Any], onMarkerFound = js.Any.fromFunction0(onMarkerFound), onMarkerLost = js.Any.fromFunction0(onMarkerLost))
      __obj.asInstanceOf[MarkerTrackingComponent]
    }
    
    extension [Self <: MarkerTrackingComponent](x: Self) {
      
      inline def setAutoEnableWhenTracking(value: Boolean): Self = StObject.set(x, "autoEnableWhenTracking", value.asInstanceOf[js.Any])
      
      inline def setIsTracking(value: () => Boolean): Self = StObject.set(x, "isTracking", js.Any.fromFunction0(value))
      
      inline def setMarker(value: MarkerAsset): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setOnMarkerFound(value: () => Unit): Self = StObject.set(x, "onMarkerFound", js.Any.fromFunction0(value))
      
      inline def setOnMarkerLost(value: () => Unit): Self = StObject.set(x, "onMarkerLost", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Base class for all MeshVisual components using Materials to render. Comparable to the former class “MeshVisual”, which was split into the classes: BaseMeshVisual, MaterialMeshVisual, and
    * RenderMeshVisual.
    * ```
    * // @input Component.MaterialMeshVisual visual
    *
    * // Set the material's main color to red
    * script.visual.mainPass.baseColor = new vec4(1, 0, 0, 1);
    * ```
    */
  trait MaterialMeshVisual
    extends StObject
       with BaseMeshVisual {
    
    /** Adds a Material to use for rendering. */
    def addMaterial(material: Material): Unit
    
    /** Clears all Materials. */
    def clearMaterials(): Unit
    
    /** Returns the Material at index index. */
    def getMaterial(index: Double): Material
    
    /** Returns the number of Materials used for rendering. */
    def getMaterialsCount(): Double
    
    /** Returns the first Material. */
    var mainMaterial: Material
    
    /** Returns the mainPass of the mainMaterial. */
    var mainPass: Pass
  }
  object MaterialMeshVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): MaterialMeshVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaterialMeshVisual]
    }
    
    extension [Self <: MaterialMeshVisual](x: Self) {
      
      inline def setAddMaterial(value: Material => Unit): Self = StObject.set(x, "addMaterial", js.Any.fromFunction1(value))
      
      inline def setClearMaterials(value: () => Unit): Self = StObject.set(x, "clearMaterials", js.Any.fromFunction0(value))
      
      inline def setGetMaterial(value: Double => Material): Self = StObject.set(x, "getMaterial", js.Any.fromFunction1(value))
      
      inline def setGetMaterialsCount(value: () => Double): Self = StObject.set(x, "getMaterialsCount", js.Any.fromFunction0(value))
      
      inline def setMainMaterial(value: Material): Self = StObject.set(x, "mainMaterial", value.asInstanceOf[js.Any])
      
      inline def setMainPass(value: Pass): Self = StObject.set(x, "mainPass", value.asInstanceOf[js.Any])
    }
  }
  
  /** Used to track objects in the camera. Moves the local ScreenTransform to match the detected image. See the Object Tracking guide for more information. */
  trait ObjectTracking
    extends StObject
       with Component {
    
    /** If true, child objects of this Component’s SceneObject will be disabled when the object is not being tracked. */
    var autoEnableWhenTracking: Boolean
    
    /** Returns true if the object is currently being tracked on camera. */
    def isTracking(): Boolean
    
    /** The index of the object being tracked. */
    var objectIndex: Double
    
    /** Function that gets called when the tracked object is found. */
    def onObjectFound(): Unit
    
    /** Function that gets called when the tracked object is lost. */
    def onObjectLost(): Unit
    
    /** Registers a callback to be executed when the passed in descriptor ends for this tracked object. */
    def registerDescriptorEnd(descriptor: String, callback: js.Function1[/* descriptor */ String, Unit]): Unit
    
    /** Registers a callback to be executed when the passed in descriptor starts for this tracked object. */
    def registerDescriptorStart(descriptor: String, callback: js.Function1[/* descriptor */ String, Unit]): Unit
  }
  object ObjectTracking {
    
    inline def apply(
      autoEnableWhenTracking: Boolean,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      isTracking: () => Boolean,
      objectIndex: Double,
      onObjectFound: () => Unit,
      onObjectLost: () => Unit,
      registerDescriptorEnd: (String, js.Function1[/* descriptor */ String, Unit]) => Unit,
      registerDescriptorStart: (String, js.Function1[/* descriptor */ String, Unit]) => Unit
    ): ObjectTracking = {
      val __obj = js.Dynamic.literal(autoEnableWhenTracking = autoEnableWhenTracking.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), isTracking = js.Any.fromFunction0(isTracking), objectIndex = objectIndex.asInstanceOf[js.Any], onObjectFound = js.Any.fromFunction0(onObjectFound), onObjectLost = js.Any.fromFunction0(onObjectLost), registerDescriptorEnd = js.Any.fromFunction2(registerDescriptorEnd), registerDescriptorStart = js.Any.fromFunction2(registerDescriptorStart))
      __obj.asInstanceOf[ObjectTracking]
    }
    
    extension [Self <: ObjectTracking](x: Self) {
      
      inline def setAutoEnableWhenTracking(value: Boolean): Self = StObject.set(x, "autoEnableWhenTracking", value.asInstanceOf[js.Any])
      
      inline def setIsTracking(value: () => Boolean): Self = StObject.set(x, "isTracking", js.Any.fromFunction0(value))
      
      inline def setObjectIndex(value: Double): Self = StObject.set(x, "objectIndex", value.asInstanceOf[js.Any])
      
      inline def setOnObjectFound(value: () => Unit): Self = StObject.set(x, "onObjectFound", js.Any.fromFunction0(value))
      
      inline def setOnObjectLost(value: () => Unit): Self = StObject.set(x, "onObjectLost", js.Any.fromFunction0(value))
      
      inline def setRegisterDescriptorEnd(value: (String, js.Function1[/* descriptor */ String, Unit]) => Unit): Self = StObject.set(x, "registerDescriptorEnd", js.Any.fromFunction2(value))
      
      inline def setRegisterDescriptorStart(value: (String, js.Function1[/* descriptor */ String, Unit]) => Unit): Self = StObject.set(x, "registerDescriptorStart", js.Any.fromFunction2(value))
    }
  }
  
  /** Attaches the SceneObject to the mesh surface of a different SceneObject. See the Pin To Mesh guide for more information. */
  trait PinToMeshComponent
    extends StObject
       with Component {
    
    /** The position offset to apply. */
    var offsetPosition: vec3
    
    /** The euler angle offset to apply. Only has an effect when orientation is set to PositionAndDirection. */
    var offsetRotation: vec3
    
    /** The orientation type to use. */
    var orientation: Orientation
    
    /** The UV coordinates on the target mesh to attach to. */
    var pinUV: vec2
    
    /** The preferred triangle index to attach to when multiple triangles contain the desired UV coordinate. */
    var preferredTriangle: Double
    
    /** Index of the UV coordinate set to use for pinning. */
    var preferredUVLayerIndex: Double
    
    /** The target mesh to attach to. */
    var target: BaseMeshVisual
    
    /** If enabled, interpolated vertex normals will be used when calculating the attachment position. */
    var useInterpolatedVertexNormal: Boolean
  }
  object PinToMeshComponent {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      offsetPosition: vec3,
      offsetRotation: vec3,
      orientation: Orientation,
      pinUV: vec2,
      preferredTriangle: Double,
      preferredUVLayerIndex: Double,
      target: BaseMeshVisual,
      useInterpolatedVertexNormal: Boolean
    ): typings.snapchatLensStudio.Component.PinToMeshComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), offsetPosition = offsetPosition.asInstanceOf[js.Any], offsetRotation = offsetRotation.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], pinUV = pinUV.asInstanceOf[js.Any], preferredTriangle = preferredTriangle.asInstanceOf[js.Any], preferredUVLayerIndex = preferredUVLayerIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], useInterpolatedVertexNormal = useInterpolatedVertexNormal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.snapchatLensStudio.Component.PinToMeshComponent]
    }
    
    extension [Self <: typings.snapchatLensStudio.Component.PinToMeshComponent](x: Self) {
      
      inline def setOffsetPosition(value: vec3): Self = StObject.set(x, "offsetPosition", value.asInstanceOf[js.Any])
      
      inline def setOffsetRotation(value: vec3): Self = StObject.set(x, "offsetRotation", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setPinUV(value: vec2): Self = StObject.set(x, "pinUV", value.asInstanceOf[js.Any])
      
      inline def setPreferredTriangle(value: Double): Self = StObject.set(x, "preferredTriangle", value.asInstanceOf[js.Any])
      
      inline def setPreferredUVLayerIndex(value: Double): Self = StObject.set(x, "preferredUVLayerIndex", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: BaseMeshVisual): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setUseInterpolatedVertexNormal(value: Boolean): Self = StObject.set(x, "useInterpolatedVertexNormal", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Uses an input color lookup table image to adjust the coloring of the Lens. See the Color Correction Post Effect guide for more information.
    * ```
    * // Sets the post effects texture to a custom texture in script and sets the color to red
    * //@input Component.PostEffectVisual postEffect
    * //@input Asset.Texture texture
    *
    * script.postEffect.mainPass.baseTex = script.texture;
    * script.postEffect.mainPass.baseColor = new vec4(1.0,0.0,0.0,1.0);
    * ```
    */
  type PostEffectVisual = MaterialMeshVisual
  
  /** Applies ScreenTransform positioning to match the cropped region of a texture. For more information, see the Crop Textures guide. */
  trait RectangleSetter
    extends StObject
       with Component {
    
    /** Cropped texture to match the screen region of. Should be a texture using a RectCropTextureProvider, such as a Screen Crop Texture or Face Crop Texture. */
    var cropTexture: Texture
  }
  object RectangleSetter {
    
    inline def apply(
      cropTexture: Texture,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean
    ): RectangleSetter = {
      val __obj = js.Dynamic.literal(cropTexture = cropTexture.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame))
      __obj.asInstanceOf[RectangleSetter]
    }
    
    extension [Self <: RectangleSetter](x: Self) {
      
      inline def setCropTexture(value: Texture): Self = StObject.set(x, "cropTexture", value.asInstanceOf[js.Any])
    }
  }
  
  /** Renders a RenderMesh asset in the scene. Comparable to the former class “MeshVisual”, which was split into the classes: BaseMeshVisual, MaterialMeshVisual, and RenderMeshVisual. */
  trait RenderMeshVisual
    extends StObject
       with MaterialMeshVisual {
    
    /** The BlendShapes component used for rendering this mesh. */
    var blendShape: BlendShapes
    
    /** The RenderMesh asset to render. */
    var mesh: RenderMesh
    
    /** Sets the Skin to use for rendering this mesh. */
    def setSkin(skin: Skin): Unit
  }
  object RenderMeshVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      blendShape: BlendShapes,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      mesh: RenderMesh,
      meshShadowMode: Double,
      setRenderOrder: Double => Unit,
      setSkin: Skin => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): RenderMeshVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), blendShape = blendShape.asInstanceOf[js.Any], clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), setSkin = js.Any.fromFunction1(setSkin), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMeshVisual]
    }
    
    extension [Self <: RenderMeshVisual](x: Self) {
      
      inline def setBlendShape(value: BlendShapes): Self = StObject.set(x, "blendShape", value.asInstanceOf[js.Any])
      
      inline def setMesh(value: RenderMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
      
      inline def setSetSkin(value: Skin => Unit): Self = StObject.set(x, "setSkin", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Visual effect used to add subtle retouching effects to detected faces ( skin: soft,  whitening: teeth, etc.). To learn more, visit the Retouch Guide.
    * ```
    * // Sets a Retouch component's teeth whitening intensity
    *
    * //@input Component.RetouchVisual retouchVisual
    *
    * script.retouchVisual.teethWhiteningIntensity = 0.4;
    * ```
    */
  trait RetouchVisual
    extends StObject
       with MaterialMeshVisual {
    
    /** The strength of the eye whitening effect. */
    var eyeWhiteningIntensity: Double
    
    /** The index of the face the effect is being applied to. */
    var faceIndex: Double
    
    /** The strength of the eye sharpening effect. */
    var sharpenEyeIntensity: Double
    
    /** The strength of the soft-skin effect. */
    var softSkinIntensity: Double
    
    /** The strength of the teeth whitening effect. */
    var teethWhiteningIntensity: Double
  }
  object RetouchVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      eyeWhiteningIntensity: Double,
      faceIndex: Double,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      sharpenEyeIntensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      softSkinIntensity: Double,
      stretchMode: StretchMode,
      teethWhiteningIntensity: Double,
      verticalAlignment: VerticalAlignment
    ): RetouchVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], eyeWhiteningIntensity = eyeWhiteningIntensity.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], sharpenEyeIntensity = sharpenEyeIntensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), softSkinIntensity = softSkinIntensity.asInstanceOf[js.Any], stretchMode = stretchMode.asInstanceOf[js.Any], teethWhiteningIntensity = teethWhiteningIntensity.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetouchVisual]
    }
    
    extension [Self <: RetouchVisual](x: Self) {
      
      inline def setEyeWhiteningIntensity(value: Double): Self = StObject.set(x, "eyeWhiteningIntensity", value.asInstanceOf[js.Any])
      
      inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
      
      inline def setSharpenEyeIntensity(value: Double): Self = StObject.set(x, "sharpenEyeIntensity", value.asInstanceOf[js.Any])
      
      inline def setSoftSkinIntensity(value: Double): Self = StObject.set(x, "softSkinIntensity", value.asInstanceOf[js.Any])
      
      inline def setTeethWhiteningIntensity(value: Double): Self = StObject.set(x, "teethWhiteningIntensity", value.asInstanceOf[js.Any])
    }
  }
  
  /** Overrides the settings on a local ScreenTransform to fit a screen region on the device. See the Screen Transform guide for more information. */
  trait ScreenRegionComponent
    extends StObject
       with Component {
    
    /** The region of the screen the local ScreenTransform will be fit to. */
    var region: ScreenRegionType
  }
  object ScreenRegionComponent {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      region: ScreenRegionType
    ): ScreenRegionComponent = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenRegionComponent]
    }
    
    extension [Self <: ScreenRegionComponent](x: Self) {
      
      inline def setRegion(value: ScreenRegionType): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  /** Used for positioning objects in 2d screen space. It overrides the regular Transform component on the SceneObject it’s attached to. */
  trait ScreenTransform
    extends StObject
       with Component {
    
    /**
      * The anchor rect positioning this ScreenTransform proportional to its parent’s bounds. For each field, a value of 0 equals the parent’s center point, and value of -1 or 1 (depending on the
      * side) equals the parent’s full boundary.
      * For example, a top value of 1.0 means this ScreenTransform’s top edge will be exactly at the top edge of its parent.
      * A bottom value of -0.5 means this ScreenTransform’s bottom edge will be halfway between its parent’s bottom edge and center.
      * A right value of 0 means this ScreenTransform’s right edge will be exactly at its parent’s center.
      * A left value of -2 means this ScreenTransform’s left edge will be twice as far from its parent’s center as its parent’s left edge is.
      */
    var anchors: Rect
    
    /** Returns true if the screen position is within the boundaries of this ScreenTransform. Useful for checking if a touch event overlaps with this object. */
    def containsScreenPoint(screenPoint: vec2): Boolean
    
    /** Returns true if the world position is within the boundaries of this ScreenTransform. The z value of the world position is ignored. */
    def containsWorldPoint(worldPoint: vec3): Boolean
    
    /**
      * Returns true if this ScreenTransform is in a valid screen hierarchy, which is required for anchoring to work. To be in a valid screen hierarchy there must be a Camera component upward in
      * the parent hierarchy, and every object between the Camera and this one must also have a ScreenTransform.
      */
    def isInScreenHierarchy(): Boolean
    
    /** Converts from a normalized (-1 to 1) position within this ScreenTransform’s bounds to a screen position. */
    def localPointToScreenPoint(relativeLocalPoint: vec2): vec2
    
    /** Converts from a normalized (-1 to 1) position within this ScreenTransform’s bounds to a world position. */
    def localPointToWorldPoint(relativeLocalPoint: vec2): vec3
    
    /**
      * This rect is applied after anchors to determine the final boundaries of the ScreenTransform. It adds an offset in world units (based on the parent Camera’s size property) to each edge of
      * the ScreenTransform’s boundaries.
      * For example, a value of 0 for any side will have no effect on boundaries.
      * A value of 1.0 for any side will offset that edge by 1.0 world unit.
      */
    var offsets: Rect
    
    /** Normalized (x, y) position of the center point used in rotation. (-1, -1) being bottom left, (0, 0) being center, and (1, 1) being top right of the image. */
    var pivot: vec2
    
    /** Basic local position in world units relative to the parent’s center. Useful for animating screen elements with a simple offset. */
    var position: vec3
    
    /** Basic local rotation applied to the SceneObject. */
    var rotation: quat
    
    /** Basic local scaling applied to the SceneObject. */
    var scale: vec3
    
    /** Converts from a screen position to a normalized (-1 to 1) position within this ScreenTransform’s bounds. */
    def screenPointToLocalPoint(screenPoint: vec2): vec2
    
    /**
      * Converts from a screen position to a normalized (-1 to 1) position within the parent object’s bounds. This value is useful because it can be used directly for this ScreenTransform’s anchor
      * positioning.
      */
    def screenPointToParentPoint(screenPoint: vec2): vec2
    
    /** Converts from a world position to a normalized (-1 to 1) position within this ScreenTransform’s bounds. */
    def worldPointToLocalPoint(worldPoint: vec3): vec2
    
    /**
      * Converts from a world position to a normalized (-1 to 1) position within the parent object’s bounds. This value is useful because it can be used directly for this ScreenTransform’s anchor
      * positioning.
      */
    def worldPointToParentPoint(worldPoint: vec3): vec2
  }
  object ScreenTransform {
    
    inline def apply(
      anchors: Rect,
      containsScreenPoint: vec2 => Boolean,
      containsWorldPoint: vec3 => Boolean,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isInScreenHierarchy: () => Boolean,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      localPointToScreenPoint: vec2 => vec2,
      localPointToWorldPoint: vec2 => vec3,
      offsets: Rect,
      pivot: vec2,
      position: vec3,
      rotation: quat,
      scale: vec3,
      screenPointToLocalPoint: vec2 => vec2,
      screenPointToParentPoint: vec2 => vec2,
      worldPointToLocalPoint: vec3 => vec2,
      worldPointToParentPoint: vec3 => vec2
    ): ScreenTransform = {
      val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], containsScreenPoint = js.Any.fromFunction1(containsScreenPoint), containsWorldPoint = js.Any.fromFunction1(containsWorldPoint), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isInScreenHierarchy = js.Any.fromFunction0(isInScreenHierarchy), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), localPointToScreenPoint = js.Any.fromFunction1(localPointToScreenPoint), localPointToWorldPoint = js.Any.fromFunction1(localPointToWorldPoint), offsets = offsets.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], screenPointToLocalPoint = js.Any.fromFunction1(screenPointToLocalPoint), screenPointToParentPoint = js.Any.fromFunction1(screenPointToParentPoint), worldPointToLocalPoint = js.Any.fromFunction1(worldPointToLocalPoint), worldPointToParentPoint = js.Any.fromFunction1(worldPointToParentPoint))
      __obj.asInstanceOf[ScreenTransform]
    }
    
    extension [Self <: ScreenTransform](x: Self) {
      
      inline def setAnchors(value: Rect): Self = StObject.set(x, "anchors", value.asInstanceOf[js.Any])
      
      inline def setContainsScreenPoint(value: vec2 => Boolean): Self = StObject.set(x, "containsScreenPoint", js.Any.fromFunction1(value))
      
      inline def setContainsWorldPoint(value: vec3 => Boolean): Self = StObject.set(x, "containsWorldPoint", js.Any.fromFunction1(value))
      
      inline def setIsInScreenHierarchy(value: () => Boolean): Self = StObject.set(x, "isInScreenHierarchy", js.Any.fromFunction0(value))
      
      inline def setLocalPointToScreenPoint(value: vec2 => vec2): Self = StObject.set(x, "localPointToScreenPoint", js.Any.fromFunction1(value))
      
      inline def setLocalPointToWorldPoint(value: vec2 => vec3): Self = StObject.set(x, "localPointToWorldPoint", js.Any.fromFunction1(value))
      
      inline def setOffsets(value: Rect): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setPivot(value: vec2): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: quat): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: vec3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScreenPointToLocalPoint(value: vec2 => vec2): Self = StObject.set(x, "screenPointToLocalPoint", js.Any.fromFunction1(value))
      
      inline def setScreenPointToParentPoint(value: vec2 => vec2): Self = StObject.set(x, "screenPointToParentPoint", js.Any.fromFunction1(value))
      
      inline def setWorldPointToLocalPoint(value: vec3 => vec2): Self = StObject.set(x, "worldPointToLocalPoint", js.Any.fromFunction1(value))
      
      inline def setWorldPointToParentPoint(value: vec3 => vec2): Self = StObject.set(x, "worldPointToParentPoint", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Binds scripts to Events and executes them when triggered. Any script can access the ScriptComponent executing them through the variable script. See also: Scripting Overview, Script Events
    * Guide. Lens Studio v1.0.0+
    *
    * Instead of doing the following:
    * ```
    * const typedScript = script as Component.ScriptComponent<{ anInput: number }, { anApiProp: 'some' | 'thing' }>
    * ```
    * Use the following to type your script's inputs and/or api properties by extending the interfaces of `ScriptInputs` and/or `ScriptApi`:
    * ```
    * declare namespace SnapchatLensStudio {
    *     interface ScriptApi {
    *         some?: 'thing' | 'other-thing'
    *     }
    * }
    * ```
    */
  type ScriptComponent[Inputs /* <: js.Object */, Api /* <: js.Object */] = CreateEvent[Api] & Component & Inputs
  
  /** Represents skinning data for rigged meshes. See also: MeshVisual. */
  type Skin = Component
  
  /** Represents transform data for screen-aligned 2D sprites. Use on SceneObjects with a SpriteVisual Component. See also: SpriteVisual. */
  trait SpriteAligner
    extends StObject
       with Component {
    
    /** The location of the point this sprite is bound to. */
    var bindingPoint: vec2
    
    /** The width and height of the SpriteVisual. */
    var size: vec2
  }
  object SpriteAligner {
    
    inline def apply(
      bindingPoint: vec2,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      size: vec2
    ): SpriteAligner = {
      val __obj = js.Dynamic.literal(bindingPoint = bindingPoint.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteAligner]
    }
    
    extension [Self <: SpriteAligner](x: Self) {
      
      inline def setBindingPoint(value: vec2): Self = StObject.set(x, "bindingPoint", value.asInstanceOf[js.Any])
      
      inline def setSize(value: vec2): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a renderable 2D visual in Lens Studio.
    * ```
    * // Flip the Sprite upside down
    * //@input Component.SpriteVisual sprite
    * script.sprite.flipY = true;
    *
    * // Change the Sprite's fill mode to "stretch"
    * //@input Component.SpriteVisual sprite
    * script.sprite.fillMode = 2;
    *
    * // Change the Sprite's pivot point to top right corner
    * //@input Component.SpriteVisual sprite
    * script.sprite.pivot = new vec2(1,1);
    * ```
    */
  trait SpriteVisual
    extends StObject
       with MaterialMeshVisual {
    
    /**
      * Which type of fill the sprite uses. Possible values:
      * ```
      * Fit = 0
      * Fill = 1
      * Stretch = 2
      * ```
      */
    var fillMode: `0` | `1` | `2`
    
    /** Whether the sprite is flipped over the Y-axis (sideways). */
    var flipX: Boolean
    
    /** Whether the sprite is flipped over the X-axis (upside-down). */
    var flipY: Boolean
    
    /** Returns the width and height of the mesh the SpriteVisual is applied to. */
    def getMeshSize(): vec2
    
    /**
      * The location of the sprite’s pivot point relative to its boundaries. The pivot’s x value is a relative horizontal position, -1 being the sprite’s left border and 1 being the sprite’s right
      * border. Similarly, the y value is a relative vertical position, -1 being the sprite’s bottom border and 1 being the sprite’s top border.
      */
    var pivot: vec2
  }
  object SpriteVisual {
    
    inline def apply(
      addMaterial: Material => Unit,
      clearMaterials: () => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      fillMode: `0` | `1` | `2`,
      flipX: Boolean,
      flipY: Boolean,
      getMaterial: Double => Material,
      getMaterialsCount: () => Double,
      getMeshSize: () => vec2,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainMaterial: Material,
      mainPass: Pass,
      meshShadowMode: Double,
      pivot: vec2,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      verticalAlignment: VerticalAlignment
    ): SpriteVisual = {
      val __obj = js.Dynamic.literal(addMaterial = js.Any.fromFunction1(addMaterial), clearMaterials = js.Any.fromFunction0(clearMaterials), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], fillMode = fillMode.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], getMaterial = js.Any.fromFunction1(getMaterial), getMaterialsCount = js.Any.fromFunction0(getMaterialsCount), getMeshSize = js.Any.fromFunction0(getMeshSize), getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainMaterial = mainMaterial.asInstanceOf[js.Any], mainPass = mainPass.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], pivot = pivot.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpriteVisual]
    }
    
    extension [Self <: SpriteVisual](x: Self) {
      
      inline def setFillMode(value: `0` | `1` | `2`): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
      
      inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setGetMeshSize(value: () => vec2): Self = StObject.set(x, "getMeshSize", js.Any.fromFunction0(value))
      
      inline def setPivot(value: vec2): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    }
  }
  
  /** Visual component that renders dynamic text. See the Text guide for more information. */
  trait Text
    extends StObject
       with BaseMeshVisual {
    
    /** Settings for drawing a background behind the text. */
    var backgroundSettings: BackgroundSettings
    
    /** If enabled, the text material will use Depth Testing. Useful when Text exists in 3D space. */
    var depthTest: Boolean
    
    /** Settings for how dropshadow is used in text drawing. */
    var dropshadowSettings: DropshadowSettings
    
    /** Font asset used. */
    var font: Font
    
    /** Controls how text should be handled when it goes past the horizontal boundaries. */
    var horizontalOverflow: HorizontalOverflow
    
    /**
      * Modifies the spacing between letters. Set to 0 by default, which uses the font’s normal letter spacing. Negative values will remove space between letters, and positive values will add more
      * space between letters.
      */
    var letterSpacing: Double
    
    /** Settings for how text outline is used in text drawing. */
    var outlineSettings: OutlineSettings
    
    /** Font size used. */
    var size: Double
    
    /** If enabled, the rendered text will always scale to fit the boundaries. */
    var sizeToFit: Boolean
    
    /** Text string to be drawn. */
    var text: String
    
    /** Settings for how the text is drawn, such as fill color or texture. */
    var textFill: TextFill
    
    /** Controls how text should be handled when it goes past the vertical boundaries. */
    var verticalOverflow: VerticalOverflow
  }
  object Text {
    
    inline def apply(
      backgroundSettings: BackgroundSettings,
      depthTest: Boolean,
      destroy: () => Unit,
      dropshadowSettings: DropshadowSettings,
      enabled: Boolean,
      extentsTarget: ScreenTransform,
      font: Font,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      horizontalAlignment: HorizontalAlignment,
      horizontalOverflow: HorizontalOverflow,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      letterSpacing: Double,
      meshShadowMode: Double,
      outlineSettings: OutlineSettings,
      setRenderOrder: Double => Unit,
      shadowColor: vec4,
      shadowDensity: Double,
      size: Double,
      sizeToFit: Boolean,
      snap: typings.snapchatLensStudio.Component.Camera => Unit,
      stretchMode: StretchMode,
      text: String,
      textFill: TextFill,
      verticalAlignment: VerticalAlignment,
      verticalOverflow: VerticalOverflow
    ): Text = {
      val __obj = js.Dynamic.literal(backgroundSettings = backgroundSettings.asInstanceOf[js.Any], depthTest = depthTest.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dropshadowSettings = dropshadowSettings.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], extentsTarget = extentsTarget.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), horizontalAlignment = horizontalAlignment.asInstanceOf[js.Any], horizontalOverflow = horizontalOverflow.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), letterSpacing = letterSpacing.asInstanceOf[js.Any], meshShadowMode = meshShadowMode.asInstanceOf[js.Any], outlineSettings = outlineSettings.asInstanceOf[js.Any], setRenderOrder = js.Any.fromFunction1(setRenderOrder), shadowColor = shadowColor.asInstanceOf[js.Any], shadowDensity = shadowDensity.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], sizeToFit = sizeToFit.asInstanceOf[js.Any], snap = js.Any.fromFunction1(snap), stretchMode = stretchMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textFill = textFill.asInstanceOf[js.Any], verticalAlignment = verticalAlignment.asInstanceOf[js.Any], verticalOverflow = verticalOverflow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setBackgroundSettings(value: BackgroundSettings): Self = StObject.set(x, "backgroundSettings", value.asInstanceOf[js.Any])
      
      inline def setDepthTest(value: Boolean): Self = StObject.set(x, "depthTest", value.asInstanceOf[js.Any])
      
      inline def setDropshadowSettings(value: DropshadowSettings): Self = StObject.set(x, "dropshadowSettings", value.asInstanceOf[js.Any])
      
      inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setHorizontalOverflow(value: HorizontalOverflow): Self = StObject.set(x, "horizontalOverflow", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setOutlineSettings(value: OutlineSettings): Self = StObject.set(x, "outlineSettings", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeToFit(value: Boolean): Self = StObject.set(x, "sizeToFit", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextFill(value: TextFill): Self = StObject.set(x, "textFill", value.asInstanceOf[js.Any])
      
      inline def setVerticalOverflow(value: VerticalOverflow): Self = StObject.set(x, "verticalOverflow", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Allows the MeshVisual provided to this component to handle touches on the screen (blocking Snapchat from receiving the touches), and optionally let certain touch types to pass through (let
    * Snapchat handle the touch).
    */
  trait TouchComponent
    extends StObject
       with Component {
    
    /** Adds a MeshVisual as a target for touch detection. */
    def addMeshVisual(meshVisual: BaseMeshVisual): Unit
    
    /** Adds a touch type that this component will ignore. */
    def addTouchBlockingException(
      exception: TouchTypeNone | TouchTypeTouch | TouchTypeTap | TouchTypeDoubleTap | TouchTypeScale | TouchTypePan | TouchTypeSwipe
    ): Unit
    
    /** Returns the minimum bounding box size used for detecting touches. Value range is from 0-1, relative to screen width. */
    def getMinimumTouchSize(): Double
    
    /** Removes a MeshVisual as a target for touch detection. */
    def removeMeshVisual(meshVisual: BaseMeshVisual): Unit
    
    /** Sets the camera that will be used for touch detection. */
    def setCamera(cameraValue: typings.snapchatLensStudio.Component.Camera): Unit
    
    /** Sets the minimum bounding box size used for detecting touches. Value range is from 0-1, relative to screen width. */
    def setMinimumTouchSize(minimumSize: Double): Unit
  }
  object TouchComponent {
    
    inline def apply(
      addMeshVisual: BaseMeshVisual => Unit,
      addTouchBlockingException: TouchTypeNone | TouchTypeTouch | TouchTypeTap | TouchTypeDoubleTap | TouchTypeScale | TouchTypePan | TouchTypeSwipe => Unit,
      destroy: () => Unit,
      enabled: Boolean,
      getMinimumTouchSize: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      removeMeshVisual: BaseMeshVisual => Unit,
      setCamera: typings.snapchatLensStudio.Component.Camera => Unit,
      setMinimumTouchSize: Double => Unit
    ): TouchComponent = {
      val __obj = js.Dynamic.literal(addMeshVisual = js.Any.fromFunction1(addMeshVisual), addTouchBlockingException = js.Any.fromFunction1(addTouchBlockingException), destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getMinimumTouchSize = js.Any.fromFunction0(getMinimumTouchSize), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), removeMeshVisual = js.Any.fromFunction1(removeMeshVisual), setCamera = js.Any.fromFunction1(setCamera), setMinimumTouchSize = js.Any.fromFunction1(setMinimumTouchSize))
      __obj.asInstanceOf[TouchComponent]
    }
    
    extension [Self <: TouchComponent](x: Self) {
      
      inline def setAddMeshVisual(value: BaseMeshVisual => Unit): Self = StObject.set(x, "addMeshVisual", js.Any.fromFunction1(value))
      
      inline def setAddTouchBlockingException(
        value: TouchTypeNone | TouchTypeTouch | TouchTypeTap | TouchTypeDoubleTap | TouchTypeScale | TouchTypePan | TouchTypeSwipe => Unit
      ): Self = StObject.set(x, "addTouchBlockingException", js.Any.fromFunction1(value))
      
      inline def setGetMinimumTouchSize(value: () => Double): Self = StObject.set(x, "getMinimumTouchSize", js.Any.fromFunction0(value))
      
      inline def setRemoveMeshVisual(value: BaseMeshVisual => Unit): Self = StObject.set(x, "removeMeshVisual", js.Any.fromFunction1(value))
      
      inline def setSetCamera(value: typings.snapchatLensStudio.Component.Camera => Unit): Self = StObject.set(x, "setCamera", js.Any.fromFunction1(value))
      
      inline def setSetMinimumTouchSize(value: Double => Unit): Self = StObject.set(x, "setMinimumTouchSize", js.Any.fromFunction1(value))
    }
  }
  
  /** Used to help control vertex animations on the SceneObject. */
  trait VertexCache
    extends StObject
       with Component {
    
    /** The current time of vertex animations on this SceneObject. */
    var currentTime: Double
    
    /** The weight applied to vertex animations on this SceneObject. */
    var weight: Double
  }
  object VertexCache {
    
    inline def apply(
      currentTime: Double,
      destroy: () => Unit,
      enabled: Boolean,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      weight: Double
    ): VertexCache = {
      val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[VertexCache]
    }
    
    extension [Self <: VertexCache](x: Self) {
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  /** Base class for all visual Components (e.g. MeshVisual). */
  trait Visual
    extends StObject
       with Component {
    
    /** Returns the order of this Visual in the render queue. */
    def getRenderOrder(): Double
    
    /** Sets the order of this Visual in the render queue. */
    def setRenderOrder(value: Double): Unit
  }
  object Visual {
    
    inline def apply(
      destroy: () => Unit,
      enabled: Boolean,
      getRenderOrder: () => Double,
      getSceneObject: () => SceneObject,
      getTransform: () => Transform,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      setRenderOrder: Double => Unit
    ): Visual = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), enabled = enabled.asInstanceOf[js.Any], getRenderOrder = js.Any.fromFunction0(getRenderOrder), getSceneObject = js.Any.fromFunction0(getSceneObject), getTransform = js.Any.fromFunction0(getTransform), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), setRenderOrder = js.Any.fromFunction1(setRenderOrder))
      __obj.asInstanceOf[Visual]
    }
    
    extension [Self <: Visual](x: Self) {
      
      inline def setGetRenderOrder(value: () => Double): Self = StObject.set(x, "getRenderOrder", js.Any.fromFunction0(value))
      
      inline def setSetRenderOrder(value: Double => Unit): Self = StObject.set(x, "setRenderOrder", js.Any.fromFunction1(value))
    }
  }
}

package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for all assets used in the engine. */
trait Asset
  extends StObject
     with SerializableWithUID {
  
  /**
    * The name of the Asset in Lens Studio.
    */
  var name: String
}
object Asset {
  
  inline def apply(
    getTypeName: () => String,
    isOfType: String => Boolean,
    isSame: SerializableWithUID => Boolean,
    name: String
  ): Asset = {
    val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  /**
    * Configures an animation layer for a single SceneObject. Gives access to position, rotation, scale and blend shape animation tracks. See also: Playing 3D Animation Guide, AnimationMixer,
    * Animation.
    *
    */
  trait AnimationLayer
    extends StObject
       with Asset {
    
    /** Returns a FloatAnimationTrack from this AnimationLayer’s blend shapes. */
    def getBlendShapeTrack(shapeName: String): FloatAnimationTrack
    
    /** The Vec3AnimationTrack controlling position in this AnimationLayer. */
    var position: Vec3AnimationTrack
    
    /** The QuaternionAnimationTrack controlling rotation in this AnimationLayer. */
    var rotation: QuaternionAnimationTrack
    
    /** The Vec3AnimationTrack controlling scale in this AnimationLayer. */
    var scale: Vec3AnimationTrack
    
    /** Sets or adds a FloatAnimationTrack to this AnimationLayer’s blend shapes. */
    def setBlendShapeTrack(shapeName: String, track: FloatAnimationTrack): Unit
    
    /** The IntAnimationTrack controlling visibility in this AnimationLayer. */
    var visibility: IntAnimationTrack
  }
  object AnimationLayer {
    
    inline def apply(
      getBlendShapeTrack: String => FloatAnimationTrack,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      name: String,
      position: Vec3AnimationTrack,
      rotation: QuaternionAnimationTrack,
      scale: Vec3AnimationTrack,
      setBlendShapeTrack: (String, FloatAnimationTrack) => Unit,
      visibility: IntAnimationTrack
    ): AnimationLayer = {
      val __obj = js.Dynamic.literal(getBlendShapeTrack = js.Any.fromFunction1(getBlendShapeTrack), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], setBlendShapeTrack = js.Any.fromFunction2(setBlendShapeTrack), visibility = visibility.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationLayer]
    }
    
    extension [Self <: AnimationLayer](x: Self) {
      
      inline def setGetBlendShapeTrack(value: String => FloatAnimationTrack): Self = StObject.set(x, "getBlendShapeTrack", js.Any.fromFunction1(value))
      
      inline def setPosition(value: Vec3AnimationTrack): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: QuaternionAnimationTrack): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Vec3AnimationTrack): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSetBlendShapeTrack(value: (String, FloatAnimationTrack) => Unit): Self = StObject.set(x, "setBlendShapeTrack", js.Any.fromFunction2(value))
      
      inline def setVisibility(value: IntAnimationTrack): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
  
  type AudioEffectAsset = Asset
  
  /** Represents an audio file asset. See also: AudioComponent. */
  type AudioTrackAsset = Asset
  
  /** File based asset. */
  type BinAsset = Asset
  
  type Font = Asset
  
  /**
    * Binary ML model supplied by the user.
    * ```
    * //@input Asset.MLAsset model
    * var mlComponent = script.sceneObject.createComponent('MLComponent');
    * mlComponent.model = script.model;
    * ```
    */
  type MLAsset = BinAsset
  
  /**
    * Defines a marker to use for Marker Tracking with MarkerTrackingComponent. For more information, see the Marker Tracking guide.
    * ```
    * // Set the MarkerAsset on a MarkerTracking component
    *
    * //@input Component.MarkerTrackingComponent markerTracker
    * //@input Asset.MarkerAsset marker
    *
    * script.markerTracker.marker = script.marker;
    * ```
    */
  trait MarkerAsset
    extends StObject
       with Asset {
    
    /** Returns the aspect ratio (width / height) of the texture used by the marker asset. */
    def getAspectRatio(): Double
  }
  object MarkerAsset {
    
    inline def apply(
      getAspectRatio: () => Double,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      name: String
    ): MarkerAsset = {
      val __obj = js.Dynamic.literal(getAspectRatio = js.Any.fromFunction0(getAspectRatio), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerAsset]
    }
    
    extension [Self <: MarkerAsset](x: Self) {
      
      inline def setGetAspectRatio(value: () => Double): Self = StObject.set(x, "getAspectRatio", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * An asset that describes how visual objects should appear. Each Material is a collection of Passes which define the actual rendering passes. Materials are used by MeshVisuals for drawing meshes
    * in the scene.
    * ```
    * // Gets the first pass of a material on a sprite and plays the animation from its texture
    * var sprite = script.getSceneObject().getFirstComponent("Component.SpriteVisual");
    * var material = sprite.getMaterial(0);
    * material.getPass(0).baseTex.control.play(-1,0.0);
    * // Print number of passes
    * print("Pass count = " + material.getPassCount().toString());
    * ```
    */
  trait Material
    extends StObject
       with Asset {
    
    /** Returns the Pass of the Material at index index. */
    def getPass(index: Double): Pass
    
    /** Returns the number of Passes for the Material. */
    def getPassCount(): Double
    
    /** The first Pass of the Material. */
    var mainPass: Pass
  }
  object Material {
    
    inline def apply(
      getPass: Double => Pass,
      getPassCount: () => Double,
      getTypeName: () => String,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      mainPass: Pass,
      name: String
    ): Material = {
      val __obj = js.Dynamic.literal(getPass = js.Any.fromFunction1(getPass), getPassCount = js.Any.fromFunction0(getPassCount), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), mainPass = mainPass.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Material]
    }
    
    extension [Self <: Material](x: Self) {
      
      inline def setGetPass(value: Double => Pass): Self = StObject.set(x, "getPass", js.Any.fromFunction1(value))
      
      inline def setGetPassCount(value: () => Double): Self = StObject.set(x, "getPassCount", js.Any.fromFunction0(value))
      
      inline def setMainPass(value: Pass): Self = StObject.set(x, "mainPass", value.asInstanceOf[js.Any])
    }
  }
  
  type ObjectPrefab = Asset
  
  /** Represents a mesh asset. See also: Asset.RenderMeshVisual. */
  trait RenderMesh
    extends StObject
       with Asset {
    
    /** Returns the maximum value in each dimension of the axis-aligned bounding box containing this mesh. */
    var aabbMax: vec3
    
    /** Returns the minimum value in each dimension of the axis-aligned bounding box containing this mesh. */
    var aabbMin: vec3
    
    /** The RenderObjectProvider for this RenderMesh, which can provide more controls depending on the mesh type. See also: FaceRenderObjectProvider */
    var control: RenderObjectProvider
    
    /** The index data type used by this mesh. */
    var indexType: MeshIndexType
    
    /** The topology type used by this mesh. */
    var topology: MeshTopology
  }
  object RenderMesh {
    
    inline def apply(
      aabbMax: vec3,
      aabbMin: vec3,
      control: RenderObjectProvider,
      getTypeName: () => String,
      indexType: MeshIndexType,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      name: String,
      topology: MeshTopology
    ): RenderMesh = {
      val __obj = js.Dynamic.literal(aabbMax = aabbMax.asInstanceOf[js.Any], aabbMin = aabbMin.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), indexType = indexType.asInstanceOf[js.Any], isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), name = name.asInstanceOf[js.Any], topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderMesh]
    }
    
    extension [Self <: RenderMesh](x: Self) {
      
      inline def setAabbMax(value: vec3): Self = StObject.set(x, "aabbMax", value.asInstanceOf[js.Any])
      
      inline def setAabbMin(value: vec3): Self = StObject.set(x, "aabbMin", value.asInstanceOf[js.Any])
      
      inline def setControl(value: RenderObjectProvider): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setIndexType(value: MeshIndexType): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
      
      inline def setTopology(value: MeshTopology): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  /** Segmentation model used for SegmentationTextureProvider. */
  type SegmentationModel = BinAsset
  
  /** Represents a texture file asset. */
  trait Texture
    extends StObject
       with Asset {
    
    /** The TextureProvider for the texture, which may control things like animation depending on the texture type. See also: AnimatedTextureFileProvider. */
    var control: TextureProvider
    
    /** Returns a Texture that captures the current state of this Texture Asset. */
    def copyFrame(): Texture
    
    /** Returns the Colorspace of the Texture. */
    def getColorspace(): Colorspace
    
    /** Returns the height of the texture. */
    def getHeight(): Double
    
    /** Returns the width of the texture. */
    def getWidth(): Double
  }
  object Texture {
    
    inline def apply(
      control: TextureProvider,
      copyFrame: () => Texture,
      getColorspace: () => Colorspace,
      getHeight: () => Double,
      getTypeName: () => String,
      getWidth: () => Double,
      isOfType: String => Boolean,
      isSame: SerializableWithUID => Boolean,
      name: String
    ): Texture = {
      val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], copyFrame = js.Any.fromFunction0(copyFrame), getColorspace = js.Any.fromFunction0(getColorspace), getHeight = js.Any.fromFunction0(getHeight), getTypeName = js.Any.fromFunction0(getTypeName), getWidth = js.Any.fromFunction0(getWidth), isOfType = js.Any.fromFunction1(isOfType), isSame = js.Any.fromFunction1(isSame), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Texture]
    }
    
    extension [Self <: Texture](x: Self) {
      
      inline def setControl(value: TextureProvider): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
      
      inline def setCopyFrame(value: () => Texture): Self = StObject.set(x, "copyFrame", js.Any.fromFunction0(value))
      
      inline def setGetColorspace(value: () => Colorspace): Self = StObject.set(x, "getColorspace", js.Any.fromFunction0(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
    }
  }
}

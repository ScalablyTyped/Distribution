package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable10
import typings.react.mod.ReactNode
import typings.reactThreeFiber.canvasMod.ComputeOffsetsFunction
import typings.reactThreeFiber.canvasMod.DomEvent
import typings.reactThreeFiber.canvasMod.FilterFunction
import typings.reactThreeFiber.canvasMod.Intersection
import typings.reactThreeFiber.canvasMod.SharedCanvasContext
import typings.reactThreeFiber.threeTypesMod.Euler
import typings.reactThreeFiber.threeTypesMod.Layers
import typings.reactThreeFiber.threeTypesMod.Matrix4
import typings.reactThreeFiber.threeTypesMod.Quaternion
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import typings.std.OffscreenCanvas
import typings.std.Record
import typings.std.WebGLRenderingContext
import typings.three.anon.X
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.PixelFormat
import typings.three.constantsMod.ShadowMapType
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureEncoding
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.lightMod.Light
import typings.three.mod.BufferGeometry
import typings.three.mod.Ray
import typings.three.mod.Texture
import typings.three.mod.Vector3
import typings.three.object3DMod.Object3D
import typings.three.raycasterMod.RaycasterParameters
import typings.three.sceneMod.Scene
import typings.three.webGLObjectsMod.WebGLObjects
import typings.three.webGLRendererMod.WebGLRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Camera[T] extends StObject {
    
    var camera: typings.reactThreeFiber.canvasMod.Camera = js.native
    
    var delta: Double = js.native
    
    var intersections: js.Array[Intersection] = js.native
    
    var ray: Ray = js.native
    
    var sourceEvent: T = js.native
    
    def stopPropagation(): Unit = js.native
    
    var stopped: Boolean = js.native
    
    var unprojectedPoint: Vector3 = js.native
  }
  object Camera {
    
    @scala.inline
    def apply[T](
      camera: typings.reactThreeFiber.canvasMod.Camera,
      delta: Double,
      intersections: js.Array[Intersection],
      ray: Ray,
      sourceEvent: T,
      stopPropagation: () => Unit,
      stopped: Boolean,
      unprojectedPoint: Vector3
    ): Camera[T] = {
      val __obj = js.Dynamic.literal(camera = camera.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], intersections = intersections.asInstanceOf[js.Any], ray = ray.asInstanceOf[js.Any], sourceEvent = sourceEvent.asInstanceOf[js.Any], stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], unprojectedPoint = unprojectedPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Camera[T]]
    }
    
    @scala.inline
    implicit class CameraMutableBuilder[Self <: Camera[_], T] (val x: Self with Camera[T]) extends AnyVal {
      
      @scala.inline
      def setCamera(value: typings.reactThreeFiber.canvasMod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
      
      @scala.inline
      def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceEvent(value: T): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnprojectedPoint(value: Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: Double | js.Symbol = js.native
    
    var children: ReactNode = js.native
    
    var containerInfo: js.Any = js.native
    
    var implementation: js.Any = js.native
    
    var key: String | Null = js.native
  }
  object Children {
    
    @scala.inline
    def apply(DollarDollartypeof: Double | js.Symbol, containerInfo: js.Any, implementation: js.Any): Children = {
      val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setContainerInfo(value: js.Any): Self = StObject.set(x, "containerInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDollarDollartypeof(value: Double | js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImplementation(value: js.Any): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
    }
  }
  
  @js.native
  trait Color extends StObject {
    
    var color: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Color] = js.native
  }
  object Color {
    
    @scala.inline
    def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    @scala.inline
    implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: typings.reactThreeFiber.threeTypesMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  @js.native
  trait Dispose extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit] | Null] = js.native
    
    var layers: js.UndefOr[Layers] = js.native
    
    var matrix: js.UndefOr[Matrix4] = js.native
    
    var position: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.native
    
    var quaternion: js.UndefOr[Quaternion] = js.native
    
    var rotation: js.UndefOr[Euler] = js.native
    
    var scale: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.native
    
    var up: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.native
  }
  object Dispose {
    
    @scala.inline
    def apply(): Dispose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dispose]
    }
    
    @scala.inline
    implicit class DisposeMutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisposeNull: Self = StObject.set(x, "dispose", null)
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      @scala.inline
      def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      @scala.inline
      def setPosition(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuaternionUndefined: Self = StObject.set(x, "quaternion", js.undefined)
      
      @scala.inline
      def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setUp(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(x: Double, y: Double, z: Double): typings.three.eulerMod.Euler = js.native
    def apply(x: Double, y: Double, z: Double, order: String): typings.three.eulerMod.Euler = js.native
  }
  
  @js.native
  trait FnCallXY extends StObject {
    
    def apply(args: Double*): this.type = js.native
    def apply(x: Double, y: Double): this.type = js.native
  }
  
  @js.native
  trait FnCallXYZ extends StObject {
    
    def apply(args: Double*): this.type = js.native
    def apply(x: Double, y: Double, z: Double): this.type = js.native
  }
  
  @js.native
  trait OffsetX extends StObject {
    
    var offsetX: Double = js.native
    
    var offsetY: Double = js.native
  }
  object OffsetX {
    
    @scala.inline
    def apply(offsetX: Double, offsetY: Double): OffsetX = {
      val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    @scala.inline
    implicit class OffsetXMutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<three.three.Raycaster> & {  filter :react-three-fiber.react-three-fiber/canvas.FilterFunction | undefined,   computeOffsets :react-three-fiber.react-three-fiber/canvas.ComputeOffsetsFunction | undefined} */
  @js.native
  trait PartialRaycasterfilterFil extends StObject {
    
    var camera: js.UndefOr[typings.three.cameraMod.Camera] = js.native
    
    var computeOffsets: js.UndefOr[ComputeOffsetsFunction] = js.native
    
    var constructor: js.UndefOr[js.Function0[js.Any]] = js.native
    
    var far: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[FilterFunction] = js.native
    
    var intersectObject: js.UndefOr[
        js.Function1[/* object */ Object3D, js.Array[typings.three.raycasterMod.Intersection]]
      ] = js.native
    
    var intersectObjects: js.UndefOr[
        js.Function1[
          /* objects */ js.Array[Object3D], 
          js.Array[typings.three.raycasterMod.Intersection]
        ]
      ] = js.native
    
    var layers: js.UndefOr[typings.three.layersMod.Layers] = js.native
    
    var near: js.UndefOr[Double] = js.native
    
    var params: js.UndefOr[RaycasterParameters] = js.native
    
    var ray: js.UndefOr[typings.three.rayMod.Ray] = js.native
    
    var set: js.UndefOr[
        js.Function2[
          /* origin */ typings.three.vector3Mod.Vector3, 
          /* direction */ typings.three.vector3Mod.Vector3, 
          Unit
        ]
      ] = js.native
    
    var setFromCamera: js.UndefOr[js.Function2[/* coords */ X, /* camera */ typings.three.cameraMod.Camera, Unit]] = js.native
  }
  object PartialRaycasterfilterFil {
    
    @scala.inline
    def apply(): PartialRaycasterfilterFil = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaycasterfilterFil]
    }
    
    @scala.inline
    implicit class PartialRaycasterfilterFilMutableBuilder[Self <: PartialRaycasterfilterFil] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera(value: typings.three.cameraMod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      @scala.inline
      def setComputeOffsets(value: /* event */ DomEvent => OffsetX): Self = StObject.set(x, "computeOffsets", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComputeOffsetsUndefined: Self = StObject.set(x, "computeOffsets", js.undefined)
      
      @scala.inline
      def setConstructor(value: () => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
      
      @scala.inline
      def setFilter(
        value: (/* items */ js.Array[typings.three.raycasterMod.Intersection], /* state */ SharedCanvasContext) => js.Array[typings.three.raycasterMod.Intersection]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setIntersectObject(value: /* object */ Object3D => js.Array[typings.three.raycasterMod.Intersection]): Self = StObject.set(x, "intersectObject", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntersectObjectUndefined: Self = StObject.set(x, "intersectObject", js.undefined)
      
      @scala.inline
      def setIntersectObjects(value: /* objects */ js.Array[Object3D] => js.Array[typings.three.raycasterMod.Intersection]): Self = StObject.set(x, "intersectObjects", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIntersectObjectsUndefined: Self = StObject.set(x, "intersectObjects", js.undefined)
      
      @scala.inline
      def setLayers(value: typings.three.layersMod.Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
      
      @scala.inline
      def setParams(value: RaycasterParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setRay(value: typings.three.rayMod.Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
      
      @scala.inline
      def setSet(
        value: (/* origin */ typings.three.vector3Mod.Vector3, /* direction */ typings.three.vector3Mod.Vector3) => Unit
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetFromCamera(value: (/* coords */ X, /* camera */ typings.three.cameraMod.Camera) => Unit): Self = StObject.set(x, "setFromCamera", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetFromCameraUndefined: Self = StObject.set(x, "setFromCamera", js.undefined)
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  /* Inlined std.Partial<three.three.WebGLRendererParameters> */
  @js.native
  trait PartialWebGLRendererParam extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.native
    
    var antialias: js.UndefOr[Boolean] = js.native
    
    var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.native
    
    var context: js.UndefOr[WebGLRenderingContext] = js.native
    
    var depth: js.UndefOr[Boolean] = js.native
    
    var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.native
    
    var powerPreference: js.UndefOr[String] = js.native
    
    var precision: js.UndefOr[String] = js.native
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.native
    
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.native
    
    var stencil: js.UndefOr[Boolean] = js.native
  }
  object PartialWebGLRendererParam {
    
    @scala.inline
    def apply(): PartialWebGLRendererParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWebGLRendererParam]
    }
    
    @scala.inline
    implicit class PartialWebGLRendererParamMutableBuilder[Self <: PartialWebGLRendererParam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      @scala.inline
      def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      @scala.inline
      def setContext(value: WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
      
      @scala.inline
      def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
      
      @scala.inline
      def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      @scala.inline
      def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      @scala.inline
      def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
  
  /* Inlined std.Partial<three.three.WebGLShadowMap> */
  @js.native
  trait PartialWebGLShadowMap extends StObject {
    
    var autoUpdate: js.UndefOr[Boolean] = js.native
    
    var constructor: js.UndefOr[
        js.Function3[
          /* _renderer */ WebGLRenderer, 
          /* _objects */ WebGLObjects, 
          /* maxTextureSize */ Double, 
          js.Any
        ]
      ] = js.native
    
    var cullFace: js.UndefOr[js.Any] = js.native
    
    var enabled: js.UndefOr[Boolean] = js.native
    
    var needsUpdate: js.UndefOr[Boolean] = js.native
    
    var render: js.UndefOr[
        js.Function3[
          /* shadowsArray */ js.Array[Light], 
          /* scene */ Scene, 
          /* camera */ typings.three.cameraMod.Camera, 
          Unit
        ]
      ] = js.native
    
    var `type`: js.UndefOr[ShadowMapType] = js.native
  }
  object PartialWebGLShadowMap {
    
    @scala.inline
    def apply(): PartialWebGLShadowMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWebGLShadowMap]
    }
    
    @scala.inline
    implicit class PartialWebGLShadowMapMutableBuilder[Self <: PartialWebGLShadowMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
      
      @scala.inline
      def setConstructor(
        value: (/* _renderer */ WebGLRenderer, /* _objects */ WebGLObjects, /* maxTextureSize */ Double) => js.Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setCullFace(value: js.Any): Self = StObject.set(x, "cullFace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCullFaceUndefined: Self = StObject.set(x, "cullFace", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsUpdateUndefined: Self = StObject.set(x, "needsUpdate", js.undefined)
      
      @scala.inline
      def setRender(
        value: (/* shadowsArray */ js.Array[Light], /* scene */ Scene, /* camera */ typings.three.cameraMod.Camera) => Unit
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setType(value: ShadowMapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Resize extends StObject {
    
    var resize: Double = js.native
    
    var scroll: Double = js.native
  }
  object Resize {
    
    @scala.inline
    def apply(resize: Double, scroll: Double): Resize = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    @scala.inline
    implicit class ResizeMutableBuilder[Self <: Resize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: Double): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBufferGeometry extends Instantiable0[BufferGeometry] {
    
    var MaxIndex: Double = js.native
  }
  
  @js.native
  trait TypeofColor
    extends Instantiable0[typings.three.mod.Color] {
    
    /**
    	 * List of X11 color names.
    	 */
    var NAMES: Record[String, Double] = js.native
  }
  
  @js.native
  trait TypeofEuler
    extends Instantiable0[typings.three.mod.Euler] {
    
    var DefaultOrder: String = js.native
    
    var RotationOrders: js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofQuaternion
    extends Instantiable0[typings.three.mod.Quaternion] {
    
    def multiplyQuaternionsFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double
    ): js.Array[Double] = js.native
    
    /**
    	 * Adapted from http://www.euclideanspace.com/maths/algebra/realNormedAlgebra/quaternions/slerp/.
    	 */
    def slerp(
      qa: typings.three.quaternionMod.Quaternion,
      qb: typings.three.quaternionMod.Quaternion,
      qm: typings.three.quaternionMod.Quaternion,
      t: Double
    ): typings.three.quaternionMod.Quaternion = js.native
    
    def slerpFlat(
      dst: js.Array[Double],
      dstOffset: Double,
      src0: js.Array[Double],
      srcOffset: Double,
      src1: js.Array[Double],
      stcOffset1: Double,
      t: Double
    ): typings.three.quaternionMod.Quaternion = js.native
  }
  
  @js.native
  trait TypeofTexture
    extends Instantiable10[
          /* image */ js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement], 
          /* mapping */ js.UndefOr[Mapping], 
          /* wrapS */ js.UndefOr[Wrapping], 
          /* wrapT */ js.UndefOr[Wrapping], 
          /* magFilter */ js.UndefOr[TextureFilter], 
          /* minFilter */ js.UndefOr[TextureFilter], 
          /* format */ js.UndefOr[PixelFormat], 
          /* type */ js.UndefOr[TextureDataType], 
          /* anisotropy */ js.UndefOr[Double], 
          /* encoding */ js.UndefOr[TextureEncoding], 
          Texture
        ] {
    
    var DEFAULT_IMAGE: js.Any = js.native
    
    var DEFAULT_MAPPING: js.Any = js.native
  }
  
  @js.native
  trait Vertices extends StObject {
    
    var vertices: js.UndefOr[js.Array[typings.reactThreeFiber.threeTypesMod.Vector3]] = js.native
  }
  object Vertices {
    
    @scala.inline
    def apply(): Vertices = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vertices]
    }
    
    @scala.inline
    implicit class VerticesMutableBuilder[Self <: Vertices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVertices(value: js.Array[typings.reactThreeFiber.threeTypesMod.Vector3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
      
      @scala.inline
      def setVerticesVarargs(value: typings.reactThreeFiber.threeTypesMod.Vector3*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
}

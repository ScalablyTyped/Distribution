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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Camera[T] extends StObject {
    
    var camera: typings.reactThreeFiber.canvasMod.Camera
    
    var delta: Double
    
    var intersections: js.Array[Intersection]
    
    var ray: Ray
    
    var sourceEvent: T
    
    def stopPropagation(): Unit
    
    var stopped: Boolean
    
    var unprojectedPoint: Vector3
  }
  object Camera {
    
    inline def apply[T](
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
    
    extension [Self <: Camera[?], T](x: Self & Camera[T]) {
      
      inline def setCamera(value: typings.reactThreeFiber.canvasMod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
      
      inline def setIntersections(value: js.Array[Intersection]): Self = StObject.set(x, "intersections", value.asInstanceOf[js.Any])
      
      inline def setIntersectionsVarargs(value: Intersection*): Self = StObject.set(x, "intersections", js.Array(value :_*))
      
      inline def setRay(value: Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      inline def setSourceEvent(value: T): Self = StObject.set(x, "sourceEvent", value.asInstanceOf[js.Any])
      
      inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
      
      inline def setUnprojectedPoint(value: Vector3): Self = StObject.set(x, "unprojectedPoint", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    @JSName("$$typeof")
    var DollarDollartypeof: Double | js.Symbol
    
    var children: ReactNode
    
    var containerInfo: js.Any
    
    var implementation: js.Any
    
    var key: String | Null
  }
  object Children {
    
    inline def apply(DollarDollartypeof: Double | js.Symbol, containerInfo: js.Any, implementation: js.Any): Children = {
      val __obj = js.Dynamic.literal(containerInfo = containerInfo.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any], key = null)
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContainerInfo(value: js.Any): Self = StObject.set(x, "containerInfo", value.asInstanceOf[js.Any])
      
      inline def setDollarDollartypeof(value: Double | js.Symbol): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
      
      inline def setImplementation(value: js.Any): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
    }
  }
  
  trait Color extends StObject {
    
    var color: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Color] = js.undefined
  }
  object Color {
    
    inline def apply(): Color = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: typings.reactThreeFiber.threeTypesMod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait Dispose extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit] | Null] = js.undefined
    
    var layers: js.UndefOr[Layers] = js.undefined
    
    var matrix: js.UndefOr[Matrix4] = js.undefined
    
    var position: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.undefined
    
    var quaternion: js.UndefOr[Quaternion] = js.undefined
    
    var rotation: js.UndefOr[Euler] = js.undefined
    
    var scale: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.undefined
    
    var up: js.UndefOr[typings.reactThreeFiber.threeTypesMod.Vector3] = js.undefined
  }
  object Dispose {
    
    inline def apply(): Dispose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dispose]
    }
    
    extension [Self <: Dispose](x: Self) {
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposeNull: Self = StObject.set(x, "dispose", null)
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setLayers(value: Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setMatrix(value: Matrix4): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setPosition(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setQuaternion(value: Quaternion): Self = StObject.set(x, "quaternion", value.asInstanceOf[js.Any])
      
      inline def setQuaternionUndefined: Self = StObject.set(x, "quaternion", js.undefined)
      
      inline def setRotation(value: Euler): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setScale(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setUp(value: typings.reactThreeFiber.threeTypesMod.Vector3): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
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
  
  trait OffsetX extends StObject {
    
    var offsetX: Double
    
    var offsetY: Double
  }
  object OffsetX {
    
    inline def apply(offsetX: Double, offsetY: Double): OffsetX = {
      val __obj = js.Dynamic.literal(offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    extension [Self <: OffsetX](x: Self) {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<three.three.Raycaster> & {  filter :react-three-fiber.react-three-fiber/canvas.FilterFunction | undefined,   computeOffsets :react-three-fiber.react-three-fiber/canvas.ComputeOffsetsFunction | undefined} */
  trait PartialRaycasterfilterFil extends StObject {
    
    var camera: js.UndefOr[typings.three.cameraMod.Camera] = js.undefined
    
    var computeOffsets: js.UndefOr[ComputeOffsetsFunction] = js.undefined
    
    var constructor: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    var far: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[FilterFunction] = js.undefined
    
    var intersectObject: js.UndefOr[
        js.Function1[/* object */ Object3D, js.Array[typings.three.raycasterMod.Intersection]]
      ] = js.undefined
    
    var intersectObjects: js.UndefOr[
        js.Function1[
          /* objects */ js.Array[Object3D], 
          js.Array[typings.three.raycasterMod.Intersection]
        ]
      ] = js.undefined
    
    var layers: js.UndefOr[typings.three.layersMod.Layers] = js.undefined
    
    var near: js.UndefOr[Double] = js.undefined
    
    var params: js.UndefOr[RaycasterParameters] = js.undefined
    
    var ray: js.UndefOr[typings.three.rayMod.Ray] = js.undefined
    
    var set: js.UndefOr[
        js.Function2[
          /* origin */ typings.three.vector3Mod.Vector3, 
          /* direction */ typings.three.vector3Mod.Vector3, 
          Unit
        ]
      ] = js.undefined
    
    var setFromCamera: js.UndefOr[js.Function2[/* coords */ X, /* camera */ typings.three.cameraMod.Camera, Unit]] = js.undefined
  }
  object PartialRaycasterfilterFil {
    
    inline def apply(): PartialRaycasterfilterFil = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRaycasterfilterFil]
    }
    
    extension [Self <: PartialRaycasterfilterFil](x: Self) {
      
      inline def setCamera(value: typings.three.cameraMod.Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      inline def setComputeOffsets(value: /* event */ DomEvent => OffsetX): Self = StObject.set(x, "computeOffsets", js.Any.fromFunction1(value))
      
      inline def setComputeOffsetsUndefined: Self = StObject.set(x, "computeOffsets", js.undefined)
      
      inline def setConstructor(value: () => js.Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
      
      inline def setFarUndefined: Self = StObject.set(x, "far", js.undefined)
      
      inline def setFilter(
        value: (/* items */ js.Array[typings.three.raycasterMod.Intersection], /* state */ SharedCanvasContext) => js.Array[typings.three.raycasterMod.Intersection]
      ): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setIntersectObject(value: /* object */ Object3D => js.Array[typings.three.raycasterMod.Intersection]): Self = StObject.set(x, "intersectObject", js.Any.fromFunction1(value))
      
      inline def setIntersectObjectUndefined: Self = StObject.set(x, "intersectObject", js.undefined)
      
      inline def setIntersectObjects(value: /* objects */ js.Array[Object3D] => js.Array[typings.three.raycasterMod.Intersection]): Self = StObject.set(x, "intersectObjects", js.Any.fromFunction1(value))
      
      inline def setIntersectObjectsUndefined: Self = StObject.set(x, "intersectObjects", js.undefined)
      
      inline def setLayers(value: typings.three.layersMod.Layers): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
      
      inline def setNearUndefined: Self = StObject.set(x, "near", js.undefined)
      
      inline def setParams(value: RaycasterParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRay(value: typings.three.rayMod.Ray): Self = StObject.set(x, "ray", value.asInstanceOf[js.Any])
      
      inline def setRayUndefined: Self = StObject.set(x, "ray", js.undefined)
      
      inline def setSet(
        value: (/* origin */ typings.three.vector3Mod.Vector3, /* direction */ typings.three.vector3Mod.Vector3) => Unit
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSetFromCamera(value: (/* coords */ X, /* camera */ typings.three.cameraMod.Camera) => Unit): Self = StObject.set(x, "setFromCamera", js.Any.fromFunction2(value))
      
      inline def setSetFromCameraUndefined: Self = StObject.set(x, "setFromCamera", js.undefined)
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    }
  }
  
  /* Inlined std.Partial<three.three.WebGLRendererParameters> */
  trait PartialWebGLRendererParam extends StObject {
    
    var alpha: js.UndefOr[Boolean] = js.undefined
    
    var antialias: js.UndefOr[Boolean] = js.undefined
    
    var canvas: js.UndefOr[HTMLCanvasElement | OffscreenCanvas] = js.undefined
    
    var context: js.UndefOr[WebGLRenderingContext] = js.undefined
    
    var depth: js.UndefOr[Boolean] = js.undefined
    
    var logarithmicDepthBuffer: js.UndefOr[Boolean] = js.undefined
    
    var powerPreference: js.UndefOr[String] = js.undefined
    
    var precision: js.UndefOr[String] = js.undefined
    
    var premultipliedAlpha: js.UndefOr[Boolean] = js.undefined
    
    var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
    
    var stencil: js.UndefOr[Boolean] = js.undefined
  }
  object PartialWebGLRendererParam {
    
    inline def apply(): PartialWebGLRendererParam = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWebGLRendererParam]
    }
    
    extension [Self <: PartialWebGLRendererParam](x: Self) {
      
      inline def setAlpha(value: Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setAntialias(value: Boolean): Self = StObject.set(x, "antialias", value.asInstanceOf[js.Any])
      
      inline def setAntialiasUndefined: Self = StObject.set(x, "antialias", js.undefined)
      
      inline def setCanvas(value: HTMLCanvasElement | OffscreenCanvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
      
      inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
      
      inline def setContext(value: WebGLRenderingContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setLogarithmicDepthBuffer(value: Boolean): Self = StObject.set(x, "logarithmicDepthBuffer", value.asInstanceOf[js.Any])
      
      inline def setLogarithmicDepthBufferUndefined: Self = StObject.set(x, "logarithmicDepthBuffer", js.undefined)
      
      inline def setPowerPreference(value: String): Self = StObject.set(x, "powerPreference", value.asInstanceOf[js.Any])
      
      inline def setPowerPreferenceUndefined: Self = StObject.set(x, "powerPreference", js.undefined)
      
      inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPremultipliedAlpha(value: Boolean): Self = StObject.set(x, "premultipliedAlpha", value.asInstanceOf[js.Any])
      
      inline def setPremultipliedAlphaUndefined: Self = StObject.set(x, "premultipliedAlpha", js.undefined)
      
      inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
      
      inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
      
      inline def setStencil(value: Boolean): Self = StObject.set(x, "stencil", value.asInstanceOf[js.Any])
      
      inline def setStencilUndefined: Self = StObject.set(x, "stencil", js.undefined)
    }
  }
  
  /* Inlined std.Partial<three.three.WebGLShadowMap> */
  trait PartialWebGLShadowMap extends StObject {
    
    var autoUpdate: js.UndefOr[Boolean] = js.undefined
    
    var constructor: js.UndefOr[
        js.Function3[
          /* _renderer */ WebGLRenderer, 
          /* _objects */ WebGLObjects, 
          /* maxTextureSize */ Double, 
          js.Any
        ]
      ] = js.undefined
    
    var cullFace: js.UndefOr[js.Any] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var needsUpdate: js.UndefOr[Boolean] = js.undefined
    
    var render: js.UndefOr[
        js.Function3[
          /* shadowsArray */ js.Array[Light], 
          /* scene */ Scene, 
          /* camera */ typings.three.cameraMod.Camera, 
          Unit
        ]
      ] = js.undefined
    
    var `type`: js.UndefOr[ShadowMapType] = js.undefined
  }
  object PartialWebGLShadowMap {
    
    inline def apply(): PartialWebGLShadowMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWebGLShadowMap]
    }
    
    extension [Self <: PartialWebGLShadowMap](x: Self) {
      
      inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
      
      inline def setConstructor(
        value: (/* _renderer */ WebGLRenderer, /* _objects */ WebGLObjects, /* maxTextureSize */ Double) => js.Any
      ): Self = StObject.set(x, "constructor", js.Any.fromFunction3(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setCullFace(value: js.Any): Self = StObject.set(x, "cullFace", value.asInstanceOf[js.Any])
      
      inline def setCullFaceUndefined: Self = StObject.set(x, "cullFace", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
      
      inline def setNeedsUpdateUndefined: Self = StObject.set(x, "needsUpdate", js.undefined)
      
      inline def setRender(
        value: (/* shadowsArray */ js.Array[Light], /* scene */ Scene, /* camera */ typings.three.cameraMod.Camera) => Unit
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setType(value: ShadowMapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Resize extends StObject {
    
    var resize: Double
    
    var scroll: Double
  }
  object Resize {
    
    inline def apply(resize: Double, scroll: Double): Resize = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resize]
    }
    
    extension [Self <: Resize](x: Self) {
      
      inline def setResize(value: Double): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setScroll(value: Double): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofBufferGeometry
    extends StObject
       with Instantiable0[BufferGeometry] {
    
    var MaxIndex: Double = js.native
  }
  
  @js.native
  trait TypeofColor
    extends StObject
       with Instantiable0[typings.three.mod.Color] {
    
    /**
    	 * List of X11 color names.
    	 */
    var NAMES: Record[String, Double] = js.native
  }
  
  @js.native
  trait TypeofEuler
    extends StObject
       with Instantiable0[typings.three.mod.Euler] {
    
    var DefaultOrder: String = js.native
    
    var RotationOrders: js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofQuaternion
    extends StObject
       with Instantiable0[typings.three.mod.Quaternion] {
    
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
    extends StObject
       with Instantiable10[
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
  
  trait Vertices extends StObject {
    
    var vertices: js.UndefOr[js.Array[typings.reactThreeFiber.threeTypesMod.Vector3]] = js.undefined
  }
  object Vertices {
    
    inline def apply(): Vertices = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Vertices]
    }
    
    extension [Self <: Vertices](x: Self) {
      
      inline def setVertices(value: js.Array[typings.reactThreeFiber.threeTypesMod.Vector3]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
      
      inline def setVerticesVarargs(value: typings.reactThreeFiber.threeTypesMod.Vector3*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
}

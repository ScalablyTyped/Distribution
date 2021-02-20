package typings.reactThreeFiber

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import typings.react.mod.HTMLAttributes
import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.reactThreeFiber.anon.PartialRaycasterfilterFil
import typings.reactThreeFiber.anon.PartialWebGLRendererParam
import typings.reactThreeFiber.anon.PartialWebGLShadowMap
import typings.reactThreeFiber.canvasMod.CanvasContext
import typings.reactThreeFiber.canvasMod.ResizeOptions
import typings.reactThreeFiber.threeTypesMod.Object3DNode
import typings.std.HTMLDivElement
import typings.std.Partial
import typings.three.mod.Camera
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import typings.three.object3DMod.Object3D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resizeContainerMod {
  
  @JSImport("react-three-fiber/targets/shared/web/ResizeContainer", "ResizeContainer")
  @js.native
  val ResizeContainer: NamedExoticComponent[ResizeContainerProps] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactThreeFiber.canvasMod.CanvasProps because var conflicts: children. Inlined vr, webgl1, concurrent, shadowMap, colorManagement, orthographic, resize, invalidateFrameloop, updateDefaultCamera, noEvents, gl, camera, raycaster, pixelRatio, onCreated, onPointerMissed */ @js.native
  trait ContainerProps extends HTMLAttributes[HTMLDivElement] {
    
    var camera: js.UndefOr[
        Partial[
          (Object3DNode[Camera, Instantiable0[Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
            OrthographicCamera, 
            Instantiable4[
              /* left */ Double, 
              /* right */ Double, 
              /* top */ Double, 
              /* bottom */ Double, 
              OrthographicCamera
            ]
          ])
        ]
      ] = js.native
    
    @JSName("children")
    var children_ContainerProps: ReactNode = js.native
    
    var colorManagement: js.UndefOr[Boolean] = js.native
    
    var concurrent: js.UndefOr[Boolean] = js.native
    
    var gl: js.UndefOr[PartialWebGLRendererParam] = js.native
    
    var invalidateFrameloop: js.UndefOr[Boolean] = js.native
    
    var noEvents: js.UndefOr[Boolean] = js.native
    
    var onCreated: js.UndefOr[js.Function1[/* props */ CanvasContext, js.Promise[_] | Unit]] = js.native
    
    var onPointerMissed: js.UndefOr[js.Function0[Unit]] = js.native
    
    var orthographic: js.UndefOr[Boolean] = js.native
    
    var pixelRatio: js.UndefOr[Double | (js.Tuple2[Double, Double])] = js.native
    
    var raycaster: js.UndefOr[PartialRaycasterfilterFil] = js.native
    
    var resize: js.UndefOr[ResizeOptions] = js.native
    
    var shadowMap: js.UndefOr[Boolean | PartialWebGLShadowMap] = js.native
    
    var updateDefaultCamera: js.UndefOr[Boolean] = js.native
    
    var vr: js.UndefOr[Boolean] = js.native
    
    var webgl1: js.UndefOr[Boolean] = js.native
  }
  object ContainerProps {
    
    @scala.inline
    def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    @scala.inline
    implicit class ContainerPropsMutableBuilder[Self <: ContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamera(
        value: Partial[
              (Object3DNode[Camera, Instantiable0[Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
                OrthographicCamera, 
                Instantiable4[
                  /* left */ Double, 
                  /* right */ Double, 
                  /* top */ Double, 
                  /* bottom */ Double, 
                  OrthographicCamera
                ]
              ])
            ]
      ): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setColorManagement(value: Boolean): Self = StObject.set(x, "colorManagement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorManagementUndefined: Self = StObject.set(x, "colorManagement", js.undefined)
      
      @scala.inline
      def setConcurrent(value: Boolean): Self = StObject.set(x, "concurrent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentUndefined: Self = StObject.set(x, "concurrent", js.undefined)
      
      @scala.inline
      def setGl(value: PartialWebGLRendererParam): Self = StObject.set(x, "gl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlUndefined: Self = StObject.set(x, "gl", js.undefined)
      
      @scala.inline
      def setInvalidateFrameloop(value: Boolean): Self = StObject.set(x, "invalidateFrameloop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidateFrameloopUndefined: Self = StObject.set(x, "invalidateFrameloop", js.undefined)
      
      @scala.inline
      def setNoEvents(value: Boolean): Self = StObject.set(x, "noEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoEventsUndefined: Self = StObject.set(x, "noEvents", js.undefined)
      
      @scala.inline
      def setOnCreated(value: /* props */ CanvasContext => js.Promise[_] | Unit): Self = StObject.set(x, "onCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCreatedUndefined: Self = StObject.set(x, "onCreated", js.undefined)
      
      @scala.inline
      def setOnPointerMissed(value: () => Unit): Self = StObject.set(x, "onPointerMissed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPointerMissedUndefined: Self = StObject.set(x, "onPointerMissed", js.undefined)
      
      @scala.inline
      def setOrthographic(value: Boolean): Self = StObject.set(x, "orthographic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrthographicUndefined: Self = StObject.set(x, "orthographic", js.undefined)
      
      @scala.inline
      def setPixelRatio(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      @scala.inline
      def setRaycaster(value: PartialRaycasterfilterFil): Self = StObject.set(x, "raycaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaycasterUndefined: Self = StObject.set(x, "raycaster", js.undefined)
      
      @scala.inline
      def setResize(value: ResizeOptions): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      @scala.inline
      def setShadowMap(value: Boolean | PartialWebGLShadowMap): Self = StObject.set(x, "shadowMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowMapUndefined: Self = StObject.set(x, "shadowMap", js.undefined)
      
      @scala.inline
      def setUpdateDefaultCamera(value: Boolean): Self = StObject.set(x, "updateDefaultCamera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDefaultCameraUndefined: Self = StObject.set(x, "updateDefaultCamera", js.undefined)
      
      @scala.inline
      def setVr(value: Boolean): Self = StObject.set(x, "vr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVrUndefined: Self = StObject.set(x, "vr", js.undefined)
      
      @scala.inline
      def setWebgl1(value: Boolean): Self = StObject.set(x, "webgl1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebgl1Undefined: Self = StObject.set(x, "webgl1", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<three.three.Renderer, 'domElement'> */
  @js.native
  trait Renderer extends StObject {
    
    var render: js.Function2[/* scene */ Object3D, /* camera */ typings.three.cameraMod.Camera, Unit] = js.native
    
    var setSize: js.Function2[/* width */ Double, /* height */ Double, Unit] = js.native
  }
  object Renderer {
    
    @scala.inline
    def apply(
      render: (/* scene */ Object3D, /* camera */ typings.three.cameraMod.Camera) => Unit,
      setSize: (/* width */ Double, /* height */ Double) => Unit
    ): Renderer = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render), setSize = js.Any.fromFunction2(setSize))
      __obj.asInstanceOf[Renderer]
    }
    
    @scala.inline
    implicit class RendererMutableBuilder[Self <: Renderer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: (/* scene */ Object3D, /* camera */ typings.three.cameraMod.Camera) => Unit): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetSize(value: (/* width */ Double, /* height */ Double) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ResizeContainerProps extends ContainerProps {
    
    var effects: js.UndefOr[
        js.Function2[/* renderer */ js.Any, /* parent */ HTMLDivElement, js.Function0[_]]
      ] = js.native
    
    var preRender: js.UndefOr[ReactNode] = js.native
    
    def renderer(): js.UndefOr[Renderer | Null] = js.native
  }
  object ResizeContainerProps {
    
    @scala.inline
    def apply(renderer: () => js.UndefOr[Renderer | Null]): ResizeContainerProps = {
      val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction0(renderer))
      __obj.asInstanceOf[ResizeContainerProps]
    }
    
    @scala.inline
    implicit class ResizeContainerPropsMutableBuilder[Self <: ResizeContainerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffects(value: (/* renderer */ js.Any, /* parent */ HTMLDivElement) => js.Function0[_]): Self = StObject.set(x, "effects", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setPreRender(value: ReactNode): Self = StObject.set(x, "preRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      @scala.inline
      def setRenderer(value: () => js.UndefOr[Renderer | Null]): Self = StObject.set(x, "renderer", js.Any.fromFunction0(value))
    }
  }
}

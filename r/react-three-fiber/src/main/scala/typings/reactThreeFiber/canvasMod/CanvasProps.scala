package typings.reactThreeFiber.canvasMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable4
import typings.react.mod.ReactNode
import typings.reactThreeFiber.anon.PartialRaycasterfilterFil
import typings.reactThreeFiber.anon.PartialWebGLRendererParam
import typings.reactThreeFiber.anon.PartialWebGLShadowMap
import typings.reactThreeFiber.threeTypesMod.Object3DNode
import typings.std.Partial
import typings.three.mod.OrthographicCamera
import typings.three.mod.PerspectiveCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasProps extends js.Object {
  
  var camera: js.UndefOr[
    Partial[
      (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
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
  
  var children: ReactNode = js.native
  
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
object CanvasProps {
  
  @scala.inline
  def apply(): CanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasProps]
  }
  
  @scala.inline
  implicit class CanvasPropsOps[Self <: CanvasProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCamera(
      value: Partial[
          (Object3DNode[typings.three.mod.Camera, Instantiable0[typings.three.mod.Camera]]) with (Object3DNode[PerspectiveCamera, Instantiable0[PerspectiveCamera]]) with (Object3DNode[
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
    ): Self = this.set("camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setColorManagement(value: Boolean): Self = this.set("colorManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorManagement: Self = this.set("colorManagement", js.undefined)
    
    @scala.inline
    def setConcurrent(value: Boolean): Self = this.set("concurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrent: Self = this.set("concurrent", js.undefined)
    
    @scala.inline
    def setGl(value: PartialWebGLRendererParam): Self = this.set("gl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGl: Self = this.set("gl", js.undefined)
    
    @scala.inline
    def setInvalidateFrameloop(value: Boolean): Self = this.set("invalidateFrameloop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidateFrameloop: Self = this.set("invalidateFrameloop", js.undefined)
    
    @scala.inline
    def setNoEvents(value: Boolean): Self = this.set("noEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoEvents: Self = this.set("noEvents", js.undefined)
    
    @scala.inline
    def setOnCreated(value: /* props */ CanvasContext => js.Promise[_] | Unit): Self = this.set("onCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCreated: Self = this.set("onCreated", js.undefined)
    
    @scala.inline
    def setOnPointerMissed(value: () => Unit): Self = this.set("onPointerMissed", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnPointerMissed: Self = this.set("onPointerMissed", js.undefined)
    
    @scala.inline
    def setOrthographic(value: Boolean): Self = this.set("orthographic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrthographic: Self = this.set("orthographic", js.undefined)
    
    @scala.inline
    def setPixelRatio(value: Double | (js.Tuple2[Double, Double])): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    
    @scala.inline
    def setRaycaster(value: PartialRaycasterfilterFil): Self = this.set("raycaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaycaster: Self = this.set("raycaster", js.undefined)
    
    @scala.inline
    def setResize(value: ResizeOptions): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setShadowMap(value: Boolean | PartialWebGLShadowMap): Self = this.set("shadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowMap: Self = this.set("shadowMap", js.undefined)
    
    @scala.inline
    def setUpdateDefaultCamera(value: Boolean): Self = this.set("updateDefaultCamera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateDefaultCamera: Self = this.set("updateDefaultCamera", js.undefined)
    
    @scala.inline
    def setVr(value: Boolean): Self = this.set("vr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVr: Self = this.set("vr", js.undefined)
    
    @scala.inline
    def setWebgl1(value: Boolean): Self = this.set("webgl1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebgl1: Self = this.set("webgl1", js.undefined)
  }
}

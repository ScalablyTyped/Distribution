package typings.reactThreeFiber.nativeCanvasMod

import typings.react.mod.MutableRefObject
import typings.reactNative.mod.ViewStyle
import typings.reactThreeFiber.canvasMod.CanvasProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeCanvasProps extends CanvasProps {
  
  var nativeRef_EXPERIMENTAL: js.UndefOr[MutableRefObject[_]] = js.native
  
  var onContextCreated: js.UndefOr[
    js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any, 
      js.Promise[_] | Unit
    ]
  ] = js.native
  
  var style: js.UndefOr[ViewStyle] = js.native
}
object NativeCanvasProps {
  
  @scala.inline
  def apply(): NativeCanvasProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeCanvasProps]
  }
  
  @scala.inline
  implicit class NativeCanvasPropsOps[Self <: NativeCanvasProps] (val x: Self) extends AnyVal {
    
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
    def setNativeRef_EXPERIMENTAL(value: MutableRefObject[_]): Self = this.set("nativeRef_EXPERIMENTAL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeRef_EXPERIMENTAL: Self = this.set("nativeRef_EXPERIMENTAL", js.undefined)
    
    @scala.inline
    def setOnContextCreated(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any => js.Promise[_] | Unit
    ): Self = this.set("onContextCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextCreated: Self = this.set("onContextCreated", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}

package typings.reactThreeFiber

import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewStyle
import typings.reactThreeFiber.canvasMod.CanvasProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeCanvasMod {
  
  @JSImport("react-three-fiber/targets/native/canvas", "Canvas")
  @js.native
  val Canvas: MemoExoticComponent[js.Function1[/* props */ NativeCanvasProps, Element]] = js.native
  
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
    implicit class NativeCanvasPropsMutableBuilder[Self <: NativeCanvasProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNativeRef_EXPERIMENTAL(value: MutableRefObject[_]): Self = StObject.set(x, "nativeRef_EXPERIMENTAL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeRef_EXPERIMENTALUndefined: Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.undefined)
      
      @scala.inline
      def setOnContextCreated(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any => js.Promise[_] | Unit
      ): Self = StObject.set(x, "onContextCreated", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextCreatedUndefined: Self = StObject.set(x, "onContextCreated", js.undefined)
      
      @scala.inline
      def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

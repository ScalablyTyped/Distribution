package typings.reactThreeFiber

import typings.react.mod.MemoExoticComponent
import typings.react.mod.MutableRefObject
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.ViewStyle
import typings.reactThreeFiber.canvasMod.CanvasProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeCanvasMod {
  
  @JSImport("react-three-fiber/targets/native/canvas", "Canvas")
  @js.native
  val Canvas: MemoExoticComponent[js.Function1[/* props */ NativeCanvasProps, Element]] = js.native
  
  trait NativeCanvasProps
    extends StObject
       with CanvasProps {
    
    var nativeRef_EXPERIMENTAL: js.UndefOr[MutableRefObject[js.Any]] = js.undefined
    
    var onContextCreated: js.UndefOr[
        js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any, 
          js.Promise[js.Any] | Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[ViewStyle] = js.undefined
  }
  object NativeCanvasProps {
    
    inline def apply(): NativeCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeCanvasProps]
    }
    
    extension [Self <: NativeCanvasProps](x: Self) {
      
      inline def setNativeRef_EXPERIMENTAL(value: MutableRefObject[js.Any]): Self = StObject.set(x, "nativeRef_EXPERIMENTAL", value.asInstanceOf[js.Any])
      
      inline def setNativeRef_EXPERIMENTALUndefined: Self = StObject.set(x, "nativeRef_EXPERIMENTAL", js.undefined)
      
      inline def setOnContextCreated(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExpoWebGLRenderingContext */ /* gl */ js.Any => js.Promise[js.Any] | Unit
      ): Self = StObject.set(x, "onContextCreated", js.Any.fromFunction1(value))
      
      inline def setOnContextCreatedUndefined: Self = StObject.set(x, "onContextCreated", js.undefined)
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}

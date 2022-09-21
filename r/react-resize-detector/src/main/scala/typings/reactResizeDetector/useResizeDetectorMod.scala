package typings.reactResizeDetector

import typings.react.mod.MutableRefObject
import typings.reactResizeDetector.anon.FnCall
import typings.reactResizeDetector.resizeDetectorMod.Props
import typings.reactResizeDetector.resizeDetectorMod.ReactResizeDetectorDimensions
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useResizeDetectorMod {
  
  @JSImport("react-resize-detector/build/useResizeDetector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UseResizeDetectorReturn[T]]
  inline def default[T](props: FunctionProps): UseResizeDetectorReturn[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[UseResizeDetectorReturn[T]]
  
  trait FunctionProps
    extends StObject
       with Props {
    
    var targetRef: js.UndefOr[ReturnType[FnCall]] = js.undefined
  }
  object FunctionProps {
    
    inline def apply(): FunctionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FunctionProps]
    }
    
    extension [Self <: FunctionProps](x: Self) {
      
      inline def setTargetRef(value: ReturnType[FnCall]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetRefUndefined: Self = StObject.set(x, "targetRef", js.undefined)
    }
  }
  
  trait UseResizeDetectorReturn[T]
    extends StObject
       with ReactResizeDetectorDimensions {
    
    var ref: MutableRefObject[T | Null]
  }
  object UseResizeDetectorReturn {
    
    inline def apply[T](ref: MutableRefObject[T | Null]): UseResizeDetectorReturn[T] = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseResizeDetectorReturn[T]]
    }
    
    extension [Self <: UseResizeDetectorReturn[?], T](x: Self & UseResizeDetectorReturn[T]) {
      
      inline def setRef(value: MutableRefObject[T | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}

package typings.rcResizeObserver

import typings.rcResizeObserver.mod.SizeInfo
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCollectionMod {
  
  @JSImport("rc-resize-observer/es/Collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Collection(hasChildrenOnBatchResize: CollectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collection")(hasChildrenOnBatchResize.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("rc-resize-observer/es/Collection", "CollectionContext")
  @js.native
  val CollectionContext: Context[onCollectionResize] = js.native
  
  trait CollectionProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Trigger when some children ResizeObserver changed. Collect by frame render level */
    var onBatchResize: js.UndefOr[js.Function1[/* resizeInfo */ js.Array[ResizeInfo], Unit]] = js.undefined
  }
  object CollectionProps {
    
    inline def apply(): CollectionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollectionProps]
    }
    
    extension [Self <: CollectionProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnBatchResize(value: /* resizeInfo */ js.Array[ResizeInfo] => Unit): Self = StObject.set(x, "onBatchResize", js.Any.fromFunction1(value))
      
      inline def setOnBatchResizeUndefined: Self = StObject.set(x, "onBatchResize", js.undefined)
    }
  }
  
  trait ResizeInfo extends StObject {
    
    var data: Any
    
    var element: HTMLElement
    
    var size: SizeInfo
  }
  object ResizeInfo {
    
    inline def apply(data: Any, element: HTMLElement, size: SizeInfo): ResizeInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResizeInfo]
    }
    
    extension [Self <: ResizeInfo](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setSize(value: SizeInfo): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type onCollectionResize = js.Function3[/* size */ SizeInfo, /* element */ HTMLElement, /* data */ Any, Unit]
}

package typings.reachObserveRect

import typings.reachObserveRect.anon.Observe
import typings.std.DOMRect
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/observe-rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: Element, cb: js.Function1[/* rect */ DOMRect, Unit]): Observe = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Observe]
  
  /* Inlined std.Partial<std.DOMRect> */
  trait PartialRect extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var toJSON: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialRect {
    
    inline def apply(): PartialRect = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRect]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRect] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait RectProps extends StObject {
    
    var callbacks: js.Array[js.Function]
    
    var hasRectChanged: Boolean
    
    var rect: js.UndefOr[DOMRect] = js.undefined
  }
  object RectProps {
    
    inline def apply(callbacks: js.Array[js.Function], hasRectChanged: Boolean): RectProps = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], hasRectChanged = hasRectChanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RectProps] (val x: Self) extends AnyVal {
      
      inline def setCallbacks(value: js.Array[js.Function]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: js.Function*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setHasRectChanged(value: Boolean): Self = StObject.set(x, "hasRectChanged", value.asInstanceOf[js.Any])
      
      inline def setRect(value: DOMRect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    }
  }
}

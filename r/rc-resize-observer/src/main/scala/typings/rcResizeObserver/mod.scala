package typings.rcResizeObserver

import typings.rcResizeObserver.esCollectionMod.CollectionProps
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(props: ResizeObserverProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("rc-resize-observer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof imported_Collection.Collection` */
    inline def Collection(param0: CollectionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Collection")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  }
  
  type OnResize = js.Function2[/* size */ SizeInfo, /* element */ HTMLElement, Unit]
  
  trait ResizeObserverProps extends StObject {
    
    var children: ReactNode | (js.Function1[/* ref */ RefObject[Any], ReactElement])
    
    /** Pass to ResizeObserver.Collection with additional data */
    var data: js.UndefOr[Any] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Trigger if element resized. Will always trigger when first time render. */
    var onResize: js.UndefOr[OnResize] = js.undefined
  }
  object ResizeObserverProps {
    
    inline def apply(): ResizeObserverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeObserverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeObserverProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode | (js.Function1[/* ref */ RefObject[Any], ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* ref */ RefObject[Any] => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnResize(value: (/* size */ SizeInfo, /* element */ HTMLElement) => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction2(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
    }
  }
  
  trait SizeInfo extends StObject {
    
    var height: Double
    
    var offsetHeight: Double
    
    var offsetWidth: Double
    
    var width: Double
  }
  object SizeInfo {
    
    inline def apply(height: Double, offsetHeight: Double, offsetWidth: Double, width: Double): SizeInfo = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetHeight = offsetHeight.asInstanceOf[js.Any], offsetWidth = offsetWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizeInfo] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffsetHeight(value: Double): Self = StObject.set(x, "offsetHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetWidth(value: Double): Self = StObject.set(x, "offsetWidth", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}

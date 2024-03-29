package typings.reactDndPreview

import typings.dndCore.distInterfacesMod.Identifier
import typings.react.mod.CSSProperties
import typings.react.mod.MutableRefObject
import typings.reactDnd.distTypesMonitorsMod.DragLayerMonitor
import typings.reactDndPreview.reactDndPreviewBooleans.`true`
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUsePreviewMod {
  
  @JSImport("react-dnd-preview/dist/usePreview", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePreview[T, El /* <: Element */](): usePreviewState[T, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePreview")().asInstanceOf[usePreviewState[T, El]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDndPreview.anon.Display
    - typings.reactDndPreview.distUsePreviewMod.usePreviewStateFull[T, El]
  */
  trait usePreviewState[T, El /* <: Element */] extends StObject
  object usePreviewState {
    
    inline def Display(): typings.reactDndPreview.anon.Display = {
      val __obj = js.Dynamic.literal(display = false)
      __obj.asInstanceOf[typings.reactDndPreview.anon.Display]
    }
    
    inline def usePreviewStateFull[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: MutableRefObject[El | Null], style: CSSProperties): typings.reactDndPreview.distUsePreviewMod.usePreviewStateFull[T, El] = {
      val __obj = js.Dynamic.literal(display = true, item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[typings.reactDndPreview.distUsePreviewMod.usePreviewStateFull[T, El]]
    }
  }
  
  trait usePreviewStateContent[T, El /* <: Element */] extends StObject {
    
    var item: T
    
    var itemType: Identifier | Null
    
    var monitor: DragLayerMonitor[Any]
    
    var ref: MutableRefObject[El | Null]
    
    var style: CSSProperties
  }
  object usePreviewStateContent {
    
    inline def apply[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: MutableRefObject[El | Null], style: CSSProperties): usePreviewStateContent[T, El] = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[usePreviewStateContent[T, El]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: usePreviewStateContent[?, ?], T, El /* <: Element */] (val x: Self & (usePreviewStateContent[T, El])) extends AnyVal {
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemType(value: Identifier): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeNull: Self = StObject.set(x, "itemType", null)
      
      inline def setMonitor(value: DragLayerMonitor[Any]): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setRef(value: MutableRefObject[El | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait usePreviewStateFull[T, El /* <: Element */]
    extends StObject
       with usePreviewStateContent[T, El]
       with usePreviewState[T, El] {
    
    var display: `true`
  }
  object usePreviewStateFull {
    
    inline def apply[T, El /* <: Element */](item: T, monitor: DragLayerMonitor[Any], ref: MutableRefObject[El | Null], style: CSSProperties): usePreviewStateFull[T, El] = {
      val __obj = js.Dynamic.literal(display = true, item = item.asInstanceOf[js.Any], monitor = monitor.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], itemType = null)
      __obj.asInstanceOf[usePreviewStateFull[T, El]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: usePreviewStateFull[?, ?], T, El /* <: Element */] (val x: Self & (usePreviewStateFull[T, El])) extends AnyVal {
      
      inline def setDisplay(value: `true`): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    }
  }
}

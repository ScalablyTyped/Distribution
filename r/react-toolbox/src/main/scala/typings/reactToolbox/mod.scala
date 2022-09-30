package typings.reactToolbox

import typings.react.mod.Attributes
import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ReactToolbox {
    
    trait Props
      extends StObject
         with Attributes {
      
      /**
        * Set a class for the root component.
        */
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Callback called when the component is clicked.
        */
      var onClick: js.UndefOr[js.Function] = js.undefined
      
      var onContextMenu: js.UndefOr[js.Function] = js.undefined
      
      var onDoubleClick: js.UndefOr[js.Function] = js.undefined
      
      var onDrag: js.UndefOr[js.Function] = js.undefined
      
      var onDragEnd: js.UndefOr[js.Function] = js.undefined
      
      var onDragEnter: js.UndefOr[js.Function] = js.undefined
      
      var onDragExit: js.UndefOr[js.Function] = js.undefined
      
      var onDragLeave: js.UndefOr[js.Function] = js.undefined
      
      var onDragOver: js.UndefOr[js.Function] = js.undefined
      
      var onDragStart: js.UndefOr[js.Function] = js.undefined
      
      var onDrop: js.UndefOr[js.Function] = js.undefined
      
      /**
        * Callback called when the mouse press the Component.
        */
      var onMouseDown: js.UndefOr[js.Function] = js.undefined
      
      /**
        * Callback called when the mouse enters the Component.
        */
      var onMouseEnter: js.UndefOr[js.Function] = js.undefined
      
      /**
        * Callback called when the mouse leaves the Component.
        */
      var onMouseLeave: js.UndefOr[js.Function] = js.undefined
      
      var onMouseMove: js.UndefOr[js.Function] = js.undefined
      
      var onMouseOut: js.UndefOr[js.Function] = js.undefined
      
      var onMouseOver: js.UndefOr[js.Function] = js.undefined
      
      /**
        * Fires after the mouse is released from the Component.
        */
      var onMouseUp: js.UndefOr[js.Function] = js.undefined
      
      var onTouchCancel: js.UndefOr[js.Function] = js.undefined
      
      var onTouchEnd: js.UndefOr[js.Function] = js.undefined
      
      var onTouchMove: js.UndefOr[js.Function] = js.undefined
      
      var onTouchStart: js.UndefOr[js.Function] = js.undefined
      
      /**
        * Set inline style for the root component.
        */
      var style: js.UndefOr[CSSProperties] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setOnContextMenu(value: js.Function): Self = StObject.set(x, "onContextMenu", value.asInstanceOf[js.Any])
        
        inline def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
        
        inline def setOnDoubleClick(value: js.Function): Self = StObject.set(x, "onDoubleClick", value.asInstanceOf[js.Any])
        
        inline def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
        
        inline def setOnDrag(value: js.Function): Self = StObject.set(x, "onDrag", value.asInstanceOf[js.Any])
        
        inline def setOnDragEnd(value: js.Function): Self = StObject.set(x, "onDragEnd", value.asInstanceOf[js.Any])
        
        inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        inline def setOnDragEnter(value: js.Function): Self = StObject.set(x, "onDragEnter", value.asInstanceOf[js.Any])
        
        inline def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
        
        inline def setOnDragExit(value: js.Function): Self = StObject.set(x, "onDragExit", value.asInstanceOf[js.Any])
        
        inline def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
        
        inline def setOnDragLeave(value: js.Function): Self = StObject.set(x, "onDragLeave", value.asInstanceOf[js.Any])
        
        inline def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
        
        inline def setOnDragOver(value: js.Function): Self = StObject.set(x, "onDragOver", value.asInstanceOf[js.Any])
        
        inline def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
        
        inline def setOnDragStart(value: js.Function): Self = StObject.set(x, "onDragStart", value.asInstanceOf[js.Any])
        
        inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
        
        inline def setOnDrop(value: js.Function): Self = StObject.set(x, "onDrop", value.asInstanceOf[js.Any])
        
        inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
        
        inline def setOnMouseDown(value: js.Function): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
        
        inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
        
        inline def setOnMouseEnter(value: js.Function): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
        
        inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
        
        inline def setOnMouseLeave(value: js.Function): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
        
        inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
        
        inline def setOnMouseMove(value: js.Function): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
        
        inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
        
        inline def setOnMouseOut(value: js.Function): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
        
        inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
        
        inline def setOnMouseOver(value: js.Function): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
        
        inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
        
        inline def setOnMouseUp(value: js.Function): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
        
        inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
        
        inline def setOnTouchCancel(value: js.Function): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
        
        inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
        
        inline def setOnTouchEnd(value: js.Function): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
        
        inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
        
        inline def setOnTouchMove(value: js.Function): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
        
        inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
        
        inline def setOnTouchStart(value: js.Function): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
        
        inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
        
        inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      }
    }
  }
}

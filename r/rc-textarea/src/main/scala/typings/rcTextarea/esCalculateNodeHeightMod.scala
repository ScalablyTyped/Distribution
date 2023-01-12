package typings.rcTextarea

import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esCalculateNodeHeightMod {
  
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(uiTextNode: HTMLTextAreaElement): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Null, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Unit, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Double, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Null, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  inline def default(uiTextNode: HTMLTextAreaElement, useCache: Unit, minRows: Unit, maxRows: Double): CSSProperties = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(uiTextNode.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any], minRows.asInstanceOf[js.Any], maxRows.asInstanceOf[js.Any])).asInstanceOf[CSSProperties]
  
  inline def calculateNodeStyling(node: HTMLElement): NodeType = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateNodeStyling")(node.asInstanceOf[js.Any]).asInstanceOf[NodeType]
  inline def calculateNodeStyling(node: HTMLElement, useCache: Boolean): NodeType = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateNodeStyling")(node.asInstanceOf[js.Any], useCache.asInstanceOf[js.Any])).asInstanceOf[NodeType]
  
  trait NodeType extends StObject {
    
    var borderSize: Double
    
    var boxSizing: String
    
    var paddingSize: Double
    
    var sizingStyle: String
  }
  object NodeType {
    
    inline def apply(borderSize: Double, boxSizing: String, paddingSize: Double, sizingStyle: String): NodeType = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeType] (val x: Self) extends AnyVal {
      
      inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      inline def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      inline def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      inline def setSizingStyle(value: String): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
}

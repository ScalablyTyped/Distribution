package typings.rcTextarea

import typings.rcTextarea.anon.MaxHeight
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateNodeHeightMod {
  
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(
    uiTextNode: HTMLTextAreaElement,
    useCache: js.UndefOr[scala.Nothing],
    minRows: js.UndefOr[scala.Nothing],
    maxRows: Double
  ): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement, useCache: js.UndefOr[scala.Nothing], minRows: Double): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(
    uiTextNode: HTMLTextAreaElement,
    useCache: js.UndefOr[scala.Nothing],
    minRows: Double,
    maxRows: Double
  ): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(
    uiTextNode: HTMLTextAreaElement,
    useCache: js.UndefOr[scala.Nothing],
    minRows: Null,
    maxRows: Double
  ): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(
    uiTextNode: HTMLTextAreaElement,
    useCache: Boolean,
    minRows: js.UndefOr[scala.Nothing],
    maxRows: Double
  ): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Double, maxRows: Double): MaxHeight = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", JSImport.Default)
  @js.native
  def default(uiTextNode: HTMLTextAreaElement, useCache: Boolean, minRows: Null, maxRows: Double): MaxHeight = js.native
  
  @JSImport("rc-textarea/es/calculateNodeHeight", "calculateNodeStyling")
  @js.native
  def calculateNodeStyling(node: HTMLElement): NodeType = js.native
  @JSImport("rc-textarea/es/calculateNodeHeight", "calculateNodeStyling")
  @js.native
  def calculateNodeStyling(node: HTMLElement, useCache: Boolean): NodeType = js.native
  
  @js.native
  trait NodeType extends StObject {
    
    var borderSize: Double = js.native
    
    var boxSizing: String = js.native
    
    var paddingSize: Double = js.native
    
    var sizingStyle: String = js.native
  }
  object NodeType {
    
    @scala.inline
    def apply(borderSize: Double, boxSizing: String, paddingSize: Double, sizingStyle: String): NodeType = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeType]
    }
    
    @scala.inline
    implicit class NodeTypeMutableBuilder[Self <: NodeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSizing(value: String): Self = StObject.set(x, "boxSizing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizingStyle(value: String): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
}

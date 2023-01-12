package typings.reactTextareaAutosize

import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.borderBottomWidth
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.borderLeftWidth
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.borderRightWidth
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.borderTopWidth
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.boxSizing
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.fontFamily
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.fontSize
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.fontStyle
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.fontWeight
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.letterSpacing
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.lineHeight
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingBottom
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingLeft
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingRight
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.paddingTop
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.tabSize
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.textIndent
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.textRendering
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.textTransform
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.width
import typings.reactTextareaAutosize.reactTextareaAutosizeStrings.wordBreak
import typings.std.CSSStyleDeclaration
import typings.std.Extract
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcGetSizingDataMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/getSizingData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: HTMLElement): SizingData | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[SizingData | Null]
  
  trait SizingData extends StObject {
    
    var borderSize: Double
    
    var paddingSize: Double
    
    var sizingStyle: SizingStyle
  }
  object SizingData {
    
    inline def apply(borderSize: Double, paddingSize: Double, sizingStyle: SizingStyle): SizingData = {
      val __obj = js.Dynamic.literal(borderSize = borderSize.asInstanceOf[js.Any], paddingSize = paddingSize.asInstanceOf[js.Any], sizingStyle = sizingStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizingData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SizingData] (val x: Self) extends AnyVal {
      
      inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      inline def setPaddingSize(value: Double): Self = StObject.set(x, "paddingSize", value.asInstanceOf[js.Any])
      
      inline def setSizingStyle(value: SizingStyle): Self = StObject.set(x, "sizingStyle", value.asInstanceOf[js.Any])
    }
  }
  
  type SizingProps = Extract[
    borderBottomWidth | borderLeftWidth | borderRightWidth | borderTopWidth | boxSizing | fontFamily | fontSize | fontStyle | fontWeight | letterSpacing | lineHeight | paddingBottom | paddingLeft | paddingRight | paddingTop | tabSize | textIndent | textRendering | textTransform | width | wordBreak, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 465, starting with typings.reactTextareaAutosize.reactTextareaAutosizeStrings.accentColor, typings.reactTextareaAutosize.reactTextareaAutosizeStrings.alignContent, typings.reactTextareaAutosize.reactTextareaAutosizeStrings.alignItems */ Any
  ]
  
  type SizingStyle = Pick[CSSStyleDeclaration, SizingProps]
}

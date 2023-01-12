package typings.reactDotdotdot

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.reactDotdotdot.reactDotdotdotStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dotdotdot", JSImport.Default)
  @js.native
  open class default ()
    extends Component[DotdotdotProps, js.Object, Any]
  
  type Dotdotdot = Component[DotdotdotProps, js.Object, Any]
  
  trait DotdotdotProps
    extends StObject
       with HTMLProps[Dotdotdot] {
    
    /** Animate clamp */
    var animate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of lines that should be displayed, a css pixel value for height
      * as a string (i.e. "100px"), or "auto" to try and fill the available space
      */
    var clamp: String | Double | auto
    
    /** Split on sentences (periods), hypens, en-dashes, em-dashes, and words */
    var splitOnChars: js.UndefOr[js.Array[String]] = js.undefined
    
    /** The type of HTML tag which will wrap the component's content */
    var tagName: js.UndefOr[String] = js.undefined
    
    /**
      * The character to insert at the end of the HTML element after trunation is
      * performed.
      */
    var truncationChar: js.UndefOr[String] = js.undefined
    
    /** String of HTML to use instead of truncationChar */
    var truncationHTML: js.UndefOr[String] = js.undefined
    
    /** Use -webkit-line-clamp available in WebKit (Chrome, Safari) only */
    var useNativeClamp: js.UndefOr[Boolean] = js.undefined
  }
  object DotdotdotProps {
    
    inline def apply(clamp: String | Double | auto): DotdotdotProps = {
      val __obj = js.Dynamic.literal(clamp = clamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[DotdotdotProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DotdotdotProps] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setClamp(value: String | Double | auto): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
      
      inline def setSplitOnChars(value: js.Array[String]): Self = StObject.set(x, "splitOnChars", value.asInstanceOf[js.Any])
      
      inline def setSplitOnCharsUndefined: Self = StObject.set(x, "splitOnChars", js.undefined)
      
      inline def setSplitOnCharsVarargs(value: String*): Self = StObject.set(x, "splitOnChars", js.Array(value*))
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTruncationChar(value: String): Self = StObject.set(x, "truncationChar", value.asInstanceOf[js.Any])
      
      inline def setTruncationCharUndefined: Self = StObject.set(x, "truncationChar", js.undefined)
      
      inline def setTruncationHTML(value: String): Self = StObject.set(x, "truncationHTML", value.asInstanceOf[js.Any])
      
      inline def setTruncationHTMLUndefined: Self = StObject.set(x, "truncationHTML", js.undefined)
      
      inline def setUseNativeClamp(value: Boolean): Self = StObject.set(x, "useNativeClamp", value.asInstanceOf[js.Any])
      
      inline def setUseNativeClampUndefined: Self = StObject.set(x, "useNativeClamp", js.undefined)
    }
  }
}

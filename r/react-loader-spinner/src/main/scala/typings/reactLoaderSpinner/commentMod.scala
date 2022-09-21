package typings.reactLoaderSpinner

import typings.react.mod.global.JSX.Element
import typings.reactLoaderSpinner.typeMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod {
  
  @JSImport("react-loader-spinner/dist/esm/loader/Comment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasVisibleWidthHeightBackgroundColorColorWrapperClassWrapperStyleAriaLabel: CommentProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasVisibleWidthHeightBackgroundColorColorWrapperClassWrapperStyleAriaLabel.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait CommentProps
    extends StObject
       with BaseProps {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
  }
  object CommentProps {
    
    inline def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
    
    extension [Self <: CommentProps](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    }
  }
}

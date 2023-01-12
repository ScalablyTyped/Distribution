package typings.reactMdList

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListItemTextMod {
  
  @JSImport("@react-md/list/types/ListItemText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ListItemText(param0: ListItemTextProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ListItemText")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait ListItemTextProps extends StObject {
    
    /**
      * The main text children to display. This will be stacked above the
      * `secondaryText` if it was provided.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the `children`.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Optional secondary text to display that will be stacked below the
      * `children`. This also applies some styles to make the text less prominent
      * than the `children`.
      */
    var secondaryText: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the
      * `secondaryText` if it was provided.
      */
    var secondaryTextClassName: js.UndefOr[String] = js.undefined
  }
  object ListItemTextProps {
    
    inline def apply(): ListItemTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemTextProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      inline def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    }
  }
}

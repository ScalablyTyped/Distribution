package typings.reactMdList

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextMod {
  
  object ListItemText {
    
    inline def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/list/types/ListItemText", "ListItemText")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.className")
      @js.native
      def className: js.Any = js.native
      inline def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.secondaryText")
      @js.native
      def secondaryText: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.secondaryTextClassName")
      @js.native
      def secondaryTextClassName: js.Any = js.native
      inline def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
      
      inline def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
    }
  }
  
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
    
    extension [Self <: ListItemTextProps](x: Self) {
      
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

package typings.reactMdList

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextMod {
  
  object ListItemText {
    
    @JSImport("@react-md/list/types/ListItemText", "ListItemText")
    @js.native
    def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.secondaryText")
      @js.native
      def secondaryText: js.Any = js.native
      
      @JSImport("@react-md/list/types/ListItemText", "ListItemText.propTypes.secondaryTextClassName")
      @js.native
      def secondaryTextClassName: js.Any = js.native
      @scala.inline
      def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListItemTextProps extends StObject {
    
    /**
      * The main text children to display. This will be stacked above the
      * `secondaryText` if it was provided.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the `children`.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional secondary text to display that will be stacked below the
      * `children`. This also applies some styles to make the text less prominent
      * than the `children`.
      */
    var secondaryText: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional `className` to apply to the `<span>` surrounding the
      * `secondaryText` if it was provided.
      */
    var secondaryTextClassName: js.UndefOr[String] = js.native
  }
  object ListItemTextProps {
    
    @scala.inline
    def apply(): ListItemTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemTextProps]
    }
    
    @scala.inline
    implicit class ListItemTextPropsMutableBuilder[Self <: ListItemTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSecondaryText(value: ReactNode): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassName(value: String): Self = StObject.set(x, "secondaryTextClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryTextClassNameUndefined: Self = StObject.set(x, "secondaryTextClassName", js.undefined)
      
      @scala.inline
      def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    }
  }
}

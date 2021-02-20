package typings.reactFlex

import typings.react.mod.Component
import typings.react.mod.Props
import typings.reactFlex.reactFlexStrings.`fit-content`
import typings.reactFlex.reactFlexStrings.`max-content`
import typings.reactFlex.reactFlexStrings.`min-content`
import typings.reactFlex.reactFlexStrings.auto
import typings.reactFlex.reactFlexStrings.content
import typings.reactFlex.reactFlexStrings.fit
import typings.reactFlex.reactFlexStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flex", "Flex")
  @js.native
  class Flex protected ()
    extends Component[FlexProps, js.Object, js.Any] {
    def this(props: FlexProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlexProps, context: js.Any) = this()
  }
  
  @JSImport("react-flex", "Item")
  @js.native
  class Item protected ()
    extends Component[ItemProps, js.Object, js.Any] {
    def this(props: ItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ItemProps, context: js.Any) = this()
  }
  
  @js.native
  trait CommonFlexProps extends StObject {
    
    /**
      * A value for the `align-content` css property.
      */
    var alignContent: js.UndefOr[String] = js.native
    
    /**
      * A value for the `align-items` css property. Defaults to `'center'`.
      */
    var alignItems: js.UndefOr[String] = js.native
    
    /**
      * For `flex-direction: column`.
      */
    var column: js.UndefOr[Boolean] = js.native
    
    /**
      * Customize the display to be `'flex'` or `'inline-flex'`.
      * Defaults to `'flex'`.
      */
    var display: js.UndefOr[String] = js.native
    
    /**
      * A number/string from 0 to 24 for the `flex` css property. `false` for `'none'`.
      */
    var flex: js.UndefOr[Double | String | Boolean] = js.native
    
    /**
      * For `display: inline-flex`.
      */
    var `inline`: js.UndefOr[Boolean] = js.native
    
    /**
      * A value for the `justify-content` css property.
      */
    var justifyContent: js.UndefOr[String] = js.native
    
    /**
      * For reverse direction (eg. `flex-direction: column-reverse` or `row-reverse`).
      */
    var reverse: js.UndefOr[Boolean] = js.native
    
    /**
      * For `flex-direction: row`. Defaults to `true`.
      */
    var row: js.UndefOr[Boolean] = js.native
    
    /**
      * For custom style
      */
    var style: js.UndefOr[js.Any] = js.native
    
    /**
      * For `flex-wrap: wrap`. Defaults to `true`.
      */
    var wrap: js.UndefOr[Boolean] = js.native
  }
  object CommonFlexProps {
    
    @scala.inline
    def apply(): CommonFlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonFlexProps]
    }
    
    @scala.inline
    implicit class CommonFlexPropsMutableBuilder[Self <: CommonFlexProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignContent(value: String): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignItems(value: String): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setColumn(value: Boolean): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setFlex(value: Double | String | Boolean): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setJustifyContent(value: String): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setRow(value: Boolean): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  @js.native
  trait FlexProps
    extends Props[Flex]
       with CommonFlexProps
  object FlexProps {
    
    @scala.inline
    def apply(): FlexProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlexProps]
    }
  }
  
  @js.native
  trait ItemProps
    extends Props[Flex]
       with CommonFlexProps {
    
    /**
      * A value for the flex-basis css property. Valid values are: `0` (and `'none'`, which is the same),
      * `'auto'`, `'content'`, `'fit-content'`, `'min-content'`, `'max-content'`, `'fit'`.
      */
    var flexBasis: js.UndefOr[
        Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit
      ] = js.native
    
    /**
      * A number/string from 0 to 24 for `flex-grow`. Most of the times, using `flex` is just enough.
      */
    var flexGrow: js.UndefOr[Double | String | Boolean] = js.native
    
    /**
      * A value for the `flex-shrink` css property. From `0` to `24`.
      */
    var flexShrink: js.UndefOr[Double | String] = js.native
  }
  object ItemProps {
    
    @scala.inline
    def apply(): ItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemProps]
    }
    
    @scala.inline
    implicit class ItemPropsMutableBuilder[Self <: ItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlexBasis(value: Double | none | auto | content | `fit-content` | `min-content` | `max-content` | fit): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      @scala.inline
      def setFlexGrow(value: Double | String | Boolean): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      @scala.inline
      def setFlexShrink(value: Double | String): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
    }
  }
}

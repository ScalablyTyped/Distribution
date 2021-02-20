package typings.reactMdAutocomplete

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object highlightedResultMod {
  
  object HighlightedResult {
    
    @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult")
    @js.native
    def apply(hasIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.className")
      @js.native
      def className: js.Any = js.native
      @scala.inline
      def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.enabled")
      @js.native
      def enabled: js.Any = js.native
      @scala.inline
      def enabled_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.id")
      @js.native
      def id: js.Any = js.native
      @scala.inline
      def id_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.index")
      @js.native
      def index: js.Any = js.native
      @scala.inline
      def index_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("index")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.repeatable")
      @js.native
      def repeatable: js.Any = js.native
      @scala.inline
      def repeatable_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("repeatable")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.style")
      @js.native
      def style: js.Any = js.native
      @scala.inline
      def style_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/autocomplete/types/HighlightedResult", "HighlightedResult.propTypes.value")
      @js.native
      def value: js.Any = js.native
      @scala.inline
      def value_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HighlightedResultProps extends StObject {
    
    /**
      * The children to highlight. If this is not a string, the highlight will not
      * work.
      */
    var children: ReactNode = js.native
    
    /**
      * An optional className to provide to the `<span>`.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Boolean if the highlighting functionality should be enabled. Setting this
      * to false will just return the `children` instead.
      */
    var enabled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional id to use for the `<span>`. This will be suffixed by the
      * current `index` if it was provided
      */
    var id: js.UndefOr[String] = js.native
    
    /**
      * The match index which is automatically added when the `repeatable` prop is
      * used for nested matches.
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * Boolean if the highlighting can be repeated multiple times within the
      * children string.
      */
    var repeatable: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional style to provide to the `<span>`.
      */
    var style: js.UndefOr[CSSProperties] = js.native
    
    /**
      * The current value to match against.
      */
    var value: String = js.native
  }
  object HighlightedResultProps {
    
    @scala.inline
    def apply(value: String): HighlightedResultProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightedResultProps]
    }
    
    @scala.inline
    implicit class HighlightedResultPropsMutableBuilder[Self <: HighlightedResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatableUndefined: Self = StObject.set(x, "repeatable", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

package typings.reactMdAutocomplete

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesHighlightedResultMod {
  
  @JSImport("@react-md/autocomplete/types/HighlightedResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HighlightedResult(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex: HighlightedResultProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("HighlightedResult")(hasPropIdStyleClassNameEnabledValueChildrenRepeatableIndex.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait HighlightedResultProps extends StObject {
    
    /**
      * The children to highlight. If this is not a string, the highlight will not
      * work.
      */
    var children: ReactNode
    
    /**
      * An optional className to provide to the `<span>`.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the highlighting functionality should be enabled. Setting this
      * to false will just return the `children` instead.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional id to use for the `<span>`. This will be suffixed by the
      * current `index` if it was provided
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * The match index which is automatically added when the `repeatable` prop is
      * used for nested matches.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * Boolean if the highlighting can be repeated multiple times within the
      * children string.
      */
    var repeatable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An optional style to provide to the `<span>`.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The current value to match against.
      */
    var value: String
  }
  object HighlightedResultProps {
    
    inline def apply(value: String): HighlightedResultProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightedResultProps]
    }
    
    extension [Self <: HighlightedResultProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setRepeatable(value: Boolean): Self = StObject.set(x, "repeatable", value.asInstanceOf[js.Any])
      
      inline def setRepeatableUndefined: Self = StObject.set(x, "repeatable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

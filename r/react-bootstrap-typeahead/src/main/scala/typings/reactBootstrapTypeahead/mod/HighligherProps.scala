package typings.reactBootstrapTypeahead.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighligherProps extends StObject {
  
  /* Highlighter expects a string as the only child. */
  var children: ReactNode
  
  /* Classname applied to the highlighted text. */
  var highlightClassName: js.UndefOr[String] = js.undefined
  
  /* he substring to look for. This value should correspond to the input text of the typeahead and can be obtained via the
    onInputChange prop or from the text property of props being passed down via renderMenu or renderMenuItemChildren. */
  var search: String
}
object HighligherProps {
  
  inline def apply(search: String): HighligherProps = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighligherProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighligherProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setHighlightClassName(value: String): Self = StObject.set(x, "highlightClassName", value.asInstanceOf[js.Any])
    
    inline def setHighlightClassNameUndefined: Self = StObject.set(x, "highlightClassName", js.undefined)
    
    inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}

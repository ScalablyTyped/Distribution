package typings.reactBootstrapTable.mod

import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPanelProps extends StObject {
  
  /**
    * Default clear search field button component.
    */
  var clearBtn: ReactElement
  
  /**
    * A callback to trigger the clear search field event.
    */
  def clearBtnClick(): Unit
  
  /**
    * The default search text.
    */
  var defaultValue: String
  
  /**
    * The placeholder text for the search field.
    */
  var placeholder: String
  
  /**
    * A callback to trigger a search, takes the search text as an input.
    */
  def search(searchText: String): Unit
  
  /**
    * Default search field component.
    */
  var searchField: ReactElement
}
object SearchPanelProps {
  
  inline def apply(
    clearBtn: ReactElement,
    clearBtnClick: () => Unit,
    defaultValue: String,
    placeholder: String,
    search: String => Unit,
    searchField: ReactElement
  ): SearchPanelProps = {
    val __obj = js.Dynamic.literal(clearBtn = clearBtn.asInstanceOf[js.Any], clearBtnClick = js.Any.fromFunction0(clearBtnClick), defaultValue = defaultValue.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], search = js.Any.fromFunction1(search), searchField = searchField.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPanelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPanelProps] (val x: Self) extends AnyVal {
    
    inline def setClearBtn(value: ReactElement): Self = StObject.set(x, "clearBtn", value.asInstanceOf[js.Any])
    
    inline def setClearBtnClick(value: () => Unit): Self = StObject.set(x, "clearBtnClick", js.Any.fromFunction0(value))
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: String => Unit): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
    
    inline def setSearchField(value: ReactElement): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
  }
}

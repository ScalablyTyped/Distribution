package typings.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryGroup extends StObject {
  
  var dataProvider: DataProvider
  
  var displays: js.Array[DisplayControl]
  
  var name: String
  
  var searchBoxes: js.Array[Refinement]
}
object QueryGroup {
  
  @scala.inline
  def apply(
    dataProvider: DataProvider,
    displays: js.Array[DisplayControl],
    name: String,
    searchBoxes: js.Array[Refinement]
  ): QueryGroup = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], displays = displays.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], searchBoxes = searchBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryGroup]
  }
  
  @scala.inline
  implicit class QueryGroupMutableBuilder[Self <: QueryGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataProvider(value: DataProvider): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplays(value: js.Array[DisplayControl]): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplaysVarargs(value: DisplayControl*): Self = StObject.set(x, "displays", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBoxes(value: js.Array[Refinement]): Self = StObject.set(x, "searchBoxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchBoxesVarargs(value: Refinement*): Self = StObject.set(x, "searchBoxes", js.Array(value :_*))
  }
}

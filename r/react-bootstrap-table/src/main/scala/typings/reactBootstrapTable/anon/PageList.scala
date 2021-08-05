package typings.reactBootstrapTable.anon

import typings.react.mod.ReactElement
import typings.reactBootstrapTable.mod.SizePerPageDropDown
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageList extends StObject {
  
  /**
    * The default list of page change buttons.
    */
  var pageList: HTMLUListElement
  
  /**
    * Default sizePerPageDropdown component.
    */
  var sizePerPageDropDown: SizePerPageDropDown
  
  /**
    * Text/element to display when displaying the total number of rows.
    */
  var totalText: String | ReactElement
}
object PageList {
  
  inline def apply(
    pageList: HTMLUListElement,
    sizePerPageDropDown: SizePerPageDropDown,
    totalText: String | ReactElement
  ): PageList = {
    val __obj = js.Dynamic.literal(pageList = pageList.asInstanceOf[js.Any], sizePerPageDropDown = sizePerPageDropDown.asInstanceOf[js.Any], totalText = totalText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageList]
  }
  
  extension [Self <: PageList](x: Self) {
    
    inline def setPageList(value: HTMLUListElement): Self = StObject.set(x, "pageList", value.asInstanceOf[js.Any])
    
    inline def setSizePerPageDropDown(value: SizePerPageDropDown): Self = StObject.set(x, "sizePerPageDropDown", value.asInstanceOf[js.Any])
    
    inline def setTotalText(value: String | ReactElement): Self = StObject.set(x, "totalText", value.asInstanceOf[js.Any])
  }
}

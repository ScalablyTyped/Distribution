package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizePerPageDropDownProps extends StObject {
  
  /**
    * Bootstrap css style class for the button, e.g. 'btn-warning'
    */
  var btnContextual: js.UndefOr[String] = js.undefined
  
  /**
    * Custom class name to use for the component.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Current size per page
    */
  var currSizePerPage: js.UndefOr[String] = js.undefined
  
  /**
    * Flag to indicate that the dropdown is currently hidden
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback function that should be triggered when the user clicks on the dropdown button.
    */
  var onClick: js.UndefOr[js.Function1[/* toggleDropDown */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    * Flag to indicate that the dropdown is open
    */
  var open: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Size Per Page options list
    */
  var options: js.UndefOr[js.Array[Double | Text]] = js.undefined
  
  /**
    * Whether the button menu should 'dropup' or 'dropdown'.
    */
  var variation: js.UndefOr[DropDirection] = js.undefined
}
object SizePerPageDropDownProps {
  
  inline def apply(): SizePerPageDropDownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizePerPageDropDownProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizePerPageDropDownProps] (val x: Self) extends AnyVal {
    
    inline def setBtnContextual(value: String): Self = StObject.set(x, "btnContextual", value.asInstanceOf[js.Any])
    
    inline def setBtnContextualUndefined: Self = StObject.set(x, "btnContextual", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCurrSizePerPage(value: String): Self = StObject.set(x, "currSizePerPage", value.asInstanceOf[js.Any])
    
    inline def setCurrSizePerPageUndefined: Self = StObject.set(x, "currSizePerPage", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setOnClick(value: /* toggleDropDown */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
    
    inline def setOptions(value: js.Array[Double | Text]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: (Double | Text)*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setVariation(value: DropDirection): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setVariationUndefined: Self = StObject.set(x, "variation", js.undefined)
  }
}

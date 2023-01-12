package typings.reactBootstrapTable.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertModalHeaderProps extends StObject {
  
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Any, Event], Unit]] = js.undefined
  
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true to hide the close button. Default is false.
    */
  var hideClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.undefined
  
  /**
    * Title to display in the header.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Bootstrap version.
    */
  var version: js.UndefOr[BootstrapVersion] = js.undefined
}
object InsertModalHeaderProps {
  
  inline def apply(): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsertModalHeaderProps] (val x: Self) extends AnyVal {
    
    inline def setBeforeClose(value: /* e */ SyntheticEvent[Any, Event] => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
    
    inline def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setHideClose(value: Boolean): Self = StObject.set(x, "hideClose", value.asInstanceOf[js.Any])
    
    inline def setHideCloseUndefined: Self = StObject.set(x, "hideClose", js.undefined)
    
    inline def setOnModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onModalClose", js.Any.fromFunction1(value))
    
    inline def setOnModalCloseUndefined: Self = StObject.set(x, "onModalClose", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: BootstrapVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

package typings.reactBootstrapTable.mod

import typings.react.mod.SyntheticEvent
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertModalHeaderProps extends StObject {
  
  /**
    * Callback function to call prior to closing the Insert Modal window.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ SyntheticEvent[_, Event], Unit]] = js.native
  
  /**
    * Header class name.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Set to true to hide the close button. Default is false.
    */
  var hideClose: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback function to call to close the Insert Modal window.
    */
  var onModalClose: js.UndefOr[js.Function1[/* closeModal */ js.Function0[Unit], Unit]] = js.native
  
  /**
    * Title to display in the header.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Bootstrap version.
    */
  var version: js.UndefOr[BootstrapVersion] = js.native
}
object InsertModalHeaderProps {
  
  @scala.inline
  def apply(): InsertModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertModalHeaderProps]
  }
  
  @scala.inline
  implicit class InsertModalHeaderPropsMutableBuilder[Self <: InsertModalHeaderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeClose(value: /* e */ SyntheticEvent[_, Event] => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setHideClose(value: Boolean): Self = StObject.set(x, "hideClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideCloseUndefined: Self = StObject.set(x, "hideClose", js.undefined)
    
    @scala.inline
    def setOnModalClose(value: /* closeModal */ js.Function0[Unit] => Unit): Self = StObject.set(x, "onModalClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnModalCloseUndefined: Self = StObject.set(x, "onModalClose", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVersion(value: BootstrapVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

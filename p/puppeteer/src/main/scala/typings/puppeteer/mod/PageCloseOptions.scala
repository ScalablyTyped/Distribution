package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageCloseOptions extends StObject {
  
  /**
    * Whether to run the before unload page handlers.
    * @default false
    */
  var runBeforeUnload: js.UndefOr[Boolean] = js.native
}
object PageCloseOptions {
  
  @scala.inline
  def apply(): PageCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCloseOptions]
  }
  
  @scala.inline
  implicit class PageCloseOptionsMutableBuilder[Self <: PageCloseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunBeforeUnload(value: Boolean): Self = StObject.set(x, "runBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBeforeUnloadUndefined: Self = StObject.set(x, "runBeforeUnload", js.undefined)
  }
}

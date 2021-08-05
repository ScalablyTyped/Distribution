package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageCloseOptions extends StObject {
  
  /**
    * Whether to run the before unload page handlers.
    * @default false
    */
  var runBeforeUnload: js.UndefOr[Boolean] = js.undefined
}
object PageCloseOptions {
  
  inline def apply(): PageCloseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageCloseOptions]
  }
  
  extension [Self <: PageCloseOptions](x: Self) {
    
    inline def setRunBeforeUnload(value: Boolean): Self = StObject.set(x, "runBeforeUnload", value.asInstanceOf[js.Any])
    
    inline def setRunBeforeUnloadUndefined: Self = StObject.set(x, "runBeforeUnload", js.undefined)
  }
}

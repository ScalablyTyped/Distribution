package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunBeforeUnload extends StObject {
  
  var runBeforeUnload: js.UndefOr[Boolean] = js.undefined
}
object RunBeforeUnload {
  
  inline def apply(): RunBeforeUnload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunBeforeUnload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunBeforeUnload] (val x: Self) extends AnyVal {
    
    inline def setRunBeforeUnload(value: Boolean): Self = StObject.set(x, "runBeforeUnload", value.asInstanceOf[js.Any])
    
    inline def setRunBeforeUnloadUndefined: Self = StObject.set(x, "runBeforeUnload", js.undefined)
  }
}

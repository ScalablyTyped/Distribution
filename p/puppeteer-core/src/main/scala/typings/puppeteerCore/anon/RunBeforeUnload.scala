package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunBeforeUnload extends StObject {
  
  var runBeforeUnload: js.UndefOr[Boolean] = js.undefined
}
object RunBeforeUnload {
  
  @scala.inline
  def apply(): RunBeforeUnload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunBeforeUnload]
  }
  
  @scala.inline
  implicit class RunBeforeUnloadMutableBuilder[Self <: RunBeforeUnload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunBeforeUnload(value: Boolean): Self = StObject.set(x, "runBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunBeforeUnloadUndefined: Self = StObject.set(x, "runBeforeUnload", js.undefined)
  }
}

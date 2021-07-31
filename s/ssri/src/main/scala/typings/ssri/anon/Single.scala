package typings.ssri.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Single extends StObject {
  
  var single: js.UndefOr[Boolean] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Single {
  
  @scala.inline
  def apply(): Single = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Single]
  }
  
  @scala.inline
  implicit class SingleMutableBuilder[Self <: Single] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}

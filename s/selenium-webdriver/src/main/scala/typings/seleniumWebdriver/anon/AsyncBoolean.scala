package typings.seleniumWebdriver.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncBoolean extends StObject {
  
  var async: Boolean
}
object AsyncBoolean {
  
  @scala.inline
  def apply(async: Boolean): AsyncBoolean = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncBoolean]
  }
  
  @scala.inline
  implicit class AsyncBooleanMutableBuilder[Self <: AsyncBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
  }
}

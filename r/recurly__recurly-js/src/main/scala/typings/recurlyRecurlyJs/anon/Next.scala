package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Next extends StObject {
  
  var next: js.UndefOr[String] = js.undefined
  
  var now: js.UndefOr[String] = js.undefined
}
object Next {
  
  @scala.inline
  def apply(): Next = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Next]
  }
  
  @scala.inline
  implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    
    @scala.inline
    def setNow(value: String): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
  }
}

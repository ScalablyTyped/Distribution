package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationOptions extends StObject {
  
  var tag: js.UndefOr[java.lang.String] = js.undefined
}
object GetNotificationOptions {
  
  @scala.inline
  def apply(): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationOptions]
  }
  
  @scala.inline
  implicit class GetNotificationOptionsMutableBuilder[Self <: GetNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}

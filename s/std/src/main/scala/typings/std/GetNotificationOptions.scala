package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationOptions extends StObject {
  
  /* standard dom */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}
object GetNotificationOptions {
  
  inline def apply(): GetNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNotificationOptions] (val x: Self) extends AnyVal {
    
    inline def setTag(value: java.lang.String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}

package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubOptions extends StObject {
  
  var prefix: js.UndefOr[String] = js.undefined
}
object PubSubOptions {
  
  inline def apply(): PubSubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubSubOptions] (val x: Self) extends AnyVal {
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}

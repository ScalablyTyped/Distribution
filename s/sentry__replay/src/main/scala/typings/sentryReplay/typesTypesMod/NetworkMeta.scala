package typings.sentryReplay.typesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkMeta extends StObject {
  
  var warnings: js.UndefOr[js.Array[NetworkMetaWarning]] = js.undefined
}
object NetworkMeta {
  
  inline def apply(): NetworkMeta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkMeta] (val x: Self) extends AnyVal {
    
    inline def setWarnings(value: js.Array[NetworkMetaWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: NetworkMetaWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}

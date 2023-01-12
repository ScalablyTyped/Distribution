package typings.sharedb.mod

import typings.sharedb.anon.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsOptions extends StObject {
  
  var opsOptions: js.UndefOr[Metadata] = js.undefined
}
object GetOpsOptions {
  
  inline def apply(): GetOpsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOpsOptions] (val x: Self) extends AnyVal {
    
    inline def setOpsOptions(value: Metadata): Self = StObject.set(x, "opsOptions", value.asInstanceOf[js.Any])
    
    inline def setOpsOptionsUndefined: Self = StObject.set(x, "opsOptions", js.undefined)
  }
}

package typings.rxjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
}
object Value {
  
  inline def apply(value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

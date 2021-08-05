package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'revalidate'> */
trait PickImplrevalidate extends StObject {
  
  var revalidate: Boolean
}
object PickImplrevalidate {
  
  inline def apply(revalidate: Boolean): PickImplrevalidate = {
    val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrevalidate]
  }
  
  extension [Self <: PickImplrevalidate](x: Self) {
    
    inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
  }
}

package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'revalidate'> */
@js.native
trait PickImplrevalidate extends StObject {
  
  var revalidate: Boolean = js.native
}
object PickImplrevalidate {
  
  @scala.inline
  def apply(revalidate: Boolean): PickImplrevalidate = {
    val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplrevalidate]
  }
  
  @scala.inline
  implicit class PickImplrevalidateMutableBuilder[Self <: PickImplrevalidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
  }
}

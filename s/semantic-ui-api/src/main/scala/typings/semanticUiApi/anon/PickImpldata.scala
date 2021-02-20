package typings.semanticUiApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-api.SemanticUI.ApiSettings._Impl, 'data'> */
@js.native
trait PickImpldata extends StObject {
  
  var data: js.Any = js.native
}
object PickImpldata {
  
  @scala.inline
  def apply(data: js.Any): PickImpldata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldata]
  }
  
  @scala.inline
  implicit class PickImpldataMutableBuilder[Self <: PickImpldata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

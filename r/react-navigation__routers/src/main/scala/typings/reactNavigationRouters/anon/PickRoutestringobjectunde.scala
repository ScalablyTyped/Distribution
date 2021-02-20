package typings.reactNavigationRouters.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.Route<string, object | undefined>, 'name' | 'params'> */
@js.native
trait PickRoutestringobjectunde extends StObject {
  
  var name: js.UndefOr[js.Any] = js.native
  
  var params: js.UndefOr[js.Any] = js.native
}
object PickRoutestringobjectunde {
  
  @scala.inline
  def apply(): PickRoutestringobjectunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickRoutestringobjectunde]
  }
  
  @scala.inline
  implicit class PickRoutestringobjectundeMutableBuilder[Self <: PickRoutestringobjectunde] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}

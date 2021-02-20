package typings.storybookAddonKnobs.anon

import typings.react.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: Validator[Boolean] = js.native
  
  var api: Validator[PickAPIonoffemitgetQueryP] = js.native
  
  var onReset: Validator[js.UndefOr[js.Object]] = js.native
}
object Active {
  
  @scala.inline
  def apply(
    active: Validator[Boolean],
    api: Validator[PickAPIonoffemitgetQueryP],
    onReset: Validator[js.UndefOr[js.Object]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], onReset = onReset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Validator[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApi(value: Validator[PickAPIonoffemitgetQueryP]): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnReset(value: Validator[js.UndefOr[js.Object]]): Self = StObject.set(x, "onReset", value.asInstanceOf[js.Any])
  }
}

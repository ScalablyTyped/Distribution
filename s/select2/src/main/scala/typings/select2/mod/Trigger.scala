package typings.select2.mod

import typings.select2.anon.Data
import typings.select2.select2Strings.select2Colonselect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trigger extends StObject {
  
  var params: Data = js.native
  
  var `type`: select2Colonselect = js.native
}
object Trigger {
  
  @scala.inline
  def apply(params: Data, `type`: select2Colonselect): Trigger = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit class TriggerMutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: Data): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: select2Colonselect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

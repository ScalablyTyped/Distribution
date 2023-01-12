package typings.select2.mod

import typings.select2.anon.Data
import typings.select2.select2Strings.select2Colonselect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trigger extends StObject {
  
  var params: Data
  
  var `type`: select2Colonselect
}
object Trigger {
  
  inline def apply(params: Data): Trigger = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("select2:select")
    __obj.asInstanceOf[Trigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trigger] (val x: Self) extends AnyVal {
    
    inline def setParams(value: Data): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setType(value: select2Colonselect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

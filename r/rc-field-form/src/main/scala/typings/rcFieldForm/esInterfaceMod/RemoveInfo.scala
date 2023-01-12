package typings.rcFieldForm.esInterfaceMod

import typings.rcFieldForm.rcFieldFormStrings.remove
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveInfo
  extends StObject
     with NotifyInfo {
  
  var `type`: remove
}
object RemoveInfo {
  
  inline def apply(): RemoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("remove")
    __obj.asInstanceOf[RemoveInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveInfo] (val x: Self) extends AnyVal {
    
    inline def setType(value: remove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

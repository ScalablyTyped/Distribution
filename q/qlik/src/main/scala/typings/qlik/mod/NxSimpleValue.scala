package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxSimpleValue extends StObject {
  
  var qNum: Double
  
  var qText: String
}
object NxSimpleValue {
  
  @scala.inline
  def apply(qNum: Double, qText: String): NxSimpleValue = {
    val __obj = js.Dynamic.literal(qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxSimpleValue]
  }
  
  @scala.inline
  implicit class NxSimpleValueMutableBuilder[Self <: NxSimpleValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}

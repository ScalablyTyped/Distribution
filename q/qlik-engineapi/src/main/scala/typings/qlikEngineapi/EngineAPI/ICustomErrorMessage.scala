package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomErrorMessage...
  */
trait ICustomErrorMessage extends StObject {
  
  var calcCond: String
}
object ICustomErrorMessage {
  
  @scala.inline
  def apply(calcCond: String): ICustomErrorMessage = {
    val __obj = js.Dynamic.literal(calcCond = calcCond.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomErrorMessage]
  }
  
  @scala.inline
  implicit class ICustomErrorMessageMutableBuilder[Self <: ICustomErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalcCond(value: String): Self = StObject.set(x, "calcCond", value.asInstanceOf[js.Any])
  }
}

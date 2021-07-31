package typings.recurlyRecurlyJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Setupfee extends StObject {
  
  var setup_fee: String
  
  var unit: String
}
object Setupfee {
  
  @scala.inline
  def apply(setup_fee: String, unit: String): Setupfee = {
    val __obj = js.Dynamic.literal(setup_fee = setup_fee.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setupfee]
  }
  
  @scala.inline
  implicit class SetupfeeMutableBuilder[Self <: Setupfee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetup_fee(value: String): Self = StObject.set(x, "setup_fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
  }
}

package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Automation date (VT_DATE)
  */
trait VarDate extends StObject {
  
  /* standard scripthost */
  /* private */ var VarDate_typekey: VarDate
}
object VarDate {
  
  inline def apply(VarDate_typekey: VarDate): VarDate = {
    val __obj = js.Dynamic.literal(VarDate_typekey = VarDate_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VarDate]
  }
  
  extension [Self <: VarDate](x: Self) {
    
    inline def setVarDate_typekey(value: VarDate): Self = StObject.set(x, "VarDate_typekey", value.asInstanceOf[js.Any])
  }
}

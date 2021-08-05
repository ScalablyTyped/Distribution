package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturningOptions extends StObject {
  
  /**
    * Append RETURNING * to get back auto generated values (Postgres only)
    */
  var returning: js.UndefOr[Boolean] = js.undefined
}
object ReturningOptions {
  
  inline def apply(): ReturningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturningOptions]
  }
  
  extension [Self <: ReturningOptions](x: Self) {
    
    inline def setReturning(value: Boolean): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    inline def setReturningUndefined: Self = StObject.set(x, "returning", js.undefined)
  }
}

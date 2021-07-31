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
  
  @scala.inline
  def apply(): ReturningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturningOptions]
  }
  
  @scala.inline
  implicit class ReturningOptionsMutableBuilder[Self <: ReturningOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturning(value: Boolean): Self = StObject.set(x, "returning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturningUndefined: Self = StObject.set(x, "returning", js.undefined)
  }
}

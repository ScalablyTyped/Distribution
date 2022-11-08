package typings.random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidationMod {
  
  @JSImport("random/dist/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random/dist/validation", "NumberValidator")
  @js.native
  open class NumberValidator_ protected () extends StObject {
    def this(num: Double) = this()
    
    def greaterThan(v: Double): this.type = js.native
    
    def greaterThanOrEqual(v: Double): this.type = js.native
    
    def isInt(): this.type = js.native
    
    def isPositive(): this.type = js.native
    
    def lessThan(v: Double): this.type = js.native
    
    /* private */ var n: Any = js.native
  }
  
  inline def numberValidator(num: Double): NumberValidator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("numberValidator")(num.asInstanceOf[js.Any]).asInstanceOf[NumberValidator_]
}

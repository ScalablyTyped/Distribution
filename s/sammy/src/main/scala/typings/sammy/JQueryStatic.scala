package typings.sammy

import typings.sammy.Sammy.Application
import typings.sammy.Sammy.SammyFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var log: js.Function
  
  def sammy(): Application
  def sammy(handler: js.Function): Application
  def sammy(selector: String): Application
  def sammy(selector: String, handler: js.Function): Application
  @JSName("sammy")
  var sammy_Original: SammyFunc
}
object JQueryStatic {
  
  inline def apply(log: js.Function, sammy: SammyFunc): JQueryStatic = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], sammy = sammy.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setLog(value: js.Function): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setSammy(value: SammyFunc): Self = StObject.set(x, "sammy", value.asInstanceOf[js.Any])
  }
}

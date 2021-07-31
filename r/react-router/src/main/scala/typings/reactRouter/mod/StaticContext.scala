package typings.reactRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticContext extends StObject {
  
  var statusCode: js.UndefOr[Double] = js.undefined
}
object StaticContext {
  
  @scala.inline
  def apply(): StaticContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticContext]
  }
  
  @scala.inline
  implicit class StaticContextMutableBuilder[Self <: StaticContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}

package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  var steps: js.UndefOr[Double] = js.undefined
}
object Steps {
  
  inline def apply(): Steps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Steps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}

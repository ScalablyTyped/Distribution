package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  var steps: js.UndefOr[Double] = js.undefined
}
object Steps {
  
  @scala.inline
  def apply(): Steps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Steps]
  }
  
  @scala.inline
  implicit class StepsMutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}

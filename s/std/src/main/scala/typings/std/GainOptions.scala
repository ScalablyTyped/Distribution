package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GainOptions
  extends StObject
     with AudioNodeOptions {
  
  var gain: js.UndefOr[Double] = js.undefined
}
object GainOptions {
  
  @scala.inline
  def apply(): GainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GainOptions]
  }
  
  @scala.inline
  implicit class GainOptionsMutableBuilder[Self <: GainOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
  }
}

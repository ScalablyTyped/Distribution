package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMergerOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var numberOfInputs: js.UndefOr[Double] = js.undefined
}
object ChannelMergerOptions {
  
  inline def apply(): ChannelMergerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMergerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelMergerOptions] (val x: Self) extends AnyVal {
    
    inline def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInputsUndefined: Self = StObject.set(x, "numberOfInputs", js.undefined)
  }
}

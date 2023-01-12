package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioWorkletNodeOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var numberOfInputs: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var numberOfOutputs: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var outputChannelCount: js.UndefOr[js.Array[Double]] = js.undefined
  
  /* standard dom */
  var parameterData: js.UndefOr[Record[java.lang.String, Double]] = js.undefined
  
  /* standard dom */
  var processorOptions: js.UndefOr[Any] = js.undefined
}
object AudioWorkletNodeOptions {
  
  inline def apply(): AudioWorkletNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioWorkletNodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioWorkletNodeOptions] (val x: Self) extends AnyVal {
    
    inline def setNumberOfInputs(value: Double): Self = StObject.set(x, "numberOfInputs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfInputsUndefined: Self = StObject.set(x, "numberOfInputs", js.undefined)
    
    inline def setNumberOfOutputs(value: Double): Self = StObject.set(x, "numberOfOutputs", value.asInstanceOf[js.Any])
    
    inline def setNumberOfOutputsUndefined: Self = StObject.set(x, "numberOfOutputs", js.undefined)
    
    inline def setOutputChannelCount(value: js.Array[Double]): Self = StObject.set(x, "outputChannelCount", value.asInstanceOf[js.Any])
    
    inline def setOutputChannelCountUndefined: Self = StObject.set(x, "outputChannelCount", js.undefined)
    
    inline def setOutputChannelCountVarargs(value: Double*): Self = StObject.set(x, "outputChannelCount", js.Array(value*))
    
    inline def setParameterData(value: Record[java.lang.String, Double]): Self = StObject.set(x, "parameterData", value.asInstanceOf[js.Any])
    
    inline def setParameterDataUndefined: Self = StObject.set(x, "parameterData", js.undefined)
    
    inline def setProcessorOptions(value: Any): Self = StObject.set(x, "processorOptions", value.asInstanceOf[js.Any])
    
    inline def setProcessorOptionsUndefined: Self = StObject.set(x, "processorOptions", js.undefined)
  }
}

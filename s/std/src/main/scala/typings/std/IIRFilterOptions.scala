package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIRFilterOptions
  extends StObject
     with AudioNodeOptions {
  
  /* standard dom */
  var feedback: js.Array[Double]
  
  /* standard dom */
  var feedforward: js.Array[Double]
}
object IIRFilterOptions {
  
  inline def apply(feedback: js.Array[Double], feedforward: js.Array[Double]): IIRFilterOptions = {
    val __obj = js.Dynamic.literal(feedback = feedback.asInstanceOf[js.Any], feedforward = feedforward.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIRFilterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIRFilterOptions] (val x: Self) extends AnyVal {
    
    inline def setFeedback(value: js.Array[Double]): Self = StObject.set(x, "feedback", value.asInstanceOf[js.Any])
    
    inline def setFeedbackVarargs(value: Double*): Self = StObject.set(x, "feedback", js.Array(value*))
    
    inline def setFeedforward(value: js.Array[Double]): Self = StObject.set(x, "feedforward", value.asInstanceOf[js.Any])
    
    inline def setFeedforwardVarargs(value: Double*): Self = StObject.set(x, "feedforward", js.Array(value*))
  }
}

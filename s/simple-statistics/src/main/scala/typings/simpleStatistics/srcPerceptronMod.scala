package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPerceptronMod {
  
  @JSImport("simple-statistics/src/perceptron", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PerceptronModel {
    
    /* CompleteClass */
    var bias: Double = js.native
    
    /* CompleteClass */
    override def predict(features: js.Array[Double]): Double = js.native
    
    /* CompleteClass */
    override def train(features: js.Array[Double], label: Double): PerceptronModel = js.native
    
    /* CompleteClass */
    var weights: js.Array[Double] = js.native
  }
  
  trait PerceptronModel extends StObject {
    
    var bias: Double
    
    def predict(features: js.Array[Double]): Double
    
    def train(features: js.Array[Double], label: Double): PerceptronModel
    
    var weights: js.Array[Double]
  }
  object PerceptronModel {
    
    inline def apply(
      bias: Double,
      predict: js.Array[Double] => Double,
      train: (js.Array[Double], Double) => PerceptronModel,
      weights: js.Array[Double]
    ): PerceptronModel = {
      val __obj = js.Dynamic.literal(bias = bias.asInstanceOf[js.Any], predict = js.Any.fromFunction1(predict), train = js.Any.fromFunction2(train), weights = weights.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerceptronModel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PerceptronModel] (val x: Self) extends AnyVal {
      
      inline def setBias(value: Double): Self = StObject.set(x, "bias", value.asInstanceOf[js.Any])
      
      inline def setPredict(value: js.Array[Double] => Double): Self = StObject.set(x, "predict", js.Any.fromFunction1(value))
      
      inline def setTrain(value: (js.Array[Double], Double) => PerceptronModel): Self = StObject.set(x, "train", js.Any.fromFunction2(value))
      
      inline def setWeights(value: js.Array[Double]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsVarargs(value: Double*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
}

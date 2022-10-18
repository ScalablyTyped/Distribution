package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBayesianClassifierMod {
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @JSImport("simple-statistics/src/bayesian_classifier", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BayesianClassifier {
    
    /* CompleteClass */
    var data: Data = js.native
    
    /* CompleteClass */
    override def score(item: Item): OddsSums = js.native
    
    /* CompleteClass */
    var totalCount: Double = js.native
    
    /* CompleteClass */
    override def train(item: Item, category: String): Unit = js.native
  }
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  trait BayesianClassifier extends StObject {
    
    var data: Data
    
    def score(item: Item): OddsSums
    
    var totalCount: Double
    
    def train(item: Item, category: String): Unit
  }
  object BayesianClassifier {
    
    inline def apply(data: Data, score: Item => OddsSums, totalCount: Double, train: (Item, String) => Unit): BayesianClassifier = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], score = js.Any.fromFunction1(score), totalCount = totalCount.asInstanceOf[js.Any], train = js.Any.fromFunction2(train))
      __obj.asInstanceOf[BayesianClassifier]
    }
    
    extension [Self <: BayesianClassifier](x: Self) {
      
      inline def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Item => OddsSums): Self = StObject.set(x, "score", js.Any.fromFunction1(value))
      
      inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
      
      inline def setTrain(value: (Item, String) => Unit): Self = StObject.set(x, "train", js.Any.fromFunction2(value))
    }
  }
  
  type Data = js.Object
  
  type Item = js.Object
  
  type OddsSums = js.Object
}

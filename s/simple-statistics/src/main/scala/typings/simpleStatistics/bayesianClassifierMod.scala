package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bayesianClassifierMod {
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @JSImport("simple-statistics/src/bayesian_classifier", JSImport.Default)
  @js.native
  class default () extends BayesianClassifier
  
  /**
    * https://simplestatistics.org/docs/#bayesianclassifier
    */
  @js.native
  trait BayesianClassifier extends StObject {
    
    var data: Data = js.native
    
    def score(item: Item): OddsSums = js.native
    
    var totalCount: Double = js.native
    
    def train(item: Item, category: String): Unit = js.native
  }
  object BayesianClassifier {
    
    @scala.inline
    def apply(data: Data, score: Item => OddsSums, totalCount: Double, train: (Item, String) => Unit): BayesianClassifier = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], score = js.Any.fromFunction1(score), totalCount = totalCount.asInstanceOf[js.Any], train = js.Any.fromFunction2(train))
      __obj.asInstanceOf[BayesianClassifier]
    }
    
    @scala.inline
    implicit class BayesianClassifierMutableBuilder[Self <: BayesianClassifier] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Data): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Item => OddsSums): Self = StObject.set(x, "score", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrain(value: (Item, String) => Unit): Self = StObject.set(x, "train", js.Any.fromFunction2(value))
    }
  }
  
  type Data = js.Object
  
  type Item = js.Object
  
  type OddsSums = js.Object
}

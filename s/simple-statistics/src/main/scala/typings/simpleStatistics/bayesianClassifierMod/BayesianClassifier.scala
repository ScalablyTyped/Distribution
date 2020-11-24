package typings.simpleStatistics.bayesianClassifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * https://simplestatistics.org/docs/#bayesianclassifier
  */
@js.native
trait BayesianClassifier extends js.Object {
  
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
  implicit class BayesianClassifierOps[Self <: BayesianClassifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScore(value: Item => OddsSums): Self = this.set("score", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrain(value: (Item, String) => Unit): Self = this.set("train", js.Any.fromFunction2(value))
  }
}

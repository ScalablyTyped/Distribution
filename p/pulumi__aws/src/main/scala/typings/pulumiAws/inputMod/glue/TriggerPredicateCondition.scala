package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerPredicateCondition extends StObject {
  
  /**
    * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawlerName` must also be specified. Conflicts with `state`.
    */
  var crawlState: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `jobName` must also be specified. Conflicts with `crawlerState`.
    */
  var state: js.UndefOr[Input[String]] = js.undefined
}
object TriggerPredicateCondition {
  
  @scala.inline
  def apply(): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
  
  @scala.inline
  implicit class TriggerPredicateConditionMutableBuilder[Self <: TriggerPredicateCondition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlState(value: Input[String]): Self = StObject.set(x, "crawlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlStateUndefined: Self = StObject.set(x, "crawlState", js.undefined)
    
    @scala.inline
    def setCrawlerName(value: Input[String]): Self = StObject.set(x, "crawlerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlerNameUndefined: Self = StObject.set(x, "crawlerName", js.undefined)
    
    @scala.inline
    def setJobName(value: Input[String]): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    @scala.inline
    def setLogicalOperator(value: Input[String]): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

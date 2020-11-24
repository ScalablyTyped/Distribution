package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerPredicateCondition extends js.Object {
  
  /**
    * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawlerName` must also be specified. Conflicts with `state`.
    */
  var crawlState: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[Input[String]] = js.native
  
  /**
    * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `jobName` must also be specified. Conflicts with `crawlerState`.
    */
  var state: js.UndefOr[Input[String]] = js.native
}
object TriggerPredicateCondition {
  
  @scala.inline
  def apply(): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
  
  @scala.inline
  implicit class TriggerPredicateConditionOps[Self <: TriggerPredicateCondition] (val x: Self) extends AnyVal {
    
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
    def setCrawlState(value: Input[String]): Self = this.set("crawlState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlState: Self = this.set("crawlState", js.undefined)
    
    @scala.inline
    def setCrawlerName(value: Input[String]): Self = this.set("crawlerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlerName: Self = this.set("crawlerName", js.undefined)
    
    @scala.inline
    def setJobName(value: Input[String]): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("jobName", js.undefined)
    
    @scala.inline
    def setLogicalOperator(value: Input[String]): Self = this.set("logicalOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogicalOperator: Self = this.set("logicalOperator", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

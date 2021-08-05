package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerPredicateCondition extends StObject {
  
  /**
    * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawlerName` must also be specified. Conflicts with `state`.
    */
  var crawlState: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.undefined
  
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[String] = js.undefined
  
  /**
    * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `jobName` must also be specified. Conflicts with `crawlerState`.
    */
  var state: js.UndefOr[String] = js.undefined
}
object TriggerPredicateCondition {
  
  inline def apply(): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
  
  extension [Self <: TriggerPredicateCondition](x: Self) {
    
    inline def setCrawlState(value: String): Self = StObject.set(x, "crawlState", value.asInstanceOf[js.Any])
    
    inline def setCrawlStateUndefined: Self = StObject.set(x, "crawlState", js.undefined)
    
    inline def setCrawlerName(value: String): Self = StObject.set(x, "crawlerName", value.asInstanceOf[js.Any])
    
    inline def setCrawlerNameUndefined: Self = StObject.set(x, "crawlerName", js.undefined)
    
    inline def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobNameUndefined: Self = StObject.set(x, "jobName", js.undefined)
    
    inline def setLogicalOperator(value: String): Self = StObject.set(x, "logicalOperator", value.asInstanceOf[js.Any])
    
    inline def setLogicalOperatorUndefined: Self = StObject.set(x, "logicalOperator", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

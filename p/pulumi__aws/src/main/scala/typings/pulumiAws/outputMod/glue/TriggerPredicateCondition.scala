package typings.pulumiAws.outputMod.glue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerPredicateCondition extends js.Object {
  /**
    * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawlerName` must also be specified. Conflicts with `state`.
    */
  var crawlState: js.UndefOr[String] = js.native
  /**
    * The name of the crawler to watch. If this is specified, `crawlState` must also be specified. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[String] = js.native
  /**
    * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[String] = js.native
  /**
    * A logical operator. Defaults to `EQUALS`.
    */
  var logicalOperator: js.UndefOr[String] = js.native
  /**
    * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `jobName` must also be specified. Conflicts with `crawlerState`.
    */
  var state: js.UndefOr[String] = js.native
}

object TriggerPredicateCondition {
  @scala.inline
  def apply(
    crawlState: String = null,
    crawlerName: String = null,
    jobName: String = null,
    logicalOperator: String = null,
    state: String = null
  ): TriggerPredicateCondition = {
    val __obj = js.Dynamic.literal()
    if (crawlState != null) __obj.updateDynamic("crawlState")(crawlState.asInstanceOf[js.Any])
    if (crawlerName != null) __obj.updateDynamic("crawlerName")(crawlerName.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (logicalOperator != null) __obj.updateDynamic("logicalOperator")(logicalOperator.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicateCondition]
  }
}


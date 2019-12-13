package typings.atPulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LimitedPriorityLevelConfiguration specifies how to handle requests that are subject to
  * limits. It addresses two issues:
  *  * How are requests for this priority level limited?
  *  * What should be done with requests that exceed the limit?
  */
trait LimitedPriorityLevelConfiguration extends js.Object {
  /**
    * `assuredConcurrencyShares` (ACS) configures the execution limit, which is a limit on the
    * number of requests of this priority level that may be exeucting at a given time.  ACS must
    * be a positive number. The server's concurrency limit (SCL) is divided among the
    * concurrency-controlled priority levels in proportion to their assured concurrency shares.
    * This produces the assured concurrency value (ACV) --- the number of requests that may be
    * executing at a time --- for each such priority level:
    *
    *             ACV(l) = ceil( SCL * ACS(l) / ( sum[priority levels k] ACS(k) ) )
    *
    * bigger numbers of ACS mean more reserved concurrent requests (at the expense of every other
    * PL). This field has a default value of 30.
    */
  var assuredConcurrencyShares: js.UndefOr[Input[Double]] = js.undefined
  /**
    * `limitResponse` indicates what to do with requests that can not be executed right now
    */
  var limitResponse: js.UndefOr[Input[LimitResponse]] = js.undefined
}

object LimitedPriorityLevelConfiguration {
  @scala.inline
  def apply(assuredConcurrencyShares: Input[Double] = null, limitResponse: Input[LimitResponse] = null): LimitedPriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal()
    if (assuredConcurrencyShares != null) __obj.updateDynamic("assuredConcurrencyShares")(assuredConcurrencyShares.asInstanceOf[js.Any])
    if (limitResponse != null) __obj.updateDynamic("limitResponse")(limitResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedPriorityLevelConfiguration]
  }
}


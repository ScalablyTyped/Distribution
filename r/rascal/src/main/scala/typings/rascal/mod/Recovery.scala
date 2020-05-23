package typings.rascal.mod

import typings.rascal.rascalStrings.ack
import typings.rascal.rascalStrings.forward
import typings.rascal.rascalStrings.nack
import typings.rascal.rascalStrings.republish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recovery extends js.Object {
  var attempts: js.UndefOr[Double] = js.undefined
  var defer: js.UndefOr[Double] = js.undefined
  var immediateNack: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[PublicationConfig] = js.undefined
  var publication: js.UndefOr[String] = js.undefined
  var requeue: js.UndefOr[Boolean] = js.undefined
  var strategy: ack | nack | republish | forward
  var xDeathFix: js.UndefOr[Boolean] = js.undefined
}

object Recovery {
  @scala.inline
  def apply(
    strategy: ack | nack | republish | forward,
    attempts: js.UndefOr[Double] = js.undefined,
    defer: js.UndefOr[Double] = js.undefined,
    immediateNack: js.UndefOr[Boolean] = js.undefined,
    options: PublicationConfig = null,
    publication: String = null,
    requeue: js.UndefOr[Boolean] = js.undefined,
    xDeathFix: js.UndefOr[Boolean] = js.undefined
  ): Recovery = {
    val __obj = js.Dynamic.literal(strategy = strategy.asInstanceOf[js.Any])
    if (!js.isUndefined(attempts)) __obj.updateDynamic("attempts")(attempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediateNack)) __obj.updateDynamic("immediateNack")(immediateNack.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (publication != null) __obj.updateDynamic("publication")(publication.asInstanceOf[js.Any])
    if (!js.isUndefined(requeue)) __obj.updateDynamic("requeue")(requeue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xDeathFix)) __obj.updateDynamic("xDeathFix")(xDeathFix.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recovery]
  }
}


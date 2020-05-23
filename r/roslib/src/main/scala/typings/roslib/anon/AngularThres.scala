package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularThres extends js.Object {
  var angularThres: js.UndefOr[Double] = js.undefined
  var fixedFrame: js.UndefOr[String] = js.undefined
  var rate: js.UndefOr[Double] = js.undefined
  var repubServiceName: js.UndefOr[String] = js.undefined
  var ros: typings.roslib.mod.Ros
  var serverName: js.UndefOr[String] = js.undefined
  var topicTimeout: js.UndefOr[Double] = js.undefined
  var transThres: js.UndefOr[Double] = js.undefined
  var updateDelay: js.UndefOr[Double] = js.undefined
}

object AngularThres {
  @scala.inline
  def apply(
    ros: typings.roslib.mod.Ros,
    angularThres: js.UndefOr[Double] = js.undefined,
    fixedFrame: String = null,
    rate: js.UndefOr[Double] = js.undefined,
    repubServiceName: String = null,
    serverName: String = null,
    topicTimeout: js.UndefOr[Double] = js.undefined,
    transThres: js.UndefOr[Double] = js.undefined,
    updateDelay: js.UndefOr[Double] = js.undefined
  ): AngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    if (!js.isUndefined(angularThres)) __obj.updateDynamic("angularThres")(angularThres.get.asInstanceOf[js.Any])
    if (fixedFrame != null) __obj.updateDynamic("fixedFrame")(fixedFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(rate)) __obj.updateDynamic("rate")(rate.get.asInstanceOf[js.Any])
    if (repubServiceName != null) __obj.updateDynamic("repubServiceName")(repubServiceName.asInstanceOf[js.Any])
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    if (!js.isUndefined(topicTimeout)) __obj.updateDynamic("topicTimeout")(topicTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transThres)) __obj.updateDynamic("transThres")(transThres.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateDelay)) __obj.updateDynamic("updateDelay")(updateDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularThres]
  }
}


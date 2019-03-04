package typings
package roslibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AngularThres extends js.Object {
  var angularThres: js.UndefOr[scala.Double] = js.undefined
  var fixedFrame: js.UndefOr[java.lang.String] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var repubServiceName: js.UndefOr[java.lang.String] = js.undefined
  var ros: roslibLib.roslibMod.ROSLIBNs.Ros
  var serverName: js.UndefOr[java.lang.String] = js.undefined
  var topicTimeout: js.UndefOr[scala.Double] = js.undefined
  var transThres: js.UndefOr[scala.Double] = js.undefined
  var updateDelay: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AngularThres {
  @scala.inline
  def apply(
    ros: roslibLib.roslibMod.ROSLIBNs.Ros,
    angularThres: scala.Int | scala.Double = null,
    fixedFrame: java.lang.String = null,
    rate: scala.Int | scala.Double = null,
    repubServiceName: java.lang.String = null,
    serverName: java.lang.String = null,
    topicTimeout: scala.Int | scala.Double = null,
    transThres: scala.Int | scala.Double = null,
    updateDelay: scala.Int | scala.Double = null
  ): Anon_AngularThres = {
    val __obj = js.Dynamic.literal(ros = ros)
    if (angularThres != null) __obj.updateDynamic("angularThres")(angularThres.asInstanceOf[js.Any])
    if (fixedFrame != null) __obj.updateDynamic("fixedFrame")(fixedFrame)
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (repubServiceName != null) __obj.updateDynamic("repubServiceName")(repubServiceName)
    if (serverName != null) __obj.updateDynamic("serverName")(serverName)
    if (topicTimeout != null) __obj.updateDynamic("topicTimeout")(topicTimeout.asInstanceOf[js.Any])
    if (transThres != null) __obj.updateDynamic("transThres")(transThres.asInstanceOf[js.Any])
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AngularThres]
  }
}


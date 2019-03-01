package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.undefined
  /**
    * An identifier for the condition that was encountered.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[sarifLib.sarifMod.NotificationNs.level] = js.undefined
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message
  /**
    * The artifact and region relevant to this notification.
    */
  var physicalLocation: js.UndefOr[PhysicalLocation] = js.undefined
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  /**
    * The stable, unique identifier of the rule, if any, to which this notification is relevant.
    */
  var ruleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The index within the run resources array of the rule object, if any, associated with this notification.
    */
  var ruleIndex: js.UndefOr[scala.Double] = js.undefined
  /**
    * The thread identifier of the code that generated the notification.
    */
  var threadId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    message: Message,
    exception: Exception = null,
    id: java.lang.String = null,
    level: sarifLib.sarifMod.NotificationNs.level = null,
    physicalLocation: PhysicalLocation = null,
    properties: PropertyBag = null,
    ruleId: java.lang.String = null,
    ruleIndex: scala.Int | scala.Double = null,
    threadId: scala.Int | scala.Double = null,
    timeUtc: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (id != null) __obj.updateDynamic("id")(id)
    if (level != null) __obj.updateDynamic("level")(level)
    if (physicalLocation != null) __obj.updateDynamic("physicalLocation")(physicalLocation)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (ruleId != null) __obj.updateDynamic("ruleId")(ruleId)
    if (ruleIndex != null) __obj.updateDynamic("ruleIndex")(ruleIndex.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    if (timeUtc != null) __obj.updateDynamic("timeUtc")(timeUtc)
    __obj.asInstanceOf[Notification]
  }
}


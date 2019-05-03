package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  /**
    * A reference used to locate the rule descriptor associated with this notification.
    */
  var associatedRule: js.UndefOr[ReportingDescriptorReference] = js.undefined
  /**
    * A reference used to locate the descriptor relevant to this notification.
    */
  var descriptor: js.UndefOr[ReportingDescriptorReference] = js.undefined
  /**
    * The runtime exception, if any, relevant to this notification.
    */
  var exception: js.UndefOr[Exception] = js.undefined
  /**
    * A value specifying the severity level of the notification.
    */
  var level: js.UndefOr[sarifLib.sarifMod.NotificationNs.level] = js.undefined
  /**
    * The locations relevant to this notification.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.undefined
  /**
    * A message that describes the condition that was encountered.
    */
  var message: Message
  /**
    * Key/value pairs that provide additional information about the notification.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
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
    associatedRule: ReportingDescriptorReference = null,
    descriptor: ReportingDescriptorReference = null,
    exception: Exception = null,
    level: sarifLib.sarifMod.NotificationNs.level = null,
    locations: js.Array[Location] = null,
    properties: PropertyBag = null,
    threadId: scala.Int | scala.Double = null,
    timeUtc: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal(message = message)
    if (associatedRule != null) __obj.updateDynamic("associatedRule")(associatedRule)
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (exception != null) __obj.updateDynamic("exception")(exception)
    if (level != null) __obj.updateDynamic("level")(level)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    if (timeUtc != null) __obj.updateDynamic("timeUtc")(timeUtc)
    __obj.asInstanceOf[Notification]
  }
}


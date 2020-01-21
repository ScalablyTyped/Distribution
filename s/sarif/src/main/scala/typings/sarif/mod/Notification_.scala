package typings.sarif.mod

import typings.sarif.mod.Notification.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification_ extends js.Object {
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
  var level: js.UndefOr[level] = js.undefined
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
  var threadId: js.UndefOr[Double] = js.undefined
  /**
    * The Coordinated Universal Time (UTC) date and time at which the analysis tool generated the notification.
    */
  var timeUtc: js.UndefOr[String] = js.undefined
}

object Notification_ {
  @scala.inline
  def apply(
    message: Message,
    associatedRule: ReportingDescriptorReference = null,
    descriptor: ReportingDescriptorReference = null,
    exception: Exception = null,
    level: level = null,
    locations: js.Array[Location] = null,
    properties: PropertyBag = null,
    threadId: Int | Double = null,
    timeUtc: String = null
  ): Notification_ = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (associatedRule != null) __obj.updateDynamic("associatedRule")(associatedRule.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (exception != null) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId.asInstanceOf[js.Any])
    if (timeUtc != null) __obj.updateDynamic("timeUtc")(timeUtc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification_]
  }
}


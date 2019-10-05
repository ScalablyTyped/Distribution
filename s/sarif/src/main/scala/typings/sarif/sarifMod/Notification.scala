package typings.sarif.sarifMod

import typings.sarif.sarifMod.Notification.level
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

@JSImport("sarif", "Notification")
@js.native
object Notification extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.sarif.sarifStrings.none
    - typings.sarif.sarifStrings.note
    - typings.sarif.sarifStrings.warning
    - typings.sarif.sarifStrings.error
  */
  trait level extends js.Object
  
}


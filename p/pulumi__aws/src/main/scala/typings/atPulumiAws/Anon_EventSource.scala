package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventSource extends js.Object {
  var eventSource: js.UndefOr[String] = js.undefined
  var maximumExecutionFrequency: js.UndefOr[String] = js.undefined
  var messageType: js.UndefOr[String] = js.undefined
}

object Anon_EventSource {
  @scala.inline
  def apply(eventSource: String = null, maximumExecutionFrequency: String = null, messageType: String = null): Anon_EventSource = {
    val __obj = js.Dynamic.literal()
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource)
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType)
    __obj.asInstanceOf[Anon_EventSource]
  }
}


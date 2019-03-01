package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventSource extends js.Object {
  var eventSource: js.UndefOr[java.lang.String] = js.undefined
  var maximumExecutionFrequency: js.UndefOr[java.lang.String] = js.undefined
  var messageType: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EventSource {
  @scala.inline
  def apply(
    eventSource: java.lang.String = null,
    maximumExecutionFrequency: java.lang.String = null,
    messageType: java.lang.String = null
  ): Anon_EventSource = {
    val __obj = js.Dynamic.literal()
    if (eventSource != null) __obj.updateDynamic("eventSource")(eventSource)
    if (maximumExecutionFrequency != null) __obj.updateDynamic("maximumExecutionFrequency")(maximumExecutionFrequency)
    if (messageType != null) __obj.updateDynamic("messageType")(messageType)
    __obj.asInstanceOf[Anon_EventSource]
  }
}


package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEventQueryResourceFetch extends LogEvent {
  // FetchPolicy from relay-experimental
  val fetchPolicy: String
  val name: queryresourceDotfetch
  val operation: OperationDescriptor
  val queryAvailability: OperationAvailability
  // RenderPolicy from relay-experimental
  val renderPolicy: String
  val shouldFetch: Boolean
}

object LogEventQueryResourceFetch {
  @scala.inline
  def apply(
    fetchPolicy: String,
    name: queryresourceDotfetch,
    operation: OperationDescriptor,
    queryAvailability: OperationAvailability,
    renderPolicy: String,
    shouldFetch: Boolean
  ): LogEventQueryResourceFetch = {
    val __obj = js.Dynamic.literal(fetchPolicy = fetchPolicy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], queryAvailability = queryAvailability.asInstanceOf[js.Any], renderPolicy = renderPolicy.asInstanceOf[js.Any], shouldFetch = shouldFetch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEventQueryResourceFetch]
  }
}


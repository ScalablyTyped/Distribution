package typings.relayRuntime.relayStoreTypesMod

import typings.relayRuntime.relayRuntimeStrings.queryresourceDotfetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEventQueryResourceFetch extends LogEvent {
  // FetchPolicy from relay-experimental
  val fetchPolicy: String = js.native
  val name: queryresourceDotfetch = js.native
  val operation: OperationDescriptor = js.native
  val queryAvailability: OperationAvailability = js.native
  // RenderPolicy from relay-experimental
  val renderPolicy: String = js.native
  val shouldFetch: Boolean = js.native
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
  @scala.inline
  implicit class LogEventQueryResourceFetchOps[Self <: LogEventQueryResourceFetch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFetchPolicy(value: String): Self = this.set("fetchPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: queryresourceDotfetch): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationDescriptor): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryAvailability(value: OperationAvailability): Self = this.set("queryAvailability", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderPolicy(value: String): Self = this.set("renderPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldFetch(value: Boolean): Self = this.set("shouldFetch", value.asInstanceOf[js.Any])
  }
  
}


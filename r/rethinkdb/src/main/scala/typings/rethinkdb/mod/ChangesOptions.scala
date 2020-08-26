package typings.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: https://rethinkdb.com/api/javascript/changes/
  */
@js.native
trait ChangesOptions extends js.Object {
  /**
    * The number of changes the server will buffer between client reads before it starts dropping changes and generates an error (default: 100,000).
    */
  var changefeedQueueSize: Double = js.native
  /**
    * If `true`, the changefeed stream will begin with the current contents of the table or selection being monitored. These initial results will have `new_val` fields, but no `old_val` fields. The initial results may be intermixed with actual changes, as long as an initial result for the changed document has already been given. If an initial result for a document has been sent and a change is made to that document that would move it to the unsent part of the result set (e.g., a changefeed monitors the top 100 posters, the first 50 have been sent, and poster 48 has become poster 52), an “uninitial” notification will be sent, with an `old_val` field but no `new_val` field.
    */
  var includeInitial: Boolean = js.native
  /**
    * If `true`, a changefeed stream on an `orderBy.limit` changefeed will include `old_offset` and `new_offset` fields in status documents that include `old_val` and `new_val`. This allows applications to maintain ordered lists of the stream’s result set. If `old_offset` is set and not `null`, the element at `old_offset` is being deleted; if `new_offset` is set and not `null`, then `new_val` is being inserted at `new_offset`. Setting `includeOffsets` to `true` on a changefeed that does not support it will raise an error.
    */
  var includeOffsets: Boolean = js.native
  /**
    * If `true`, the changefeed stream will include special status documents consisting of the field `state` and a string indicating a change in the feed’s state. These documents can occur at any point in the feed between the notification documents described below. If `includeStates` is `false` (the default), the status documents will not be sent.
    */
  var includeStates: Boolean = js.native
  /**
    * If `true`, every result on a changefeed will include a `type` field with a string that indicates the kind of change the result represents: `add`, `remove`, `change`, `initial`, `uninitial`, `state`. Defaults to `false`.
    */
  var includeTypes: Boolean = js.native
  /**
    * Controls how change notifications are batched. Acceptable values are `true`, `false` and a numeric value:
    *
    *   * `true`: When multiple changes to the same document occur before a batch of notifications is sent, the changes are “squashed” into one change. The client receives a notification that will bring it fully up to date with the server.
    *   * `false`: All changes will be sent to the client verbatim. This is the default.
    *   * `n`: A numeric value (floating point). Similar to `true`, but the server will wait `n` seconds to respond in order to squash as many changes together as possible, reducing network traffic. The first batch will always be returned immediately.
    */
  var squash: Boolean | Double = js.native
}

object ChangesOptions {
  @scala.inline
  def apply(
    changefeedQueueSize: Double,
    includeInitial: Boolean,
    includeOffsets: Boolean,
    includeStates: Boolean,
    includeTypes: Boolean,
    squash: Boolean | Double
  ): ChangesOptions = {
    val __obj = js.Dynamic.literal(changefeedQueueSize = changefeedQueueSize.asInstanceOf[js.Any], includeInitial = includeInitial.asInstanceOf[js.Any], includeOffsets = includeOffsets.asInstanceOf[js.Any], includeStates = includeStates.asInstanceOf[js.Any], includeTypes = includeTypes.asInstanceOf[js.Any], squash = squash.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesOptions]
  }
  @scala.inline
  implicit class ChangesOptionsOps[Self <: ChangesOptions] (val x: Self) extends AnyVal {
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
    def setChangefeedQueueSize(value: Double): Self = this.set("changefeedQueueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeInitial(value: Boolean): Self = this.set("includeInitial", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeOffsets(value: Boolean): Self = this.set("includeOffsets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeStates(value: Boolean): Self = this.set("includeStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeTypes(value: Boolean): Self = this.set("includeTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setSquash(value: Boolean | Double): Self = this.set("squash", value.asInstanceOf[js.Any])
  }
  
}


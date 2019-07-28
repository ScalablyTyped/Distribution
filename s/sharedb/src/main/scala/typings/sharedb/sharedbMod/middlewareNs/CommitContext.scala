package typings.sharedb.sharedbMod.middlewareNs

import typings.sharedb.libSharedbMod.Snapshot
import typings.sharedb.sharedbMod.Op
import typings.sharedb.sharedbMod.Projection
import typings.sharedb.sharedbMod.SubmitRequest
import typings.sharedb.sharedbStrings.afterSubmit
import typings.sharedb.sharedbStrings.apply
import typings.sharedb.sharedbStrings.commit
import typings.sharedb.sharedbStrings.connect
import typings.sharedb.sharedbStrings.doc
import typings.sharedb.sharedbStrings.op
import typings.sharedb.sharedbStrings.query
import typings.sharedb.sharedbStrings.readSnapshots
import typings.sharedb.sharedbStrings.receive
import typings.sharedb.sharedbStrings.reply
import typings.sharedb.sharedbStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitContext
  extends BaseContext
     with SubmitRequest

object CommitContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: js.Any,
    backend: typings.sharedb.sharedbMod.sharedb,
    collection: String,
    id: String,
    index: String,
    op: Op,
    ops: js.Array[typings.sharedb.libSharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double,
    channels: js.Array[String] = null,
    maxRetries: Int | Double = null,
    projection: Projection = null,
    saveMilestoneSnapshot: js.UndefOr[Boolean] = js.undefined,
    snapshot: Snapshot = null,
    suppressPublish: js.UndefOr[Boolean] = js.undefined
  ): CommitContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, collection = collection, id = id, index = index, op = op, ops = ops, options = options, retries = retries, start = start)
    if (channels != null) __obj.updateDynamic("channels")(channels)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (!js.isUndefined(saveMilestoneSnapshot)) __obj.updateDynamic("saveMilestoneSnapshot")(saveMilestoneSnapshot)
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot)
    if (!js.isUndefined(suppressPublish)) __obj.updateDynamic("suppressPublish")(suppressPublish)
    __obj.asInstanceOf[CommitContext]
  }
}


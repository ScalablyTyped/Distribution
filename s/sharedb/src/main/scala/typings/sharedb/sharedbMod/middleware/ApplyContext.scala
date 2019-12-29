package typings.sharedb.sharedbMod.middleware

import typings.sharedb.libAgentMod.^
import typings.sharedb.libSharedbMod.Snapshot
import typings.sharedb.sharedbMod.Op
import typings.sharedb.sharedbMod.Projection
import typings.sharedb.sharedbMod.SubmitRequest
import typings.sharedb.sharedbMod.sharedb
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

trait ApplyContext
  extends BaseContext
     with SubmitRequest

object ApplyContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
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
  ): ApplyContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(saveMilestoneSnapshot)) __obj.updateDynamic("saveMilestoneSnapshot")(saveMilestoneSnapshot.asInstanceOf[js.Any])
    if (snapshot != null) __obj.updateDynamic("snapshot")(snapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressPublish)) __obj.updateDynamic("suppressPublish")(suppressPublish.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyContext]
  }
}


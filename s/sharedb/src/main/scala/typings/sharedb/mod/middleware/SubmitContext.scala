package typings.sharedb.mod.middleware

import typings.sharedb.agentMod.^
import typings.sharedb.mod.Op
import typings.sharedb.mod.Projection
import typings.sharedb.mod.SubmitRequest
import typings.sharedb.mod.sharedb
import typings.sharedb.sharedbMod.Snapshot
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

trait SubmitContext
  extends BaseContext
     with SubmitRequest

object SubmitContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: ^,
    backend: sharedb,
    collection: String,
    id: String,
    index: String,
    op: Op,
    ops: js.Array[typings.sharedb.sharedbMod.Op],
    options: js.Any,
    retries: Double,
    start: Double,
    channels: js.Array[String] = null,
    maxRetries: Double = null.asInstanceOf[Double],
    projection: Projection = null,
    saveMilestoneSnapshot: Boolean = null.asInstanceOf[Boolean],
    snapshot: Snapshot = null,
    suppressPublish: Boolean = null.asInstanceOf[Boolean]
  ): SubmitContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], saveMilestoneSnapshot = saveMilestoneSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], suppressPublish = suppressPublish.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitContext]
  }
}


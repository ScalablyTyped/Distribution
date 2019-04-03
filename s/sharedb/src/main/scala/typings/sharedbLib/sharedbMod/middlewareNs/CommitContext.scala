package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitContext
  extends BaseContext
     with sharedbLib.sharedbMod.SubmitRequest

object CommitContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb,
    collection: java.lang.String,
    id: java.lang.String,
    index: java.lang.String,
    op: sharedbLib.sharedbMod.sharedbNs.Op,
    ops: js.Array[sharedbLib.libSharedbMod.Op],
    options: js.Any,
    retries: scala.Double,
    start: scala.Double,
    channels: js.Array[java.lang.String] = null,
    maxRetries: scala.Int | scala.Double = null,
    projection: sharedbLib.sharedbMod.Projection = null,
    saveMilestoneSnapshot: js.UndefOr[scala.Boolean] = js.undefined,
    snapshot: sharedbLib.libSharedbMod.Snapshot = null,
    suppressPublish: js.UndefOr[scala.Boolean] = js.undefined
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


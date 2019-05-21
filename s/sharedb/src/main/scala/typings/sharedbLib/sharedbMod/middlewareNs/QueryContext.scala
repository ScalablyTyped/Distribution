package typings
package sharedbLib.sharedbMod.middlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends BaseContext {
  var channel: java.lang.String
  var collection: java.lang.String
  var db: sharedbLib.sharedbMod.DB | scala.Null
  var fields: js.UndefOr[sharedbLib.sharedbMod.ProjectionFields] = js.undefined
  var index: java.lang.String
  var options: sharedbLib.libSharedbMod.JSONObject
  var projection: js.UndefOr[sharedbLib.sharedbMod.Projection] = js.undefined
  var query: sharedbLib.libSharedbMod.JSONObject
  var snapshotProjection: sharedbLib.sharedbMod.Projection | scala.Null
}

object QueryContext {
  @scala.inline
  def apply(
    action: sharedbLib.sharedbLibStrings.afterSubmit | sharedbLib.sharedbLibStrings.apply | sharedbLib.sharedbLibStrings.commit | sharedbLib.sharedbLibStrings.connect | sharedbLib.sharedbLibStrings.doc | sharedbLib.sharedbLibStrings.op | sharedbLib.sharedbLibStrings.query | sharedbLib.sharedbLibStrings.readSnapshots | sharedbLib.sharedbLibStrings.receive | sharedbLib.sharedbLibStrings.reply | sharedbLib.sharedbLibStrings.submit,
    agent: js.Any,
    backend: sharedbLib.sharedbMod.sharedb,
    channel: java.lang.String,
    collection: java.lang.String,
    index: java.lang.String,
    options: sharedbLib.libSharedbMod.JSONObject,
    query: sharedbLib.libSharedbMod.JSONObject,
    db: sharedbLib.sharedbMod.DB = null,
    fields: sharedbLib.sharedbMod.ProjectionFields = null,
    projection: sharedbLib.sharedbMod.Projection = null,
    snapshotProjection: sharedbLib.sharedbMod.Projection = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, channel = channel, collection = collection, index = index, options = options, query = query)
    if (db != null) __obj.updateDynamic("db")(db)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (snapshotProjection != null) __obj.updateDynamic("snapshotProjection")(snapshotProjection)
    __obj.asInstanceOf[QueryContext]
  }
}


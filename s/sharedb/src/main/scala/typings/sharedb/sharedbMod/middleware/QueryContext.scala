package typings.sharedb.sharedbMod.middleware

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.sharedbMod.DB
import typings.sharedb.sharedbMod.Projection
import typings.sharedb.sharedbMod.ProjectionFields
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

trait QueryContext extends BaseContext {
  var channel: String
  var collection: String
  var db: DB | Null
  var fields: js.UndefOr[ProjectionFields] = js.undefined
  var index: String
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var projection: js.UndefOr[Projection] = js.undefined
  var query: js.Any
  var snapshotProjection: Projection | Null
}

object QueryContext {
  @scala.inline
  def apply(
    action: afterSubmit | apply | commit | connect | doc | op | query | readSnapshots | receive | reply | submit,
    agent: typings.sharedb.libAgentMod.^,
    backend: typings.sharedb.sharedbMod.sharedb,
    channel: String,
    collection: String,
    index: String,
    query: js.Any,
    db: DB = null,
    fields: ProjectionFields = null,
    options: StringDictionary[js.Any] = null,
    projection: Projection = null,
    snapshotProjection: Projection = null
  ): QueryContext = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (snapshotProjection != null) __obj.updateDynamic("snapshotProjection")(snapshotProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
}


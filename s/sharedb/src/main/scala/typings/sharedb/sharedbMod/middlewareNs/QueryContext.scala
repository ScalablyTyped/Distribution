package typings.sharedb.sharedbMod.middlewareNs

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
    agent: js.Any,
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
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], agent = agent, backend = backend, channel = channel, collection = collection, index = index, query = query)
    if (db != null) __obj.updateDynamic("db")(db)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (options != null) __obj.updateDynamic("options")(options)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (snapshotProjection != null) __obj.updateDynamic("snapshotProjection")(snapshotProjection)
    __obj.asInstanceOf[QueryContext]
  }
}


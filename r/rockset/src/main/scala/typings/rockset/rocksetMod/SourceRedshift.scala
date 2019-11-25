package typings.rockset.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRedshift extends js.Object {
  // name of the database in Redshift Cluster
  var database: String
  // field in Redshift source table to monitor for updates
  var incremental_field: js.UndefOr[String] = js.undefined
  // schema which contains the Redshift table
  var schema: String
  // name of Redshift table containing data
  var table_name: String
}

object SourceRedshift {
  @scala.inline
  def apply(database: String, schema: String, table_name: String, incremental_field: String = null): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], table_name = table_name.asInstanceOf[js.Any])
    if (incremental_field != null) __obj.updateDynamic("incremental_field")(incremental_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceRedshift]
  }
}


package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceRedshift extends js.Object {
  // name of the database in Redshift Cluster
  var database: java.lang.String
  // field in Redshift source table to monitor for updates
  var incremental_field: js.UndefOr[java.lang.String] = js.undefined
  // schema which contains the Redshift table
  var schema: java.lang.String
  // name of Redshift table containing data
  var table_name: java.lang.String
}

object SourceRedshift {
  @scala.inline
  def apply(
    database: java.lang.String,
    schema: java.lang.String,
    table_name: java.lang.String,
    incremental_field: java.lang.String = null
  ): SourceRedshift = {
    val __obj = js.Dynamic.literal(database = database, schema = schema, table_name = table_name)
    if (incremental_field != null) __obj.updateDynamic("incremental_field")(incremental_field)
    __obj.asInstanceOf[SourceRedshift]
  }
}


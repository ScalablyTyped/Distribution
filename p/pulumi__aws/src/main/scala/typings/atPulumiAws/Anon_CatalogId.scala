package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatalogId extends js.Object {
  var catalogId: String
  var databaseName: String
  var region: String
  var roleArn: String
  var tableName: String
  var versionId: js.UndefOr[String] = js.undefined
}

object Anon_CatalogId {
  @scala.inline
  def apply(
    catalogId: String,
    databaseName: String,
    region: String,
    roleArn: String,
    tableName: String,
    versionId: String = null
  ): Anon_CatalogId = {
    val __obj = js.Dynamic.literal(catalogId = catalogId, databaseName = databaseName, region = region, roleArn = roleArn, tableName = tableName)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[Anon_CatalogId]
  }
}


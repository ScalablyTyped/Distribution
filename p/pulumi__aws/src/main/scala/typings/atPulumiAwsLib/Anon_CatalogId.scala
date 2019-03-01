package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatalogId extends js.Object {
  var catalogId: java.lang.String
  var databaseName: java.lang.String
  var region: java.lang.String
  var roleArn: java.lang.String
  var tableName: java.lang.String
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CatalogId {
  @scala.inline
  def apply(
    catalogId: java.lang.String,
    databaseName: java.lang.String,
    region: java.lang.String,
    roleArn: java.lang.String,
    tableName: java.lang.String,
    versionId: java.lang.String = null
  ): Anon_CatalogId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catalogId")(catalogId)
    __obj.updateDynamic("databaseName")(databaseName)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("roleArn")(roleArn)
    __obj.updateDynamic("tableName")(tableName)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[Anon_CatalogId]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CatalogIdDatabaseName extends js.Object {
  var catalogId: js.UndefOr[Input[String]] = js.undefined
  var databaseName: Input[String]
  var region: js.UndefOr[Input[String]] = js.undefined
  var roleArn: Input[String]
  var tableName: Input[String]
  var versionId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CatalogIdDatabaseName {
  @scala.inline
  def apply(
    databaseName: Input[String],
    roleArn: Input[String],
    tableName: Input[String],
    catalogId: Input[String] = null,
    region: Input[String] = null,
    versionId: Input[String] = null
  ): Anon_CatalogIdDatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (catalogId != null) __obj.updateDynamic("catalogId")(catalogId.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CatalogIdDatabaseName]
  }
}


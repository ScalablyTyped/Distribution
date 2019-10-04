package typings.atPulumiAws.typesOutputMod.glueNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatalogTableStorageDescriptorSerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[String] = js.undefined
}

object CatalogTableStorageDescriptorSerDeInfo {
  @scala.inline
  def apply(
    name: String = null,
    parameters: StringDictionary[String] = null,
    serializationLibrary: String = null
  ): CatalogTableStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (serializationLibrary != null) __obj.updateDynamic("serializationLibrary")(serializationLibrary)
    __obj.asInstanceOf[CatalogTableStorageDescriptorSerDeInfo]
  }
}


package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[String] = js.native
}

object CatalogTableStorageDescriptorSerDeInfo {
  @scala.inline
  def apply(
    name: String = null,
    parameters: StringDictionary[String] = null,
    serializationLibrary: String = null
  ): CatalogTableStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serializationLibrary != null) __obj.updateDynamic("serializationLibrary")(serializationLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorSerDeInfo]
  }
}


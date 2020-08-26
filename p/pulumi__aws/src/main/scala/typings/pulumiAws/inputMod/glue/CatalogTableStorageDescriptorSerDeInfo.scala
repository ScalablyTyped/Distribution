package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSerDeInfo extends js.Object {
  /**
    * Name of the SerDe.
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of initialization parameters for the SerDe, in key-value form.
    */
  var parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Usually the class that implements the SerDe. An example is: org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe.
    */
  var serializationLibrary: js.UndefOr[Input[String]] = js.native
}

object CatalogTableStorageDescriptorSerDeInfo {
  @scala.inline
  def apply(): CatalogTableStorageDescriptorSerDeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogTableStorageDescriptorSerDeInfo]
  }
  @scala.inline
  implicit class CatalogTableStorageDescriptorSerDeInfoOps[Self <: CatalogTableStorageDescriptorSerDeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    @scala.inline
    def setSerializationLibrary(value: Input[String]): Self = this.set("serializationLibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerializationLibrary: Self = this.set("serializationLibrary", js.undefined)
  }
  
}


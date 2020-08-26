package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INamespace extends AnyNestedObject {
  /** Nested object descriptors */
  var nested: js.UndefOr[StringDictionary[AnyNestedObject]] = js.native
  /** Namespace options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object INamespace {
  @scala.inline
  def apply(): INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INamespace]
  }
  @scala.inline
  implicit class INamespaceOps[Self <: INamespace] (val x: Self) extends AnyVal {
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
    def setNested(value: StringDictionary[AnyNestedObject]): Self = this.set("nested", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNested: Self = this.set("nested", js.undefined)
    @scala.inline
    def setOptions(value: StringDictionary[js.Any]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}


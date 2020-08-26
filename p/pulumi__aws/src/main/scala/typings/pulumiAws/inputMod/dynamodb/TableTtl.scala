package typings.pulumiAws.inputMod.dynamodb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableTtl extends js.Object {
  /**
    * The name of the table attribute to store the TTL timestamp in.
    */
  var attributeName: Input[String] = js.native
  /**
    * Indicates whether ttl is enabled (true) or disabled (false).
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
}

object TableTtl {
  @scala.inline
  def apply(attributeName: Input[String]): TableTtl = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableTtl]
  }
  @scala.inline
  implicit class TableTtlOps[Self <: TableTtl] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: Input[String]): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
  
}


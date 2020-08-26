package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tool extends js.Object {
  /**
    * The analysis tool that was run.
    */
  var driver: ToolComponent = js.native
  /**
    * Tool extensions that contributed to or reconfigured the analysis tool that was run.
    */
  var extensions: js.UndefOr[js.Array[ToolComponent]] = js.native
  /**
    * Key/value pairs that provide additional information about the tool.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object Tool {
  @scala.inline
  def apply(driver: ToolComponent): Tool = {
    val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tool]
  }
  @scala.inline
  implicit class ToolOps[Self <: Tool] (val x: Self) extends AnyVal {
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
    def setDriver(value: ToolComponent): Self = this.set("driver", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensionsVarargs(value: ToolComponent*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[ToolComponent]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


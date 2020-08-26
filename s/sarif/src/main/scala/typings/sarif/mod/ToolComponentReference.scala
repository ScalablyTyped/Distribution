package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolComponentReference extends js.Object {
  /**
    * The 'guid' property of the referenced toolComponent.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * An index into the referenced toolComponent in tool.extensions.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * The 'name' property of the referenced toolComponent.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the toolComponentReference.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
}

object ToolComponentReference {
  @scala.inline
  def apply(): ToolComponentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolComponentReference]
  }
  @scala.inline
  implicit class ToolComponentReferenceOps[Self <: ToolComponentReference] (val x: Self) extends AnyVal {
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
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


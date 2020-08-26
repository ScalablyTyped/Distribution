package typings.pulumiAws.thingTypeMod

import typings.pulumiAws.inputMod.iot.ThingTypeProperties
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingTypeArgs extends js.Object {
  /**
    * Whether the thing type is deprecated. If true, no new things could be associated with this type.
    */
  val deprecated: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the thing type.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * , Configuration block that can contain the following properties of the thing type:
    */
  val properties: js.UndefOr[Input[ThingTypeProperties]] = js.native
}

object ThingTypeArgs {
  @scala.inline
  def apply(): ThingTypeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingTypeArgs]
  }
  @scala.inline
  implicit class ThingTypeArgsOps[Self <: ThingTypeArgs] (val x: Self) extends AnyVal {
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
    def setDeprecated(value: Input[Boolean]): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: Input[ThingTypeProperties]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
  
}


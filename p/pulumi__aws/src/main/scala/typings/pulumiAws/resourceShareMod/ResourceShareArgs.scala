package typings.pulumiAws.resourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceShareArgs extends js.Object {
  /**
    * Indicates whether principals outside your organization can be associated with a resource share.
    */
  val allowExternalPrincipals: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The name of the resource share.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource share.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ResourceShareArgs {
  @scala.inline
  def apply(): ResourceShareArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceShareArgs]
  }
  @scala.inline
  implicit class ResourceShareArgsOps[Self <: ResourceShareArgs] (val x: Self) extends AnyVal {
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
    def setAllowExternalPrincipals(value: Input[Boolean]): Self = this.set("allowExternalPrincipals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowExternalPrincipals: Self = this.set("allowExternalPrincipals", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


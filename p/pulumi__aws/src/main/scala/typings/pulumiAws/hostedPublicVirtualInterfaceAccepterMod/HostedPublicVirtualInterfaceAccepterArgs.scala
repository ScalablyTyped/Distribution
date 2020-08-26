package typings.pulumiAws.hostedPublicVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedPublicVirtualInterfaceAccepterArgs extends js.Object {
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Input[String] = js.native
}

object HostedPublicVirtualInterfaceAccepterArgs {
  @scala.inline
  def apply(virtualInterfaceId: Input[String]): HostedPublicVirtualInterfaceAccepterArgs = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterArgs]
  }
  @scala.inline
  implicit class HostedPublicVirtualInterfaceAccepterArgsOps[Self <: HostedPublicVirtualInterfaceAccepterArgs] (val x: Self) extends AnyVal {
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
    def setVirtualInterfaceId(value: Input[String]): Self = this.set("virtualInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}


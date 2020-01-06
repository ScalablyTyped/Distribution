package typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedPublicVirtualInterfaceAccepterArgs extends js.Object {
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: Input[String] = js.native
}

object HostedPublicVirtualInterfaceAccepterArgs {
  @scala.inline
  def apply(virtualInterfaceId: Input[String], tags: Input[StringDictionary[_]] = null): HostedPublicVirtualInterfaceAccepterArgs = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterArgs]
  }
}


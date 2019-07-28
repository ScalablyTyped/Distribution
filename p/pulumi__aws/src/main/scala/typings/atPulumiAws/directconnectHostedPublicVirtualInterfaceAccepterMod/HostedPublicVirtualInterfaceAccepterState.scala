package typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceAccepterMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedPublicVirtualInterfaceAccepterState extends js.Object {
  /**
    * The ARN of the virtual interface.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * The ID of the Direct Connect virtual interface to accept.
    */
  val virtualInterfaceId: js.UndefOr[Input[String]] = js.undefined
}

object HostedPublicVirtualInterfaceAccepterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualInterfaceId: Input[String] = null
  ): HostedPublicVirtualInterfaceAccepterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedPublicVirtualInterfaceAccepterState]
  }
}


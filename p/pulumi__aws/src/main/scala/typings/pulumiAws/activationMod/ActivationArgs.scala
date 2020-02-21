package typings.pulumiAws.activationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivationArgs extends js.Object {
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[Input[String]] = js.native
  val expirationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: Input[String] = js.native
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ActivationArgs {
  @scala.inline
  def apply(
    iamRole: Input[String],
    description: Input[String] = null,
    expirationDate: Input[String] = null,
    name: Input[String] = null,
    registrationLimit: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null
  ): ActivationArgs = {
    val __obj = js.Dynamic.literal(iamRole = iamRole.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (registrationLimit != null) __obj.updateDynamic("registrationLimit")(registrationLimit.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationArgs]
  }
}


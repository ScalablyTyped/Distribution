package typings.pulumiAws.activationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivationState extends js.Object {
  /**
    * The code the system generates when it processes the activation.
    */
  val activationCode: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the resource that you want to register.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A timestamp in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) by which this activation request should expire. The default value is 24 hours from resource creation time.
    */
  val expirationDate: js.UndefOr[Input[String]] = js.native
  /**
    * If the current activation has expired.
    */
  val expired: js.UndefOr[Input[String]] = js.native
  /**
    * The IAM Role to attach to the managed instance.
    */
  val iamRole: js.UndefOr[Input[String]] = js.native
  /**
    * The default name of the registered managed instance.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The number of managed instances that are currently registered using this activation.
    */
  val registrationCount: js.UndefOr[Input[Double]] = js.native
  /**
    * The maximum number of managed instances you want to register. The default value is 1 instance.
    */
  val registrationLimit: js.UndefOr[Input[Double]] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ActivationState {
  @scala.inline
  def apply(
    activationCode: Input[String] = null,
    description: Input[String] = null,
    expirationDate: Input[String] = null,
    expired: Input[String] = null,
    iamRole: Input[String] = null,
    name: Input[String] = null,
    registrationCount: Input[Double] = null,
    registrationLimit: Input[Double] = null,
    tags: Input[StringDictionary[_]] = null
  ): ActivationState = {
    val __obj = js.Dynamic.literal()
    if (activationCode != null) __obj.updateDynamic("activationCode")(activationCode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (expired != null) __obj.updateDynamic("expired")(expired.asInstanceOf[js.Any])
    if (iamRole != null) __obj.updateDynamic("iamRole")(iamRole.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (registrationCount != null) __obj.updateDynamic("registrationCount")(registrationCount.asInstanceOf[js.Any])
    if (registrationLimit != null) __obj.updateDynamic("registrationLimit")(registrationLimit.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivationState]
  }
}


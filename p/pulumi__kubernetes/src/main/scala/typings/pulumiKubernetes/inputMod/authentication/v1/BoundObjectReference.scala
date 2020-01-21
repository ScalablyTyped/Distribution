package typings.pulumiKubernetes.inputMod.authentication.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BoundObjectReference is a reference to an object that a token is bound to.
  */
trait BoundObjectReference extends js.Object {
  /**
    * API version of the referent.
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Kind of the referent. Valid kinds are 'Pod' and 'Secret'.
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the referent.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  /**
    * UID of the referent.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}

object BoundObjectReference {
  @scala.inline
  def apply(
    apiVersion: Input[String] = null,
    kind: Input[String] = null,
    name: Input[String] = null,
    uid: Input[String] = null
  ): BoundObjectReference = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundObjectReference]
  }
}


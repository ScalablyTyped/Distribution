package typings.atPulumiKubernetes.typesInputMod.meta.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preconditions must be fulfilled before an operation (update, delete, etc.) is carried out.
  */
trait Preconditions extends js.Object {
  /**
    * Specifies the target ResourceVersion
    */
  var resourceVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies the target UID.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
}

object Preconditions {
  @scala.inline
  def apply(resourceVersion: Input[String] = null, uid: Input[String] = null): Preconditions = {
    val __obj = js.Dynamic.literal()
    if (resourceVersion != null) __obj.updateDynamic("resourceVersion")(resourceVersion.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preconditions]
  }
}


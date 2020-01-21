package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Subject matches the originator of a request, as identified by the request authentication
  * system. There are three ways of matching an originator; by user, group, or service account.
  */
trait Subject extends js.Object {
  var group: js.UndefOr[Input[GroupSubject]] = js.undefined
  /**
    * Required
    */
  var kind: Input[String]
  var serviceAccount: js.UndefOr[Input[ServiceAccountSubject]] = js.undefined
  var user: js.UndefOr[Input[UserSubject]] = js.undefined
}

object Subject {
  @scala.inline
  def apply(
    kind: Input[String],
    group: Input[GroupSubject] = null,
    serviceAccount: Input[ServiceAccountSubject] = null,
    user: Input[UserSubject] = null
  ): Subject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
}


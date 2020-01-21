package typings.pulumiKubernetes.inputMod.authorization.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  */
trait SelfSubjectRulesReviewSpec extends js.Object {
  /**
    * Namespace to evaluate rules for. Required.
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
}

object SelfSubjectRulesReviewSpec {
  @scala.inline
  def apply(namespace: Input[String] = null): SelfSubjectRulesReviewSpec = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
  }
}


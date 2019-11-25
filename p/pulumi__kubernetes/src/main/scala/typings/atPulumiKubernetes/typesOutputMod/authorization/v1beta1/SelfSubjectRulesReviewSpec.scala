package typings.atPulumiKubernetes.typesOutputMod.authorization.v1beta1

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
  val namespace: String
}

object SelfSubjectRulesReviewSpec {
  @scala.inline
  def apply(namespace: String): SelfSubjectRulesReviewSpec = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
  }
}


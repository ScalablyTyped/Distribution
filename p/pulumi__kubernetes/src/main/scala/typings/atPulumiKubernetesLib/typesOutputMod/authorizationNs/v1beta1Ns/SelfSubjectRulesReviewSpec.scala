package typings
package atPulumiKubernetesLib.typesOutputMod.authorizationNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfSubjectRulesReviewSpec extends js.Object {
  /**
    * Namespace to evaluate rules for. Required.
    */
  val namespace: java.lang.String
}

object SelfSubjectRulesReviewSpec {
  @scala.inline
  def apply(namespace: java.lang.String): SelfSubjectRulesReviewSpec = {
    val __obj = js.Dynamic.literal(namespace = namespace)
  
    __obj.asInstanceOf[SelfSubjectRulesReviewSpec]
  }
}


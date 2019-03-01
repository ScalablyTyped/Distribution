package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rule extends js.Object {
  var rule: Anon_ApplyServerSideEncryptionByDefault
}

object Anon_Rule {
  @scala.inline
  def apply(rule: Anon_ApplyServerSideEncryptionByDefault): Anon_Rule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[Anon_Rule]
  }
}


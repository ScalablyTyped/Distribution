package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyAlgorithmSigningAlgorithm extends js.Object {
  var keyAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var signingAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var subject: atPulumiPulumiLib.outputMod.Input[Anon_CommonNameCountry]
}

object Anon_KeyAlgorithmSigningAlgorithm {
  @scala.inline
  def apply(
    keyAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    signingAlgorithm: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    subject: atPulumiPulumiLib.outputMod.Input[Anon_CommonNameCountry]
  ): Anon_KeyAlgorithmSigningAlgorithm = {
    val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any], signingAlgorithm = signingAlgorithm.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyAlgorithmSigningAlgorithm]
  }
}


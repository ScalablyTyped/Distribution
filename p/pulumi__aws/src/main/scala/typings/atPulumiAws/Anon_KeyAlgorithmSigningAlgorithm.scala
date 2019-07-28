package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyAlgorithmSigningAlgorithm extends js.Object {
  var keyAlgorithm: Input[String]
  var signingAlgorithm: Input[String]
  var subject: Input[Anon_CommonNameCountry]
}

object Anon_KeyAlgorithmSigningAlgorithm {
  @scala.inline
  def apply(
    keyAlgorithm: Input[String],
    signingAlgorithm: Input[String],
    subject: Input[Anon_CommonNameCountry]
  ): Anon_KeyAlgorithmSigningAlgorithm = {
    val __obj = js.Dynamic.literal(keyAlgorithm = keyAlgorithm.asInstanceOf[js.Any], signingAlgorithm = signingAlgorithm.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyAlgorithmSigningAlgorithm]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyPairId extends js.Object {
  var Signer: org.scalablytyped.runtime.Instantiable2[
    /* keyPairId */ java.lang.String, 
    /* privateKey */ java.lang.String, 
    awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Signer
  ]
  val SignerNs: js.Any
  /* tso:trivial-typeparam */ val Types: this.type
}

object Anon_KeyPairId {
  @scala.inline
  def apply(
    Signer: org.scalablytyped.runtime.Instantiable2[
      /* keyPairId */ java.lang.String, 
      /* privateKey */ java.lang.String, 
      awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Signer
    ],
    SignerNs: js.Any,
    Types: Anon_KeyPairId
  ): Anon_KeyPairId = {
    val __obj = js.Dynamic.literal(Signer = Signer, SignerNs = SignerNs, Types = Types)
  
    __obj.asInstanceOf[Anon_KeyPairId]
  }
}


package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCloudFront extends js.Object {
  var Signer: org.scalablytyped.runtime.Instantiable2[
    /* keyPairId */ java.lang.String, 
    /* privateKey */ java.lang.String, 
    awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Signer
  ]
  val SignerNs: js.Any
  val Types: this.type
}

object TypeofCloudFront {
  @scala.inline
  def apply(
    Signer: org.scalablytyped.runtime.Instantiable2[
      /* keyPairId */ java.lang.String, 
      /* privateKey */ java.lang.String, 
      awsDashSdkLib.awsDashSdkMod.CloudFrontNs.Signer
    ],
    SignerNs: js.Any,
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer, SignerNs = SignerNs, Types = Types)
  
    __obj.asInstanceOf[TypeofCloudFront]
  }
}


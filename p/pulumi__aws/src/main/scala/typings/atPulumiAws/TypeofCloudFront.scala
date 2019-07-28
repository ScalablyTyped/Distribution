package typings.atPulumiAws

import org.scalablytyped.runtime.Instantiable2
import typings.awsDashSdk.awsDashSdkMod.CloudFrontNs.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCloudFront extends js.Object {
  var Signer: Instantiable2[
    /* keyPairId */ String, 
    /* privateKey */ String, 
    typings.awsDashSdk.awsDashSdkMod.CloudFrontNs.Signer
  ]
  val SignerNs: js.Any
  val Types: this.type
}

object TypeofCloudFront {
  @scala.inline
  def apply(
    Signer: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer],
    SignerNs: js.Any,
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer, SignerNs = SignerNs, Types = Types)
  
    __obj.asInstanceOf[TypeofCloudFront]
  }
}


package typings.atPulumiAws

import org.scalablytyped.runtime.Instantiable2
import typings.awsDashSdk.awsDashSdkMod.CloudFront.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCloudFront extends js.Object {
  var Signer: js.Any | (Instantiable2[
    /* keyPairId */ String, 
    /* privateKey */ String, 
    typings.awsDashSdk.awsDashSdkMod.CloudFront.Signer
  ])
  val Types: this.type
}

object TypeofCloudFront {
  @scala.inline
  def apply(
    Signer: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer],
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer, Types = Types)
  
    __obj.asInstanceOf[TypeofCloudFront]
  }
}


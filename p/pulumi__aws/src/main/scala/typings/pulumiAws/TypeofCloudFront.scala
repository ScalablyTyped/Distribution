package typings.pulumiAws

import org.scalablytyped.runtime.Instantiable2
import typings.awsSdk.mod.CloudFront.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCloudFront extends js.Object {
  val Signer: Instantiable2[
    /* keyPairId */ String, 
    /* privateKey */ String, 
    typings.awsSdk.mod.CloudFront.Signer
  ] = js.native
  val Types: this.type = js.native
}

object TypeofCloudFront {
  @scala.inline
  def apply(
    Signer: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer],
    Types: TypeofCloudFront
  ): TypeofCloudFront = {
    val __obj = js.Dynamic.literal(Signer = Signer.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCloudFront]
  }
}


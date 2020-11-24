package typings.pulumiAws.anon

import org.scalablytyped.runtime.Instantiable2
import typings.awsSdk.mod.CloudFront.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class TypeofCloudFrontOps[Self <: TypeofCloudFront] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSigner(value: Instantiable2[/* keyPairId */ String, /* privateKey */ String, Signer]): Self = this.set("Signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: TypeofCloudFront): Self = this.set("Types", value.asInstanceOf[js.Any])
  }
}

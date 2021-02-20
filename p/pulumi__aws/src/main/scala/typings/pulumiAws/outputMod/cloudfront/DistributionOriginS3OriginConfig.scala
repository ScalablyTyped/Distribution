package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOriginS3OriginConfig extends StObject {
  
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: String = js.native
}
object DistributionOriginS3OriginConfig {
  
  @scala.inline
  def apply(originAccessIdentity: String): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
  
  @scala.inline
  implicit class DistributionOriginS3OriginConfigMutableBuilder[Self <: DistributionOriginS3OriginConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginAccessIdentity(value: String): Self = StObject.set(x, "originAccessIdentity", value.asInstanceOf[js.Any])
  }
}

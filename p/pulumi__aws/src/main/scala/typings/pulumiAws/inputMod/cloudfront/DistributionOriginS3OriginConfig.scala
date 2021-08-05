package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOriginS3OriginConfig extends StObject {
  
  /**
    * The [CloudFront origin access
    * identity][5] to associate with the origin.
    */
  var originAccessIdentity: Input[String]
}
object DistributionOriginS3OriginConfig {
  
  inline def apply(originAccessIdentity: Input[String]): DistributionOriginS3OriginConfig = {
    val __obj = js.Dynamic.literal(originAccessIdentity = originAccessIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginS3OriginConfig]
  }
  
  extension [Self <: DistributionOriginS3OriginConfig](x: Self) {
    
    inline def setOriginAccessIdentity(value: Input[String]): Self = StObject.set(x, "originAccessIdentity", value.asInstanceOf[js.Any])
  }
}

package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionOriginGroupMember extends StObject {
  
  /**
    * The unique identifier of the member origin
    */
  var originId: Input[String] = js.native
}
object DistributionOriginGroupMember {
  
  @scala.inline
  def apply(originId: Input[String]): DistributionOriginGroupMember = {
    val __obj = js.Dynamic.literal(originId = originId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOriginGroupMember]
  }
  
  @scala.inline
  implicit class DistributionOriginGroupMemberMutableBuilder[Self <: DistributionOriginGroupMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginId(value: Input[String]): Self = StObject.set(x, "originId", value.asInstanceOf[js.Any])
  }
}

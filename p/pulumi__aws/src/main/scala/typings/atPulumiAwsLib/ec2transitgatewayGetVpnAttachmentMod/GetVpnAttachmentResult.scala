package typings
package atPulumiAwsLib.ec2transitgatewayGetVpnAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpnAttachmentResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Key-value tags for the EC2 Transit Gateway VPN Attachment
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetVpnAttachmentResult {
  @scala.inline
  def apply(id: java.lang.String, tags: org.scalablytyped.runtime.StringDictionary[js.Any]): GetVpnAttachmentResult = {
    val __obj = js.Dynamic.literal(id = id, tags = tags)
  
    __obj.asInstanceOf[GetVpnAttachmentResult]
  }
}


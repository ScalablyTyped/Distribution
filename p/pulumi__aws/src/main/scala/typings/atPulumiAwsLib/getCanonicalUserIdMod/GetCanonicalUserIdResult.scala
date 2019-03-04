package typings
package atPulumiAwsLib.getCanonicalUserIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCanonicalUserIdResult extends js.Object {
  /**
    * The human-friendly name linked to the canonical user ID. The bucket owner's display name. **NOTE:** [This value](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTServiceGET.html) is only included in the response in the US East (N. Virginia), US West (N. California), US West (Oregon), Asia Pacific (Singapore), Asia Pacific (Sydney), Asia Pacific (Tokyo), EU (Ireland), and South America (São Paulo) regions.
    */
  val displayName: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetCanonicalUserIdResult {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): GetCanonicalUserIdResult = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[GetCanonicalUserIdResult]
  }
}


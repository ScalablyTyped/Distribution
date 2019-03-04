package typings
package atPulumiAwsLib.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSPrincipal extends Principal {
  var AWS: java.lang.String | js.Array[java.lang.String]
}

object AWSPrincipal {
  @scala.inline
  def apply(AWS: java.lang.String | js.Array[java.lang.String]): AWSPrincipal = {
    val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AWSPrincipal]
  }
}


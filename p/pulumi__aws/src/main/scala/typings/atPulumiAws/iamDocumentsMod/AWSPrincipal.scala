package typings.atPulumiAws.iamDocumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AWSPrincipal extends Principal {
  var AWS: String | js.Array[String]
}

object AWSPrincipal {
  @scala.inline
  def apply(AWS: String | js.Array[String]): AWSPrincipal = {
    val __obj = js.Dynamic.literal(AWS = AWS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AWSPrincipal]
  }
}


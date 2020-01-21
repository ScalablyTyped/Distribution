package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilter extends js.Object {
  var jsonPath: String = js.native
  var matchEquals: String = js.native
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: String, matchEquals: String): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookFilter]
  }
}


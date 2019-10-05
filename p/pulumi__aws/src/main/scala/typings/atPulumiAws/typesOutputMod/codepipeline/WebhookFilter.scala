package typings.atPulumiAws.typesOutputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookFilter extends js.Object {
  var jsonPath: String
  var matchEquals: String
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: String, matchEquals: String): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath, matchEquals = matchEquals)
  
    __obj.asInstanceOf[WebhookFilter]
  }
}


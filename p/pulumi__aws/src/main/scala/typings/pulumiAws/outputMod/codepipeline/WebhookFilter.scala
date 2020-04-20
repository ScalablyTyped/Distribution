package typings.pulumiAws.outputMod.codepipeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebhookFilter extends js.Object {
  /**
    * The [JSON path](https://github.com/json-path/JsonPath) to filter on.
    */
  var jsonPath: String = js.native
  /**
    * The value to match on (e.g. `refs/heads/{Branch}`). See [AWS docs](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_WebhookFilterRule.html) for details.
    */
  var matchEquals: String = js.native
}

object WebhookFilter {
  @scala.inline
  def apply(jsonPath: String, matchEquals: String): WebhookFilter = {
    val __obj = js.Dynamic.literal(jsonPath = jsonPath.asInstanceOf[js.Any], matchEquals = matchEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookFilter]
  }
}


package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverPipelineConfig extends js.Object {
  var functions: js.UndefOr[js.Array[String]] = js.native
}

object ResolverPipelineConfig {
  @scala.inline
  def apply(functions: js.Array[String] = null): ResolverPipelineConfig = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverPipelineConfig]
  }
}


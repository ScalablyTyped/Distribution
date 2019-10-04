package typings.atPulumiAws.typesInputMod.appsyncNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolverPipelineConfig extends js.Object {
  var functions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ResolverPipelineConfig {
  @scala.inline
  def apply(functions: Input[js.Array[Input[String]]] = null): ResolverPipelineConfig = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverPipelineConfig]
  }
}


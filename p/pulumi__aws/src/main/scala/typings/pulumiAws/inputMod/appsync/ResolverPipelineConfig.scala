package typings.pulumiAws.inputMod.appsync

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverPipelineConfig extends js.Object {
  /**
    * The list of Function ID.
    */
  var functions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object ResolverPipelineConfig {
  @scala.inline
  def apply(functions: Input[js.Array[Input[String]]] = null): ResolverPipelineConfig = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolverPipelineConfig]
  }
}


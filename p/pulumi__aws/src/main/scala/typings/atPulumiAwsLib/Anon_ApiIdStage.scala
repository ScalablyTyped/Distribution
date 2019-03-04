package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiIdStage extends js.Object {
  var apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var stage: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_ApiIdStage {
  @scala.inline
  def apply(
    apiId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    stage: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_ApiIdStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiIdStage]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiIdStage extends js.Object {
  var apiId: Input[String]
  var stage: Input[String]
}

object Anon_ApiIdStage {
  @scala.inline
  def apply(apiId: Input[String], stage: Input[String]): Anon_ApiIdStage = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ApiIdStage]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassificationRowTagInput extends js.Object {
  var classification: Input[String]
  var rowTag: Input[String]
}

object Anon_ClassificationRowTagInput {
  @scala.inline
  def apply(classification: Input[String], rowTag: Input[String]): Anon_ClassificationRowTagInput = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], rowTag = rowTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ClassificationRowTagInput]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsName extends js.Object {
  var actions: Input[js.Array[Input[Anon_CategoryConfiguration]]]
  var name: Input[String]
}

object Anon_ActionsName {
  @scala.inline
  def apply(actions: Input[js.Array[Input[Anon_CategoryConfiguration]]], name: Input[String]): Anon_ActionsName = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionsName]
  }
}


package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsSnsTopic extends js.Object {
  var events: Input[js.Array[Input[String]]]
  var snsTopic: Input[String]
}

object Anon_EventsSnsTopic {
  @scala.inline
  def apply(events: Input[js.Array[Input[String]]], snsTopic: Input[String]): Anon_EventsSnsTopic = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], snsTopic = snsTopic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventsSnsTopic]
  }
}


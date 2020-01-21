package typings.pulumiKubernetes.inputMod.meta.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event represents a single event to a watched resource.
  */
trait WatchEvent extends js.Object {
  /**
    * Object is:
    *  * If Type is Added or Modified: the new state of the object.
    *  * If Type is Deleted: the state of the object immediately before deletion.
    *  * If Type is Error: *Status is recommended; other types may make sense
    *    depending on context.
    */
  var `object`: Input[js.Object]
  var `type`: Input[String]
}

object WatchEvent {
  @scala.inline
  def apply(`object`: Input[js.Object], `type`: Input[String]): WatchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchEvent]
  }
}


package typings.atPulumiKubernetes.typesOutputMod.meta.v1

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
  val `object`: js.Object
  val `type`: String
}

object WatchEvent {
  @scala.inline
  def apply(`object`: js.Object, `type`: String): WatchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchEvent]
  }
}


package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

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
  val `object`: atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension
  val `type`: java.lang.String
}

object WatchEvent {
  @scala.inline
  def apply(
    `object`: atPulumiKubernetesLib.typesOutputMod.pkgNs.runtimeNs.RawExtension,
    `type`: java.lang.String
  ): WatchEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WatchEvent]
  }
}


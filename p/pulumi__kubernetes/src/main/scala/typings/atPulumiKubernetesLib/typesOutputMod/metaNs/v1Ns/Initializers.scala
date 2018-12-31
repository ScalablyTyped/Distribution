package typings
package atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializers tracks the progress of initialization.
  */
trait Initializers extends js.Object {
  /**
    * Pending is a list of initializers that must execute in order before this object is visible.
    * When the last pending initializer is removed, and no failing result is set, the
    * initializers struct will be set to nil and the object is considered as initialized and
    * visible to all clients.
    */
  val pending: js.Array[Initializer]
  /**
    * If result is set with the Failure field, the object will be persisted to storage and then
    * deleted, ensuring that other clients can observe the deletion.
    */
  val result: Status
}


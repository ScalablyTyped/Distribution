package typings.reduxDashPersist.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorState extends js.Object {
  var bootstrapped: Boolean
  var registry: js.Array[String]
}

object PersistorState {
  @scala.inline
  def apply(bootstrapped: Boolean, registry: js.Array[String]): PersistorState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PersistorState]
  }
}


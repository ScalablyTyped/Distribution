package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistorState extends js.Object {
  var bootstrapped: scala.Boolean
  var registry: js.Array[java.lang.String]
}

object PersistorState {
  @scala.inline
  def apply(bootstrapped: scala.Boolean, registry: js.Array[java.lang.String]): PersistorState = {
    val __obj = js.Dynamic.literal(bootstrapped = bootstrapped, registry = registry)
  
    __obj.asInstanceOf[PersistorState]
  }
}


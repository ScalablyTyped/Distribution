package typings.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistState extends js.Object {
  var rehydrated: Boolean
  var version: Double
}

object PersistState {
  @scala.inline
  def apply(rehydrated: Boolean, version: Double): PersistState = {
    val __obj = js.Dynamic.literal(rehydrated = rehydrated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistState]
  }
}


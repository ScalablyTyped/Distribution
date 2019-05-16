package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedId extends js.Object {
  var external: scala.Boolean
  var id: java.lang.String
  var moduleSideEffects: scala.Boolean
}

object ResolvedId {
  @scala.inline
  def apply(external: scala.Boolean, id: java.lang.String, moduleSideEffects: scala.Boolean): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external, id = id, moduleSideEffects = moduleSideEffects)
  
    __obj.asInstanceOf[ResolvedId]
  }
}


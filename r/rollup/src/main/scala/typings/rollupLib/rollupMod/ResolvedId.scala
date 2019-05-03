package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedId extends js.Object {
  var external: scala.Boolean
  var id: java.lang.String
}

object ResolvedId {
  @scala.inline
  def apply(external: scala.Boolean, id: java.lang.String): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external, id = id)
  
    __obj.asInstanceOf[ResolvedId]
  }
}


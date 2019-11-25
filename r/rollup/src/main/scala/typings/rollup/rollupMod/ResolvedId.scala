package typings.rollup.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedId extends js.Object {
  var external: Boolean
  var id: String
  var moduleSideEffects: Boolean
}

object ResolvedId {
  @scala.inline
  def apply(external: Boolean, id: String, moduleSideEffects: Boolean): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResolvedId]
  }
}


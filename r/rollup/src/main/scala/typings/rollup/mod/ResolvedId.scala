package typings.rollup.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedId extends js.Object {
  var external: Boolean
  var id: String
  var moduleSideEffects: Boolean
  var syntheticNamedExports: Boolean
}

object ResolvedId {
  @scala.inline
  def apply(external: Boolean, id: String, moduleSideEffects: Boolean, syntheticNamedExports: Boolean): ResolvedId = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleSideEffects = moduleSideEffects.asInstanceOf[js.Any], syntheticNamedExports = syntheticNamedExports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedId]
  }
}


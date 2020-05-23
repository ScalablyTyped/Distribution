package typings.snykDepGraph.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphToTreeOptions extends js.Object {
  var deduplicateWithinTopLevelDeps: Boolean
}

object GraphToTreeOptions {
  @scala.inline
  def apply(deduplicateWithinTopLevelDeps: Boolean): GraphToTreeOptions = {
    val __obj = js.Dynamic.literal(deduplicateWithinTopLevelDeps = deduplicateWithinTopLevelDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphToTreeOptions]
  }
}


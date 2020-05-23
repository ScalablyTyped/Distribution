package typings.snykComposerLockfileParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends js.Object {
  var dependencies: DepTreeDependencies
  var labels: js.UndefOr[typings.snykComposerLockfileParser.anon.Scope] = js.undefined
  var name: String
  var version: String
}

object DepTree {
  @scala.inline
  def apply(
    dependencies: DepTreeDependencies,
    name: String,
    version: String,
    labels: typings.snykComposerLockfileParser.anon.Scope = null
  ): DepTree = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}


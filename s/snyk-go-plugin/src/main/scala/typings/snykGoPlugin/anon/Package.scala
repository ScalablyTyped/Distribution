package typings.snykGoPlugin.anon

import typings.snykGoPlugin.mod.DepTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  @JSName("package")
  var _package: DepTree
  var plugin: Name
}

object Package {
  @scala.inline
  def apply(_package: DepTree, plugin: Name): Package = {
    val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Package]
  }
}


package typings.snykGoParser.typesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepTree extends js.Object {
  var dependencies: js.UndefOr[StringDictionary[DepTree]] = js.undefined
  var name: String
  var version: String
}

object DepTree {
  @scala.inline
  def apply(name: String, version: String, dependencies: StringDictionary[DepTree] = null): DepTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepTree]
  }
}


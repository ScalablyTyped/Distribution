package typings.snykDepGraph.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkg extends js.Object {
  var name: String
  var version: js.UndefOr[String] = js.undefined
}

object Pkg {
  @scala.inline
  def apply(name: String, version: String = null): Pkg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pkg]
  }
}


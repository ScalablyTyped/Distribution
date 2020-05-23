package typings.snykNodejsLockfileParser.parsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dep extends js.Object {
  var dev: js.UndefOr[Boolean] = js.undefined
  var name: String
  var version: String
}

object Dep {
  @scala.inline
  def apply(name: String, version: String, dev: js.UndefOr[Boolean] = js.undefined): Dep = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(dev)) __obj.updateDynamic("dev")(dev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dep]
  }
}


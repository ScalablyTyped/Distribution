package typings
package atStorybookAddonDashJestLib.atStorybookAddonDashJestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var filesExt: js.UndefOr[java.lang.String] = js.undefined
  var results: js.Object
}

object Options {
  @scala.inline
  def apply(results: js.Object, filesExt: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal(results = results)
    if (filesExt != null) __obj.updateDynamic("filesExt")(filesExt)
    __obj.asInstanceOf[Options]
  }
}


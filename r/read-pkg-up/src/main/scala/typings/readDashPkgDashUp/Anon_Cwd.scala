package typings.readDashPkgDashUp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  /**
  		Directory to start looking for a package.json file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.undefined
}

object Anon_Cwd {
  @scala.inline
  def apply(cwd: String = null): Anon_Cwd = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Anon_Cwd]
  }
}


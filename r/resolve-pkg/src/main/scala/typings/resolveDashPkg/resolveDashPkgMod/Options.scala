package typings.resolveDashPkg.resolveDashPkgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Directory to resolve from.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    __obj.asInstanceOf[Options]
  }
}


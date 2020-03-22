package typings.readPkgUp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cwd ? :string} & type-fest.type-fest.Except<read-pkg.read-pkg.Options, 'cwd'> */
trait Options extends js.Object {
  /**
  		Directory to start looking for a package.json file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: String = null, normalize: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


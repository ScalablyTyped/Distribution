package typings.readPkgUp.mod

import typings.readPkgUp.readPkgUpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cwd ? :string} & type-fest.type-fest.Except<read-pkg.read-pkg.NormalizeOptions, 'cwd'> */
trait NormalizeOptions extends js.Object {
  /**
  		Directory to start looking for a package.json file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.undefined
  var normalize: js.UndefOr[`true`] = js.undefined
}

object NormalizeOptions {
  @scala.inline
  def apply(cwd: String = null, normalize: `true` = null): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizeOptions]
  }
}


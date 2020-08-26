package typings.readPkgUp.mod

import typings.readPkgUp.readPkgUpBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  cwd :string | undefined} & type-fest.type-fest.Except<read-pkg.read-pkg.NormalizeOptions, 'cwd'> */
@js.native
trait NormalizeOptions extends js.Object {
  /**
  		Directory to start looking for a package.json file.
  		@default process.cwd()
  		*/
  var cwd: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[`true`] = js.native
}

object NormalizeOptions {
  @scala.inline
  def apply(): NormalizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeOptions]
  }
  @scala.inline
  implicit class NormalizeOptionsOps[Self <: NormalizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setNormalize(value: `true`): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
  }
  
}


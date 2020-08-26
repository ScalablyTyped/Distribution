package typings.rimraf.mod

import typings.glob.mod.IOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.rimraf.anon.FnCall
import typings.rimraf.anon.FnCallPathOptions
import typings.rimraf.anon.Typeofchmod
import typings.rimraf.anon.Typeoflstat
import typings.rimraf.anon.Typeofreaddir
import typings.rimraf.anon.Typeofrmdir
import typings.rimraf.anon.Typeofstat
import typings.rimraf.anon.Typeofunlink
import typings.rimraf.rimrafBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see {@link https://github.com/isaacs/rimraf/blob/79b933fb362b2c51bedfa448be848e1d7ed32d7e/README.md#options}
  */
@js.native
trait Options extends js.Object {
  var chmod: js.UndefOr[Typeofchmod] = js.native
  var chmodSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]] = js.native
  /** @default false */
  var disableGlob: js.UndefOr[Boolean] = js.native
  var emfileWait: js.UndefOr[Double] = js.native
  var glob: js.UndefOr[IOptions | `false`] = js.native
  var lstat: js.UndefOr[Typeoflstat] = js.native
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  var maxBusyTries: js.UndefOr[Double] = js.native
  var readdir: js.UndefOr[Typeofreaddir] = js.native
  var readdirSync: js.UndefOr[FnCallPathOptions] = js.native
  var rmdir: js.UndefOr[Typeofrmdir] = js.native
  var rmdirSync: js.UndefOr[FnCall] = js.native
  var stat: js.UndefOr[Typeofstat] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  var unlink: js.UndefOr[Typeofunlink] = js.native
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setChmod(value: Typeofchmod): Self = this.set("chmod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChmod: Self = this.set("chmod", js.undefined)
    @scala.inline
    def setChmodSync(value: (/* path */ PathLike, /* mode */ Mode) => Unit): Self = this.set("chmodSync", js.Any.fromFunction2(value))
    @scala.inline
    def deleteChmodSync: Self = this.set("chmodSync", js.undefined)
    @scala.inline
    def setDisableGlob(value: Boolean): Self = this.set("disableGlob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableGlob: Self = this.set("disableGlob", js.undefined)
    @scala.inline
    def setEmfileWait(value: Double): Self = this.set("emfileWait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmfileWait: Self = this.set("emfileWait", js.undefined)
    @scala.inline
    def setGlob(value: IOptions | `false`): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlob: Self = this.set("glob", js.undefined)
    @scala.inline
    def setLstat(value: Typeoflstat): Self = this.set("lstat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLstat: Self = this.set("lstat", js.undefined)
    @scala.inline
    def setLstatSync(value: /* path */ PathLike => Stats): Self = this.set("lstatSync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLstatSync: Self = this.set("lstatSync", js.undefined)
    @scala.inline
    def setMaxBusyTries(value: Double): Self = this.set("maxBusyTries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBusyTries: Self = this.set("maxBusyTries", js.undefined)
    @scala.inline
    def setReaddir(value: Typeofreaddir): Self = this.set("readdir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaddir: Self = this.set("readdir", js.undefined)
    @scala.inline
    def setReaddirSync(value: FnCallPathOptions): Self = this.set("readdirSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaddirSync: Self = this.set("readdirSync", js.undefined)
    @scala.inline
    def setRmdir(value: Typeofrmdir): Self = this.set("rmdir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRmdir: Self = this.set("rmdir", js.undefined)
    @scala.inline
    def setRmdirSync(value: FnCall): Self = this.set("rmdirSync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRmdirSync: Self = this.set("rmdirSync", js.undefined)
    @scala.inline
    def setStat(value: Typeofstat): Self = this.set("stat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStat: Self = this.set("stat", js.undefined)
    @scala.inline
    def setStatSync(value: /* path */ PathLike => Stats): Self = this.set("statSync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStatSync: Self = this.set("statSync", js.undefined)
    @scala.inline
    def setUnlink(value: Typeofunlink): Self = this.set("unlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlink: Self = this.set("unlink", js.undefined)
    @scala.inline
    def setUnlinkSync(value: /* path */ PathLike => Unit): Self = this.set("unlinkSync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnlinkSync: Self = this.set("unlinkSync", js.undefined)
  }
  
}


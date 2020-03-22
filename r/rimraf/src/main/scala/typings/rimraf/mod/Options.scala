package typings.rimraf.mod

import typings.glob.mod.IOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.rimraf.Fn0
import typings.rimraf.FnCall
import typings.rimraf.FnCallPathOptions
import typings.rimraf.Typeofchmod
import typings.rimraf.Typeoflstat
import typings.rimraf.Typeofreaddir
import typings.rimraf.Typeofrmdir
import typings.rimraf.Typeofstat
import typings.rimraf.Typeofunlink
import typings.rimraf.rimrafBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see {@link https://github.com/isaacs/rimraf/blob/79b933fb362b2c51bedfa448be848e1d7ed32d7e/README.md#options}
  */
trait Options extends js.Object {
  var chmod: js.UndefOr[Typeofchmod] = js.undefined
  var chmodSync: js.UndefOr[FnCall] = js.undefined
  /** @default false */
  var disableGlob: js.UndefOr[Boolean] = js.undefined
  var emfileWait: js.UndefOr[Double] = js.undefined
  var glob: js.UndefOr[IOptions | `false`] = js.undefined
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[Double] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var readdirSync: js.UndefOr[Fn0] = js.undefined
  var rmdir: js.UndefOr[Typeofrmdir] = js.undefined
  var rmdirSync: js.UndefOr[FnCallPathOptions] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var unlink: js.UndefOr[Typeofunlink] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chmod: Typeofchmod = null,
    chmodSync: FnCall = null,
    disableGlob: js.UndefOr[Boolean] = js.undefined,
    emfileWait: Int | Double = null,
    glob: IOptions | `false` = null,
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => Stats = null,
    maxBusyTries: Int | Double = null,
    readdir: Typeofreaddir = null,
    readdirSync: Fn0 = null,
    rmdir: Typeofrmdir = null,
    rmdirSync: FnCallPathOptions = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => Stats = null,
    unlink: Typeofunlink = null,
    unlinkSync: /* path */ PathLike => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chmod != null) __obj.updateDynamic("chmod")(chmod.asInstanceOf[js.Any])
    if (chmodSync != null) __obj.updateDynamic("chmodSync")(chmodSync.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob.asInstanceOf[js.Any])
    if (emfileWait != null) __obj.updateDynamic("emfileWait")(emfileWait.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir.asInstanceOf[js.Any])
    if (readdirSync != null) __obj.updateDynamic("readdirSync")(readdirSync.asInstanceOf[js.Any])
    if (rmdir != null) __obj.updateDynamic("rmdir")(rmdir.asInstanceOf[js.Any])
    if (rmdirSync != null) __obj.updateDynamic("rmdirSync")(rmdirSync.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1(statSync))
    if (unlink != null) __obj.updateDynamic("unlink")(unlink.asInstanceOf[js.Any])
    if (unlinkSync != null) __obj.updateDynamic("unlinkSync")(js.Any.fromFunction1(unlinkSync))
    __obj.asInstanceOf[Options]
  }
}


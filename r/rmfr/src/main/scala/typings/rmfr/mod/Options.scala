package typings.rmfr.mod

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
import typings.rmfr.rmfrBooleans.`false`
import typings.rmfr.rmfrBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rimraf.rimraf.Options & {  glob ? :rimraf.rimraf.Options['glob'] | true,   disableGlob ? :never} */
trait Options extends js.Object {
  var chmod: js.UndefOr[Typeofchmod] = js.undefined
  var chmodSync: js.UndefOr[js.Function2[/* path */ PathLike, /* mode */ Mode, Unit]] = js.undefined
  /** @default false */
  var disableGlob: js.UndefOr[Boolean] = js.undefined
  var emfileWait: js.UndefOr[Double] = js.undefined
  var glob: js.UndefOr[(IOptions | `false`) with (js.UndefOr[IOptions | `false` | `true`])] = js.undefined
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[Double] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var readdirSync: js.UndefOr[FnCallPathOptions] = js.undefined
  var rmdir: js.UndefOr[Typeofrmdir] = js.undefined
  var rmdirSync: js.UndefOr[FnCall] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var unlink: js.UndefOr[Typeofunlink] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chmod: Typeofchmod = null,
    chmodSync: (/* path */ PathLike, /* mode */ Mode) => Unit = null,
    disableGlob: js.UndefOr[Boolean] = js.undefined,
    emfileWait: js.UndefOr[Double] = js.undefined,
    glob: (IOptions | `false`) with (js.UndefOr[IOptions | `false` | `true`]) = null,
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => Stats = null,
    maxBusyTries: js.UndefOr[Double] = js.undefined,
    readdir: Typeofreaddir = null,
    readdirSync: FnCallPathOptions = null,
    rmdir: Typeofrmdir = null,
    rmdirSync: FnCall = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => Stats = null,
    unlink: Typeofunlink = null,
    unlinkSync: /* path */ PathLike => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chmod != null) __obj.updateDynamic("chmod")(chmod.asInstanceOf[js.Any])
    if (chmodSync != null) __obj.updateDynamic("chmodSync")(js.Any.fromFunction2(chmodSync))
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emfileWait)) __obj.updateDynamic("emfileWait")(emfileWait.get.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (!js.isUndefined(maxBusyTries)) __obj.updateDynamic("maxBusyTries")(maxBusyTries.get.asInstanceOf[js.Any])
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


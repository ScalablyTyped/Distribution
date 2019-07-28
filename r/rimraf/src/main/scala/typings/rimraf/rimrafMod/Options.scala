package typings.rimraf.rimrafMod

import typings.glob.globMod.IOptions
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.rimraf.Anon_Buffer
import typings.rimraf.Anon_Callback
import typings.rimraf.Fn_Buffer
import typings.rimraf.Fn_Mode
import typings.rimraf.Typeoflstat
import typings.rimraf.Typeofrmdir
import typings.rimraf.Typeofstat
import typings.rimraf.Typeofunlink
import typings.rimraf.rimrafNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chmod: js.UndefOr[Anon_Callback] = js.undefined
  var chmodSync: js.UndefOr[Fn_Mode] = js.undefined
  var disableGlob: js.UndefOr[Boolean] = js.undefined
  var emfileWait: js.UndefOr[Boolean] = js.undefined
  var glob: js.UndefOr[IOptions | `false`] = js.undefined
  var lstat: js.UndefOr[
    (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeoflstat
  ] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[Double] = js.undefined
  var readdir: js.UndefOr[Anon_Buffer] = js.undefined
  var readdirSync: js.UndefOr[Fn_Buffer] = js.undefined
  var rmdir: js.UndefOr[
    (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function1[/* err */ ErrnoException | Null, Unit], 
      Unit
    ]) with Typeofrmdir
  ] = js.undefined
  var rmdirSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
  var stat: js.UndefOr[
    (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeofstat
  ] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var unlink: js.UndefOr[
    (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function1[/* err */ ErrnoException | Null, Unit], 
      Unit
    ]) with Typeofunlink
  ] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chmod: Anon_Callback = null,
    chmodSync: Fn_Mode = null,
    disableGlob: js.UndefOr[Boolean] = js.undefined,
    emfileWait: js.UndefOr[Boolean] = js.undefined,
    glob: IOptions | `false` = null,
    lstat: (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeoflstat = null,
    lstatSync: /* path */ PathLike => Stats = null,
    maxBusyTries: Int | Double = null,
    readdir: Anon_Buffer = null,
    readdirSync: Fn_Buffer = null,
    rmdir: (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function1[/* err */ ErrnoException | Null, Unit], 
      Unit
    ]) with Typeofrmdir = null,
    rmdirSync: /* path */ PathLike => Unit = null,
    stat: (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
      Unit
    ]) with Typeofstat = null,
    statSync: /* path */ PathLike => Stats = null,
    unlink: (js.Function2[
      /* path */ PathLike, 
      /* callback */ js.Function1[/* err */ ErrnoException | Null, Unit], 
      Unit
    ]) with Typeofunlink = null,
    unlinkSync: /* path */ PathLike => Unit = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chmod != null) __obj.updateDynamic("chmod")(chmod)
    if (chmodSync != null) __obj.updateDynamic("chmodSync")(chmodSync)
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob)
    if (!js.isUndefined(emfileWait)) __obj.updateDynamic("emfileWait")(emfileWait)
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat)
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir)
    if (readdirSync != null) __obj.updateDynamic("readdirSync")(readdirSync)
    if (rmdir != null) __obj.updateDynamic("rmdir")(rmdir)
    if (rmdirSync != null) __obj.updateDynamic("rmdirSync")(js.Any.fromFunction1(rmdirSync))
    if (stat != null) __obj.updateDynamic("stat")(stat)
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1(statSync))
    if (unlink != null) __obj.updateDynamic("unlink")(unlink)
    if (unlinkSync != null) __obj.updateDynamic("unlinkSync")(js.Any.fromFunction1(unlinkSync))
    __obj.asInstanceOf[Options]
  }
}


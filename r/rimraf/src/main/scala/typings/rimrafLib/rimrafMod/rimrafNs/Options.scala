package typings
package rimrafLib.rimrafMod.rimrafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var chmod: js.UndefOr[rimrafLib.Anon_Callback] = js.undefined
  var chmodSync: js.UndefOr[rimrafLib.Anon_Mode] = js.undefined
  var disableGlob: js.UndefOr[scala.Boolean] = js.undefined
  var emfileWait: js.UndefOr[scala.Boolean] = js.undefined
  var glob: js.UndefOr[globLib.globMod.GNs.IOptions | rimrafLib.rimrafLibNumbers.`false`] = js.undefined
  var lstat: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Anon_PathPromisify
  ] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[scala.Double] = js.undefined
  var readdir: js.UndefOr[rimrafLib.Anon_Buffer] = js.undefined
  var readdirSync: js.UndefOr[rimrafLib.Anon_BufferOptions] = js.undefined
  var rmdir: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Anon_Path
  ] = js.undefined
  var rmdirSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
  var stat: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException, 
        /* stats */ nodeLib.fsMod.Stats, 
        scala.Unit
      ], 
      scala.Unit
    ]) with rimrafLib.Anon_PathPromisify
  ] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var unlink: js.UndefOr[
    (js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* callback */ js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException, scala.Unit], 
      scala.Unit
    ]) with rimrafLib.Anon_Path
  ] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
}


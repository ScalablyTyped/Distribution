package typings
package rimrafLib.rimrafMod.rimrafNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var chmod: js.UndefOr[rimrafLib.Anon_PromisifyPathMode] = js.undefined
  var chmodSync: js.UndefOr[
    js.Function2[/* path */ nodeLib.fsMod.PathLike, /* mode */ scala.Double, scala.Unit]
  ] = js.undefined
  var disableGlob: js.UndefOr[scala.Boolean] = js.undefined
  var emfileWait: js.UndefOr[scala.Boolean] = js.undefined
  var glob: js.UndefOr[globLib.globMod.GNs.IOptions | rimrafLib.rimrafLibNumbers.`false`] = js.undefined
  var lstat: js.UndefOr[rimrafLib.Anon_PromisifyPath] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[scala.Double] = js.undefined
  var readdir: js.UndefOr[rimrafLib.Anon_PromisifyPathOptions] = js.undefined
  var readdirSync: js.UndefOr[
    js.Function2[
      /* path */ nodeLib.fsMod.PathLike, 
      /* options */ nodeLib.Anon_WithFileTypesTrue, 
      js.Array[nodeLib.fsMod.Dirent]
    ]
  ] = js.undefined
  var rmdir: js.UndefOr[rimrafLib.Anon_Promisify] = js.undefined
  var rmdirSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
  var stat: js.UndefOr[rimrafLib.Anon_PromisifyPath] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats]] = js.undefined
  var unlink: js.UndefOr[rimrafLib.Anon_Promisify] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ nodeLib.fsMod.PathLike, scala.Unit]] = js.undefined
}


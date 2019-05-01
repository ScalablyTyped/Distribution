package typings
package resolveLib.resolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isCore: js.Function1[/* id */ java.lang.String, js.UndefOr[scala.Boolean]] = js.native
  var sync: js.Function2[/* id */ java.lang.String, /* opts */ js.UndefOr[SyncOpts], java.lang.String] = js.native
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param callback
    */
  def apply(id: java.lang.String, cb: resolveCallback): scala.Unit = js.native
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  def apply(id: java.lang.String, opts: AsyncOpts, cb: resolveCallback): scala.Unit = js.native
}


package typings.resolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var isCore: js.Function1[/* id */ String, js.UndefOr[Boolean]] = js.native
  var sync: js.Function2[/* id */ String, /* opts */ js.UndefOr[SyncOpts], String] = js.native
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param callback
    */
  def apply(id: String, cb: resolveCallback): Unit = js.native
  /**
    * Asynchronously resolve the module path string id into cb(err, res [, pkg]), where pkg (if defined) is the data from package.json
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  def apply(id: String, opts: AsyncOpts, cb: resolveCallback): Unit = js.native
}


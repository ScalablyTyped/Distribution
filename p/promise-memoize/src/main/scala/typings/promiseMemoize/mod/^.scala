package typings.promiseMemoize.mod

import typings.promiseMemoize.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-memoize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Thenable[_]] */](fn: T): T with Clear = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, js.Thenable[_]] */](fn: T, options: Options): T with Clear = js.native
}

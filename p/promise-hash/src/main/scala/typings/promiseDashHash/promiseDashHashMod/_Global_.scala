package typings.promiseDashHash.promiseDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait PromiseConstructor extends js.Object {
    @JSName("hash")
    var hash_Original: PromiseHash = js.native
    def hash[T](
      promiseHash: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]: std.PromiseLike<T[P]> | T[P]}
      */ typings.promiseDashHash.promiseDashHashStrings.PromiseConstructor with js.Any
    ): js.Promise[T] = js.native
  }
  
}


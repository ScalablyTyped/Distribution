package typings.promiseDashHash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object promiseDashHashMod {
  type PromiseHash = js.Function1[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof any ]: std.PromiseLike<any[P]> | any[P]}
    */ /* promiseHash */ typings.promiseDashHash.promiseDashHashStrings.PromiseHash with js.Any, 
    js.Promise[js.Any]
  ]
}

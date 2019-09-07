package typings.pullDashStream

import typings.pullDashStream.pullDashStreamMod.Through
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/throughs/async-map", JSImport.Namespace)
@js.native
object throughsAsyncDashMapMod extends js.Object {
  /**
    * Like `map` but the signature of `fn` must be `function (data, cb) { cb(null, data) }`.
    */
  def apply[In, Out](
    fn: js.Function2[
      /* data */ In, 
      /* cb */ js.Function2[/* err */ Error | Null, /* result */ Out, Unit], 
      _
    ]
  ): Through[In, Out] = js.native
}


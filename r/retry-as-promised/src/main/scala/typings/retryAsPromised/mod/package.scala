package typings.retryAsPromised

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MatchOption = java.lang.String | typings.std.RegExp | typings.std.Error
  type RetryAsPromisedStatic = js.Function2[
    /* callback */ typings.retryAsPromised.mod.RetryCallback[js.Any], 
    /* options */ typings.retryAsPromised.mod.Options | scala.Double, 
    typings.bluebird.mod.^[js.Any]
  ]
  type RetryCallback[T] = js.Function1[
    /* hasCurrent */ typings.retryAsPromised.anon.Current, 
    typings.bluebird.mod.Thenable[T]
  ]
}

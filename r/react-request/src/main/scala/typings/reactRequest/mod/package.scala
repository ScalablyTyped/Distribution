package typings.reactRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DoFetch[T] = js.Function1[
    /* options */ js.UndefOr[typings.reactRequest.mod.DoFetchOptions], 
    js.Promise[typings.reactRequest.mod.FetchResponse[T]]
  ]
}

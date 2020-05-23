package typings.qIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QioHTTP {
  type Application = js.Function1[/* req */ typings.qIo.QioHTTP.Request, typings.q.mod.Promise[js.Any]]
  type Body = typings.qIo.Qio.Stream
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}

package typings.qDashIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QioHTTPNs {
  import org.scalablytyped.runtime.StringDictionary
  import typings.q.qMod.Promise
  import typings.qDashIo.QioNs.Stream

  type Application = js.Function1[/* req */ Request, Promise[js.Any]]
  type Body = Stream
  type Headers = StringDictionary[js.Any]
}

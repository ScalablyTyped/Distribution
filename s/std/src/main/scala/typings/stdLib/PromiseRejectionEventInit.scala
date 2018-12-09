package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PromiseRejectionEventInit extends EventInit {
  var promise: js.Promise[_]
  var reason: js.UndefOr[js.Any] = js.undefined
}


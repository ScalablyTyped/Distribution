package typings.spex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// PromiseAdapter class;
// API: http://vitaly-t.github.io/spex/PromiseAdapter.html
@JSImport("spex", "PromiseAdapter")
@js.native
class PromiseAdapter protected () extends js.Object {
  def this(
    create: js.Function1[/* cb */ js.Any, js.Object],
    resolve: js.Function1[/* data */ js.Any, Unit],
    reject: js.Function1[/* reason */ js.Any, Unit]
  ) = this()
}


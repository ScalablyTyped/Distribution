package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnderlyingSink[W] extends js.Object {
  var abort: js.UndefOr[WritableStreamErrorCallback] = js.undefined
  var close: js.UndefOr[WritableStreamDefaultControllerCloseCallback] = js.undefined
  var start: js.UndefOr[WritableStreamDefaultControllerStartCallback] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
  var write: js.UndefOr[WritableStreamDefaultControllerWriteCallback[W]] = js.undefined
}


package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UnderlyingSource[R] extends js.Object {
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}


package typings
package atProtobufjsFetchLib.fetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options as used by {@link util.fetch}.
  * @typedef FetchOptions
  * @type {Object}
  * @property {boolean} [binary=false] Whether expecting a binary response
  * @property {boolean} [xhr=false] If `true`, forces the use of XMLHttpRequest
  */
trait FetchOptions extends js.Object {
  var binary: js.UndefOr[scala.Boolean] = js.undefined
  var xhr: js.UndefOr[scala.Boolean] = js.undefined
}


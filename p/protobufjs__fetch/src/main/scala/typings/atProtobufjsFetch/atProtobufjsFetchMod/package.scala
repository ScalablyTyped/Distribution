package typings.atProtobufjsFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atProtobufjsFetchMod {
  import typings.std.Error

  /**
    * Node-style callback as used by {@link util.fetch}.
    * @typedef FetchCallback
    * @type {function}
    * @param {?Error} error Error, if any, otherwise `null`
    * @param {string} [contents] File contents, if there hasn't been an error
    * @returns {undefined}
    */
  type FetchCallback = js.Function2[/* error */ Error, /* contents */ js.UndefOr[String], Unit]
}

package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atProtobufjsFetchLib {
  /**
    * Node-style callback as used by {@link util.fetch}.
    * @typedef FetchCallback
    * @type {function}
    * @param {?Error} error Error, if any, otherwise `null`
    * @param {string} [contents] File contents, if there hasn't been an error
    * @returns {undefined}
    */
  type FetchCallback = js.Function2[/* error */ stdLib.Error, /* contents */ js.UndefOr[java.lang.String], scala.Unit]
}

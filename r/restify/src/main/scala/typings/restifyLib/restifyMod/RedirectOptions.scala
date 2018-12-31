package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectOptions extends js.Object {
  /**
    * redirect location's hostname
    */
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if true, `options.query`
    * stomps over any existing query
    * parameters on current URL.
    * by default, will merge the two.
    */
  var overrideQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * redirect location's pathname
    */
  var pathname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * if true, sets 301. defaults to 302.
    */
  var permanent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * redirect location's port number
    */
  var port: js.UndefOr[java.lang.String] = js.undefined
  /**
    * redirect location's query string parameters
    */
  var query: js.UndefOr[java.lang.String | js.Object] = js.undefined
  /**
    * whether to redirect to http or https
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}


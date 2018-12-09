package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Net extends js.Object {
  /**
       * Get cookie according to the given url.
       * @param  domain Domain of the cookies to be removed, remove all
       * @return     Cookies of a specific domain.
       */
  def getCookies(domain: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Remove cookies for a specific domain
       * @param  domain Domain of the cookies to be removed, remove all
       * cookies when this is null.
       */
  def removeCookies(): js.Promise[scala.Null] = js.native
  /**
       * Remove cookies for a specific domain
       * @param  domain Domain of the cookies to be removed, remove all
       * cookies when this is null.
       */
  def removeCookies(domain: java.lang.String): js.Promise[scala.Null] = js.native
}


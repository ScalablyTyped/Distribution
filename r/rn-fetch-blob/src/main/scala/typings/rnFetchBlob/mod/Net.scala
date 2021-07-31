package typings.rnFetchBlob.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Net extends StObject {
  
  /**
    * Get cookie according to the given url.
    * @param  domain Domain of the cookies to be removed, remove all
    * @return     Cookies of a specific domain.
    */
  def getCookies(domain: String): js.Promise[js.Array[String]] = js.native
  
  /**
    * Remove cookies for a specific domain
    * @param  domain Domain of the cookies to be removed, remove all
    * cookies when this is null.
    */
  def removeCookies(): js.Promise[Null] = js.native
  def removeCookies(domain: String): js.Promise[Null] = js.native
}

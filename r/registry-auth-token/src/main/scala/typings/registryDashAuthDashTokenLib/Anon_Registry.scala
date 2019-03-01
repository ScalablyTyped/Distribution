package typings
package registryDashAuthDashTokenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Registry
  extends /**
  * Registry url's with token information
  */
/* registryUrls */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] {
  /**
    * A registry url used for matching
    */
  var registry: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Registry {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Registry url's with token information
    */
  /* registryUrls */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]] = null,
    registry: java.lang.String = null
  ): Anon_Registry = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Anon_Registry]
  }
}


package typings.registryDashAuthDashToken

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Registry
  extends /**
  * Registry url's with token information
  */
/* registryUrls */ StringDictionary[js.UndefOr[String]] {
  /**
    * A registry url used for matching
    */
  var registry: js.UndefOr[String] = js.undefined
}

object Anon_Registry {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Registry url's with token information
    */
  /* registryUrls */ StringDictionary[js.UndefOr[String]] = null,
    registry: String = null
  ): Anon_Registry = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (registry != null) __obj.updateDynamic("registry")(registry)
    __obj.asInstanceOf[Anon_Registry]
  }
}


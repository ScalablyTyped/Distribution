package typings
package purlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /** 
    * extract the URL from the selected element and parse that - will work on any element with a `src`, `href` or `action` attribute.
    */
  def url(): purlLib.purlMod.purlNs.Url
}

object JQuery {
  @scala.inline
  def apply(url: js.Function0[purlLib.purlMod.purlNs.Url]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[JQuery]
  }
}


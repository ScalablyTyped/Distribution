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


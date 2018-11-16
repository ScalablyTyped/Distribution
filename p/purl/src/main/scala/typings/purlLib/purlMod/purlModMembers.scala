package typings
package purlLib.purlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("purl", JSImport.Namespace)
@js.native
object purlModMembers extends js.Object {
  /**
   * Parse the current page URL
   */
  def apply(): purlLib.purlMod.purlNs.Url = js.native
  /**
   * Pass in a URI as a string and parse that
   *
   * @param someUrl the url to be parsed
   */
  def apply(someUrl: java.lang.String): purlLib.purlMod.purlNs.Url = js.native
}


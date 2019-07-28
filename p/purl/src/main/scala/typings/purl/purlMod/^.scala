package typings.purl.purlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("purl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Parse the current page URL
    */
  def apply(): Url = js.native
  /**
    * Pass in a URI as a string and parse that
    *
    * @param someUrl the url to be parsed
    */
  def apply(someUrl: String): Url = js.native
}


package typings
package purlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * Parse the current page URL 
    */
  def url(): purlLib.purlMod.Url = js.native
  /** 
    * Pass in a URI as a string and parse that 
    * 
    * @param someUrl the url to be parsed
    */
  def url(someUrl: java.lang.String): purlLib.purlMod.Url = js.native
}


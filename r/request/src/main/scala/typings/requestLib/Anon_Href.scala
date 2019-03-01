package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: java.lang.String
  var pathname: java.lang.String
}

object Anon_Href {
  @scala.inline
  def apply(href: java.lang.String, pathname: java.lang.String): Anon_Href = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[Anon_Href]
  }
}


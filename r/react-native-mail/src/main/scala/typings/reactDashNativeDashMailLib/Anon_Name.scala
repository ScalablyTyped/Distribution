package typings
package reactDashNativeDashMailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
    * Optional: Custom filename for attachment
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The absolute path of the file from which to read data.
    */
  var path: java.lang.String
  /**
    * Mime Type: jpg, png, doc, ppt, html, pdf, csv
    */
  var `type`: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(path: java.lang.String, `type`: java.lang.String, name: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}


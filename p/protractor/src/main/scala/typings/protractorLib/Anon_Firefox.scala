package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Firefox extends js.Object {
  var firefox: js.Any
  var http: js.Any
  var remote: js.Any
}

object Anon_Firefox {
  @scala.inline
  def apply(firefox: js.Any, http: js.Any, remote: js.Any): Anon_Firefox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("firefox")(firefox)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("remote")(remote)
    __obj.asInstanceOf[Anon_Firefox]
  }
}


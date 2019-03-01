package typings
package reactDashYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTarget extends js.Object {
  var data: java.lang.String
  var target: js.Any
}

object Anon_DataTarget {
  @scala.inline
  def apply(data: java.lang.String, target: js.Any): Anon_DataTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_DataTarget]
  }
}


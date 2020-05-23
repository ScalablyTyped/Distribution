package typings.reactNativeMaterialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var icon: String
  var labels: js.Array[String]
}

object Labels {
  @scala.inline
  def apply(icon: String, labels: js.Array[String]): Labels = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}


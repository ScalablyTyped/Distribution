package typings.reactSizeme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  val height: Double | Null
  val width: Double | Null
}

object Height {
  @scala.inline
  def apply(height: Double = null.asInstanceOf[Double], width: Double = null.asInstanceOf[Double]): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}


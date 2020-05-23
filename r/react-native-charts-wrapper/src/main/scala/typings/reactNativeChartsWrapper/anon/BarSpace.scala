package typings.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarSpace extends js.Object {
  var barSpace: Double
  var fromX: Double
  var groupSpace: Double
}

object BarSpace {
  @scala.inline
  def apply(barSpace: Double, fromX: Double, groupSpace: Double): BarSpace = {
    val __obj = js.Dynamic.literal(barSpace = barSpace.asInstanceOf[js.Any], fromX = fromX.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSpace]
  }
}


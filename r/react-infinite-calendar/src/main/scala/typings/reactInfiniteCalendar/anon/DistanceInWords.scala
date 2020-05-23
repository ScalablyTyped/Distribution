package typings.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistanceInWords extends js.Object {
  def distanceInWords(token: js.Any, count: js.Any, options: js.Any): js.Any
  def format(): js.Any
}

object DistanceInWords {
  @scala.inline
  def apply(distanceInWords: (js.Any, js.Any, js.Any) => js.Any, format: () => js.Any): DistanceInWords = {
    val __obj = js.Dynamic.literal(distanceInWords = js.Any.fromFunction3(distanceInWords), format = js.Any.fromFunction0(format))
    __obj.asInstanceOf[DistanceInWords]
  }
}


package typings.rxLiteJoinpatterns.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableStatic extends js.Object {
  def when[TR](plan: Plan[TR]): Observable[TR]
}

object ObservableStatic {
  @scala.inline
  def apply(when: Plan[js.Any] => Observable[js.Any]): ObservableStatic = {
    val __obj = js.Dynamic.literal(when = js.Any.fromFunction1(when))
    __obj.asInstanceOf[ObservableStatic]
  }
}


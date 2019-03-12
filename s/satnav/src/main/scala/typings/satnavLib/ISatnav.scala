package typings
package satnavLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISatnav extends js.Object {
  def change(onChange: js.Function3[/* hash */ java.lang.String, /* params */ js.Any, /* old */ js.Any, _]): ISatnav
  def go(): ISatnav
  def navigate(navigationOptions: INavigationOptions): ISatnav
  def otherwise(route: java.lang.String): ISatnav
}

object ISatnav {
  @scala.inline
  def apply(
    change: js.Function3[/* hash */ java.lang.String, /* params */ js.Any, /* old */ js.Any, _] => ISatnav,
    go: () => ISatnav,
    navigate: INavigationOptions => ISatnav,
    otherwise: java.lang.String => ISatnav
  ): ISatnav = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction1(change), go = js.Any.fromFunction0(go), navigate = js.Any.fromFunction1(navigate), otherwise = js.Any.fromFunction1(otherwise))
  
    __obj.asInstanceOf[ISatnav]
  }
}


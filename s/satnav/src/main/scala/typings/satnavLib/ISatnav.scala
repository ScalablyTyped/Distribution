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
    change: js.Function1[
      js.Function3[/* hash */ java.lang.String, /* params */ js.Any, /* old */ js.Any, _], 
      ISatnav
    ],
    go: js.Function0[ISatnav],
    navigate: js.Function1[INavigationOptions, ISatnav],
    otherwise: js.Function1[java.lang.String, ISatnav]
  ): ISatnav = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("go")(go)
    __obj.updateDynamic("navigate")(navigate)
    __obj.updateDynamic("otherwise")(otherwise)
    __obj.asInstanceOf[ISatnav]
  }
}


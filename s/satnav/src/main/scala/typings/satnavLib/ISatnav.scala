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


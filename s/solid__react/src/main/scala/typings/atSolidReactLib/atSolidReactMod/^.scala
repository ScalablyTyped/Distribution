package typings
package atSolidReactLib.atSolidReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@solid/react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def useLDflex(expression: java.lang.String): js.Tuple3[LDflexValue, scala.Boolean, js.UndefOr[stdLib.Error]] = js.native
  def useLDflex(expression: java.lang.String, listMode: atSolidReactLib.atSolidReactLibNumbers.`false`): js.Tuple3[LDflexValue, scala.Boolean, js.UndefOr[stdLib.Error]] = js.native
  def useLDflex(expression: java.lang.String, listMode: atSolidReactLib.atSolidReactLibNumbers.`true`): js.Tuple3[js.Array[LDflexValue], scala.Boolean, js.UndefOr[stdLib.Error]] = js.native
  def useLDflexList(expression: java.lang.String): js.Array[LDflexValue] = js.native
  def useLDflexValue(expression: java.lang.String): js.UndefOr[LDflexValue] = js.native
  def useLoggedIn(): js.UndefOr[scala.Boolean] = js.native
  def useLoggedOut(): js.UndefOr[scala.Boolean] = js.native
  def useWebId(): js.UndefOr[java.lang.String | scala.Null] = js.native
}


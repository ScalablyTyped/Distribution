package typings.atSolidReact.atSolidReactMod

import typings.atSolidReact.atSolidReactNumbers.`false`
import typings.atSolidReact.atSolidReactNumbers.`true`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@solid/react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def useLDflex(expression: String): js.Tuple3[LDflexValue, Boolean, js.UndefOr[Error]] = js.native
  def useLDflexList(expression: String): js.Array[LDflexValue] = js.native
  def useLDflexValue(expression: String): js.UndefOr[LDflexValue] = js.native
  @JSName("useLDflex")
  def useLDflex_false(expression: String, listMode: `false`): js.Tuple3[LDflexValue, Boolean, js.UndefOr[Error]] = js.native
  @JSName("useLDflex")
  def useLDflex_true(expression: String, listMode: `true`): js.Tuple3[js.Array[LDflexValue], Boolean, js.UndefOr[Error]] = js.native
  def useLoggedIn(): js.UndefOr[Boolean] = js.native
  def useLoggedOut(): js.UndefOr[Boolean] = js.native
  def useWebId(): js.UndefOr[String | Null] = js.native
}


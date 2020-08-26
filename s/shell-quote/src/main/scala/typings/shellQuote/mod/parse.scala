package typings.shellQuote.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", "parse")
@js.native
object parse extends js.Object {
  def apply(cmd: String): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: js.UndefOr[scala.Nothing], opts: ParseOptions): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: StringDictionary[js.UndefOr[String]]): js.Array[ParseEntry] = js.native
  def apply(cmd: String, env: StringDictionary[js.UndefOr[String]], opts: ParseOptions): js.Array[ParseEntry] = js.native
  def apply[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]]): js.Array[ParseEntry | T] = js.native
  def apply[T /* <: js.Object | String */](cmd: String, env: js.Function1[/* key */ String, js.UndefOr[T]], opts: ParseOptions): js.Array[ParseEntry | T] = js.native
}


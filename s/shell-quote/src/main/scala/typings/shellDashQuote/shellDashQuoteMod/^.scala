package typings.shellDashQuote.shellDashQuoteMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(cmd: String): js.Array[ParseEntry] = js.native
  def parse(cmd: String, env: js.Function1[/* key */ String, String | js.Object]): js.Array[ParseEntry] = js.native
  def parse(
    cmd: String,
    env: js.Function1[/* key */ String, String | js.Object],
    opts: StringDictionary[String]
  ): js.Array[ParseEntry] = js.native
  def parse(cmd: String, env: StringDictionary[String]): js.Array[ParseEntry] = js.native
  def parse(cmd: String, env: StringDictionary[String], opts: StringDictionary[String]): js.Array[ParseEntry] = js.native
  def quote(args: js.Array[String]): String = js.native
}


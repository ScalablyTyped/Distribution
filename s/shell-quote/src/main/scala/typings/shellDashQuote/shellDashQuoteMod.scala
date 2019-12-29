package typings.shellDashQuote

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", JSImport.Namespace)
@js.native
object shellDashQuoteMod extends js.Object {
  trait _ParseEntry extends js.Object
  
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
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.shellDashQuote.Anon_Op
    - typings.shellDashQuote.Anon_Glob
    - typings.shellDashQuote.Anon_Comment
  */
  type ParseEntry = _ParseEntry | String
}


package typings
package shellDashQuoteLib.shellDashQuoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(cmd: java.lang.String): js.Array[ParseEntry] = js.native
  def parse(cmd: java.lang.String, env: js.Function1[/* key */ java.lang.String, java.lang.String | js.Object]): js.Array[ParseEntry] = js.native
  def parse(
    cmd: java.lang.String,
    env: js.Function1[/* key */ java.lang.String, java.lang.String | js.Object],
    opts: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Array[ParseEntry] = js.native
  def parse(cmd: java.lang.String, env: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Array[ParseEntry] = js.native
  def parse(
    cmd: java.lang.String,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    opts: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Array[ParseEntry] = js.native
  def quote(args: js.Array[java.lang.String]): java.lang.String = js.native
}


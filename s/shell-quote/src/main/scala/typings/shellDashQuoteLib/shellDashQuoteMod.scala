package typings
package shellDashQuoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shell-quote", JSImport.Namespace)
@js.native
object shellDashQuoteMod extends js.Object {
  def parse(cmd: java.lang.String): js.Array[java.lang.String] = js.native
  def parse(cmd: java.lang.String, env: ScalablyTyped.runtime.StringDictionary[java.lang.String]): js.Array[java.lang.String] = js.native
  def parse(
    cmd: java.lang.String,
    env: ScalablyTyped.runtime.StringDictionary[java.lang.String],
    opts: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def parse(cmd: java.lang.String, env: js.Function1[/* key */ java.lang.String, java.lang.String | js.Object]): js.Array[java.lang.String] = js.native
  def parse(
    cmd: java.lang.String,
    env: js.Function1[/* key */ java.lang.String, java.lang.String | js.Object],
    opts: ScalablyTyped.runtime.StringDictionary[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def quote(args: js.Array[java.lang.String]): java.lang.String = js.native
}


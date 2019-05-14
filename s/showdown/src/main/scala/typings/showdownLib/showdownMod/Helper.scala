package typings
package showdownLib.showdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * Helper Interface 
  */
trait Helper
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]] {
  def replaceRecursiveRegExp(args: js.Any*): java.lang.String
}

object Helper {
  @scala.inline
  def apply(
    replaceRecursiveRegExp: /* repeated */ js.Any => java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null
  ): Helper = {
    val __obj = js.Dynamic.literal(replaceRecursiveRegExp = js.Any.fromFunction1(replaceRecursiveRegExp))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Helper]
  }
}


package typings
package recaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exceptions extends js.Object {
  var exceptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object Anon_Exceptions {
  @scala.inline
  def apply(exceptions: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): Anon_Exceptions = {
    val __obj = js.Dynamic.literal()
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    __obj.asInstanceOf[Anon_Exceptions]
  }
}


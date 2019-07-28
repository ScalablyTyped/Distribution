package typings.recase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exceptions extends js.Object {
  var exceptions: js.UndefOr[StringDictionary[String]] = js.undefined
}

object Anon_Exceptions {
  @scala.inline
  def apply(exceptions: StringDictionary[String] = null): Anon_Exceptions = {
    val __obj = js.Dynamic.literal()
    if (exceptions != null) __obj.updateDynamic("exceptions")(exceptions)
    __obj.asInstanceOf[Anon_Exceptions]
  }
}


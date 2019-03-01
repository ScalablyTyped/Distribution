package typings
package settingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Common
  extends  // error is thrown if 'common' object is not provided
/* envName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var common: js.Any
  var forceEnv: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Common {
  @scala.inline
  def apply(
    common: js.Any,
    StringDictionary:  // error is thrown if 'common' object is not provided
  /* envName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    forceEnv: java.lang.String = null
  ): Anon_Common = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("common")(common)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (forceEnv != null) __obj.updateDynamic("forceEnv")(forceEnv)
    __obj.asInstanceOf[Anon_Common]
  }
}


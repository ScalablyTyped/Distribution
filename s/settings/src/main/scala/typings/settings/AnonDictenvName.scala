package typings.settings

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictenvName
  extends  // error is thrown if 'common' object is not provided
/* envName */ StringDictionary[js.Any] {
  var common: js.Any
  var forceEnv: js.UndefOr[String] = js.undefined
}

object AnonDictenvName {
  @scala.inline
  def apply(
    common: js.Any,
    StringDictionary:  // error is thrown if 'common' object is not provided
  /* envName */ StringDictionary[js.Any] = null,
    forceEnv: String = null
  ): AnonDictenvName = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (forceEnv != null) __obj.updateDynamic("forceEnv")(forceEnv.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictenvName]
  }
}


package typings.roarr.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageContextType
  extends /* k */ StringDictionary[js.Any] {
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  var application: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
}

object MessageContextType {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    _package: String = null,
    application: String = null,
    logLevel: js.UndefOr[Double] = js.undefined,
    namespace: String = null
  ): MessageContextType = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (!js.isUndefined(logLevel)) __obj.updateDynamic("logLevel")(logLevel.get.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageContextType]
  }
}


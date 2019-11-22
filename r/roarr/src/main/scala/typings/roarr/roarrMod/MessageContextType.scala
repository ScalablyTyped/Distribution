package typings.roarr.roarrMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageContextType
  extends /* k */ StringDictionary[js.Any] {
  var application: js.UndefOr[String] = js.undefined
  var logLevel: js.UndefOr[Double] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var `package`: js.UndefOr[String] = js.undefined
}

object MessageContextType {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.Any] = null,
    application: String = null,
    logLevel: Int | Double = null,
    namespace: String = null,
    `package`: String = null
  ): MessageContextType = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (application != null) __obj.updateDynamic("application")(application)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[MessageContextType]
  }
}


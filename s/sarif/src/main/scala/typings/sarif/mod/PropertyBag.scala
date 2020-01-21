package typings.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyBag
  extends /**
  * Additional Properties
  */
/* key */ StringDictionary[js.Any] {
  /**
    * A set of distinct strings that provide additional information.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}

object PropertyBag {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional Properties
    */
  /* key */ StringDictionary[js.Any] = null,
    tags: js.Array[String] = null
  ): PropertyBag = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyBag]
  }
}


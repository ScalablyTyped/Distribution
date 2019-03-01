package typings
package sarifLib.sarifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyBag
  extends /**
  * Additional Properties
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * A set of distinct strings that provide additional information.
    */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PropertyBag {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Additional Properties
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    tags: js.Array[java.lang.String] = null
  ): PropertyBag = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[PropertyBag]
  }
}


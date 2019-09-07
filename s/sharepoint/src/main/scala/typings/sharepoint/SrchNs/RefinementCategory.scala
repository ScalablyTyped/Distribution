package typings.sharepoint.SrchNs

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.sharepointStrings.AND
import typings.sharepoint.sharepointStrings.OR
import typings.sharepoint.sharepointStrings.and
import typings.sharepoint.sharepointStrings.or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefinementCategory extends js.Object {
  /** Use KQL */
  var k: Boolean
  /**  token to display value map */
  var m: StringDictionary[String] | Null
  /** Refiner Name (Mapped property) */
  var n: String
  var o: String | and | or | AND | OR
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String]
}

object RefinementCategory {
  @scala.inline
  def apply(
    k: Boolean,
    n: String,
    o: String | and | or | AND | OR,
    t: js.Array[String],
    m: StringDictionary[String] = null
  ): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k, n = n, o = o.asInstanceOf[js.Any], t = t)
    if (m != null) __obj.updateDynamic("m")(m)
    __obj.asInstanceOf[RefinementCategory]
  }
}


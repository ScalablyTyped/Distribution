package typings.sharepoint.Srch

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.sharepointStrings.AND
import typings.sharepoint.sharepointStrings.OR
import typings.sharepoint.sharepointStrings.and_
import typings.sharepoint.sharepointStrings.or_
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
  var o: String | and_ | or_ | AND | OR
  /** Values, prefixed by ǂǂ for taxonomy terms */
  var t: js.Array[String]
}

object RefinementCategory {
  @scala.inline
  def apply(
    k: Boolean,
    n: String,
    o: String | and_ | or_ | AND | OR,
    t: js.Array[String],
    m: StringDictionary[String] = null
  ): RefinementCategory = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefinementCategory]
  }
}


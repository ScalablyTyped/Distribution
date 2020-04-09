package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<saxes.saxes.SaxesTag, 'name' | 'attributes' | 'ns'> */
trait SaxesStartTag
  extends StartTagForOptions[js.Any] {
  var attributes: Record[String, SaxesAttributeNS | String]
  var name: String
  var ns: js.UndefOr[Record[String, String]] = js.undefined
}

object SaxesStartTag {
  @scala.inline
  def apply(
    attributes: Record[String, SaxesAttributeNS | String],
    name: String,
    ns: Record[String, String] = null
  ): SaxesStartTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (ns != null) __obj.updateDynamic("ns")(ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesStartTag]
  }
}


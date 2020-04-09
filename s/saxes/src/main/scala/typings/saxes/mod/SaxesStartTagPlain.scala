package typings.saxes.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<saxes.saxes.SaxesStartTag, 'name' | 'attributes'> */
trait SaxesStartTagPlain
  extends StartTagForOptions[js.Any] {
  var attributes: Record[String, SaxesAttributeNS | String]
  var name: String
}

object SaxesStartTagPlain {
  @scala.inline
  def apply(attributes: Record[String, SaxesAttributeNS | String], name: String): SaxesStartTagPlain = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SaxesStartTagPlain]
  }
}


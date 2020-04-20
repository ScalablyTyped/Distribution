package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.saxes.mod.AttributeEventForOptions because Already inherited */ trait SaxesAttributePlain extends SaxesAttribute {
  /**
    * The attribute's name.
    */
  var name: String
  /** The attribute's value. */
  var value: String
}

object SaxesAttributePlain {
  @scala.inline
  def apply(name: String, value: String): SaxesAttributePlain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaxesAttributePlain]
  }
}


package typings
package sketchappLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  var _class: sketchappLib.sketchappLibStrings.fontDescriptor
  var attributes: Anon_Name
}

object Anon_Attributes {
  @scala.inline
  def apply(_class: sketchappLib.sketchappLibStrings.fontDescriptor, attributes: Anon_Name): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_class")(_class)
    __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Anon_Attributes]
  }
}


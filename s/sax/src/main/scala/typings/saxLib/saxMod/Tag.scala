package typings
package saxLib.saxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends BaseTag {
  var attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object Tag {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    isSelfClosing: scala.Boolean,
    name: java.lang.String
  ): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("isSelfClosing")(isSelfClosing)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Tag]
  }
}


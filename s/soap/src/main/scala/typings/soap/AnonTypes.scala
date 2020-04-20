package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.soap.elementsMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypes extends js.Object {
  var types: StringDictionary[Element]
}

object AnonTypes {
  @scala.inline
  def apply(types: StringDictionary[Element]): AnonTypes = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypes]
  }
}


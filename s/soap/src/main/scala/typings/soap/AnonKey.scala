package typings.soap

import org.scalablytyped.runtime.StringDictionary
import typings.soap.elementsMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var types: StringDictionary[Element]
}

object AnonKey {
  @scala.inline
  def apply(types: StringDictionary[Element]): AnonKey = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}


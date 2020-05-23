package typings.soap.anon

import org.scalablytyped.runtime.StringDictionary
import typings.soap.elementsMod.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var types: StringDictionary[Element]
}

object Types {
  @scala.inline
  def apply(types: StringDictionary[Element]): Types = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
}


package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var map: StringDictionary[Type]
  def register(`type`: Type): Unit
}

object Types {
  @scala.inline
  def apply(map: StringDictionary[Type], register: Type => Unit): Types = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Types]
  }
}


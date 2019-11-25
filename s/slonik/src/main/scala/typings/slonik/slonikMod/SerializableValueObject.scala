package typings.slonik.slonikMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializableValueObject
  extends /* x */ StringDictionary[SerializableValueType]
     with _SerializableValueType

object SerializableValueObject {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[SerializableValueType] = null): SerializableValueObject = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SerializableValueObject]
  }
}


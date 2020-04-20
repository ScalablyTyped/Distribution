package typings.reduxOrm.modelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFieldMap extends /* K */ StringDictionary[ModelField]

object ModelFieldMap {
  @scala.inline
  def apply(StringDictionary: /* K */ StringDictionary[ModelField] = null): ModelFieldMap = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ModelFieldMap]
  }
}


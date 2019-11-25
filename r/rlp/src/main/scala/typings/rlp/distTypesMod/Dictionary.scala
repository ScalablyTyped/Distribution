package typings.rlp.distTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary
  extends /* x */ StringDictionary[Input]
     with _Input

object Dictionary {
  @scala.inline
  def apply(StringDictionary: /* x */ StringDictionary[Input] = null): Dictionary = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictionary]
  }
}


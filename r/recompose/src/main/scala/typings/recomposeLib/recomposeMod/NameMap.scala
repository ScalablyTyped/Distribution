package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
trait NameMap
  extends /* outterName */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object NameMap {
  @scala.inline
  def apply(
    StringDictionary: /* outterName */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): NameMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NameMap]
  }
}


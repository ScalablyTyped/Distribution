package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// This type is required to infer TOutter
trait HandleCreatorsStructure[TOutter]
  extends /* handlerName */ org.scalablytyped.runtime.StringDictionary[mapper[TOutter, EventHandler]]

object HandleCreatorsStructure {
  @scala.inline
  def apply[TOutter](
    StringDictionary: /* handlerName */ org.scalablytyped.runtime.StringDictionary[mapper[TOutter, EventHandler]] = null
  ): HandleCreatorsStructure[TOutter] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[HandleCreatorsStructure[TOutter]]
  }
}


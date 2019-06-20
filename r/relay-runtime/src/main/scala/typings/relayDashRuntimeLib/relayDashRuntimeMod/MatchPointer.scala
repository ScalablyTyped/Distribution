package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchPointer extends js.Object {
  var __fragmentPropName: java.lang.String
  var __fragments: org.scalablytyped.runtime.StringDictionary[Variables]
  var __id: DataID
  var __module: js.Any
}

object MatchPointer {
  @scala.inline
  def apply(
    __fragmentPropName: java.lang.String,
    __fragments: org.scalablytyped.runtime.StringDictionary[Variables],
    __id: DataID,
    __module: js.Any
  ): MatchPointer = {
    val __obj = js.Dynamic.literal(__fragmentPropName = __fragmentPropName, __fragments = __fragments, __id = __id, __module = __module)
  
    __obj.asInstanceOf[MatchPointer]
  }
}


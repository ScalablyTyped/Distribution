package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorState extends js.Object {
  var value: slateLib.slateMod.Value
}

object EditorState {
  @scala.inline
  def apply(value: slateLib.slateMod.Value): EditorState = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[EditorState]
  }
}


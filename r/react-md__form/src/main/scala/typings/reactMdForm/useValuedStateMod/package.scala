package typings.reactMdForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useValuedStateMod {
  type ChangeEventHandler[T /* <: typings.reactMdForm.useValuedStateMod.TextElement */] = typings.react.mod.ChangeEventHandler[T]
  type TextElement = typings.std.HTMLInputElement | typings.std.HTMLTextAreaElement | typings.std.HTMLSelectElement
  type Value = java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double])
}

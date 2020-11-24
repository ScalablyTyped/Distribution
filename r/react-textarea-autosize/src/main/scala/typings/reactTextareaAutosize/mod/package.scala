package typings.reactTextareaAutosize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Style = (typings.std.Omit[
    typings.std.NonNullable[js.UndefOr[typings.react.mod.CSSProperties]], 
    typings.reactTextareaAutosize.reactTextareaAutosizeStrings.maxHeight | typings.reactTextareaAutosize.reactTextareaAutosizeStrings.minHeight
  ]) with typings.reactTextareaAutosize.anon.Height
  
  type TextareaProps = typings.react.mod.TextareaHTMLAttributes[typings.std.HTMLTextAreaElement]
}

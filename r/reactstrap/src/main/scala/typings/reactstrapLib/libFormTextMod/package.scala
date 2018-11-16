package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFormTextMod {
  type FormText[T] = reactLib.reactMod.Component[FormTextProps[T], js.Object, js.Any]
  type FormTextProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_CssModuleTagInline with T
}

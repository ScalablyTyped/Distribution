package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFadeMod {
  type Fade[T] = reactLib.reactMod.Component[FadeProps[T], js.Object, js.Any]
  type FadeProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_TransitionAppearTimeout with T
}

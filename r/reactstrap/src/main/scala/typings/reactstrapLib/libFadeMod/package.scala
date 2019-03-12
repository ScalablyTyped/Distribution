package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libFadeMod {
  type Fade[T] = reactLib.reactMod.Component[FadeProps[T], js.Object, js.Any]
  type FadeProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_BaseClass with T
}

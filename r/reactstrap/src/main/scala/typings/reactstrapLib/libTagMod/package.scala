package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTagMod {
  type Tag[T] = reactLib.reactMod.Component[TagProps[T], js.Object, js.Any]
  type TagProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[stdLib.HTMLElement] with reactstrapLib.Anon_ClassNameColor with T
}

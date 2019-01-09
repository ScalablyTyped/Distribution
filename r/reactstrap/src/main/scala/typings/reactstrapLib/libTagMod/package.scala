package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTagMod {
  type Tag[T] = reactLib.reactMod.Component[TagProps[T], js.Object, js.Any]
  type TagProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ClassNameColor with T
}

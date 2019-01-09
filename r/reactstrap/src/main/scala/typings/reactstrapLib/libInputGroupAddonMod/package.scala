package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInputGroupAddonMod {
  type InputGroupAddon[T] = reactLib.reactMod.Component[InputGroupAddonProps[T], js.Object, js.Any]
  type InputGroupAddonProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_AddonTypeAppend with T
}

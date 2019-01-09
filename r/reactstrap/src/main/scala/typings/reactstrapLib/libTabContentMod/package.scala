package typings
package reactstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTabContentMod {
  type TabContent[T] = reactLib.reactMod.Component[TabContentProps[T], js.Object, js.Any]
  type TabContentProps[T] = reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] with reactstrapLib.Anon_ActiveTab with T
}

package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// will show `Memo(${Component.displayName || Component.name})` in devtools by default,
// but can be given its own specific name
@js.native
trait MemoExoticComponent[T /* <: ComponentType[_] */] extends NamedExoticComponent[ComponentPropsWithRef[T]] {
  val `type`: T = js.native
}


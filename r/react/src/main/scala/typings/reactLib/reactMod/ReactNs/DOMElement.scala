package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// string fallback for custom web-components
trait DOMElement[P /* <: HTMLAttributes[T] | SVGAttributes[T] */, T /* <: reactLib.Element */] extends ReactElement[P] {
  var ref: LegacyRef[T]
  @JSName("type")
  var type_DOMElement: java.lang.String
}


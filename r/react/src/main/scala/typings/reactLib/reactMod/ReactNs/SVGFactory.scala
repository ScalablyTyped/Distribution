package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGFactory
  extends DOMFactory[SVGAttributes[reactLib.SVGElement], reactLib.SVGElement] {
  def apply(): ReactSVGElement = js.native
  def apply(
    props: ClassAttributes[reactLib.SVGElement] with (SVGAttributes[reactLib.SVGElement] | scala.Null),
    children: ReactNode*
  ): ReactSVGElement = js.native
}


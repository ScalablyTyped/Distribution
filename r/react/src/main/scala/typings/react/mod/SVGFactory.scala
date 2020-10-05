package typings.react.mod

import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGFactory extends DOMFactory[SVGAttributes[SVGElement], SVGElement] {
  def apply(props: ClassAttributes[SVGElement] with SVGAttributes[SVGElement], children: ReactNode*): ReactSVGElement = js.native
  def apply(props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactSVGElement = js.native
  def apply(props: Null, children: ReactNode*): ReactSVGElement = js.native
}


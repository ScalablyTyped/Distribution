package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRoot
  extends DocumentFragment
     with DocumentOrShadowRoot {
  val host: Element = js.native
  var innerHTML: java.lang.String = js.native
  val mode: ShadowRootMode = js.native
}


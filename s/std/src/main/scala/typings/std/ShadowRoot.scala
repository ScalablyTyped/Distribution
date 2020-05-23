package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowRoot
  extends DocumentFragment
     with DocumentOrShadowRoot
     with InnerHTML {
  val host: Element = js.native
  val mode: ShadowRootMode = js.native
}


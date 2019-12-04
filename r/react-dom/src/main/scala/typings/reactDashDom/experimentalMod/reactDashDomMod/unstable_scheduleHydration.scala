package typings.reactDashDom.experimentalMod.reactDashDomMod

import typings.std.Comment
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "unstable_scheduleHydration")
@js.native
object unstable_scheduleHydration extends js.Object {
  // enableSelectiveHydration feature
  /**
    * @see https://github.com/facebook/react/commit/3a2b5f148d450c69aab67f055fc441d294c23518
    */
  def apply(target: Element | Document | DocumentFragment | Comment): Unit = js.native
}


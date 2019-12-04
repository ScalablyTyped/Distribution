package typings.reactDashDom.experimentalMod.reactDashDomMod

import typings.std.Comment
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom", "createBlockingRoot")
@js.native
object createBlockingRoot extends js.Object {
  /**
    * Replaces `ReactDOM.render` when the `.render` method is called and enables Blocking Mode.
    *
    * Opting into Concurrent Mode introduces semantic changes to how React works.
    * This means that you can’t use Concurrent Mode in just a few components.
    * Because of this, some apps may not be able to migrate directly to Concurrent Mode.
    * Blocking Mode only contains a small subset of Concurrent Mode features and is intended
    * as an intermediary migration step for apps that are unable to migrate directly.
    *
    * @see https://reactjs.org/docs/concurrent-mode-adoption.html#migration-step-blocking-mode
    * @see https://reactjs.org/docs/concurrent-mode-reference.html#createblockingroot
    */
  def apply(container: Element | Document | DocumentFragment | Comment): Root = js.native
  def apply(container: Element | Document | DocumentFragment | Comment, options: RootOptions): Root = js.native
}


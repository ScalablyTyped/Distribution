package typings.riot.riotMod

import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotCoreComponent[P, S] extends js.Object {
  val name: js.UndefOr[String] = js.native
  // automatically generated on any component instance
  val props: P = js.native
  val root: HTMLElement = js.native
  // TODO: add the @riotjs/dom-bindings types
  val slots: js.Array[_] = js.native
  // Helpers
  @JSName("$")
  def $(selector: String): HTMLElement = js.native
  @JSName("$$")
  def $$(selector: String): js.Array[HTMLElement] = js.native
  def mount(element: HTMLElement): RiotComponent[P, S] = js.native
  def mount(element: HTMLElement, initialState: S): RiotComponent[P, S] = js.native
  def mount(element: HTMLElement, initialState: S, parentScope: js.Object): RiotComponent[P, S] = js.native
  def unmount(keepRootElement: Boolean): RiotComponent[P, S] = js.native
  def update(): RiotComponent[P, S] = js.native
  def update(newState: Partial[S]): RiotComponent[P, S] = js.native
  def update(newState: Partial[S], parentScope: js.Object): RiotComponent[P, S] = js.native
}


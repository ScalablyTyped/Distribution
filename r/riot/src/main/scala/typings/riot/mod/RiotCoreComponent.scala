package typings.riot.mod

import typings.riotjsDomBindings.mod.SlotBindingData
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotCoreComponent[Props, State] extends js.Object {
  val name: js.UndefOr[String] = js.native
  // automatically generated on any component instance
  val props: Props = js.native
  val root: HTMLElement = js.native
  val slots: js.Array[SlotBindingData] = js.native
  // Helpers
  @JSName("$")
  def $(selector: String): HTMLElement = js.native
  @JSName("$$")
  def DollarDollar(selector: String): js.Array[HTMLElement] = js.native
  def mount(element: HTMLElement): RiotComponent[Props, State] = js.native
  def mount(element: HTMLElement, initialState: State): RiotComponent[Props, State] = js.native
  def mount(element: HTMLElement, initialState: State, parentScope: js.Object): RiotComponent[Props, State] = js.native
  def mount(element: HTMLElement, initialState: js.UndefOr[scala.Nothing], parentScope: js.Object): RiotComponent[Props, State] = js.native
  def unmount(keepRootElement: Boolean): RiotComponent[Props, State] = js.native
  def update(): RiotComponent[Props, State] = js.native
  def update(newState: js.UndefOr[scala.Nothing], parentScope: js.Object): RiotComponent[Props, State] = js.native
  def update(newState: Partial[State]): RiotComponent[Props, State] = js.native
  def update(newState: Partial[State], parentScope: js.Object): RiotComponent[Props, State] = js.native
}


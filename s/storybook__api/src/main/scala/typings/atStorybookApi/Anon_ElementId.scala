package typings.atStorybookApi

import typings.atStorybookApi.atStorybookApiMod.State
import typings.atStorybookApi.distModulesLayoutMod.PanelPositions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ElementId extends js.Object {
  def focusOnUIElement(): Unit = js.native
  def focusOnUIElement(elementId: String): Unit = js.native
  def resetLayout(): js.Promise[State] = js.native
  def setOptions(options: js.Any): Unit = js.native
  def toggleFullscreen(): js.Promise[State] = js.native
  def toggleFullscreen(toggled: Boolean): js.Promise[State] = js.native
  def toggleNav(): js.Promise[State] = js.native
  def toggleNav(toggled: Boolean): js.Promise[State] = js.native
  def togglePanel(): js.Promise[State] = js.native
  def togglePanel(toggled: Boolean): js.Promise[State] = js.native
  def togglePanelPosition(): js.Promise[State] = js.native
  def togglePanelPosition(position: PanelPositions): js.Promise[State] = js.native
  def toggleToolbar(): js.Promise[State] = js.native
  def toggleToolbar(toggled: Boolean): js.Promise[State] = js.native
}


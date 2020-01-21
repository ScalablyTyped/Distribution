package typings.storybookApi.addonsMod

import typings.storybookApi.storeMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubAPI extends js.Object {
  def getAddonState[S](addonId: String): S = js.native
  def getElements(`type`: Types_): Collection = js.native
  def getPanels(): Collection = js.native
  def getSelectedPanel(): String = js.native
  def getStoryPanels(): Collection = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: S, options: Options): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: StateMerger[S]): js.Promise[S] = js.native
  def setAddonState[S](addonId: String, newStateOrMerger: StateMerger[S], options: Options): js.Promise[S] = js.native
  def setSelectedPanel(panelName: String): Unit = js.native
}


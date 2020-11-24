package typings.quicksettings.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickSettings extends js.Object {
  
  /**
    * Creates a QuickSettingsPanel with the provided parameters.
    *
    * @template    M           The type of the model that is being managed by the quick settings.
    * @template    S           Type of names of controls that do not attach to the model (e.g., button or element)
    * @param       x           x position of panel (default 0)
    * @param       y           y position of panel (default 0)
    * @param       panelTitle  title of panel (default "QuickSettings")
    * @param       parent      title of panel (default "QuickSettings")
    * @returns                 New QuickSettings Panel
    */
  def create[M, S](): QuickSettingsPanel[M, S] = js.native
  def create[M, S](
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    panelTitle: js.UndefOr[scala.Nothing],
    parent: HTMLElement
  ): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], panelTitle: String): QuickSettingsPanel[M, S] = js.native
  def create[M, S](
    x: js.UndefOr[scala.Nothing],
    y: js.UndefOr[scala.Nothing],
    panelTitle: String,
    parent: HTMLElement
  ): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: js.UndefOr[scala.Nothing], y: Double): QuickSettingsPanel[M, S] = js.native
  def create[M, S](
    x: js.UndefOr[scala.Nothing],
    y: Double,
    panelTitle: js.UndefOr[scala.Nothing],
    parent: HTMLElement
  ): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: js.UndefOr[scala.Nothing], y: Double, panelTitle: String): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: js.UndefOr[scala.Nothing], y: Double, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double): QuickSettingsPanel[M, S] = js.native
  def create[M, S](
    x: Double,
    y: js.UndefOr[scala.Nothing],
    panelTitle: js.UndefOr[scala.Nothing],
    parent: HTMLElement
  ): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: js.UndefOr[scala.Nothing], panelTitle: String): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: js.UndefOr[scala.Nothing], panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: Double): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: Double, panelTitle: js.UndefOr[scala.Nothing], parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: Double, panelTitle: String): QuickSettingsPanel[M, S] = js.native
  def create[M, S](x: Double, y: Double, panelTitle: String, parent: HTMLElement): QuickSettingsPanel[M, S] = js.native
  
   // tslint:disable-line no-unnecessary-generics
  def useExtStyleSheet(): Unit = js.native
}

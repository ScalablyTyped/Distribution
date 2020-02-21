package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Tab")
@js.native
class Tab protected () extends RibbonComponent {
  // tslint:disable-next-line: parameters-max-number
  def this(
    ribbon: Ribbon,
    id: String,
    title: String,
    description: String,
    command: String,
    contextual: Boolean,
    contextualGroupId: String,
    cssClass: String
  ) = this()
  def get_command(): String = js.native
  def get_contextual(): Boolean = js.native
  def get_contextualGroupId(): String = js.native
  def get_currentScalingIndex(): Double = js.native
  def get_scaling(): String = js.native
  def get_selected(): Boolean = js.native
  def scaleDown(): scala.Unit = js.native
  def scaleMax(): scala.Unit = js.native
  def scaleUp(): scala.Unit = js.native
  def set_selected(isSelected: Boolean): scala.Unit = js.native
}


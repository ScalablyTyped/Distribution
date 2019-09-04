package typings.reactDashIntl.distComponentsCreateFormattedComponentMod

import typings.react.reactMod.FC
import typings.react.reactMod.FunctionComponent
import typings.reactDashIntl.Anon_0
import typings.reactDashIntl.Anon_0Children
import typings.reactDashIntl.Anon_0ChildrenFormat
import typings.reactDashIntl.Anon_0Format
import typings.reactDashIntl.Anon_0FormatOpts
import typings.reactDashIntl.distTypesMod.FormatDateOptions
import typings.reactDashIntl.distTypesMod.FormatNumberOptions
import typings.reactDashIntl.reactDashIntlStrings.formatDate
import typings.reactDashIntl.reactDashIntlStrings.formatNumber
import typings.reactDashIntl.reactDashIntlStrings.formatTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/dist/components/createFormattedComponent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val FormattedNumberParts: FC[FormatNumberOptions with Anon_0] = js.native
  @JSName("createFormattedComponent")
  def createFormattedComponent_formatDate(name: formatDate): FunctionComponent[FormatDateOptions with Anon_0Format] = js.native
  @JSName("createFormattedComponent")
  def createFormattedComponent_formatNumber(name: formatNumber): FunctionComponent[FormatNumberOptions with Anon_0FormatOpts] = js.native
  @JSName("createFormattedComponent")
  def createFormattedComponent_formatTime(name: formatTime): FunctionComponent[FormatDateOptions with Anon_0Format] = js.native
  @JSName("createFormattedDateTimePartsComponent")
  def createFormattedDateTimePartsComponent_formatDate(name: formatDate): FunctionComponent[FormatDateOptions with Anon_0Children] = js.native
  @JSName("createFormattedDateTimePartsComponent")
  def createFormattedDateTimePartsComponent_formatNumber(name: formatNumber): FunctionComponent[FormatNumberOptions with Anon_0ChildrenFormat] = js.native
  @JSName("createFormattedDateTimePartsComponent")
  def createFormattedDateTimePartsComponent_formatTime(name: formatTime): FunctionComponent[FormatDateOptions with Anon_0Children] = js.native
}


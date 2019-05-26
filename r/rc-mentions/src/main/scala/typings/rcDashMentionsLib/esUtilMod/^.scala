package typings
package rcDashMentionsLib.esUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/es/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val omit: OmitFunc = js.native
  def filterOption(input: java.lang.String, hasValue: rcDashMentionsLib.esOptionMod.OptionProps): scala.Boolean = js.native
  def getBeforeSelectionText(input: stdLib.HTMLTextAreaElement): java.lang.String = js.native
  def getLastMeasureIndex(text: java.lang.String): MeasureIndex = js.native
  def getLastMeasureIndex(text: java.lang.String, prefix: java.lang.String): MeasureIndex = js.native
  def getLastMeasureIndex(text: java.lang.String, prefix: js.Array[java.lang.String]): MeasureIndex = js.native
  def replaceWithMeasure(text: java.lang.String, measureConfig: MeasureConfig): rcDashMentionsLib.Anon_SelectionLocation = js.native
  def setInputSelection(input: stdLib.HTMLTextAreaElement, location: scala.Double): scala.Unit = js.native
  def validateSearch(text: java.lang.String, props: rcDashMentionsLib.esMentionsMod.MentionsProps): scala.Boolean = js.native
}


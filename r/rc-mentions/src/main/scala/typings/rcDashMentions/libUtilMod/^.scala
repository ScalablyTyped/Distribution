package typings.rcDashMentions.libUtilMod

import typings.rcDashMentions.Anon_SelectionLocation
import typings.rcDashMentions.libMentionsMod.MentionsProps
import typings.rcDashMentions.libOptionMod.OptionProps
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-mentions/lib/util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val omit: OmitFunc = js.native
  def filterOption(input: String, hasValue: OptionProps): Boolean = js.native
  def getBeforeSelectionText(input: HTMLTextAreaElement): String = js.native
  def getLastMeasureIndex(text: String): MeasureIndex = js.native
  def getLastMeasureIndex(text: String, prefix: String): MeasureIndex = js.native
  def getLastMeasureIndex(text: String, prefix: js.Array[String]): MeasureIndex = js.native
  def replaceWithMeasure(text: String, measureConfig: MeasureConfig): Anon_SelectionLocation = js.native
  def setInputSelection(input: HTMLTextAreaElement, location: Double): Unit = js.native
  def validateSearch(text: String, props: MentionsProps): Boolean = js.native
}


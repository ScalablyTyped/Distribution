package typings.rrule.distEsmSrcNlpTotextMod

import typings.rrule.distEsmSrcNlpI18nMod.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
@js.native
class default protected () extends ToText {
  def this(rrule: typings.rrule.distEsmSrcMod.default) = this()
  def this(rrule: typings.rrule.distEsmSrcMod.default, gettext: GetText) = this()
  def this(rrule: typings.rrule.distEsmSrcMod.default, gettext: GetText, language: Language) = this()
  def this(
    rrule: typings.rrule.distEsmSrcMod.default,
    gettext: GetText,
    language: Language,
    dateFormatter: DateFormatter
  ) = this()
}

/* static members */
@JSImport("rrule/dist/esm/src/nlp/totext", JSImport.Default)
@js.native
object default extends js.Object {
  var IMPLEMENTED: js.Array[js.Array[String]] = js.native
  /**
    * Test whether the rrule can be fully converted to text.
    * @param {RRule} rrule
    * @return {Boolean}
    */
  def isFullyConvertible(rrule: typings.rrule.distEsmSrcMod.default): Boolean = js.native
}


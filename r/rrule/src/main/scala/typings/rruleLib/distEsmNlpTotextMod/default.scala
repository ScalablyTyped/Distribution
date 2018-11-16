package typings
package rruleLib.distEsmNlpTotextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/nlp/totext", JSImport.Default)
@js.native
class default protected () extends ToText {
  def this(rrule: rruleLib.distEsmMod.default) = this()
  def this(rrule: rruleLib.distEsmMod.default, gettext: GetText) = this()
  def this(rrule: rruleLib.distEsmMod.default, gettext: GetText, language: rruleLib.distEsmNlpI18nMod.Language) = this()
}

@JSImport("rrule/dist/esm/nlp/totext", JSImport.Default)
@js.native
object default extends js.Object {
  var IMPLEMENTED: js.Array[js.Array[java.lang.String]] = js.native
  /**
       * Test whether the rrule can be fully converted to text.
       * @param {RRule} rrule
       * @return {Boolean}
       */
  def isFullyConvertible(rrule: rruleLib.distEsmMod.default): scala.Boolean = js.native
}


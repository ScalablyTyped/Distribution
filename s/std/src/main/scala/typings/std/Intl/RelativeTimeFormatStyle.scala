package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The length of the internationalized message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  *
  * [Specification](https://tc39.es/ecma402/#sec-InitializeRelativeTimeFormat).
  */
/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.long
  - typings.std.stdStrings.short
  - typings.std.stdStrings.narrow
*/
trait RelativeTimeFormatStyle extends js.Object
object RelativeTimeFormatStyle {
  
  @scala.inline
  def long: typings.std.stdStrings.long = "long".asInstanceOf[typings.std.stdStrings.long]
  
  @scala.inline
  def narrow: typings.std.stdStrings.narrow = "narrow".asInstanceOf[typings.std.stdStrings.narrow]
  
  @scala.inline
  def short: typings.std.stdStrings.short = "short".asInstanceOf[typings.std.stdStrings.short]
}

package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to parse XML or HTML source code from a string into a DOM Document. */
@js.native
trait DOMParser extends js.Object {
  def parseFromString(str: java.lang.String, `type`: SupportedType): Document = js.native
}

object DOMParser {
  @scala.inline
  def apply(parseFromString: (java.lang.String, SupportedType) => Document): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.asInstanceOf[DOMParser]
  }
  @scala.inline
  implicit class DOMParserOps[Self <: DOMParser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParseFromString(value: (java.lang.String, SupportedType) => Document): Self = this.set("parseFromString", js.Any.fromFunction2(value))
  }
  
}


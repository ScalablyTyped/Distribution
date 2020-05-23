package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to parse XML or HTML source code from a string into a DOM Document. */
trait DOMParser extends js.Object {
  def parseFromString(str: java.lang.String, `type`: SupportedType): Document
}

object DOMParser {
  @scala.inline
  def apply(parseFromString: (java.lang.String, SupportedType) => Document): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.asInstanceOf[DOMParser]
  }
}


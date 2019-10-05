package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to parse XML or HTML source code from a string into a DOM Document. */
trait DOMParser extends js.Object {
  def parseFromString(str: java.lang.String, `type`: SupportedType): Document
}

@JSGlobal("DOMParser")
@js.native
object DOMParser extends Instantiable0[DOMParser]


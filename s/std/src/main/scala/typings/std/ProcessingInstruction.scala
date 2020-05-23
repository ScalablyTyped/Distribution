package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A processing instruction embeds application-specific instructions in XML which can be ignored by other applications that don't recognize them. */
@js.native
trait ProcessingInstruction
  extends CharacterData
     with LinkStyle {
  val target: java.lang.String = js.native
}


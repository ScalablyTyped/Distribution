package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A processing instruction embeds application-specific instructions in XML which can be ignored by other applications that don't recognize them. */
@js.native
trait ProcessingInstruction extends CharacterData {
  val target: java.lang.String = js.native
}

@JSGlobal("ProcessingInstruction")
@js.native
class ProcessingInstructionCls () extends ProcessingInstruction {
  /**
    * Returns the first following sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | Null = js.native
  /**
    * Returns the first preceding sibling that is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | Null = js.native
}

@JSGlobal("ProcessingInstruction")
@js.native
object ProcessingInstruction extends Instantiable0[ProcessingInstruction]


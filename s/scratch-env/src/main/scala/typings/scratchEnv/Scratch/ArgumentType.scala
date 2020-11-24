package typings.scratchEnv.Scratch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ArgumentType extends js.Object
/** Block argument types. */
@JSGlobal("Scratch.ArgumentType")
@js.native
object ArgumentType extends js.Object {
  
  /** Numeric value with angle picker. */
  @js.native
  sealed trait ANGLE extends ArgumentType
  
  /** Boolean value with hexagonal placeholder. */
  @js.native
  sealed trait BOOLEAN extends ArgumentType
  
  /** Numeric value with color picker. */
  @js.native
  sealed trait COLOR extends ArgumentType
  
  /** Inline image on block (as part of the label). */
  @js.native
  sealed trait IMAGE extends ArgumentType
  
  /** String value with matrix field. */
  @js.native
  sealed trait MATRIX extends ArgumentType
  
  /** MIDI note number with note picker (piano) field. */
  @js.native
  sealed trait NOTE extends ArgumentType
  
  /** Numeric value with text field. */
  @js.native
  sealed trait NUMBER extends ArgumentType
  
  /** String value with text field. */
  @js.native
  sealed trait STRING extends ArgumentType
}

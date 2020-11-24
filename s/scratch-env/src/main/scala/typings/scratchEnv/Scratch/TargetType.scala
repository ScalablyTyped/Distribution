package typings.scratchEnv.Scratch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TargetType extends js.Object
/** Default types of target supported by the VM. */
@JSGlobal("Scratch.TargetType")
@js.native
object TargetType extends js.Object {
  
  /** Rendered target which can move, change costumes, etc. */
  @js.native
  sealed trait SPRITE extends TargetType
  
  /** Rendered target which cannot move but can change backdrops. */
  @js.native
  sealed trait STAGE extends TargetType
}

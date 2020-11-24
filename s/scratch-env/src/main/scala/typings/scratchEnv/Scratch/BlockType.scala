package typings.scratchEnv.Scratch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlockType extends js.Object
/** Types of blocks. */
@JSGlobal("Scratch.BlockType")
@js.native
object BlockType extends js.Object {
  
  /** Boolean reporter with hexagonal shape. */
  @js.native
  sealed trait BOOLEAN extends BlockType
  
  /** A button (not an actual block) for some special action, like making a variable. */
  @js.native
  sealed trait BUTTON extends BlockType
  
  /** Command block. */
  @js.native
  sealed trait COMMAND extends BlockType
  
  /**
    * Specialized command block which may or may not run a child branch.
    * The thread continues with the next block whether or not a child branch ran.
    */
  @js.native
  sealed trait CONDITIONAL extends BlockType
  
  /**
    * Specialized hat block with no implementation function.
    * This stack only runs if the corresponding event is emitted by other code.
    */
  @js.native
  sealed trait EVENT extends BlockType
  
  /** Hat block which conditionally starts a block stack. */
  @js.native
  sealed trait HAT extends BlockType
  
  /**
    * Specialized command block which may or may not run a child branch.
    * If a child branch runs, the thread evaluates the loop block again.
    */
  @js.native
  sealed trait LOOP extends BlockType
  
  /** General reporter with numeric or string value. */
  @js.native
  sealed trait REPORTER extends BlockType
}

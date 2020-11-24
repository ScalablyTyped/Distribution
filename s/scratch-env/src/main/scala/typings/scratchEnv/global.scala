package typings.scratchEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  /** Indicate the scope for a reporter's value. */
  @js.native
  object ReporterScope extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.scratchEnv.ReporterScope with String] = js.native
    
    /* "global" */ val GLOBAL: typings.scratchEnv.ReporterScope.GLOBAL with String = js.native
    
    /* "target" */ val TARGET: typings.scratchEnv.ReporterScope.TARGET with String = js.native
  }
  
  @js.native
  object Scratch extends js.Object {
    
    /** Block argument types. */
    @js.native
    object ArgumentType extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.ArgumentType with String] = js.native
      
      /* "angle" */ val ANGLE: typings.scratchEnv.Scratch.ArgumentType.ANGLE with String = js.native
      
      /* "Boolean" */ val BOOLEAN: typings.scratchEnv.Scratch.ArgumentType.BOOLEAN with String = js.native
      
      /* "color" */ val COLOR: typings.scratchEnv.Scratch.ArgumentType.COLOR with String = js.native
      
      /* "image" */ val IMAGE: typings.scratchEnv.Scratch.ArgumentType.IMAGE with String = js.native
      
      /* "matrix" */ val MATRIX: typings.scratchEnv.Scratch.ArgumentType.MATRIX with String = js.native
      
      /* "note" */ val NOTE: typings.scratchEnv.Scratch.ArgumentType.NOTE with String = js.native
      
      /* "number" */ val NUMBER: typings.scratchEnv.Scratch.ArgumentType.NUMBER with String = js.native
      
      /* "string" */ val STRING: typings.scratchEnv.Scratch.ArgumentType.STRING with String = js.native
    }
    
    /** Types of blocks. */
    @js.native
    object BlockType extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.BlockType with String] = js.native
      
      /* "Boolean" */ val BOOLEAN: typings.scratchEnv.Scratch.BlockType.BOOLEAN with String = js.native
      
      /* "button" */ val BUTTON: typings.scratchEnv.Scratch.BlockType.BUTTON with String = js.native
      
      /* "command" */ val COMMAND: typings.scratchEnv.Scratch.BlockType.COMMAND with String = js.native
      
      /* "conditional" */ val CONDITIONAL: typings.scratchEnv.Scratch.BlockType.CONDITIONAL with String = js.native
      
      /* "event" */ val EVENT: typings.scratchEnv.Scratch.BlockType.EVENT with String = js.native
      
      /* "hat" */ val HAT: typings.scratchEnv.Scratch.BlockType.HAT with String = js.native
      
      /* "loop" */ val LOOP: typings.scratchEnv.Scratch.BlockType.LOOP with String = js.native
      
      /* "reporter" */ val REPORTER: typings.scratchEnv.Scratch.BlockType.REPORTER with String = js.native
    }
    
    /** Default types of target supported by the VM. */
    @js.native
    object TargetType extends js.Object {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.TargetType with String] = js.native
      
      /* "sprite" */ val SPRITE: typings.scratchEnv.Scratch.TargetType.SPRITE with String = js.native
      
      /* "stage" */ val STAGE: typings.scratchEnv.Scratch.TargetType.STAGE with String = js.native
    }
    
    @js.native
    object extensions extends js.Object {
      
      /** Register an extension. */
      def register(extension: typings.scratchEnv.ScratchExtension): Unit = js.native
    }
  }
  
  @js.native
  class ScratchExtension ()
    extends typings.scratchEnv.ScratchExtension
}

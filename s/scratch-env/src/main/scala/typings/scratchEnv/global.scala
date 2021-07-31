package typings.scratchEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /** Indicate the scope for a reporter's value. */
  @JSGlobal("ReporterScope")
  @js.native
  object ReporterScope extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.scratchEnv.ReporterScope & String] = js.native
    
    /* "global" */ val GLOBAL: typings.scratchEnv.ReporterScope.GLOBAL & String = js.native
    
    /* "target" */ val TARGET: typings.scratchEnv.ReporterScope.TARGET & String = js.native
  }
  
  object Scratch {
    
    /** Block argument types. */
    @JSGlobal("Scratch.ArgumentType")
    @js.native
    object ArgumentType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.ArgumentType & String] = js.native
      
      /* "angle" */ val ANGLE: typings.scratchEnv.Scratch.ArgumentType.ANGLE & String = js.native
      
      /* "Boolean" */ val BOOLEAN: typings.scratchEnv.Scratch.ArgumentType.BOOLEAN & String = js.native
      
      /* "color" */ val COLOR: typings.scratchEnv.Scratch.ArgumentType.COLOR & String = js.native
      
      /* "image" */ val IMAGE: typings.scratchEnv.Scratch.ArgumentType.IMAGE & String = js.native
      
      /* "matrix" */ val MATRIX: typings.scratchEnv.Scratch.ArgumentType.MATRIX & String = js.native
      
      /* "note" */ val NOTE: typings.scratchEnv.Scratch.ArgumentType.NOTE & String = js.native
      
      /* "number" */ val NUMBER: typings.scratchEnv.Scratch.ArgumentType.NUMBER & String = js.native
      
      /* "string" */ val STRING: typings.scratchEnv.Scratch.ArgumentType.STRING & String = js.native
    }
    
    /** Types of blocks. */
    @JSGlobal("Scratch.BlockType")
    @js.native
    object BlockType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.BlockType & String] = js.native
      
      /* "Boolean" */ val BOOLEAN: typings.scratchEnv.Scratch.BlockType.BOOLEAN & String = js.native
      
      /* "button" */ val BUTTON: typings.scratchEnv.Scratch.BlockType.BUTTON & String = js.native
      
      /* "command" */ val COMMAND: typings.scratchEnv.Scratch.BlockType.COMMAND & String = js.native
      
      /* "conditional" */ val CONDITIONAL: typings.scratchEnv.Scratch.BlockType.CONDITIONAL & String = js.native
      
      /* "event" */ val EVENT: typings.scratchEnv.Scratch.BlockType.EVENT & String = js.native
      
      /* "hat" */ val HAT: typings.scratchEnv.Scratch.BlockType.HAT & String = js.native
      
      /* "loop" */ val LOOP: typings.scratchEnv.Scratch.BlockType.LOOP & String = js.native
      
      /* "reporter" */ val REPORTER: typings.scratchEnv.Scratch.BlockType.REPORTER & String = js.native
    }
    
    /** Default types of target supported by the VM. */
    @JSGlobal("Scratch.TargetType")
    @js.native
    object TargetType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.scratchEnv.Scratch.TargetType & String] = js.native
      
      /* "sprite" */ val SPRITE: typings.scratchEnv.Scratch.TargetType.SPRITE & String = js.native
      
      /* "stage" */ val STAGE: typings.scratchEnv.Scratch.TargetType.STAGE & String = js.native
    }
    
    object extensions {
      
      @JSGlobal("Scratch.extensions")
      @js.native
      val ^ : js.Any = js.native
      
      /** Register an extension. */
      @scala.inline
      def register(`extension`: typings.scratchEnv.ScratchExtension): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(`extension`.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
  
  @JSGlobal("ScratchExtension")
  @js.native
  class ScratchExtension ()
    extends StObject
       with typings.scratchEnv.ScratchExtension {
    
    /** Returns data about the extension. */
    /* CompleteClass */
    override def getInfo(): ExtensionMetadata = js.native
  }
}

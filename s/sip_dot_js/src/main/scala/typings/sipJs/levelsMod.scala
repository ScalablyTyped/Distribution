package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levelsMod {
  
  @js.native
  sealed trait Levels extends StObject
  @JSImport("sip.js/lib/core/log/levels", "Levels")
  @js.native
  object Levels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with Levels
    /* 3 */ val debug: typings.sipJs.levelsMod.Levels.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with Levels
    /* 0 */ val error: typings.sipJs.levelsMod.Levels.error & Double = js.native
    
    @js.native
    sealed trait log
      extends StObject
         with Levels
    /* 2 */ val log: typings.sipJs.levelsMod.Levels.log & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with Levels
    /* 1 */ val warn: typings.sipJs.levelsMod.Levels.warn & Double = js.native
  }
}

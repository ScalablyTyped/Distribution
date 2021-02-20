package typings.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levelsMod {
  
  @js.native
  sealed trait Levels extends StObject
  @JSImport("sip.js/lib/core/log/levels", "Levels")
  @js.native
  object Levels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels with Double] = js.native
    
    @js.native
    sealed trait debug extends Levels
    /* 3 */ val debug: typings.sipJs.levelsMod.Levels.debug with Double = js.native
    
    @js.native
    sealed trait error extends Levels
    /* 0 */ val error: typings.sipJs.levelsMod.Levels.error with Double = js.native
    
    @js.native
    sealed trait log extends Levels
    /* 2 */ val log: typings.sipJs.levelsMod.Levels.log with Double = js.native
    
    @js.native
    sealed trait warn extends Levels
    /* 1 */ val warn: typings.sipJs.levelsMod.Levels.warn with Double = js.native
  }
}

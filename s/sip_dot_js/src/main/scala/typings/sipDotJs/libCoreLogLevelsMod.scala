package typings.sipDotJs

import org.scalablytyped.runtime.TopLevel
import typings.sipDotJs.libCoreLogLevelsMod.Levels
import typings.sipDotJs.libCoreLogLevelsMod.Levels.debug
import typings.sipDotJs.libCoreLogLevelsMod.Levels.error
import typings.sipDotJs.libCoreLogLevelsMod.Levels.log
import typings.sipDotJs.libCoreLogLevelsMod.Levels.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/log/levels", JSImport.Namespace)
@js.native
object libCoreLogLevelsMod extends js.Object {
  @js.native
  sealed trait Levels extends js.Object
  
  @js.native
  object Levels extends js.Object {
    @js.native
    sealed trait debug extends Levels
    
    @js.native
    sealed trait error extends Levels
    
    @js.native
    sealed trait log extends Levels
    
    @js.native
    sealed trait warn extends Levels
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels with Double] = js.native
    /* 3 */ @js.native
    object debug extends TopLevel[debug with Double]
    
    /* 0 */ @js.native
    object error extends TopLevel[error with Double]
    
    /* 2 */ @js.native
    object log extends TopLevel[log with Double]
    
    /* 1 */ @js.native
    object warn extends TopLevel[warn with Double]
    
  }
  
}


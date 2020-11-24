package typings.sipJs

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/log/levels", JSImport.Namespace)
@js.native
object levelsMod extends js.Object {
  
  @js.native
  sealed trait Levels extends js.Object
  @js.native
  object Levels extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Levels with Double] = js.native
    
    @js.native
    sealed trait debug extends Levels
    /* 3 */ @js.native
    object debug extends TopLevel[debug with Double]
    
    @js.native
    sealed trait error extends Levels
    /* 0 */ @js.native
    object error extends TopLevel[error with Double]
    
    @js.native
    sealed trait log extends Levels
    /* 2 */ @js.native
    object log extends TopLevel[log with Double]
    
    @js.native
    sealed trait warn extends Levels
    /* 1 */ @js.native
    object warn extends TopLevel[warn with Double]
  }
}

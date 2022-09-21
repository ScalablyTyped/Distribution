package typings.signals

import org.scalablytyped.runtime.Shortcut
import typings.signals.mod.Signal
import typings.signals.mod.SignalWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object signals extends Shortcut {
    
    @JSGlobal("signals")
    @js.native
    val ^ : SignalWrapper[Any] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("signals.Signal")
    @js.native
    /**
      * Custom event broadcaster
      * <br />- inspired by Robert Penner's AS3 Signals.
      * @author Miller Medeiros
      */
    open class SignalCls ()
      extends StObject
         with Signal[Any]
    
    type _To = SignalWrapper[Any]
    
    /* This means you don't have to write `^`, but can instead just say `signals.foo` */
    override def _to: SignalWrapper[Any] = ^
  }
}

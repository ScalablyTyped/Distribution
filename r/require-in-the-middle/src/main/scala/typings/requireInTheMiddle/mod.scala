package typings.requireInTheMiddle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("require-in-the-middle", "Hook")
  @js.native
  open class Hook protected () extends StObject {
    def this(onrequire: OnRequireFn) = this()
    def this(modules: js.Array[String], onrequire: OnRequireFn) = this()
    def this(modules: Null, onrequire: OnRequireFn) = this()
    def this(modules: js.Array[String], options: Null, onrequire: OnRequireFn) = this()
    def this(modules: js.Array[String], options: HookOptions, onrequire: OnRequireFn) = this()
    def this(modules: Null, options: Null, onrequire: OnRequireFn) = this()
    def this(modules: Null, options: HookOptions, onrequire: OnRequireFn) = this()
    
    def unhook(): Unit = js.native
  }
  
  trait HookOptions extends StObject {
    
    var internals: js.UndefOr[Boolean] = js.undefined
  }
  object HookOptions {
    
    inline def apply(): HookOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HookOptions] (val x: Self) extends AnyVal {
      
      inline def setInternals(value: Boolean): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
      
      inline def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
    }
  }
  
  type OnRequireFn = js.Function3[/* exports */ Any, /* name */ String, /* basedir */ js.UndefOr[String], Any]
}

package typings.reactUid

import typings.react.mod.FC
import typings.react.mod.PropsWithChildren
import typings.reactUid.distEs5ContextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5ControlMod {
  
  @JSImport("react-uid/dist/es5/Control", "UIDConsumer")
  @js.native
  val UIDConsumer: FC[UIDProps] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDFork")
  @js.native
  val UIDFork: FC[PropsWithChildren[WithPrefix]] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDReset")
  @js.native
  val UIDReset: FC[PropsWithChildren[WithPrefix]] = js.native
  
  trait WithPrefix extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object WithPrefix {
    
    inline def apply(): WithPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithPrefix]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithPrefix] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}

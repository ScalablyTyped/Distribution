package typings.reactUid

import typings.react.mod.SFC
import typings.reactUid.contextMod.UIDProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlMod {
  
  @JSImport("react-uid/dist/es5/Control", "UIDConsumer")
  @js.native
  val UIDConsumer: SFC[UIDProps] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDFork")
  @js.native
  val UIDFork: SFC[WithPrefix] = js.native
  
  @JSImport("react-uid/dist/es5/Control", "UIDReset")
  @js.native
  val UIDReset: SFC[WithPrefix] = js.native
  
  trait WithPrefix extends StObject {
    
    var prefix: js.UndefOr[String] = js.undefined
  }
  object WithPrefix {
    
    @scala.inline
    def apply(): WithPrefix = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithPrefix]
    }
    
    @scala.inline
    implicit class WithPrefixMutableBuilder[Self <: WithPrefix] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}

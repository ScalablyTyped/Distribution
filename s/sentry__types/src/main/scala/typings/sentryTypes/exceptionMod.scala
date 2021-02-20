package typings.sentryTypes

import typings.sentryTypes.mechanismMod.Mechanism
import typings.sentryTypes.stacktraceMod.Stacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exceptionMod {
  
  @js.native
  trait Exception extends StObject {
    
    var mechanism: js.UndefOr[Mechanism] = js.native
    
    var module: js.UndefOr[String] = js.native
    
    var stacktrace: js.UndefOr[Stacktrace] = js.native
    
    var thread_id: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object Exception {
    
    @scala.inline
    def apply(): Exception = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exception]
    }
    
    @scala.inline
    implicit class ExceptionMutableBuilder[Self <: Exception] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMechanism(value: Mechanism): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMechanismUndefined: Self = StObject.set(x, "mechanism", js.undefined)
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setStacktrace(value: Stacktrace): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
      
      @scala.inline
      def setThread_id(value: Double): Self = StObject.set(x, "thread_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThread_idUndefined: Self = StObject.set(x, "thread_id", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}

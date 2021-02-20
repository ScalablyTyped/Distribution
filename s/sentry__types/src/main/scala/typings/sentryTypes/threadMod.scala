package typings.sentryTypes

import typings.sentryTypes.stacktraceMod.Stacktrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object threadMod {
  
  @js.native
  trait Thread extends StObject {
    
    var crashed: js.UndefOr[Boolean] = js.native
    
    var current: js.UndefOr[Boolean] = js.native
    
    var id: js.UndefOr[Double] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stacktrace: js.UndefOr[Stacktrace] = js.native
  }
  object Thread {
    
    @scala.inline
    def apply(): Thread = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Thread]
    }
    
    @scala.inline
    implicit class ThreadMutableBuilder[Self <: Thread] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrashed(value: Boolean): Self = StObject.set(x, "crashed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrashedUndefined: Self = StObject.set(x, "crashed", js.undefined)
      
      @scala.inline
      def setCurrent(value: Boolean): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStacktrace(value: Stacktrace): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
    }
  }
}

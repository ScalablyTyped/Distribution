package typings.streamMock

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningMod {
  
  @JSImport("stream-mock/lib/helpers/Warning", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Warning {
    def this(msg: String, name: WARNING_TYPES, code: String) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @js.native
  sealed trait WARNING_TYPES extends StObject
  @JSImport("stream-mock/lib/helpers/Warning", "WARNING_TYPES")
  @js.native
  object WARNING_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WARNING_TYPES & String] = js.native
    
    @js.native
    sealed trait DEPRECATED
      extends StObject
         with WARNING_TYPES
    /* "DeprecationWarning" */ val DEPRECATED: typings.streamMock.warningMod.WARNING_TYPES.DEPRECATED & String = js.native
  }
  
  trait Warning
    extends StObject
       with Error {
    
    var code: js.UndefOr[String] = js.undefined
  }
  object Warning {
    
    @scala.inline
    def apply(message: String, name: String): Warning = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Warning]
    }
    
    @scala.inline
    implicit class WarningMutableBuilder[Self <: Warning] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
}

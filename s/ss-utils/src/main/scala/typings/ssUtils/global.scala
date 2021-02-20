package typings.ssUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ssutils {
    
    /**
      * EventSource
      */
    @JSGlobal("ssutils.ReadyState")
    @js.native
    object ReadyState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.ssUtils.ssutils.ReadyState with Double] = js.native
      
      /* 2 */ val CLOSED: typings.ssUtils.ssutils.ReadyState.CLOSED with Double = js.native
      
      /* 0 */ val CONNECTING: typings.ssUtils.ssutils.ReadyState.CONNECTING with Double = js.native
      
      /* 1 */ val OPEN: typings.ssUtils.ssutils.ReadyState.OPEN with Double = js.native
    }
  }
}

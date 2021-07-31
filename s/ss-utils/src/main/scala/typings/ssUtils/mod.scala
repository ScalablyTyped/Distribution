package typings.ssUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * EventSource
    */
  @JSImport("ss-utils", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ssUtils.ssutils.ReadyState & Double] = js.native
    
    /* 2 */ val CLOSED: typings.ssUtils.ssutils.ReadyState.CLOSED & Double = js.native
    
    /* 0 */ val CONNECTING: typings.ssUtils.ssutils.ReadyState.CONNECTING & Double = js.native
    
    /* 1 */ val OPEN: typings.ssUtils.ssutils.ReadyState.OPEN & Double = js.native
  }
}

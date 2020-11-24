package typings.ssUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ss-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * EventSource
    */
  @js.native
  object ReadyState extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ssUtils.ssutils.ReadyState with Double] = js.native
    
    /* 2 */ val CLOSED: typings.ssUtils.ssutils.ReadyState.CLOSED with Double = js.native
    
    /* 0 */ val CONNECTING: typings.ssUtils.ssutils.ReadyState.CONNECTING with Double = js.native
    
    /* 1 */ val OPEN: typings.ssUtils.ssutils.ReadyState.OPEN with Double = js.native
  }
}

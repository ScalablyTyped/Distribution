package typings.speechRuleEngine.jsCommonEventUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventType extends StObject
@JSImport("speech-rule-engine/js/common/event_util", "EventType")
@js.native
object EventType extends StObject {
  
  @js.native
  sealed trait CLICK
    extends StObject
       with EventType
  
  @js.native
  sealed trait DBLCLICK
    extends StObject
       with EventType
  
  @js.native
  sealed trait KEYDOWN
    extends StObject
       with EventType
  
  @js.native
  sealed trait KEYPRESS
    extends StObject
       with EventType
  
  @js.native
  sealed trait KEYUP
    extends StObject
       with EventType
  
  @js.native
  sealed trait MOUSEDOWN
    extends StObject
       with EventType
  
  @js.native
  sealed trait MOUSEMOVE
    extends StObject
       with EventType
  
  @js.native
  sealed trait MOUSEOUT
    extends StObject
       with EventType
  
  @js.native
  sealed trait MOUSEOVER
    extends StObject
       with EventType
  
  @js.native
  sealed trait MOUSEUP
    extends StObject
       with EventType
  
  @js.native
  sealed trait SELECTSTART
    extends StObject
       with EventType
  
  @js.native
  sealed trait TOUCHCANCEL
    extends StObject
       with EventType
  
  @js.native
  sealed trait TOUCHEND
    extends StObject
       with EventType
  
  @js.native
  sealed trait TOUCHMOVE
    extends StObject
       with EventType
  
  @js.native
  sealed trait TOUCHSTART
    extends StObject
       with EventType
}

package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTimelineLevelMod {
  
  @JSImport("pusher-js/types/src/core/timeline/level", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimelineLevel & Double] = js.native
    
    /* 7 */ val DEBUG: typings.pusherJs.typesSrcCoreTimelineLevelMod.TimelineLevel.DEBUG & Double = js.native
    
    /* 3 */ val ERROR: typings.pusherJs.typesSrcCoreTimelineLevelMod.TimelineLevel.ERROR & Double = js.native
    
    /* 6 */ val INFO: typings.pusherJs.typesSrcCoreTimelineLevelMod.TimelineLevel.INFO & Double = js.native
  }
  
  @js.native
  sealed trait TimelineLevel extends StObject
  @JSImport("pusher-js/types/src/core/timeline/level", "TimelineLevel")
  @js.native
  object TimelineLevel extends StObject {
    
    @js.native
    sealed trait DEBUG
      extends StObject
         with TimelineLevel
    
    @js.native
    sealed trait ERROR
      extends StObject
         with TimelineLevel
    
    @js.native
    sealed trait INFO
      extends StObject
         with TimelineLevel
  }
}

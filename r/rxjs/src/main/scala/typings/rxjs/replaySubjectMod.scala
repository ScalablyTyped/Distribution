package typings.rxjs

import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaySubjectMod {
  
  @JSImport("rxjs/internal/ReplaySubject", "ReplaySubject")
  @js.native
  class ReplaySubject[T] () extends Subject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: Double, windowTime: Double) = this()
    def this(bufferSize: Unit, windowTime: Double) = this()
    def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike) = this()
    def this(bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike) = this()
    
    /* private */ var _bufferSize: js.Any = js.native
    
    /* private */ var _events: js.Any = js.native
    
    def _getNow(): Double = js.native
    
    /* private */ var _infiniteTimeWindow: js.Any = js.native
    
    /* private */ var _trimBufferThenGetEvents: js.Any = js.native
    
    /* private */ var _windowTime: js.Any = js.native
    
    /* private */ var nextInfiniteTimeWindow: js.Any = js.native
    
    /* private */ var nextTimeWindow: js.Any = js.native
    
    /* private */ var scheduler: js.Any = js.native
  }
}

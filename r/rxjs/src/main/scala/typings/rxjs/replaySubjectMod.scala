package typings.rxjs

import typings.rxjs.subjectMod.Subject
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaySubjectMod {
  
  @JSImport("rxjs/internal/ReplaySubject", "ReplaySubject")
  @js.native
  class ReplaySubject[T] () extends Subject[T] {
    def this(bufferSize: Double) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double) = this()
    def this(bufferSize: Double, windowTime: Double) = this()
    def this(
      bufferSize: js.UndefOr[scala.Nothing],
      windowTime: js.UndefOr[scala.Nothing],
      scheduler: SchedulerLike
    ) = this()
    def this(bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike) = this()
    def this(bufferSize: Double, windowTime: Double, scheduler: SchedulerLike) = this()
    
    var _bufferSize: js.Any = js.native
    
    var _events: js.Any = js.native
    
    def _getNow(): Double = js.native
    
    var _infiniteTimeWindow: js.Any = js.native
    
    var _trimBufferThenGetEvents: js.Any = js.native
    
    var _windowTime: js.Any = js.native
    
    var nextInfiniteTimeWindow: js.Any = js.native
    
    var nextTimeWindow: js.Any = js.native
    
    var scheduler: js.Any = js.native
  }
}

package typings.rxjs

import typings.rxjs.internalTypesMod.TimestampProvider
import typings.rxjs.subjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaySubjectMod {
  
  @JSImport("rxjs/dist/types/internal/ReplaySubject", "ReplaySubject")
  @js.native
  /**
    * @param bufferSize The size of the buffer to replay on subscription
    * @param windowTime The amount of time the buffered items will say buffered
    * @param timestampProvider An object with a `now()` method that provides the current timestamp. This is used to
    * calculate the amount of time something has been buffered.
    */
  open class ReplaySubject[T] () extends Subject[T] {
    def this(_bufferSize: Double) = this()
    def this(_bufferSize: Double, _windowTime: Double) = this()
    def this(_bufferSize: Unit, _windowTime: Double) = this()
    def this(_bufferSize: Double, _windowTime: Double, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Double, _windowTime: Unit, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Unit, _windowTime: Double, _timestampProvider: TimestampProvider) = this()
    def this(_bufferSize: Unit, _windowTime: Unit, _timestampProvider: TimestampProvider) = this()
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _bufferSize: Any = js.native
    
    /* private */ var _infiniteTimeWindow: Any = js.native
    
    /* private */ var _timestampProvider: Any = js.native
    
    /* private */ var _trimBuffer: Any = js.native
    
    /* private */ var _windowTime: Any = js.native
  }
}

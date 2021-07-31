package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareReplayMod {
  
  @JSImport("rxjs/internal/operators/shareReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shareReplay[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Double): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Unit, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[MonoTypeOperatorFunction[T]]
  @scala.inline
  def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait ShareReplayConfig extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    var refCount: Boolean
    
    var scheduler: js.UndefOr[SchedulerLike] = js.undefined
    
    var windowTime: js.UndefOr[Double] = js.undefined
  }
  object ShareReplayConfig {
    
    @scala.inline
    def apply(refCount: Boolean): ShareReplayConfig = {
      val __obj = js.Dynamic.literal(refCount = refCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[ShareReplayConfig]
    }
    
    @scala.inline
    implicit class ShareReplayConfigMutableBuilder[Self <: ShareReplayConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      @scala.inline
      def setRefCount(value: Boolean): Self = StObject.set(x, "refCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduler(value: SchedulerLike): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      @scala.inline
      def setWindowTime(value: Double): Self = StObject.set(x, "windowTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowTimeUndefined: Self = StObject.set(x, "windowTime", js.undefined)
    }
  }
}

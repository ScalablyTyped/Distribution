package typings.rxjs

import typings.rxjs.typesMod.MonoTypeOperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shareReplayMod {
  
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: SchedulerLike
  ): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: js.UndefOr[scala.Nothing], scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): MonoTypeOperatorFunction[T] = js.native
  @JSImport("rxjs/internal/operators/shareReplay", "shareReplay")
  @js.native
  def shareReplay[T](config: ShareReplayConfig): MonoTypeOperatorFunction[T] = js.native
  
  @js.native
  trait ShareReplayConfig extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.native
    
    var refCount: Boolean = js.native
    
    var scheduler: js.UndefOr[SchedulerLike] = js.native
    
    var windowTime: js.UndefOr[Double] = js.native
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

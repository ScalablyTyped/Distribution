package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Configs
import typings.reactNativeReanimated.anon.Now
import typings.reactNativeReanimated.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReanimated2GlobalsMod {
  
  object global {
    
    object ReanimatedDataMock {
      
      @JSGlobal("ReanimatedDataMock")
      @js.native
      val ^ : js.Any = js.native
      
      inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    }
    
    @JSGlobal("_WORKLET")
    @js.native
    val _WORKLET: Boolean = js.native
    
    inline def chronoNow(): Double = js.Dynamic.global.applyDynamic("_chronoNow")().asInstanceOf[Double]
    
    @JSGlobal("_eventTimestamp")
    @js.native
    val eventTimestamp: Double = js.native
    
    @JSGlobal("_frameCallbackRegistry")
    @js.native
    val frameCallbackRegistry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FrameCallbackRegistryUI */ Any = js.native
    
    @JSGlobal("_frameTimestamp")
    @js.native
    val frameTimestamp: Double = js.native
    
    inline def getCurrentTime(): Double = js.Dynamic.global.applyDynamic("_getCurrentTime")().asInstanceOf[Double]
    
    inline def measure(viewTag: Double): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MeasuredDimensions */ Any) | Null = js.Dynamic.global.applyDynamic("_measure")(viewTag.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MeasuredDimensions */ Any) | Null]
    
    inline def scrollTo(viewTag: Double, x: Double, y: Double, animated: Boolean): Unit = (js.Dynamic.global.applyDynamic("_scrollTo")(viewTag.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setGestureState(handlerTag: Double, newState: Double): Unit = (js.Dynamic.global.applyDynamic("_setGestureState")(handlerTag.asInstanceOf[js.Any], newState.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setGlobalConsole(): Unit = js.Dynamic.global.applyDynamic("_setGlobalConsole")().asInstanceOf[Unit]
    inline def setGlobalConsole(
      console: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReanimatedConsole */ Any
    ): Unit = js.Dynamic.global.applyDynamic("_setGlobalConsole")(console.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def startObservingProgress(tag: Double, flag: Value): Unit = (js.Dynamic.global.applyDynamic("_startObservingProgress")(tag.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def stopObservingProgress(tag: Double, flag: Boolean): Unit = (js.Dynamic.global.applyDynamic("_stopObservingProgress")(tag.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateProps(
      tag: Double,
      name: String,
      updates: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StyleProps */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimatedStyle */ Any
    ): Unit = (js.Dynamic.global.applyDynamic("_updateProps")(tag.asInstanceOf[js.Any], name.asInstanceOf[js.Any], updates.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object NodeJS {
      
      @js.native
      trait Global extends StObject {
        
        var LayoutAnimationRepository: Configs = js.native
        
        var ReanimatedDataMock: Now = js.native
        
        var _WORKLET: Boolean = js.native
        
        var __reanimatedModuleProxy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeReanimated */ Any = js.native
        
        def _chronoNow(): Double = js.native
        
        var _frameCallbackRegistry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FrameCallbackRegistryUI */ Any = js.native
        
        var _frameTimestamp: Double | Null = js.native
        
        def _log(s: String): Unit = js.native
        
        def _measure(): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MeasuredDimensions */ Any) | Null = js.native
        
        def _scrollTo(): Unit = js.native
        
        def _setGestureState(): Unit = js.native
        
        def _setGlobalConsole(): Unit = js.native
        def _setGlobalConsole(
          console: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReanimatedConsole */ Any
        ): Unit = js.native
        
        var performance: Now = js.native
      }
    }
  }
}

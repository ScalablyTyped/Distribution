package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Configs
import typings.reactNativeReanimated.anon.Now
import typings.reactNativeReanimated.anon.Value
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcReanimated2GlobalsMod {
  
  object global {
    
    object LayoutAnimationRepository {
      
      @JSGlobal("LayoutAnimationRepository")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("LayoutAnimationRepository.configs")
      @js.native
      def configs: Record[String, Any] = js.native
      inline def configs_=(x: Record[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("configs")(x.asInstanceOf[js.Any])
      
      inline def registerConfig(tag: Double, config: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerConfig")(tag.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def removeConfig(tag: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConfig")(tag.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def startAnimationForTag(tag: Double, `type`: String, yogaValues: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("startAnimationForTag")(tag.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], yogaValues.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
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
    val frameTimestamp: Double | Null = js.native
    
    inline def getCurrentTime(): Double = js.Dynamic.global.applyDynamic("_getCurrentTime")().asInstanceOf[Double]
    
    inline def log(s: String): Unit = js.Dynamic.global.applyDynamic("_log")(s.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def measure(viewTag: Double): Any = js.Dynamic.global.applyDynamic("_measure")(viewTag.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    object performance {
      
      @JSGlobal("performance")
      @js.native
      val ^ : js.Any = js.native
      
      inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
    }
    
    @JSGlobal("__reanimatedModuleProxy")
    @js.native
    val reanimatedModuleProxy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeReanimated */ Any = js.native
    
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
        
        var _IS_FABRIC: Boolean = js.native
        
        var _WORKLET: Boolean = js.native
        
        var __reanimatedModuleProxy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NativeReanimated */ Any = js.native
        
        def _chronoNow(): Double = js.native
        
        var _eventTimestamp: Double = js.native
        
        var _frameCallbackRegistry: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FrameCallbackRegistryUI */ Any = js.native
        
        var _frameTimestamp: Double | Null = js.native
        
        def _getCurrentTime(): Double = js.native
        
        def _log(s: String): Unit = js.native
        
        def _measure(viewTag: Double): Any = js.native
        
        def _scrollTo(viewTag: Double, x: Double, y: Double, animated: Boolean): Unit = js.native
        
        def _setGestureState(handlerTag: Double, newState: Double): Unit = js.native
        
        def _setGlobalConsole(): Unit = js.native
        def _setGlobalConsole(
          console: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReanimatedConsole */ Any
        ): Unit = js.native
        
        def _startObservingProgress(tag: Double, flag: Value): Unit = js.native
        
        def _stopObservingProgress(tag: Double, flag: Boolean): Unit = js.native
        
        var performance: Now = js.native
      }
    }
  }
}

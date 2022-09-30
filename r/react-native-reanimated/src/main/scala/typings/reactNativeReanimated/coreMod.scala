package typings.reactNativeReanimated

import typings.reactNativeReanimated.hookCommonTypesMod.Descriptor
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatableValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject
import typings.reactNativeReanimated.reanimated2CommonTypesMod.ComplexWorkletFunction
import typings.reactNativeReanimated.reanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkPluginState(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkPluginState")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def configureProps(uiProps: js.Array[String], nativeProps: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configureProps")(uiProps.asInstanceOf[js.Any], nativeProps.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLayoutAnimations(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableLayoutAnimations(flag: Boolean, isCallByUser: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLayoutAnimations")(flag.asInstanceOf[js.Any], isCallByUser.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getTimestamp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimestamp")().asInstanceOf[Double]
  
  inline def getViewProp[T](viewTag: String, propName: String): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getViewProp")(viewTag.asInstanceOf[js.Any], propName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
  
  inline def isConfigured(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")().asInstanceOf[Boolean]
  inline def isConfigured(throwError: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigured")(throwError.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isConfiguredCheck(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfiguredCheck")().asInstanceOf[Unit]
  
  inline def jestResetJsReanimatedModule(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("jestResetJsReanimatedModule")().asInstanceOf[Unit]
  
  inline def makeMutable[T](value: T): SharedValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMutable")(value.asInstanceOf[js.Any]).asInstanceOf[SharedValue[T]]
  
  inline def makeRemote[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")().asInstanceOf[T]
  inline def makeRemote[T](`object`: js.Object): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemote")(`object`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def makeShareable[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("makeShareable")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def requestFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestFrame")(frame.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runOnJS[A /* <: js.Array[Any] */, R](fun: RunOnJSFunction[A, R]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnJS")(fun.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def runOnUI[A /* <: js.Array[Any] */, R](worklet: ComplexWorkletFunction[A, R]): js.Function1[/* args */ A, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runOnUI")(worklet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ A, Unit]]
  
  inline def startMapper(mapper: js.Function0[Unit]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: js.Array[Any], outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: js.Array[Any],
    outputs: Unit,
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: js.Array[Any], updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: js.Array[Any],
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(mapper: js.Function0[Unit], inputs: Unit, outputs: Unit, updater: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: js.Function0[Unit],
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: Unit,
    viewDescriptors: js.Array[Descriptor]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def startMapper(
    mapper: js.Function0[Unit],
    inputs: Unit,
    outputs: Unit,
    updater: Unit,
    viewDescriptors: SharedValue[js.Array[Descriptor]]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("startMapper")(mapper.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any], outputs.asInstanceOf[js.Any], updater.asInstanceOf[js.Any], viewDescriptors.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def stopMapper(mapperId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopMapper")(mapperId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Inlined std.Pick<std.Console, 'debug' | 'log' | 'warn' | 'info' | 'error'> */
  trait ReanimatedConsole extends StObject {
    
    var debug: js.Function1[/* repeated */ Any, Unit]
    
    var error: js.Function1[/* repeated */ Any, Unit]
    
    var info: js.Function1[/* repeated */ Any, Unit]
    
    var log: js.Function1[/* repeated */ Any, Unit]
    
    var warn: js.Function1[/* repeated */ Any, Unit]
  }
  object ReanimatedConsole {
    
    inline def apply(
      debug: /* repeated */ Any => Unit,
      error: /* repeated */ Any => Unit,
      info: /* repeated */ Any => Unit,
      log: /* repeated */ Any => Unit,
      warn: /* repeated */ Any => Unit
    ): ReanimatedConsole = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[ReanimatedConsole]
    }
    
    extension [Self <: ReanimatedConsole](x: Self) {
      
      inline def setDebug(value: /* repeated */ Any => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ Any => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RunOnJSFunction[A /* <: js.Array[Any] */, R] extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type A is not an array type */ args: A
    ): R = js.native
    
    var __callAsync: js.UndefOr[js.Function1[/* args */ A, Unit]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Function0[typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject]
    - typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject
    - typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimatableValue
    - typings.reactNativeReanimated.hookCommonTypesMod.Descriptor
  */
  type WorkletValue = _WorkletValue | js.Function0[AnimationObject] | AnimatableValue
  
  trait _WorkletValue extends StObject
  object _WorkletValue {
    
    inline def AnimationObject(
      callback: (/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue]) => Unit,
      onFrame: (Any, Timestamp) => Boolean,
      onStart: (Any, Any, Timestamp, Any) => Unit
    ): typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), onFrame = js.Any.fromFunction2(onFrame), onStart = js.Any.fromFunction4(onStart))
      __obj.asInstanceOf[typings.reactNativeReanimated.reanimated2CommonTypesMod.AnimationObject]
    }
    
    inline def Descriptor(name: String, tag: Double): typings.reactNativeReanimated.hookCommonTypesMod.Descriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeReanimated.hookCommonTypesMod.Descriptor]
    }
  }
}

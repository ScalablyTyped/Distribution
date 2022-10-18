package typings.reactNativeReanimated

import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.AnimatedKeyboardInfo
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SensorValue3D
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SensorValueRotation
import typings.reactNativeReanimated.libTypesReanimated2CommonTypesMod.SharedValue
import typings.reactNativeReanimated.libTypesReanimated2HookCommonTypesMod.Descriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2NativeReanimatedNativeReanimatedMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/NativeReanimated/NativeReanimated", "NativeReanimated")
  @js.native
  open class NativeReanimated () extends StObject {
    def this(native: Boolean) = this()
    
    /* private */ var InnerNativeModule: Any = js.native
    
    def configureProps(uiProps: js.Array[String], nativeProps: js.Array[String]): Unit = js.native
    
    def enableLayoutAnimations(flag: Boolean): Unit = js.native
    
    def getViewProp[T](viewTag: String, propName: String): js.Promise[T] = js.native
    def getViewProp[T](viewTag: String, propName: String, callback: js.Function1[/* result */ T, Unit]): js.Promise[T] = js.native
    
    def installCoreFunctions(valueSetter: js.Function1[/* value */ Any, Unit]): Unit = js.native
    
    def makeMutable[T](value: T): SharedValue[T] = js.native
    
    def makeRemote[T](): T = js.native
    def makeRemote[T](`object`: js.Object): T = js.native
    
    def makeShareable[T](value: T): T = js.native
    
    var native: Boolean = js.native
    
    def registerEventHandler[T](eventHash: String, eventHandler: js.Function1[/* event */ T, Unit]): String = js.native
    
    def registerSensor(sensorType: Double, interval: Double, sensorData: SensorValue3D | SensorValueRotation): Any = js.native
    
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[Any],
      outputs: js.Array[Any],
      updater: js.Function0[Unit],
      viewDescriptors: js.Array[Descriptor]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[Any],
      outputs: js.Array[Any],
      updater: js.Function0[Unit],
      viewDescriptors: SharedValue[js.Array[Descriptor]]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[Any],
      outputs: Unit,
      updater: js.Function0[Unit],
      viewDescriptors: js.Array[Descriptor]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[Any],
      outputs: Unit,
      updater: js.Function0[Unit],
      viewDescriptors: SharedValue[js.Array[Descriptor]]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: js.Array[Any],
      updater: js.Function0[Unit],
      viewDescriptors: js.Array[Descriptor]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: js.Array[Any],
      updater: js.Function0[Unit],
      viewDescriptors: SharedValue[js.Array[Descriptor]]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: Unit,
      updater: js.Function0[Unit],
      viewDescriptors: js.Array[Descriptor]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: Unit,
      updater: js.Function0[Unit],
      viewDescriptors: SharedValue[js.Array[Descriptor]]
    ): Double = js.native
    
    def stopMapper(mapperId: Double): Unit = js.native
    
    def subscribeForKeyboardEvents(keyboardEventData: AnimatedKeyboardInfo): Double = js.native
    
    def unregisterEventHandler(id: String): Unit = js.native
    
    def unregisterSensor(sensorId: Double): Any = js.native
    
    def unsubscribeFromKeyboardEvents(listenerId: Double): Unit = js.native
  }
}

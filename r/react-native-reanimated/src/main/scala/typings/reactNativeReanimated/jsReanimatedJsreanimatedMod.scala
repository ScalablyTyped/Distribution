package typings.reactNativeReanimated

import typings.reactNativeReanimated.anon.Now
import typings.reactNativeReanimated.nativeReanimatedNativeReanimatedMod.NativeReanimated
import typings.reactNativeReanimated.reanimated2CommonTypesMod.NestedObjectValues
import typings.reactNativeReanimated.reanimated2CommonTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsReanimatedJsreanimatedMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/JSReanimated", JSImport.Default)
  @js.native
  open class default () extends JSReanimated
  
  @js.native
  trait JSReanimated extends NativeReanimated {
    
    var _frames: js.Array[js.Function1[/* timestamp */ Timestamp, Unit]] = js.native
    
    var _mapperRegistry: typings.reactNativeReanimated.mapperRegistryMod.default[Any] = js.native
    
    def _onRender(timestampMs: Double): Unit = js.native
    
    var _renderRequested: Boolean = js.native
    
    var _valueSetter: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.native
    
    def enableLayoutAnimations(): Unit = js.native
    
    def getTimestamp(): Double = js.native
    
    def jestResetModule(): Unit = js.native
    
    def maybeRequestRender(): Unit = js.native
    
    def pushFrame(frame: js.Function1[/* timestamp */ Timestamp, Unit]): Unit = js.native
    
    def registerSensor(): Double = js.native
    
    def startMapper(mapper: js.Function0[Unit]): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]]]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]]],
      outputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]]]
    ): Double = js.native
    def startMapper(
      mapper: js.Function0[Unit],
      inputs: Unit,
      outputs: js.Array[NestedObjectValues[typings.reactNativeReanimated.mutableValueMod.default[Any]]]
    ): Double = js.native
    
    var timeProvider: Now = js.native
    
    def unregisterSensor(): Unit = js.native
  }
}

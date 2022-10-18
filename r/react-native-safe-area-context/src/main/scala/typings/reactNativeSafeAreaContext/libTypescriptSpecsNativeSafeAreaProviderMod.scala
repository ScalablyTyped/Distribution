package typings.reactNativeSafeAreaContext

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.DirectEventHandler
import typings.reactNative.mod.HostComponent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ViewProps
import typings.reactNativeSafeAreaContext.anon.ReadonlytopDoublerightDou
import typings.reactNativeSafeAreaContext.anon.ReadonlyxDoubleyDoublewid
import typings.reactNativeSafeAreaContext.reactNativeSafeAreaContextStrings.paperInsetsChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSpecsNativeSafeAreaProviderMod extends Shortcut {
  
  @JSImport("react-native-safe-area-context/lib/typescript/specs/NativeSafeAreaProvider", JSImport.Default)
  @js.native
  val default: HostComponent[NativeProps] = js.native
  
  /* Inlined std.Readonly<{  insets :std.Readonly<{  top :react-native.react-native/Libraries/Types/CodegenTypes.Double,   right :react-native.react-native/Libraries/Types/CodegenTypes.Double,   bottom :react-native.react-native/Libraries/Types/CodegenTypes.Double,   left :react-native.react-native/Libraries/Types/CodegenTypes.Double}>,   frame :std.Readonly<{  x :react-native.react-native/Libraries/Types/CodegenTypes.Double,   y :react-native.react-native/Libraries/Types/CodegenTypes.Double,   width :react-native.react-native/Libraries/Types/CodegenTypes.Double,   height :react-native.react-native/Libraries/Types/CodegenTypes.Double}>}> */
  trait Event extends StObject {
    
    val frame: ReadonlyxDoubleyDoublewid
    
    val insets: ReadonlytopDoublerightDou
  }
  object Event {
    
    inline def apply(frame: ReadonlyxDoubleyDoublewid, insets: ReadonlytopDoublerightDou): Event = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], insets = insets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setFrame(value: ReadonlyxDoubleyDoublewid): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      inline def setInsets(value: ReadonlytopDoublerightDou): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeProps
    extends StObject
       with ViewProps {
    
    var onInsetsChange: js.UndefOr[DirectEventHandler[Event, paperInsetsChange]] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setOnInsetsChange(value: /* event */ NativeSyntheticEvent[Event] => Unit | js.Promise[Unit]): Self = StObject.set(x, "onInsetsChange", js.Any.fromFunction1(value))
      
      inline def setOnInsetsChangeUndefined: Self = StObject.set(x, "onInsetsChange", js.undefined)
    }
  }
  
  type _To = HostComponent[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSpecsNativeSafeAreaProviderMod.foo` */
  override def _to: HostComponent[NativeProps] = default
}

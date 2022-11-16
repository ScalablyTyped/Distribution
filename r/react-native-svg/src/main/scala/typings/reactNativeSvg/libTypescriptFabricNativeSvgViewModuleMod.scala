package typings.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typings.reactNative.librariesTypesCodegenTypesMod.Int32
import typings.reactNative.mod.TurboModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricNativeSvgViewModuleMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/NativeSvgViewModule", JSImport.Default)
  @js.native
  val default: Spec = js.native
  
  @js.native
  trait Spec
    extends StObject
       with TurboModule {
    
    def toDataURL(): Unit = js.native
    def toDataURL(tag: Null, options: js.Object): Unit = js.native
    def toDataURL(tag: Null, options: js.Object, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    def toDataURL(tag: Null, options: Unit, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    def toDataURL(tag: Int32): Unit = js.native
    def toDataURL(tag: Int32, options: js.Object): Unit = js.native
    def toDataURL(tag: Int32, options: js.Object, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
    def toDataURL(tag: Int32, options: Unit, callback: js.Function1[/* base64 */ String, Unit]): Unit = js.native
  }
  
  type _To = Spec
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricNativeSvgViewModuleMod.foo` */
  override def _to: Spec = default
}

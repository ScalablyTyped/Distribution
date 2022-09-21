package typings.reactNativeCryptoJs

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeCryptoJs.mod.CipherHelper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rc4Mod extends Shortcut {
  
  @JSImport("react-native-crypto-js/rc4", JSImport.Namespace)
  @js.native
  val ^ : CipherHelper = js.native
  
  type _To = CipherHelper
  
  /* This means you don't have to write `^`, but can instead just say `rc4Mod.foo` */
  override def _to: CipherHelper = ^
}

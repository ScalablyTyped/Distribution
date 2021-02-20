package typings.reactNativeDotenv

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-dotenv", JSImport.Namespace)
  @js.native
  val ^ : Env = js.native
  
  type Env = StringDictionary[String]
  
  type _To = Env
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Env = ^
}

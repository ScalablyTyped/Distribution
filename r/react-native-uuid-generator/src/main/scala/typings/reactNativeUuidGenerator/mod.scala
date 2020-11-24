package typings.reactNativeUuidGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-uuid-generator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def getRandomUUID(): js.Promise[String] = js.native
    def getRandomUUID(callback: js.Function1[/* uuid */ String, Unit]): Unit = js.native
  }
}

package typings.roarr

import org.scalablytyped.runtime.StringDictionary
import typings.roarr.typesMod.JsonValue
import typings.roarr.typesMod.Logger
import typings.roarr.typesMod.MessageEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createMockLoggerMod {
  
  @JSImport("roarr/dist/src/factories/createMockLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMockLogger(onMessage: MessageEventHandler): Logger[StringDictionary[JsonValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMockLogger")(onMessage.asInstanceOf[js.Any]).asInstanceOf[Logger[StringDictionary[JsonValue]]]
  inline def createMockLogger(onMessage: MessageEventHandler, parentContext: StringDictionary[JsonValue]): Logger[StringDictionary[JsonValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMockLogger")(onMessage.asInstanceOf[js.Any], parentContext.asInstanceOf[js.Any])).asInstanceOf[Logger[StringDictionary[JsonValue]]]
}

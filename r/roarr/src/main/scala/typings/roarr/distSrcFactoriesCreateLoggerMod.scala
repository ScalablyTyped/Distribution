package typings.roarr

import org.scalablytyped.runtime.StringDictionary
import typings.roarr.distSrcTypesMod.JsonValue
import typings.roarr.distSrcTypesMod.Logger
import typings.roarr.distSrcTypesMod.MessageEventHandler
import typings.roarr.distSrcTypesMod.TransformMessageFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesCreateLoggerMod {
  
  @JSImport("roarr/dist/src/factories/createLogger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLogger(onMessage: MessageEventHandler): Logger[StringDictionary[JsonValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(onMessage.asInstanceOf[js.Any]).asInstanceOf[Logger[StringDictionary[JsonValue]]]
  inline def createLogger(onMessage: MessageEventHandler, parentMessageContext: StringDictionary[JsonValue]): Logger[StringDictionary[JsonValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(onMessage.asInstanceOf[js.Any], parentMessageContext.asInstanceOf[js.Any])).asInstanceOf[Logger[StringDictionary[JsonValue]]]
  inline def createLogger(
    onMessage: MessageEventHandler,
    parentMessageContext: StringDictionary[JsonValue],
    transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
  ): Logger[StringDictionary[JsonValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(onMessage.asInstanceOf[js.Any], parentMessageContext.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Logger[StringDictionary[JsonValue]]]
  inline def createLogger(
    onMessage: MessageEventHandler,
    parentMessageContext: Unit,
    transforms: js.Array[TransformMessageFunction[StringDictionary[JsonValue]]]
  ): Logger[StringDictionary[JsonValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(onMessage.asInstanceOf[js.Any], parentMessageContext.asInstanceOf[js.Any], transforms.asInstanceOf[js.Any])).asInstanceOf[Logger[StringDictionary[JsonValue]]]
}

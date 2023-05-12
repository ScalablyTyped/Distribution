package typings.stagehand

import typings.stagehand.mod.MessageEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandCoordinatorMod {
  
  @JSImport("stagehand/lib/command-coordinator", JSImport.Default)
  @js.native
  open class default[Commands] protected ()
    extends StObject
       with CommandCoordinator[Commands] {
    def this(
      endpoint: MessageEndpoint,
      handleRegistry: typings.stagehand.libFunctionHandleRegistryMod.default,
      executor: Commands
    ) = this()
    
    /* private */ /* CompleteClass */
    var dispatchCommand: Any = js.native
    
    /* private */ /* CompleteClass */
    var dispatchResponse: Any = js.native
    
    /* private */ /* CompleteClass */
    var endpoint: Any = js.native
    
    /* private */ /* CompleteClass */
    var executor: Any = js.native
    
    /* private */ /* CompleteClass */
    var handleRegistry: Any = js.native
    
    /* private */ /* CompleteClass */
    var isCommand: Any = js.native
    
    /* private */ /* CompleteClass */
    var isResponse: Any = js.native
    
    /* private */ /* CompleteClass */
    var messageReceived: Any = js.native
    
    /* private */ /* CompleteClass */
    var nextSeq: Any = js.native
    
    /* private */ /* CompleteClass */
    var pendingCommands: Any = js.native
    
    /* CompleteClass */
    override def sendCommand[Name /* <: /* keyof Commands */ String */](
      name: Name,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CommandParams<Commands[Name]> is not an array type */ args: CommandParams[
          /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
        ]
    ): js.Promise[
        CommandReturn[
          /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
        ]
      ] = js.native
    
    /* private */ /* CompleteClass */
    var sendMessage: Any = js.native
  }
  
  trait CommandCoordinator[Commands] extends StObject {
    
    /* private */ var dispatchCommand: Any
    
    /* private */ var dispatchResponse: Any
    
    /* private */ var endpoint: Any
    
    /* private */ var executor: Any
    
    /* private */ var handleRegistry: Any
    
    /* private */ var isCommand: Any
    
    /* private */ var isResponse: Any
    
    /* private */ var messageReceived: Any
    
    /* private */ var nextSeq: Any
    
    /* private */ var pendingCommands: Any
    
    def sendCommand[Name /* <: /* keyof Commands */ String */](
      name: Name,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type CommandParams<Commands[Name]> is not an array type */ args: CommandParams[
          /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
        ]
    ): js.Promise[
        CommandReturn[
          /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
        ]
      ]
    
    /* private */ var sendMessage: Any
  }
  object CommandCoordinator {
    
    inline def apply[Commands](
      dispatchCommand: Any,
      dispatchResponse: Any,
      endpoint: Any,
      executor: Any,
      handleRegistry: Any,
      isCommand: Any,
      isResponse: Any,
      messageReceived: Any,
      nextSeq: Any,
      pendingCommands: Any,
      sendCommand: (Any, CommandParams[
          /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
        ]) => js.Promise[
          CommandReturn[
            /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
          ]
        ],
      sendMessage: Any
    ): CommandCoordinator[Commands] = {
      val __obj = js.Dynamic.literal(dispatchCommand = dispatchCommand.asInstanceOf[js.Any], dispatchResponse = dispatchResponse.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], handleRegistry = handleRegistry.asInstanceOf[js.Any], isCommand = isCommand.asInstanceOf[js.Any], isResponse = isResponse.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], nextSeq = nextSeq.asInstanceOf[js.Any], pendingCommands = pendingCommands.asInstanceOf[js.Any], sendCommand = js.Any.fromFunction2(sendCommand), sendMessage = sendMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandCoordinator[Commands]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandCoordinator[?], Commands] (val x: Self & CommandCoordinator[Commands]) extends AnyVal {
      
      inline def setDispatchCommand(value: Any): Self = StObject.set(x, "dispatchCommand", value.asInstanceOf[js.Any])
      
      inline def setDispatchResponse(value: Any): Self = StObject.set(x, "dispatchResponse", value.asInstanceOf[js.Any])
      
      inline def setEndpoint(value: Any): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: Any): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      inline def setHandleRegistry(value: Any): Self = StObject.set(x, "handleRegistry", value.asInstanceOf[js.Any])
      
      inline def setIsCommand(value: Any): Self = StObject.set(x, "isCommand", value.asInstanceOf[js.Any])
      
      inline def setIsResponse(value: Any): Self = StObject.set(x, "isResponse", value.asInstanceOf[js.Any])
      
      inline def setMessageReceived(value: Any): Self = StObject.set(x, "messageReceived", value.asInstanceOf[js.Any])
      
      inline def setNextSeq(value: Any): Self = StObject.set(x, "nextSeq", value.asInstanceOf[js.Any])
      
      inline def setPendingCommands(value: Any): Self = StObject.set(x, "pendingCommands", value.asInstanceOf[js.Any])
      
      inline def setSendCommand(
        value: (Any, CommandParams[
              /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
            ]) => js.Promise[
              CommandReturn[
                /* import warning: importer.ImportType#apply Failed type conversion: Commands[Name] */ js.Any
              ]
            ]
      ): Self = StObject.set(x, "sendCommand", js.Any.fromFunction2(value))
      
      inline def setSendMessage(value: Any): Self = StObject.set(x, "sendMessage", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (params : infer Params): any ? Params : never
    }}}
    */
  @js.native
  trait CommandParams[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends (params : ...any): infer Return ? Return : never
    }}}
    */
  @js.native
  trait CommandReturn[T] extends StObject
}

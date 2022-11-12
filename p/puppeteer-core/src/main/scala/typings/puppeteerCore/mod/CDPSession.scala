package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer-core", "CDPSession")
@js.native
open class CDPSession () extends EventEmitter {
  
  /* Excluded from this release type: __constructor */
  def connection(): js.UndefOr[Connection] = js.native
  
  /**
    * Detaches the cdpSession from the target. Once detached, the cdpSession object
    * won't emit any events and can't be used to send messages.
    */
  def detach(): js.Promise[Unit] = js.native
  
  /**
    * Returns the session's id.
    */
  def id(): String = js.native
  
  @JSName("send")
  def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 541, starting with typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotclearMessages, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotdisable, typings.puppeteerCore.puppeteerCoreStrings.ConsoleDotenable */ Any */](
    method: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
  ] = js.native
}

package typings.puppeteer.mod

import typings.devtoolsProtocol.mod.Protocol.Target.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "Connection")
@js.native
open class Connection protected () extends EventEmitter {
  def this(url: String, transport: ConnectionTransport) = this()
  def this(url: String, transport: ConnectionTransport, delay: Double) = this()
  
  /* Excluded from this release type: isAutoAttached */
  /* Excluded from this release type: _createSession */
  /**
    * @param targetInfo - The target info
    * @returns The CDP session that is created
    */
  def createSession(targetInfo: TargetInfo): js.Promise[CDPSession] = js.native
  
  /* Excluded from this release type: _rawSend */
  /* Excluded from this release type: onMessage */
  def dispose(): Unit = js.native
  
  /* private */ var `private`: Any = js.native
  
  @JSName("send")
  def send_paramsType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 536, starting with typings.puppeteer.puppeteerStrings.ConsoleDotclearMessages, typings.puppeteer.puppeteerStrings.ConsoleDotdisable, typings.puppeteer.puppeteerStrings.ConsoleDotenable */ Any */](
    method: T,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param paramArgs because its type ProtocolMapping.Commands[T]['paramsType'] is not an array type */ paramArgs: /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['paramsType'] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: devtools-protocol.devtools-protocol/types/protocol-mapping.ProtocolMapping.Commands[T]['returnType'] */ js.Any
  ] = js.native
  
  /* Excluded from this release type: _closed */
  /* Excluded from this release type: _sessions */
  /**
    * @param sessionId - The session id
    * @returns The current CDP session if it exists
    */
  def session(sessionId: String): CDPSession | Null = js.native
  
  def url(): String = js.native
}
/* static members */
object Connection {
  
  @JSImport("puppeteer", "Connection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSession(session: CDPSession): js.UndefOr[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSession")(session.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Connection]]
}

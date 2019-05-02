package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Server
  extends simplecrawlerLib.netMod.Server {
  def addContext(hostName: java.lang.String, credentials: simplecrawlerLib.Anon_Ca): scala.Unit = js.native
  @JSName("addListener")
  def addListener_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ simplecrawlerLib.Buffer, 
      /* issuer */ simplecrawlerLib.Buffer, 
      /* callback */ js.Function, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ js.Any, 
      /* sessionData */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_secureConnection(
    event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    listener: js.Function2[/* err */ simplecrawlerLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("emit")
  def emit_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    certificate: simplecrawlerLib.Buffer,
    issuer: simplecrawlerLib.Buffer,
    callback: js.Function
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    sessionId: js.Any,
    sessionData: js.Any,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    sessionId: js.Any,
    callback: js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit]
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_secureConnection(event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection, tlsSocket: TLSSocket): scala.Boolean = js.native
  @JSName("emit")
  def emit_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    err: simplecrawlerLib.Error,
    tlsSocket: TLSSocket
  ): scala.Boolean = js.native
  @JSName("on")
  def on_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ simplecrawlerLib.Buffer, 
      /* issuer */ simplecrawlerLib.Buffer, 
      /* callback */ js.Function, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ js.Any, 
      /* sessionData */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_secureConnection(
    event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    listener: js.Function2[/* err */ simplecrawlerLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ simplecrawlerLib.Buffer, 
      /* issuer */ simplecrawlerLib.Buffer, 
      /* callback */ js.Function, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ js.Any, 
      /* sessionData */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_secureConnection(
    event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    listener: js.Function2[/* err */ simplecrawlerLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ simplecrawlerLib.Buffer, 
      /* issuer */ simplecrawlerLib.Buffer, 
      /* callback */ js.Function, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ js.Any, 
      /* sessionData */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_secureConnection(
    event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    listener: js.Function2[/* err */ simplecrawlerLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_OCSPRequest(
    event: simplecrawlerLib.simplecrawlerLibStrings.OCSPRequest,
    listener: js.Function3[
      /* certificate */ simplecrawlerLib.Buffer, 
      /* issuer */ simplecrawlerLib.Buffer, 
      /* callback */ js.Function, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_newSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.newSession,
    listener: js.Function3[
      /* sessionId */ js.Any, 
      /* sessionData */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* resp */ simplecrawlerLib.Buffer, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_resumeSession(
    event: simplecrawlerLib.simplecrawlerLibStrings.resumeSession,
    listener: js.Function2[
      /* sessionId */ js.Any, 
      /* callback */ js.Function2[/* err */ simplecrawlerLib.Error, /* sessionData */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_secureConnection(
    event: simplecrawlerLib.simplecrawlerLibStrings.secureConnection,
    listener: js.Function1[/* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_tlsClientError(
    event: simplecrawlerLib.simplecrawlerLibStrings.tlsClientError,
    listener: js.Function2[/* err */ simplecrawlerLib.Error, /* tlsSocket */ TLSSocket, scala.Unit]
  ): this.type = js.native
}


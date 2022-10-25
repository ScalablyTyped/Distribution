package typings.sipJs.mod.Core

import typings.sipJs.libCoreMessagesBodyMod.Body
import typings.sipJs.libCoreMessagesOutgoingRequestMessageMod.OutgoingRequestMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.OutgoingRequestMessage")
@js.native
open class OutgoingRequestMessage protected ()
  extends typings.sipJs.libCoreMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: Unit,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: Unit,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: Unit,
    extraHeaders: Unit,
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.libGrammarUriMod.URI,
    fromURI: typings.sipJs.libGrammarUriMod.URI,
    toURI: typings.sipJs.libGrammarUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: Unit,
    body: Body
  ) = this()
}
/* static members */
object OutgoingRequestMessage {
  
  @JSImport("sip.js", "Core.OutgoingRequestMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /** Get a copy of the default options. */
  @JSImport("sip.js", "Core.OutgoingRequestMessage.getDefaultOptions")
  @js.native
  def getDefaultOptions: Any = js.native
  inline def getDefaultOptions_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDefaultOptions")(x.asInstanceOf[js.Any])
  
  @JSImport("sip.js", "Core.OutgoingRequestMessage.makeNameAddrHeader")
  @js.native
  def makeNameAddrHeader: Any = js.native
  inline def makeNameAddrHeader_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("makeNameAddrHeader")(x.asInstanceOf[js.Any])
}

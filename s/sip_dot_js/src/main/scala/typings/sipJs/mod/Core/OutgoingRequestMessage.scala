package typings.sipJs.mod.Core

import typings.sipJs.bodyMod.Body
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.OutgoingRequestMessage")
@js.native
open class OutgoingRequestMessage protected ()
  extends typings.sipJs.coreMod.OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: Unit,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: Unit,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: Unit,
    extraHeaders: Unit,
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.grammarMod.URI,
    fromURI: typings.sipJs.grammarMod.URI,
    toURI: typings.sipJs.grammarMod.URI,
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

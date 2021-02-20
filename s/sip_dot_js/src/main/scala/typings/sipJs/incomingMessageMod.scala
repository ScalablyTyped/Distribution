package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.anon.Host
import typings.sipJs.anon.Parsed
import typings.sipJs.grammarMod.NameAddrHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object incomingMessageMod {
  
  @JSImport("sip.js/lib/core/messages/incoming-message", "IncomingMessage")
  @js.native
  class IncomingMessage () extends StObject {
    
    /**
      * Insert a header of the given name and value into the last position of the
      * header array.
      * @param name - header name
      * @param value - header value
      */
    def addHeader(name: String, value: String): Unit = js.native
    
    var body: String = js.native
    
    var callId: String = js.native
    
    var cseq: Double = js.native
    
    var data: String = js.native
    
    var from: NameAddrHeader = js.native
    
    var fromTag: String = js.native
    
    /**
      * Get the value of the given header name at the given position.
      * @param name - header name
      * @returns Returns the specified header, undefined if header doesn't exist.
      */
    def getHeader(name: String): js.UndefOr[String] = js.native
    
    /**
      * Get the header/s of the given name.
      * @param name - header name
      * @returns Array - with all the headers of the specified name.
      */
    def getHeaders(name: String): js.Array[String] = js.native
    
    /**
      * Verify the existence of the given header.
      * @param name - header name
      * @returns true if header with given name exists, false otherwise
      */
    def hasHeader(name: String): Boolean = js.native
    
    var headers: StringDictionary[js.Array[Parsed]] = js.native
    
    var method: String = js.native
    
    /**
      * Parse the given header on the given index.
      * @param name - header name
      * @param idx - header index
      * @returns Parsed header object, undefined if the
      *   header is not present or in case of a parsing error.
      */
    def parseHeader(name: String): js.UndefOr[js.Any] = js.native
    def parseHeader(name: String, idx: Double): js.UndefOr[js.Any] = js.native
    
    var referTo: js.UndefOr[String] = js.native
    
    /**
      * Message Header attribute selector. Alias of parseHeader.
      * @param name - header name
      * @param idx - header index
      * @returns Parsed header object, undefined if the
      *   header is not present or in case of a parsing error.
      *
      * @example
      * message.s('via',3).port
      */
    def s(name: String): js.UndefOr[js.Any] = js.native
    def s(name: String, idx: Double): js.UndefOr[js.Any] = js.native
    
    /**
      * Replace the value of the given header by the value.
      * @param name - header name
      * @param value - header value
      */
    def setHeader(name: String, value: String): Unit = js.native
    
    var to: NameAddrHeader = js.native
    
    var toTag: String = js.native
    
    var via: Host = js.native
    
    var viaBranch: String = js.native
  }
}

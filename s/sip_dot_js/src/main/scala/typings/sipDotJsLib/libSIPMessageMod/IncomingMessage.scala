package typings
package sipDotJsLib.libSIPMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SIPMessage", "IncomingMessage")
@js.native
class IncomingMessage () extends js.Object {
  var body: java.lang.String = js.native
  var callId: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var data: java.lang.String = js.native
  var from: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var fromTag: java.lang.String = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.Array[sipDotJsLib.Anon_Parsed]] = js.native
  var method: java.lang.String = js.native
  var referTo: js.UndefOr[java.lang.String] = js.native
  var to: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var toTag: java.lang.String = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var via: sipDotJsLib.Anon_Host = js.native
  var viaBranch: java.lang.String = js.native
  /**
    * Insert a header of the given name and value into the last position of the
    * header array.
    * @param {String} name header name
    * @param {String} value header value
    */
  def addHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Get the value of the given header name at the given position.
    * @param {String} name header name
    * @returns {String|undefined} Returns the specified header, undefined if header doesn't exist.
    */
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Get the header/s of the given name.
    * @param {String} name header name
    * @returns {Array} Array with all the headers of the specified name.
    */
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Verify the existence of the given header.
    * @param {String} name header name
    * @returns {boolean} true if header with given name exists, false otherwise
    */
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  /**
    * Parse the given header on the given index.
    * @param {String} name header name
    * @param {Number} [idx=0] header index
    * @returns {Object|undefined} Parsed header object, undefined if the
    *   header is not present or in case of a parsing error.
    */
  def parseHeader(name: java.lang.String): js.UndefOr[js.Any] = js.native
  def parseHeader(name: java.lang.String, idx: scala.Double): js.UndefOr[js.Any] = js.native
  /**
    * Message Header attribute selector. Alias of parseHeader.
    * @param {String} name header name
    * @param {Number} [idx=0] header index
    * @returns {Object|undefined} Parsed header object, undefined if the
    *   header is not present or in case of a parsing error.
    *
    * @example
    * message.s('via',3).port
    */
  def s(name: java.lang.String): js.UndefOr[js.Any] = js.native
  def s(name: java.lang.String, idx: scala.Double): js.UndefOr[js.Any] = js.native
  /**
    * Replace the value of the given header by the value.
    * @param {String} name header name
    * @param {String} value header value
    */
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
}


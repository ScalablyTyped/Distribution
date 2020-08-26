package typings.sipJs

import typings.sipJs.anon.Buffer
import typings.sipJs.sipJsBooleans.`false`
import typings.sipJs.sipJsBooleans.`true`
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/md5", JSImport.Namespace)
@js.native
object md5Mod extends js.Object {
  @js.native
  class Md5 () extends js.Object {
    var _buffer: js.Any = js.native
    var _buffer32: js.Any = js.native
    var _buffer8: js.Any = js.native
    var _bufferLength: js.Any = js.native
    var _dataLength: js.Any = js.native
    var _state: js.Any = js.native
    def appendAsciiStr(str: String): this.type = js.native
    def appendByteArray(input: Uint8Array): this.type = js.native
    def appendStr(str: String): this.type = js.native
    def end(): js.UndefOr[String | Int32Array] = js.native
    def end(raw: Boolean): js.UndefOr[String | Int32Array] = js.native
    def getState(): Buffer = js.native
    def setState(state: js.Any): Unit = js.native
    def start(): this.type = js.native
  }
  
  /* static members */
  @js.native
  object Md5 extends js.Object {
    var _hex: js.Any = js.native
    var _md5cycle: js.Any = js.native
    var buffer32Identity: js.Any = js.native
    var hexChars: js.Any = js.native
    var hexOut: js.Any = js.native
    var onePassHasher: js.Any = js.native
    var stateIdentity: js.Any = js.native
    def hashAsciiStr(str: String): String = js.native
    @JSName("hashAsciiStr")
    def hashAsciiStr_Int32Array(str: String): Int32Array = js.native
    @JSName("hashAsciiStr")
    def hashAsciiStr_false(str: String, raw: `false`): String = js.native
    @JSName("hashAsciiStr")
    def hashAsciiStr_true(str: String, raw: `true`): Int32Array = js.native
    def hashStr(str: String): String = js.native
    @JSName("hashStr")
    def hashStr_Int32Array(str: String): Int32Array = js.native
    @JSName("hashStr")
    def hashStr_false(str: String, raw: `false`): String = js.native
    @JSName("hashStr")
    def hashStr_true(str: String, raw: `true`): Int32Array = js.native
  }
  
}


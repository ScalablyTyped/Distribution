package typings.sipJs

import typings.sipJs.anon.Buffer
import typings.sipJs.sipJsBooleans.`false`
import typings.sipJs.sipJsBooleans.`true`
import typings.std.Int32Array
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object md5Mod {
  
  @JSImport("sip.js/lib/core/messages/md5", "Md5")
  @js.native
  class Md5 () extends StObject {
    
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
  object Md5 {
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5._hex")
    @js.native
    def _hex: js.Any = js.native
    @scala.inline
    def _hex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hex")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5._md5cycle")
    @js.native
    def _md5cycle: js.Any = js.native
    @scala.inline
    def _md5cycle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_md5cycle")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.buffer32Identity")
    @js.native
    def buffer32Identity: js.Any = js.native
    @scala.inline
    def buffer32Identity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer32Identity")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def hashAsciiStr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hashAsciiStr_Int32Array(str: String): Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any]).asInstanceOf[Int32Array]
    
    @scala.inline
    def hashAsciiStr_false(str: String, raw: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def hashAsciiStr_true(str: String, raw: `true`): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
    
    @scala.inline
    def hashStr(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def hashStr_Int32Array(str: String): Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any]).asInstanceOf[Int32Array]
    
    @scala.inline
    def hashStr_false(str: String, raw: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def hashStr_true(str: String, raw: `true`): Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[Int32Array]
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.hexChars")
    @js.native
    def hexChars: js.Any = js.native
    @scala.inline
    def hexChars_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexChars")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.hexOut")
    @js.native
    def hexOut: js.Any = js.native
    @scala.inline
    def hexOut_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexOut")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.onePassHasher")
    @js.native
    def onePassHasher: js.Any = js.native
    @scala.inline
    def onePassHasher_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onePassHasher")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.stateIdentity")
    @js.native
    def stateIdentity: js.Any = js.native
    @scala.inline
    def stateIdentity_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateIdentity")(x.asInstanceOf[js.Any])
  }
}

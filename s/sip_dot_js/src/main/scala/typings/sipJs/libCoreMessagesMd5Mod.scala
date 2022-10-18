package typings.sipJs

import typings.sipJs.anon.Buffer
import typings.sipJs.sipJsBooleans.`false`
import typings.sipJs.sipJsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMessagesMd5Mod {
  
  @JSImport("sip.js/lib/core/messages/md5", "Md5")
  @js.native
  open class Md5 () extends StObject {
    
    /* private */ var _buffer: Any = js.native
    
    /* private */ var _buffer32: Any = js.native
    
    /* private */ var _buffer8: Any = js.native
    
    /* private */ var _bufferLength: Any = js.native
    
    /* private */ var _dataLength: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    def appendAsciiStr(str: String): this.type = js.native
    
    def appendByteArray(input: js.typedarray.Uint8Array): this.type = js.native
    
    def appendStr(str: String): this.type = js.native
    
    def end(): js.UndefOr[String | js.typedarray.Int32Array] = js.native
    def end(raw: Boolean): js.UndefOr[String | js.typedarray.Int32Array] = js.native
    
    def getState(): Buffer = js.native
    
    def setState(state: Any): Unit = js.native
    
    def start(): this.type = js.native
  }
  /* static members */
  object Md5 {
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5._hex")
    @js.native
    def _hex: Any = js.native
    inline def _hex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_hex")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5._md5cycle")
    @js.native
    def _md5cycle: Any = js.native
    inline def _md5cycle_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_md5cycle")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.buffer32Identity")
    @js.native
    def buffer32Identity: Any = js.native
    inline def buffer32Identity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffer32Identity")(x.asInstanceOf[js.Any])
    
    inline def hashAsciiStr(str: String): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
    
    inline def hashAsciiStr_String(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashAsciiStr_false(str: String, raw: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def hashAsciiStr_true(str: String, raw: `true`): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hashAsciiStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
    
    inline def hashStr(str: String): js.typedarray.Int32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Int32Array]
    
    inline def hashStr_String(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def hashStr_false(str: String, raw: `false`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def hashStr_true(str: String, raw: `true`): js.typedarray.Int32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("hashStr")(str.asInstanceOf[js.Any], raw.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Int32Array]
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.hexChars")
    @js.native
    def hexChars: Any = js.native
    inline def hexChars_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexChars")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.hexOut")
    @js.native
    def hexOut: Any = js.native
    inline def hexOut_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hexOut")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.onePassHasher")
    @js.native
    def onePassHasher: Any = js.native
    inline def onePassHasher_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onePassHasher")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/core/messages/md5", "Md5.stateIdentity")
    @js.native
    def stateIdentity: Any = js.native
    inline def stateIdentity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateIdentity")(x.asInstanceOf[js.Any])
  }
}

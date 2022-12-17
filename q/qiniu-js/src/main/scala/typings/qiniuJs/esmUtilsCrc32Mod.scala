package typings.qiniuJs

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsCrc32Mod {
  
  @JSImport("qiniu-js/esm/utils/crc32", "CRC32")
  @js.native
  open class CRC32 () extends StObject {
    
    /* private */ var append: Any = js.native
    
    /* private */ var compute: Any = js.native
    
    /* private */ var crc: Any = js.native
    
    def file(file: File): js.Promise[Double] = js.native
    
    /* private */ var makeTable: Any = js.native
    
    /* private */ var readAsUint8Array: Any = js.native
    
    /* private */ var table: Any = js.native
  }
  /* static members */
  object CRC32 {
    
    @JSImport("qiniu-js/esm/utils/crc32", "CRC32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def file(file: File): js.Promise[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Double]]
  }
}

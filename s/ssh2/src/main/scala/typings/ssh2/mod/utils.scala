package typings.ssh2.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("ssh2", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseKey(data: String): ParsedKey | js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any]).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: String, passphrase: String): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: String, passphrase: Buffer): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: Buffer): ParsedKey | js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any]).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: Buffer, passphrase: String): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: Buffer, passphrase: Buffer): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: ParsedKey): ParsedKey | js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any]).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: ParsedKey, passphrase: String): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  inline def parseKey(data: ParsedKey, passphrase: Buffer): ParsedKey | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("parseKey")(data.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[ParsedKey | js.Error]
  
  object sftp {
    
    @JSImport("ssh2", "utils.sftp")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    sealed trait OPEN_MODE extends StObject
    @JSImport("ssh2", "utils.sftp.OPEN_MODE")
    @js.native
    object OPEN_MODE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[OPEN_MODE & Double] = js.native
      
      @js.native
      sealed trait APPEND
        extends StObject
           with OPEN_MODE
      /* 0x00000004 */ val APPEND: typings.ssh2.mod.utils.sftp.OPEN_MODE.APPEND & Double = js.native
      
      @js.native
      sealed trait CREAT
        extends StObject
           with OPEN_MODE
      /* 0x00000008 */ val CREAT: typings.ssh2.mod.utils.sftp.OPEN_MODE.CREAT & Double = js.native
      
      @js.native
      sealed trait EXCL
        extends StObject
           with OPEN_MODE
      /* 0x00000020 */ val EXCL: typings.ssh2.mod.utils.sftp.OPEN_MODE.EXCL & Double = js.native
      
      @js.native
      sealed trait READ
        extends StObject
           with OPEN_MODE
      /* 0x00000001 */ val READ: typings.ssh2.mod.utils.sftp.OPEN_MODE.READ & Double = js.native
      
      @js.native
      sealed trait TRUNC
        extends StObject
           with OPEN_MODE
      /* 0x00000010 */ val TRUNC: typings.ssh2.mod.utils.sftp.OPEN_MODE.TRUNC & Double = js.native
      
      @js.native
      sealed trait WRITE
        extends StObject
           with OPEN_MODE
      /* 0x00000002 */ val WRITE: typings.ssh2.mod.utils.sftp.OPEN_MODE.WRITE & Double = js.native
    }
    
    @js.native
    sealed trait STATUS_CODE extends StObject
    @JSImport("ssh2", "utils.sftp.STATUS_CODE")
    @js.native
    object STATUS_CODE extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[STATUS_CODE & Double] = js.native
      
      @js.native
      sealed trait BAD_MESSAGE
        extends StObject
           with STATUS_CODE
      /* 5 */ val BAD_MESSAGE: typings.ssh2.mod.utils.sftp.STATUS_CODE.BAD_MESSAGE & Double = js.native
      
      @js.native
      sealed trait CONNECTION_LOST
        extends StObject
           with STATUS_CODE
      /* 7 */ val CONNECTION_LOST: typings.ssh2.mod.utils.sftp.STATUS_CODE.CONNECTION_LOST & Double = js.native
      
      @js.native
      sealed trait EOF
        extends StObject
           with STATUS_CODE
      /* 1 */ val EOF: typings.ssh2.mod.utils.sftp.STATUS_CODE.EOF & Double = js.native
      
      @js.native
      sealed trait FAILURE
        extends StObject
           with STATUS_CODE
      /* 4 */ val FAILURE: typings.ssh2.mod.utils.sftp.STATUS_CODE.FAILURE & Double = js.native
      
      @js.native
      sealed trait NO_CONNECTION
        extends StObject
           with STATUS_CODE
      /* 6 */ val NO_CONNECTION: typings.ssh2.mod.utils.sftp.STATUS_CODE.NO_CONNECTION & Double = js.native
      
      @js.native
      sealed trait NO_SUCH_FILE
        extends StObject
           with STATUS_CODE
      /* 2 */ val NO_SUCH_FILE: typings.ssh2.mod.utils.sftp.STATUS_CODE.NO_SUCH_FILE & Double = js.native
      
      @js.native
      sealed trait OK
        extends StObject
           with STATUS_CODE
      /* 0 */ val OK: typings.ssh2.mod.utils.sftp.STATUS_CODE.OK & Double = js.native
      
      @js.native
      sealed trait OP_UNSUPPORTED
        extends StObject
           with STATUS_CODE
      /* 8 */ val OP_UNSUPPORTED: typings.ssh2.mod.utils.sftp.STATUS_CODE.OP_UNSUPPORTED & Double = js.native
      
      @js.native
      sealed trait PERMISSION_DENIED
        extends StObject
           with STATUS_CODE
      /* 3 */ val PERMISSION_DENIED: typings.ssh2.mod.utils.sftp.STATUS_CODE.PERMISSION_DENIED & Double = js.native
    }
    
    inline def flagsToString(flags: Double): OpenMode | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("flagsToString")(flags.asInstanceOf[js.Any]).asInstanceOf[OpenMode | Null]
    
    inline def stringToFlags(str: OpenMode): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFlags")(str.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  }
}

package typings.railsActivestorage

import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFileChecksumMod {
  
  object FileChecksum {
    
    @JSImport("@rails/activestorage/src/file_checksum", "FileChecksum")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(file: File, callback: js.Function2[/* error */ js.Error, /* checksum */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(file.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}

package typings.railsActivestorage

import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileChecksumMod {
  
  object FileChecksum {
    
    @JSImport("@rails/activestorage/src/file_checksum", "FileChecksum.create")
    @js.native
    def create(file: File, callback: js.Function2[/* error */ Error, /* checksum */ String, Unit]): Unit = js.native
  }
}

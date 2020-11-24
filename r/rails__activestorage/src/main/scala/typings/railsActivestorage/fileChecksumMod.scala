package typings.railsActivestorage

import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@rails/activestorage/src/file_checksum", JSImport.Namespace)
@js.native
object fileChecksumMod extends js.Object {
  
  @js.native
  object FileChecksum extends js.Object {
    
    def create(file: File, callback: js.Function2[/* error */ Error, /* checksum */ String, Unit]): Unit = js.native
  }
}

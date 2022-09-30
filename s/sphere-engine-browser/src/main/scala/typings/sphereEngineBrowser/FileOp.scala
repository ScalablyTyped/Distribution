package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileOp extends StObject
/** Specifies the mode to use when opening a file. */
@JSGlobal("FileOp")
@js.native
object FileOp extends StObject {
  
  /**
    * File will be opened for reading only, with the cursor initially placed at the beginning of
    * the file.
    */
  @js.native
  sealed trait Read
    extends StObject
       with FileOp
  
  /**
    * Enables reading and writing. If the file already exists, the file pointer will be placed at
    * the end of the file for convenience. Otherwise a new file will be created.
    */
  @js.native
  sealed trait Update
    extends StObject
       with FileOp
  
  /**
    * Enable reading and writing. If the file already exists, the existing contents will be erased
    * first. Otherwise a new file will be created.
    */
  @js.native
  sealed trait Write
    extends StObject
       with FileOp
}

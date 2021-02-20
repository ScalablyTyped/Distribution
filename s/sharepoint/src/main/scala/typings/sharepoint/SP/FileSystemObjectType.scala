package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemObjectType extends StObject
@JSGlobal("SP.FileSystemObjectType")
@js.native
object FileSystemObjectType extends StObject {
  
  @js.native
  sealed trait file extends FileSystemObjectType
  
  @js.native
  sealed trait folder extends FileSystemObjectType
  
  @js.native
  sealed trait invalid extends FileSystemObjectType
  
  @js.native
  sealed trait web extends FileSystemObjectType
}

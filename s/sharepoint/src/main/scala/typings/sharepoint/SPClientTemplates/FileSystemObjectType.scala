package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemObjectType extends StObject
@JSGlobal("SPClientTemplates.FileSystemObjectType")
@js.native
object FileSystemObjectType extends StObject {
  
  @js.native
  sealed trait File
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait Folder
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait Invalid
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait Web
    extends StObject
       with FileSystemObjectType
}

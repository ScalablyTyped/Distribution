package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileSystemObjectType extends StObject
@JSGlobal("SP.FileSystemObjectType")
@js.native
object FileSystemObjectType extends StObject {
  
  @js.native
  sealed trait file
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait folder
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait invalid
    extends StObject
       with FileSystemObjectType
  
  @js.native
  sealed trait web
    extends StObject
       with FileSystemObjectType
}

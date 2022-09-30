package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MeshIndexType extends StObject
@JSGlobal("MeshIndexType")
@js.native
object MeshIndexType extends StObject {
  
  /** No index data type */
  @js.native
  sealed trait None
    extends StObject
       with MeshIndexType
  
  /** Unsigned integer, this is the value normally used */
  @js.native
  sealed trait UInt16
    extends StObject
       with MeshIndexType
}

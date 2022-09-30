package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MeshClassificationFormat extends StObject
@JSGlobal("MeshClassificationFormat")
@js.native
object MeshClassificationFormat extends StObject {
  
  /** Do not bake classifications to mesh */
  @js.native
  sealed trait None
    extends StObject
       with MeshClassificationFormat
  
  /** Classifications are baked per vertex - vertices with multiple classes will use the value from the last face */
  @js.native
  sealed trait PerVertexFast
    extends StObject
       with MeshClassificationFormat
}

package typings.rdfjsTypes.commonMod

import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.rdfjsTypesStrings.quads
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryQuads[SupportedMetadataType]
  extends StObject
     with BaseQuery
     with BaseMetadataQuery[QuadTermName, Any, SupportedMetadataType]
     with Query[SupportedMetadataType] {
  
  def execute(opts: QueryExecuteOptions[QuadTermName]): js.Promise[ResultStream[Quad]] = js.native
  
  @JSName("resultType")
  var resultType_QueryQuads: quads = js.native
}

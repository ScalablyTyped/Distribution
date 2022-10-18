package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.anon.Variables
import typings.rdfjsTypes.dataModelMod.Variable
import typings.rdfjsTypes.rdfjsTypesStrings.bindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryBindings[SupportedMetadataType]
  extends StObject
     with BaseQuery
     with BaseMetadataQuery[Variable, Variables, SupportedMetadataType]
     with Query[SupportedMetadataType] {
  
  def execute(opts: QueryExecuteOptions[Variable]): js.Promise[ResultStream[Bindings]] = js.native
  
  @JSName("resultType")
  var resultType_QueryBindings: bindings = js.native
}

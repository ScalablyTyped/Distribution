package typings.rdfjsTypes.queryCommonMod

import typings.rdfjsTypes.dataModelMod.Variable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BaseMetadataQuery is helper interface that provides a metadata callback.
  */
@js.native
trait BaseMetadataQuery[OrderItemsType /* <: QuadTermName | Variable */, AdditionalMetadataType /* <: Any */, SupportedMetadataType] extends StObject {
  
  /**
    * Asynchronously return metadata of the current result.
    */
  def metadata[M /* <: MetadataOpts[SupportedMetadataType] */](): js.Promise[ConditionalMetadataType[AdditionalMetadataType, M, OrderItemsType]] = js.native
  def metadata[M /* <: MetadataOpts[SupportedMetadataType] */](opts: M): js.Promise[ConditionalMetadataType[AdditionalMetadataType, M, OrderItemsType]] = js.native
}

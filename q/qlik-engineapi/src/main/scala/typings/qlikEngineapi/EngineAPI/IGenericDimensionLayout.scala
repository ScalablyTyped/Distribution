package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is the layout for GenericDimensionProperties.
  */
@js.native
trait IGenericDimensionLayout extends IGenericBaseLayout {
  
  /**
    * Identifier and type of the dimension.
    */
  var qDim: INxLibraryDimensionDef = js.native
  
  /**
    * Cardinal and tags related to the dimension.
    * Length of the longest value in the field.
    */
  var qDimInfos: js.Array[IGenericDimensionInfo] = js.native
  
  /*add new member */
  /**
    * Information about publishing and permissions.
    */
  @JSName("qMeta")
  var qMeta_IGenericDimensionLayout: INxMetaTitleDescriptionTag = js.native
}
object IGenericDimensionLayout {
  
  @scala.inline
  def apply(
    qDim: INxLibraryDimensionDef,
    qDimInfos: js.Array[IGenericDimensionInfo],
    qInfo: INxInfo,
    qMeta: INxMetaTitleDescriptionTag
  ): IGenericDimensionLayout = {
    val __obj = js.Dynamic.literal(qDim = qDim.asInstanceOf[js.Any], qDimInfos = qDimInfos.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionLayout]
  }
  
  @scala.inline
  implicit class IGenericDimensionLayoutOps[Self <: IGenericDimensionLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQDim(value: INxLibraryDimensionDef): Self = this.set("qDim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimInfosVarargs(value: IGenericDimensionInfo*): Self = this.set("qDimInfos", js.Array(value :_*))
    
    @scala.inline
    def setQDimInfos(value: js.Array[IGenericDimensionInfo]): Self = this.set("qDimInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMetaTitleDescriptionTag): Self = this.set("qMeta", value.asInstanceOf[js.Any])
  }
}

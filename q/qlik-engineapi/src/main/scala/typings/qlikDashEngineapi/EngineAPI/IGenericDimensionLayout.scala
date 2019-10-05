package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is the layout for GenericDimensionProperties.
  */
trait IGenericDimensionLayout extends IGenericBaseLayout {
  /**
    * Identifier and type of the dimension.
    */
  var qDim: INxLibraryDimensionDef
  /**
    * Cardinal and tags related to the dimension.
    * Length of the longest value in the field.
    */
  var qDimInfos: js.Array[IGenericDimensionInfo]
  /*add new member */
  /**
    * Information about publishing and permissions.
    */
  @JSName("qMeta")
  var qMeta_IGenericDimensionLayout: INxMetaTitleDescriptionTag
}

object IGenericDimensionLayout {
  @scala.inline
  def apply(
    qDim: INxLibraryDimensionDef,
    qDimInfos: js.Array[IGenericDimensionInfo],
    qInfo: INxInfo,
    qMeta: INxMetaTitleDescriptionTag
  ): IGenericDimensionLayout = {
    val __obj = js.Dynamic.literal(qDim = qDim, qDimInfos = qDimInfos, qInfo = qInfo, qMeta = qMeta)
  
    __obj.asInstanceOf[IGenericDimensionLayout]
  }
}


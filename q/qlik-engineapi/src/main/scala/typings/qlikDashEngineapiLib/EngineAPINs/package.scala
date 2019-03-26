package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EngineAPINs {
  /**
    * BookmarkListObject width extend GenericObject
    */
  type IBookmarkListObject = IGenericObjectPrototype[IGenericBookmarkListProperties, IGenericBookmarkListLayout]
  type IDimensionListObject = IGenericObjectPrototype[IGenericDimensionsListProperties, IGenericDimensionListLayout]
  /**
    * FieldListObject width extend GenericObject
    */
  type IFieldListObject = IGenericObjectPrototype[IGenericFieldListProperties, IGenericFieldLayout]
  /**
    * GenericBookmarkProperties width extend GenericProperties
    */
  type IGenericBookmarkProperties = IGenericProperties
  type IGenericDerivedFieldProperties = IGenericProperties
  /**
    * GenericList...
    */
  type IGenericList = IGenericObjectPrototype[IGenericListProperties, IGenericListLayout]
  /**
    * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
    */
  type IHyperCubeObject = IGenericObjectPrototype[IGenericHyperCubeProperties, IGenericHyperCubeLayout]
  /**
    * IMeassureListObject
    */
  type IMeassureListObject = IGenericObjectPrototype[IGenericMeasureListProperties, IGenericMeasureListLayout]
  /**
    * NxCellRows...
    */
  type INxCellRows = js.Array[INxCell]
  /**
    * VariableListObject width extend GenericObject
    */
  type IVariableListObject = IGenericObjectPrototype[IGenericVariableListProperties, IGenericVariableListLayout]
  /* Rewritten from type alias, can be one of: 
    - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.N
    - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.H
    - qlikDashEngineapiLib.qlikDashEngineapiLibStrings.C
    - java.lang.String
  */
  type NxGrpType = _NxGrpType | java.lang.String
}

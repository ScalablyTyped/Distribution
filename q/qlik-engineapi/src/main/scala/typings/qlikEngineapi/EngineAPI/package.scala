package typings.qlikEngineapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EngineAPI {
  /**
    * BookmarkListObject width extend GenericObject
    */
  type IBookmarkListObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericBookmarkListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericBookmarkListLayout
  ]
  type IDimensionListObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericDimensionsListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericDimensionListLayout
  ]
  /**
    * FieldListObject width extend GenericObject
    */
  type IFieldListObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericFieldListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericFieldLayout
  ]
  /**
    * GenericBookmarkProperties width extend GenericProperties
    */
  type IGenericBookmarkProperties = typings.qlikEngineapi.EngineAPI.IGenericProperties
  type IGenericDerivedFieldProperties = typings.qlikEngineapi.EngineAPI.IGenericProperties
  /**
    * GenericList...
    */
  type IGenericList = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericListLayout
  ]
  /**
    * HyperCubeObject width extend GenericObjectPrototype<GenericHyperCubeProperties, GenericHyperCubeLayout>
    */
  type IHyperCubeObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericHyperCubeProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericHyperCubeLayout
  ]
  /**
    * IMeassureListObject
    */
  type IMeassureListObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericMeasureListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericMeasureListLayout
  ]
  /**
    * NxCellRows...
    */
  type INxCellRows = js.Array[typings.qlikEngineapi.EngineAPI.INxCell]
  /**
    * VariableListObject width extend GenericObject
    */
  type IVariableListObject = typings.qlikEngineapi.EngineAPI.IGenericObjectPrototype[
    typings.qlikEngineapi.EngineAPI.IGenericVariableListProperties, 
    typings.qlikEngineapi.EngineAPI.IGenericVariableListLayout
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.qlikEngineapi.qlikEngineapiStrings.N
    - typings.qlikEngineapi.qlikEngineapiStrings.H
    - typings.qlikEngineapi.qlikEngineapiStrings.C
    - java.lang.String
  */
  type NxGrpType = typings.qlikEngineapi.EngineAPI._NxGrpType | java.lang.String
}

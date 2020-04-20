package typings.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableMod {
  type ArrName[MClass /* <: org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel] */] = typings.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typings.reduxOrm.reduxOrmStrings.arrName, 
    typings.reduxOrm.reduxOrmStrings.items
  ]
  type ExtractModelOption[MClass /* <: org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel] */, K /* <: typings.reduxOrm.reduxOrmStrings.idAttribute | typings.reduxOrm.reduxOrmStrings.arrName | typings.reduxOrm.reduxOrmStrings.mapName | typings.reduxOrm.reduxOrmStrings.fields */, DefaultValue /* <: java.lang.String */] = DefaultValue
  type IdAttribute[MClass /* <: org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel] */] = typings.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typings.reduxOrm.reduxOrmStrings.idAttribute, 
    typings.reduxOrm.reduxOrmStrings.id
  ]
  type MapName[MClass /* <: org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel] */] = typings.reduxOrm.tableMod.ExtractModelOption[
    MClass, 
    typings.reduxOrm.reduxOrmStrings.mapName, 
    typings.reduxOrm.reduxOrmStrings.itemsById
  ]
  type TableIndexes[MClass /* <: org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in redux-orm.redux-orm/Model.FieldSpecKeys<std.InstanceType<MClass>, redux-orm.redux-orm.OneToOne | redux-orm.redux-orm.ForeignKey> ]: string}
    */ typings.reduxOrm.reduxOrmStrings.TableIndexes with org.scalablytyped.runtime.TopLevel[js.Any]
}

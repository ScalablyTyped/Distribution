package typings.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modelMod {
  type CreateProps[M /* <: typings.reduxOrm.modelMod.AnyModel */, Fields /* <: typings.reduxOrm.modelMod.ModelFields[M] */, MQsKeys /* <: /* keyof redux-orm.redux-orm/helpers.PickByValue<Fields, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ java.lang.String */, OptAttrKeys /* <: typings.reduxOrm.modelMod.FieldSpecKeys[M, typings.reduxOrm.fieldsMod.AttributeWithDefault] */, OptKeys /* <: MQsKeys | typings.reduxOrm.helpersMod.OptionalKeys[Fields] | OptAttrKeys | typings.reduxOrm.modelMod.IdKeyOpt[M] */] = typings.reduxOrm.modelMod.BlueprintProps[M, typings.std.Exclude[/* keyof Fields */ java.lang.String, OptKeys], OptKeys]
  type CustomInstanceProps[M /* <: typings.reduxOrm.modelMod.AnyModel */, Props /* <: js.Object */] = typings.std.Omit[
    Props, 
    typings.std.Extract[
      /* keyof Props */ java.lang.String, 
      typings.reduxOrm.helpersMod.KnownKeys[
        typings.reduxOrm.modelMod.ModelBlueprint[M, typings.std.Required[typings.reduxOrm.modelMod.ModelFields[M]]]
      ]
    ]
  ]
  type FieldSpecKeys[M /* <: typings.reduxOrm.modelMod.AnyModel */, TField] = typings.std.Extract[
    /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String, 
    /* keyof redux-orm.redux-orm/helpers.PickByValue<redux-orm.redux-orm/Model.ModelClass<M>['fields'], TField> */ java.lang.String
  ]
  type IdKey[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.reduxOrm.tableMod.IdAttribute[typings.reduxOrm.modelMod.ModelClass[M]]
  type IdKeyOpt[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.reduxOrm.modelMod.IdKey[M]
  type IdOrModelLike[M /* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = typings.reduxOrm.modelMod.IdType[M] | typings.reduxOrm.AnonGetId[M]
  type IdType[M /* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = scala.Double | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[any] */ js.Any)
  type ModelBlueprint[M /* <: typings.reduxOrm.modelMod.AnyModel */, Fields /* <: typings.std.Required[typings.reduxOrm.modelMod.ModelFields[M]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Fields ]: Fields[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdOrModelLike<Fields[K]> : Fields[K] extends redux-orm.redux-orm/QuerySet.MutableQuerySet<infer RM, {}>? std.ReadonlyArray<redux-orm.redux-orm/Model.IdOrModelLike<any>> : Fields[K]}
    */ typings.reduxOrm.reduxOrmStrings.ModelBlueprint with org.scalablytyped.runtime.TopLevel[js.Any]
  type ModelClass[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: M['getClass'] */ js.Any
  ]
  type ModelField = (typings.reduxOrm.querySetMod.default[js.Any, js.Object]) | (typings.reduxOrm.modelMod.SessionBoundModel[js.Any, js.Object]) | typings.reduxOrm.modelMod.Serializable
  type ModelFields[M /* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */] = js.Any
  type NonBlueprintKeys[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.std.Exclude[
    /* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/Model.AnyModel | redux-orm.redux-orm/QuerySet.default<any, {}>> */ java.lang.String, 
    (typings.reduxOrm.modelMod.FieldSpecKeys[M, typings.reduxOrm.fieldsMod.OneToOne_ | typings.reduxOrm.fieldsMod.ForeignKey]) | (/* keyof redux-orm.redux-orm/helpers.PickByValue<std.Required<redux-orm.redux-orm/Model.ModelFields<M>>, redux-orm.redux-orm/QuerySet.MutableQuerySet<any, {}>> */ java.lang.String)
  ]
  type Primitive = scala.Double | java.lang.String | scala.Boolean
  type Ref[M /* <: typings.reduxOrm.modelMod.AnyModel */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>> ]: redux-orm.redux-orm/Model.ModelFields<M>[K] extends redux-orm.redux-orm/Model.AnyModel? redux-orm.redux-orm/Model.IdType<redux-orm.redux-orm/Model.ModelFields<M>[K]> : redux-orm.redux-orm/Model.RefFields<M, keyof redux-orm.redux-orm/Model.ModelFields<M>>[K]}
    */ typings.reduxOrm.reduxOrmStrings.Ref with org.scalablytyped.runtime.TopLevel[js.Any]
  type RefFields[M /* <: typings.reduxOrm.modelMod.AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String */] = typings.std.Omit[
    typings.reduxOrm.modelMod.ModelFields[M], 
    typings.std.Extract[
      K, 
      typings.reduxOrm.modelMod.FieldSpecKeys[M, typings.reduxOrm.fieldsMod.ManyToMany]
    ]
  ]
  type RefPropOrSimple[M /* <: typings.reduxOrm.modelMod.AnyModel */, K /* <: java.lang.String */] = typings.reduxOrm.modelMod.Serializable | (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.Ref<M>[K] */ js.Any)
  type Serializable = js.UndefOr[
    typings.reduxOrm.modelMod.Primitive | js.Array[typings.reduxOrm.modelMod.Primitive] | (org.scalablytyped.runtime.StringDictionary[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias redux-orm.redux-orm/Model.Serializable */ js.Object
      ])
    ])
  ]
  type SessionBoundModel[M /* <: typings.reduxOrm.modelMod.Model[org.scalablytyped.runtime.Instantiable0[typings.reduxOrm.modelMod.AnyModel], _] */, InstanceProps /* <: js.Object */] = M with typings.reduxOrm.reduxOrmStrings.SessionBoundModel with org.scalablytyped.runtime.TopLevel[js.Any] with InstanceProps
  type SessionBoundModelField[M /* <: typings.reduxOrm.modelMod.AnyModel */, K /* <: /* keyof redux-orm.redux-orm/Model.ModelFields<M> */ java.lang.String */] = (/* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any) | (typings.reduxOrm.modelMod.SessionBoundModel[
    /* import warning: importer.ImportType#apply Failed type conversion: redux-orm.redux-orm/Model.ModelFields<M>[K] */ js.Any, 
    js.Object
  ])
  type UpdateProps[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.reduxOrm.modelMod.BlueprintProps[
    M, 
    scala.Nothing, 
    typings.std.Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ java.lang.String, 
      typings.reduxOrm.modelMod.IdKey[M]
    ]
  ]
  type UpsertProps[M /* <: typings.reduxOrm.modelMod.AnyModel */] = typings.reduxOrm.modelMod.BlueprintProps[
    M, 
    typings.reduxOrm.modelMod.IdKey[M], 
    typings.std.Exclude[
      /* keyof redux-orm.redux-orm/Model.ModelBlueprint<M, std.Required<redux-orm.redux-orm/Model.ModelFields<M>>> */ java.lang.String, 
      typings.reduxOrm.modelMod.IdKey[M]
    ]
  ]
}

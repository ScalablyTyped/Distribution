package typings.reduxOrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sessionMod {
  
  type BatchToken = js.Any
  
  type OrmSession[I /* <: typings.reduxOrm.ormMod.IndexedModelClasses[
    _, 
    typings.std.Extract[
      /* keyof any */ java.lang.String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = typings.reduxOrm.helpersMod.Assign[
    typings.reduxOrm.sessionMod.Session[I], 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
    (typings.reduxOrm.helpersMod.Diff[
      typings.reduxOrm.sessionMod.Session[I], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I]
    ]) with (typings.reduxOrm.helpersMod.Intersection[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
      typings.reduxOrm.sessionMod.Session[I]
    ]) with (typings.reduxOrm.helpersMod.Diff[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/Model.ModelType<std.InstanceType<I[K]>>}
    */ typings.reduxOrm.reduxOrmStrings.OrmSession with org.scalablytyped.runtime.TopLevel[I], 
      typings.reduxOrm.sessionMod.Session[I]
    ])
  ]
}

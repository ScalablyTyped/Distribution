package typings.reduxOrm.mod

import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.reduxMod.ORMReducer
import typings.reduxOrm.reduxMod.defaultUpdater
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm", "createReducer")
@js.native
object createReducer extends js.Object {
  
  def apply[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String]): ORMReducer[I, TAction] = js.native
  def apply[I /* <: IndexedModelClasses[
    js.Object, 
    Extract[
      /* keyof {} */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: {}[keyof {}]['modelName'] */ js.Any
    ]
  ] */, TAction /* <: js.Any */](orm: typings.reduxOrm.ormMod.ORM[I, /* keyof I */ String], updater: defaultUpdater[I, TAction]): ORMReducer[I, TAction] = js.native
}

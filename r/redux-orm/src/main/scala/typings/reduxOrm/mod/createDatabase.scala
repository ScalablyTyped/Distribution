package typings.reduxOrm.mod

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.SchemaSpec
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "createDatabase")
@js.native
object createDatabase extends js.Object {
  def apply[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.createDatabase with TopLevel[I]
  ] = js.native
}


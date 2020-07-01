package typings.reduxOrm.databaseMod

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaSpec[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
  var tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
}

object SchemaSpec {
  @scala.inline
  def apply[/* <: typings.reduxOrm.ormMod.IndexedModelClasses[
  _, 
  typings.std.Extract[
    / * keyof any * / java.lang.String, 
    / * import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] * / js.Any
  ]] */ I](
    tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
  ): SchemaSpec[I] = {
    val __obj = js.Dynamic.literal(tables = tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSpec[I]]
  }
}


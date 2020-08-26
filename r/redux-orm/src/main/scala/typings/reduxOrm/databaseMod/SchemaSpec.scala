package typings.reduxOrm.databaseMod

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSpec[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
  var tables: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I] = js.native
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
  @scala.inline
  implicit class SchemaSpecOps[Self <: SchemaSpec[_], /* <: typings.reduxOrm.ormMod.IndexedModelClasses[
  _, 
  typings.std.Extract[
    / * keyof any * / java.lang.String, 
    / * import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] * / js.Any
  ]] */ I] (val x: Self with SchemaSpec[I]) extends AnyVal {
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
    def setTables(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.ModelTableOpts<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.SchemaSpec with TopLevel[I]
    ): Self = this.set("tables", value.asInstanceOf[js.Any])
  }
  
}


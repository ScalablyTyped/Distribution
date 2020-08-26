package typings.reduxOrm.sessionMod

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.ormMod.ORM
import typings.reduxOrm.ormMod.OrmState
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/Session", JSImport.Default)
@js.native
class default[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] protected () extends Session[I] {
  /**
    * Creates a new Session.
    *
    * @param schema - {@Link ORM} instance, with bootstrapped {@link Model} prototypes.
    * @param  db - a {@link Database} instance
    * @param  state - the database {@link OrmState}
    * @param  withMutations? - whether the session should mutate data
    * @param  batchToken? - a {@link BatchToken} used by the backend to identify objects that can be
    *                                 mutated. If none is provided a default of `Symbol('ownerId')` will be created.
    *
    */
  def this(
    schema: ORM[I, /* keyof I */ String],
    db: Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ],
    state: OrmState[I]
  ) = this()
  def this(
    schema: ORM[I, /* keyof I */ String],
    db: Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ],
    state: OrmState[I],
    withMutations: Boolean
  ) = this()
  def this(
    schema: ORM[I, /* keyof I */ String],
    db: Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ],
    state: OrmState[I],
    withMutations: js.UndefOr[scala.Nothing],
    batchToken: BatchToken
  ) = this()
  def this(
    schema: ORM[I, /* keyof I */ String],
    db: Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
    */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ],
    state: OrmState[I],
    withMutations: Boolean,
    batchToken: BatchToken
  ) = this()
}


package typings.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.SchemaSpec
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.reduxOrm.tableMod.ModelTableOpts
import typings.std.Extract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm/db", JSImport.Namespace)
@js.native
object dbMod extends js.Object {
  @js.native
  /**
    * Creates a new {@link Table} instance.
    *
    * @param   userOpts - options to use.
    * @param   [userOpts.idAttribute=DefaultTableOpts.idAttribute] - the id attribute of the entity.
    * @param   [userOpts.arrName=DefaultTableOpts.arrName] - the state attribute where an array of
    *                                             entity id's are stored
    * @param   [userOpts.mapName=DefaultTableOpts.mapName] - the state attribute where the entity objects
    *                                                 are stored in a id to entity object
    *                                                 map.
    * @param   [userOpts.fields=DefaultTableOpts.fields] - mapping of field key to {@link Field} object
    */
  class Table[MClass /* <: Instantiable0[AnyModel] */] ()
    extends typings.reduxOrm.tableMod.Table[MClass] {
    def this(userOpts: ModelTableOpts[MClass]) = this()
  }
  
  def createDatabase[I /* <: IndexedModelClasses[
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
  @js.native
  object default extends js.Object {
    def createDatabase[I /* <: IndexedModelClasses[
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
    def default[I /* <: IndexedModelClasses[
        _, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.default with TopLevel[I]
      ] = js.native
  }
  
}


package typings.reduxOrm

import org.scalablytyped.runtime.Instantiable0
import typings.reduxOrm.dbDatabaseMod.Database
import typings.reduxOrm.dbDatabaseMod.SchemaSpec
import typings.reduxOrm.dbTableMod.ModelTableOpts
import typings.reduxOrm.modelMod.AnyModel
import typings.reduxOrm.ormMod.IndexedModelClasses
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dbMod {
  
  @JSImport("redux-orm/db", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("redux-orm/db", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    inline def default[I /* <: IndexedModelClasses[
        Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
        I, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
      ]]
    
    inline def createDatabase[I /* <: IndexedModelClasses[
        Any, 
        Extract[
          /* keyof any */ String, 
          /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
        ]
      ] */](schemaSpec: SchemaSpec[I]): Database[
        I, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabase")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
        I, 
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
      ]]
  }
  
  @JSImport("redux-orm/db", "Table")
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
  open class Table[MClass /* <: Instantiable0[AnyModel] */] ()
    extends typings.reduxOrm.dbTableMod.Table[MClass] {
    def this(userOpts: ModelTableOpts[MClass]) = this()
  }
  
  inline def createDatabase[I /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */](schemaSpec: SchemaSpec[I]): Database[
    I, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDatabase")(schemaSpec.asInstanceOf[js.Any]).asInstanceOf[Database[
    I, 
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>} */ js.Any
  ]]
}

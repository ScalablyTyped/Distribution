package typings.reduxOrm

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.DatabaseCreator
import typings.reduxOrm.databaseMod.SchemaSpec
import typings.reduxOrm.sessionMod.OrmSession
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ormMod {
  
  @JSImport("redux-orm/ORM", JSImport.Default)
  @js.native
  /**
    * Creates a new ORM instance.
    */
  class default[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, ModelNames /* <: /* keyof I */ String */] () extends ORM[I, ModelNames] {
    def this(opts: ORMOpts) = this()
  }
  
  @JSImport("redux-orm/ORM", "ORM")
  @js.native
  /**
    * Creates a new ORM instance.
    */
  class ORM[I /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, ModelNames /* <: /* keyof I */ String */] () extends StObject {
    def this(opts: ORMOpts) = this()
    
    /**
      * Gets a {@link Model} class by its name from the registry.
      *
      * @param  modelName - the name of the {@link Model} class to get
      *
      * @throws If {@link Model} class is not found.
      *
      * @return the {@link Model} class, if found
      */
    def get[K /* <: ModelNames */](modelName: K): /* import warning: importer.ImportType#apply Failed type conversion: I[K] */ js.Any = js.native
    
    /**
      * Acquire database reference.
      *
      * If no database exists, an instance is created using either default or supplied implementation of {@link DatabaseCreator}.
      *
      * @return A {@link Database} instance structured according to registered schema.
      */
    def getDatabase(): Database[
        I, 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof I ]: redux-orm.redux-orm/db/Table.Table<I[K]>}
      */ typings.reduxOrm.reduxOrmStrings.ORM with TopLevel[I]
      ] = js.native
    
    /**
      * Returns the empty database state.
      *
      * @see {@link OrmState}
      *
      * @return empty state
      */
    def getEmptyState(): OrmState[I] = js.native
    
    /**
      * Begins an mutable database session.
      *
      * @see {@link OrmState}
      * @see {@link SessionType}
      *
      * @param  state  - the state the database manages
      *
      * @return a new {@link Session} instance
      */
    def mutableSession(state: OrmState[I]): OrmSession[I] = js.native
    
    /**
      * Registers a {@link Model} class to the ORM.
      *
      * If the model has declared any ManyToMany fields, their
      * through models will be generated and registered with
      * this call, unless a custom through model has been specified.
      *
      * @param  model - a {@link Model} class to register
      */
    def register(
      model: (/* import warning: importer.ImportType#apply Failed type conversion: I[ModelNames] */ js.Any)*
    ): Unit = js.native
    
    /**
      * Begins an immutable database session.
      *
      * @see {@link OrmState}
      * @see {@link SessionType}
      *
      * @param  state  - the state the database manages
      *
      * @return a new {@link Session} instance
      */
    def session(): OrmSession[I] = js.native
    def session(state: OrmState[I]): OrmSession[I] = js.native
  }
  
  type IndexedModelClasses[T /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: new (): redux-orm.redux-orm/Model.AnyModel}
    */ typings.reduxOrm.reduxOrmStrings.IndexedModelClasses with TopLevel[js.Any] */, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: T[K]}
    */ typings.reduxOrm.reduxOrmStrings.IndexedModelClasses with TopLevel[T]
  
  @js.native
  trait ORMOpts extends StObject {
    
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
      */ typings.reduxOrm.reduxOrmStrings.ORMOpts with TopLevel[I]
      ] = js.native
    @JSName("createDatabase")
    var createDatabase_Original: DatabaseCreator = js.native
  }
  
  type OrmState[MClassMap /* <: IndexedModelClasses[
    _, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof MClassMap ]: redux-orm.redux-orm/db/Table.TableState<MClassMap[K]>}
    */ typings.reduxOrm.reduxOrmStrings.OrmState with TopLevel[MClassMap]
}

package typings.reduxOrm

import org.scalablytyped.runtime.TopLevel
import typings.reduxOrm.databaseMod.Database
import typings.reduxOrm.databaseMod.DatabaseCreator
import typings.reduxOrm.sessionMod.OrmSession
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ormMod {
  
  @JSImport("redux-orm/ORM", JSImport.Default)
  @js.native
  /**
    * Creates a new ORM instance.
    */
  open class default[I /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, ModelNames /* <: /* keyof I */ String */] () extends ORM[I, ModelNames] {
    def this(opts: ORMOpts[I]) = this()
  }
  
  @JSImport("redux-orm/ORM", "ORM")
  @js.native
  /**
    * Creates a new ORM instance.
    */
  open class ORM[I /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */, ModelNames /* <: /* keyof I */ String */] () extends StObject {
    def this(opts: ORMOpts[I]) = this()
    
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
      */ typings.reduxOrm.reduxOrmStrings.ORM & TopLevel[I]
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
    */ typings.reduxOrm.reduxOrmStrings.IndexedModelClasses & TopLevel[Any] */, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in K ]: T[K]}
    */ typings.reduxOrm.reduxOrmStrings.IndexedModelClasses & TopLevel[T]
  
  trait ORMOpts[MClassMap] extends StObject {
    
    var createDatabase: js.UndefOr[DatabaseCreator] = js.undefined
    
    var stateSelector: js.UndefOr[js.Function1[/* state */ Any, OrmState[MClassMap]]] = js.undefined
  }
  object ORMOpts {
    
    inline def apply[MClassMap](): ORMOpts[MClassMap] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ORMOpts[MClassMap]]
    }
    
    extension [Self <: ORMOpts[?], MClassMap](x: Self & ORMOpts[MClassMap]) {
      
      inline def setCreateDatabase(value: DatabaseCreator): Self = StObject.set(x, "createDatabase", value.asInstanceOf[js.Any])
      
      inline def setCreateDatabaseUndefined: Self = StObject.set(x, "createDatabase", js.undefined)
      
      inline def setStateSelector(value: /* state */ Any => OrmState[MClassMap]): Self = StObject.set(x, "stateSelector", js.Any.fromFunction1(value))
      
      inline def setStateSelectorUndefined: Self = StObject.set(x, "stateSelector", js.undefined)
    }
  }
  
  type OrmState[MClassMap /* <: IndexedModelClasses[
    Any, 
    Extract[
      /* keyof any */ String, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
    ]
  ] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof MClassMap ]: redux-orm.redux-orm/db/Table.TableState<MClassMap[K]>}
    */ typings.reduxOrm.reduxOrmStrings.OrmState & TopLevel[MClassMap]
}

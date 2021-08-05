package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import typings.senchaTouch.Ext.device.storage.html5.IHTML5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storage {
  
  trait IAbstract
    extends StObject
       with IBase {
    
    /** [Method] Returns the value of databaseDisplayName
      * @returns String
      */
    var getDatabaseDisplayName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of databaseName
      * @returns String
      */
    var getDatabaseName: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Returns the value of databaseSize
      * @returns Object
      */
    var getDatabaseSize: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** [Method] Returns the value of databaseVersion
      * @returns String
      */
    var getDatabaseVersion: js.UndefOr[js.Function0[String]] = js.undefined
    
    /** [Method] Sets the value of databaseDisplayName
      * @param databaseDisplayName String The new value.
      */
    var setDatabaseDisplayName: js.UndefOr[js.Function1[/* databaseDisplayName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of databaseName
      * @param databaseName String The new value.
      */
    var setDatabaseName: js.UndefOr[js.Function1[/* databaseName */ js.UndefOr[String], Unit]] = js.undefined
    
    /** [Method] Sets the value of databaseSize
      * @param databaseSize Object The new value.
      */
    var setDatabaseSize: js.UndefOr[js.Function1[/* databaseSize */ js.UndefOr[js.Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of databaseVersion
      * @param databaseVersion String The new value.
      */
    var setDatabaseVersion: js.UndefOr[js.Function1[/* databaseVersion */ js.UndefOr[String], Unit]] = js.undefined
  }
  object IAbstract {
    
    inline def apply(): IAbstract = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAbstract]
    }
    
    extension [Self <: IAbstract](x: Self) {
      
      inline def setGetDatabaseDisplayName(value: () => String): Self = StObject.set(x, "getDatabaseDisplayName", js.Any.fromFunction0(value))
      
      inline def setGetDatabaseDisplayNameUndefined: Self = StObject.set(x, "getDatabaseDisplayName", js.undefined)
      
      inline def setGetDatabaseName(value: () => String): Self = StObject.set(x, "getDatabaseName", js.Any.fromFunction0(value))
      
      inline def setGetDatabaseNameUndefined: Self = StObject.set(x, "getDatabaseName", js.undefined)
      
      inline def setGetDatabaseSize(value: () => js.Any): Self = StObject.set(x, "getDatabaseSize", js.Any.fromFunction0(value))
      
      inline def setGetDatabaseSizeUndefined: Self = StObject.set(x, "getDatabaseSize", js.undefined)
      
      inline def setGetDatabaseVersion(value: () => String): Self = StObject.set(x, "getDatabaseVersion", js.Any.fromFunction0(value))
      
      inline def setGetDatabaseVersionUndefined: Self = StObject.set(x, "getDatabaseVersion", js.undefined)
      
      inline def setSetDatabaseDisplayName(value: /* databaseDisplayName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDatabaseDisplayName", js.Any.fromFunction1(value))
      
      inline def setSetDatabaseDisplayNameUndefined: Self = StObject.set(x, "setDatabaseDisplayName", js.undefined)
      
      inline def setSetDatabaseName(value: /* databaseName */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDatabaseName", js.Any.fromFunction1(value))
      
      inline def setSetDatabaseNameUndefined: Self = StObject.set(x, "setDatabaseName", js.undefined)
      
      inline def setSetDatabaseSize(value: /* databaseSize */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "setDatabaseSize", js.Any.fromFunction1(value))
      
      inline def setSetDatabaseSizeUndefined: Self = StObject.set(x, "setDatabaseSize", js.undefined)
      
      inline def setSetDatabaseVersion(value: /* databaseVersion */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setDatabaseVersion", js.Any.fromFunction1(value))
      
      inline def setSetDatabaseVersionUndefined: Self = StObject.set(x, "setDatabaseVersion", js.undefined)
    }
  }
  
  type ICordova = IHTML5
  
  type IPhoneGap = IHTML5
  
  type ISimulator = IHTML5
  
  object html5 {
    
    trait IDatabase
      extends StObject
         with IBase {
      
      /** [Method]
        * @param sql String/String[]/Object/Object[]/SQLStatement/SQLStatement[] SQL Command to run with optional arguments and callbacks
        * @param success Function callback for successful transaction
        * @param failure Function callback for failed transaction
        */
      var transaction: js.UndefOr[
            js.Function3[
              /* sql */ js.UndefOr[js.Any], 
              /* success */ js.UndefOr[js.Any], 
              /* failure */ js.UndefOr[js.Any], 
              Unit
            ]
          ] = js.undefined
    }
    object IDatabase {
      
      inline def apply(): IDatabase = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IDatabase]
      }
      
      extension [Self <: IDatabase](x: Self) {
        
        inline def setTransaction(
          value: (/* sql */ js.UndefOr[js.Any], /* success */ js.UndefOr[js.Any], /* failure */ js.UndefOr[js.Any]) => Unit
        ): Self = StObject.set(x, "transaction", js.Any.fromFunction3(value))
        
        inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      }
    }
    
    type IHTML5 = IAbstract
    
    type ISQLStatement = IBase
  }
}

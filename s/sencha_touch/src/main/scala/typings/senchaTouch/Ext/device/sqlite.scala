package typings.senchaTouch.Ext.device

import typings.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlite {
  
  @js.native
  trait IDatabase extends IBase {
    
    /** [Method] Verifies and changes the version of the database at the same time as doing a schema update with a Ext device sqlite S
      * @param config Object The object which contains the following config options:
      */
    var changeVersion: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Returns the current version of the database
      * @returns String The database current version.
      */
    var getVersion: js.UndefOr[js.Function0[String]] = js.native
    
    /** [Method] Works the same way as transaction but performs a Ext device sqlite SQLTransaction instance in a read only mode
      * @param config Object
      */
    var readTransaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
    
    /** [Method] Performs a Ext device sqlite SQLTransaction instance in a read write mode
      * @param config Object The object which contains the following config options:
      */
    var transaction: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object IDatabase {
    
    @scala.inline
    def apply(): IDatabase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDatabase]
    }
    
    @scala.inline
    implicit class IDatabaseMutableBuilder[Self <: IDatabase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeVersion(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "changeVersion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeVersionUndefined: Self = StObject.set(x, "changeVersion", js.undefined)
      
      @scala.inline
      def setGetVersion(value: () => String): Self = StObject.set(x, "getVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetVersionUndefined: Self = StObject.set(x, "getVersion", js.undefined)
      
      @scala.inline
      def setReadTransaction(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "readTransaction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadTransactionUndefined: Self = StObject.set(x, "readTransaction", js.undefined)
      
      @scala.inline
      def setTransaction(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    }
  }
  
  @js.native
  trait ISQLResultSet extends IBase {
    
    /** [Method] Returns the row ID of the last row that the SQL statement inserted into the database if the statement inserted any r
      * @returns Number The inserted row ID.
      */
    var getInsertId: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns a Ext device sqlite SQLResultSetRowList instance representing rows returned by the SQL statement
      * @returns Ext.device.sqlite.SQLResultSetRowList The rows.
      */
    var getRows: js.UndefOr[js.Function0[ISQLResultSetRowList]] = js.native
    
    /** [Method] Returns the number of rows that were changed by the SQL statement
      * @returns Number The number of rows affected.
      */
    var getRowsAffected: js.UndefOr[js.Function0[Double]] = js.native
  }
  object ISQLResultSet {
    
    @scala.inline
    def apply(): ISQLResultSet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISQLResultSet]
    }
    
    @scala.inline
    implicit class ISQLResultSetMutableBuilder[Self <: ISQLResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetInsertId(value: () => Double): Self = StObject.set(x, "getInsertId", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetInsertIdUndefined: Self = StObject.set(x, "getInsertId", js.undefined)
      
      @scala.inline
      def setGetRows(value: () => ISQLResultSetRowList): Self = StObject.set(x, "getRows", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRowsAffected(value: () => Double): Self = StObject.set(x, "getRowsAffected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetRowsAffectedUndefined: Self = StObject.set(x, "getRowsAffected", js.undefined)
      
      @scala.inline
      def setGetRowsUndefined: Self = StObject.set(x, "getRows", js.undefined)
    }
  }
  
  @js.native
  trait ISQLResultSetRowList extends IBase {
    
    /** [Method] Returns the number of rows returned by the SQL statement
      * @returns Number The number of rows.
      */
    var getLength: js.UndefOr[js.Function0[Double]] = js.native
    
    /** [Method] Returns a row at specified index returned by the SQL statement
      * @param index Number This is required. The index of a row.
      * @returns Object The row.
      */
    var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], _]] = js.native
  }
  object ISQLResultSetRowList {
    
    @scala.inline
    def apply(): ISQLResultSetRowList = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISQLResultSetRowList]
    }
    
    @scala.inline
    implicit class ISQLResultSetRowListMutableBuilder[Self <: ISQLResultSetRowList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLengthUndefined: Self = StObject.set(x, "getLength", js.undefined)
      
      @scala.inline
      def setItem(value: /* index */ js.UndefOr[Double] => _): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  @js.native
  trait ISQLTransaction extends IBase {
    
    /** [Method] Executes an SQL statement
      * @param config Object The object which contains the following config options:
      */
    var executeSql: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], Unit]] = js.native
  }
  object ISQLTransaction {
    
    @scala.inline
    def apply(): ISQLTransaction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISQLTransaction]
    }
    
    @scala.inline
    implicit class ISQLTransactionMutableBuilder[Self <: ISQLTransaction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecuteSql(value: /* config */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "executeSql", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExecuteSqlUndefined: Self = StObject.set(x, "executeSql", js.undefined)
    }
  }
  
  @js.native
  trait ISencha extends IBase {
    
    /** [Method] Returns a Ext device sqlite Database instance
      * @param config Object The object which contains the following config options:
      * @returns Ext.device.sqlite.Database The opened database, null if an error occured.
      */
    var openDatabase: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], IDatabase]] = js.native
  }
  object ISencha {
    
    @scala.inline
    def apply(): ISencha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISencha]
    }
    
    @scala.inline
    implicit class ISenchaMutableBuilder[Self <: ISencha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenDatabase(value: /* config */ js.UndefOr[js.Any] => IDatabase): Self = StObject.set(x, "openDatabase", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenDatabaseUndefined: Self = StObject.set(x, "openDatabase", js.undefined)
    }
  }
}

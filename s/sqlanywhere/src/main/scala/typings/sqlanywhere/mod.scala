package typings.sqlanywhere

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlanywhere", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createConnection(): SybaseConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")().asInstanceOf[SybaseConnection]
  
  trait ConnectionParameters extends StObject {
    
    var AutoStart: js.UndefOr[String] = js.undefined
    
    var DatabaseFile: js.UndefOr[String] = js.undefined
    
    var Host: js.UndefOr[String] = js.undefined
    
    var Password: String
    
    var Server: String
    
    var UserId: String
  }
  object ConnectionParameters {
    
    inline def apply(Password: String, Server: String, UserId: String): ConnectionParameters = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionParameters]
    }
    
    extension [Self <: ConnectionParameters](x: Self) {
      
      inline def setAutoStart(value: String): Self = StObject.set(x, "AutoStart", value.asInstanceOf[js.Any])
      
      inline def setAutoStartUndefined: Self = StObject.set(x, "AutoStart", js.undefined)
      
      inline def setDatabaseFile(value: String): Self = StObject.set(x, "DatabaseFile", value.asInstanceOf[js.Any])
      
      inline def setDatabaseFileUndefined: Self = StObject.set(x, "DatabaseFile", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Statement extends StObject {
    
    def drop(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def exec(args: js.Array[js.Any]): js.Array[js.Any] = js.native
    def exec(
      args: js.Array[js.Any],
      cb: js.Function2[/* err */ js.UndefOr[Error], /* rows */ js.Array[js.Any], Unit]
    ): Unit = js.native
    
    def getMoreResults(): js.Array[js.Any] = js.native
  }
  
  @js.native
  trait SybaseConnection extends StObject {
    
    def close(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def commit(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def connect(params: ConnectionParameters, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def connected(): Boolean = js.native
    
    def disconnect(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def exec(query: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.Any, Unit]): Unit = js.native
    def exec(
      query: String,
      placeholders: js.Array[js.Any],
      cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def prepare(query: String): Statement = js.native
    def prepare(query: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* stmt */ Statement, Unit]): Unit = js.native
    
    def rollback(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
}

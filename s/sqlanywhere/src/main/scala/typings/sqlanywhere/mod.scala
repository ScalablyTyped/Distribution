package typings.sqlanywhere

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlanywhere", "createConnection")
  @js.native
  def createConnection(): SybaseConnection = js.native
  
  @js.native
  trait ConnectionParameters extends StObject {
    
    var AutoStart: js.UndefOr[String] = js.native
    
    var DatabaseFile: js.UndefOr[String] = js.native
    
    var Host: js.UndefOr[String] = js.native
    
    var Password: String = js.native
    
    var Server: String = js.native
    
    var UserId: String = js.native
  }
  object ConnectionParameters {
    
    @scala.inline
    def apply(Password: String, Server: String, UserId: String): ConnectionParameters = {
      val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionParameters]
    }
    
    @scala.inline
    implicit class ConnectionParametersMutableBuilder[Self <: ConnectionParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoStart(value: String): Self = StObject.set(x, "AutoStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoStartUndefined: Self = StObject.set(x, "AutoStart", js.undefined)
      
      @scala.inline
      def setDatabaseFile(value: String): Self = StObject.set(x, "DatabaseFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseFileUndefined: Self = StObject.set(x, "DatabaseFile", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "Host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "Host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Statement extends StObject {
    
    def drop(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def exec(args: js.Array[_]): js.Array[_] = js.native
    def exec(args: js.Array[_], cb: js.Function2[/* err */ js.UndefOr[Error], /* rows */ js.Array[_], Unit]): Unit = js.native
    
    def getMoreResults(): js.Array[_] = js.native
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
      placeholders: js.Array[_],
      cb: js.Function2[/* err */ js.UndefOr[Error], /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def prepare(query: String): Statement = js.native
    def prepare(query: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* stmt */ Statement, Unit]): Unit = js.native
    
    def rollback(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  }
}

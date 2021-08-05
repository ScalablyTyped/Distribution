package typings.steam

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("steam", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait EChatEntryType extends StObject
  @JSImport("steam", "EChatEntryType")
  @js.native
  object EChatEntryType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EChatEntryType & Double] = js.native
    
    @js.native
    sealed trait ChatMsg
      extends StObject
         with EChatEntryType
    /* 0 */ val ChatMsg: typings.steam.mod.EChatEntryType.ChatMsg & Double = js.native
  }
  
  @js.native
  sealed trait EChatMemberStateChange extends StObject
  @JSImport("steam", "EChatMemberStateChange")
  @js.native
  object EChatMemberStateChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EChatMemberStateChange & Double] = js.native
    
    @js.native
    sealed trait Kicked
      extends StObject
         with EChatMemberStateChange
    /* 0 */ val Kicked: typings.steam.mod.EChatMemberStateChange.Kicked & Double = js.native
  }
  
  @js.native
  sealed trait EPersonaState extends StObject
  @JSImport("steam", "EPersonaState")
  @js.native
  object EPersonaState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EPersonaState & Double] = js.native
    
    @js.native
    sealed trait Online
      extends StObject
         with EPersonaState
    /* 0 */ val Online: typings.steam.mod.EPersonaState.Online & Double = js.native
  }
  
  @js.native
  sealed trait EResult extends StObject
  @JSImport("steam", "EResult")
  @js.native
  object EResult extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EResult & Double] = js.native
    
    @js.native
    sealed trait AccountLogonDenied
      extends StObject
         with EResult
    /* 0 */ val AccountLogonDenied: typings.steam.mod.EResult.AccountLogonDenied & Double = js.native
  }
  
  @JSImport("steam", "SteamClient")
  @js.native
  class SteamClient () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    // Event emitter
    def addListener(event: String, listener: js.Function): this.type = js.native
    
    var cookie: js.Array[String] = js.native
    
    def joinChat(chatId: String): Unit = js.native
    
    def logOn(options: LogonOptions): Unit = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    
    def once(event: String, listener: js.Function): this.type = js.native
    
    def removeListener(event: String, listener: js.Function): this.type = js.native
    
    def sendMessage(source: js.Any, message: String, entryType: EChatEntryType): Unit = js.native
    
    var sessionId: String = js.native
    
    def setPersonaName(name: String): Unit = js.native
    
    def setPersonaState(state: EPersonaState): Unit = js.native
    
    var steamID: String = js.native
    
    def webLogOn(callback: js.Function1[/* cookie */ js.Array[js.Any], Unit]): Unit = js.native
  }
  
  @JSImport("steam", "servers")
  @js.native
  def servers: js.Any = js.native
  inline def servers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("servers")(x.asInstanceOf[js.Any])
  
  trait LogonOptions extends StObject {
    
    var accountName: String
    
    var authCode: js.UndefOr[String] = js.undefined
    
    var password: String
    
    var shaSentryfile: js.UndefOr[String] = js.undefined
  }
  object LogonOptions {
    
    inline def apply(accountName: String, password: String): LogonOptions = {
      val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogonOptions]
    }
    
    extension [Self <: LogonOptions](x: Self) {
      
      inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
      
      inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
      
      inline def setAuthCodeUndefined: Self = StObject.set(x, "authCode", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setShaSentryfile(value: String): Self = StObject.set(x, "shaSentryfile", value.asInstanceOf[js.Any])
      
      inline def setShaSentryfileUndefined: Self = StObject.set(x, "shaSentryfile", js.undefined)
    }
  }
}

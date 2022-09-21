package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EJSRegisterMethodType extends StObject
@JSImport("steam-user", "EJSRegisterMethodType")
@js.native
object EJSRegisterMethodType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EJSRegisterMethodType & Double] = js.native
  
  @js.native
  sealed trait Callback
    extends StObject
       with EJSRegisterMethodType
  /* 2 */ val Callback: typings.steamUser.mod.EJSRegisterMethodType.Callback & Double = js.native
  
  @js.native
  sealed trait Function
    extends StObject
       with EJSRegisterMethodType
  /* 1 */ val Function: typings.steamUser.mod.EJSRegisterMethodType.Function & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EJSRegisterMethodType
  /* 0 */ val Invalid: typings.steamUser.mod.EJSRegisterMethodType.Invalid & Double = js.native
  
  @js.native
  sealed trait Promise
    extends StObject
       with EJSRegisterMethodType
  /* 3 */ val Promise: typings.steamUser.mod.EJSRegisterMethodType.Promise & Double = js.native
}

package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeChars extends StObject
// Type chars
@JSImport("steamid", "TypeChars")
@js.native
object TypeChars extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TypeChars with scala.Nothing] = js.native
  
  @js.native
  sealed trait A extends TypeChars
  /* Type.ANON_GAMESERVER */ val A: typings.steamid.mod.TypeChars.A with scala.Nothing = js.native
  
  @js.native
  sealed trait C extends TypeChars
  /* Type.CONTENT_SERVER */ val C: typings.steamid.mod.TypeChars.C with scala.Nothing = js.native
  
  @js.native
  sealed trait G extends TypeChars
  /* Type.GAMESERVER */ val G: typings.steamid.mod.TypeChars.G with scala.Nothing = js.native
  
  @js.native
  sealed trait I extends TypeChars
  /* Type.INVALID */ val I: typings.steamid.mod.TypeChars.I with scala.Nothing = js.native
  
  @js.native
  sealed trait M extends TypeChars
  /* Type.MULTISEAT */ val M: typings.steamid.mod.TypeChars.M with scala.Nothing = js.native
  
  @js.native
  sealed trait P extends TypeChars
  /* Type.PENDING */ val P: typings.steamid.mod.TypeChars.P with scala.Nothing = js.native
  
  @js.native
  sealed trait T extends TypeChars
  /* Type.CHAT */ val T: typings.steamid.mod.TypeChars.T with scala.Nothing = js.native
  
  @js.native
  sealed trait U extends TypeChars
  /* Type.INDIVIDUAL */ val U: typings.steamid.mod.TypeChars.U with scala.Nothing = js.native
  
  @js.native
  sealed trait a extends TypeChars
  /* Type.ANON_USER */ val a: typings.steamid.mod.TypeChars.a with scala.Nothing = js.native
  
  @js.native
  sealed trait g extends TypeChars
  /* Type.CLAN */ val g: typings.steamid.mod.TypeChars.g with scala.Nothing = js.native
}

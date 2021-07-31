package typings.steamid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeChars extends StObject
// Type chars
@JSImport("steamid", "TypeChars")
@js.native
object TypeChars extends StObject {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TypeChars & scala.Nothing] = js.native
  
  @js.native
  sealed trait A
    extends StObject
       with TypeChars
  /* Type.ANON_GAMESERVER */ val A: typings.steamid.mod.TypeChars.A & scala.Nothing = js.native
  
  @js.native
  sealed trait C
    extends StObject
       with TypeChars
  /* Type.CONTENT_SERVER */ val C: typings.steamid.mod.TypeChars.C & scala.Nothing = js.native
  
  @js.native
  sealed trait G
    extends StObject
       with TypeChars
  /* Type.GAMESERVER */ val G: typings.steamid.mod.TypeChars.G & scala.Nothing = js.native
  
  @js.native
  sealed trait I
    extends StObject
       with TypeChars
  /* Type.INVALID */ val I: typings.steamid.mod.TypeChars.I & scala.Nothing = js.native
  
  @js.native
  sealed trait M
    extends StObject
       with TypeChars
  /* Type.MULTISEAT */ val M: typings.steamid.mod.TypeChars.M & scala.Nothing = js.native
  
  @js.native
  sealed trait P
    extends StObject
       with TypeChars
  /* Type.PENDING */ val P: typings.steamid.mod.TypeChars.P & scala.Nothing = js.native
  
  @js.native
  sealed trait T
    extends StObject
       with TypeChars
  /* Type.CHAT */ val T: typings.steamid.mod.TypeChars.T & scala.Nothing = js.native
  
  @js.native
  sealed trait U
    extends StObject
       with TypeChars
  /* Type.INDIVIDUAL */ val U: typings.steamid.mod.TypeChars.U & scala.Nothing = js.native
  
  @js.native
  sealed trait a
    extends StObject
       with TypeChars
  /* Type.ANON_USER */ val a: typings.steamid.mod.TypeChars.a & scala.Nothing = js.native
  
  @js.native
  sealed trait g
    extends StObject
       with TypeChars
  /* Type.CLAN */ val g: typings.steamid.mod.TypeChars.g & scala.Nothing = js.native
}

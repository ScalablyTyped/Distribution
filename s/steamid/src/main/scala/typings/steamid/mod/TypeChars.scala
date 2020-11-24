package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeChars extends js.Object
// Type chars
@JSImport("steamid", "TypeChars")
@js.native
object TypeChars extends js.Object {
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TypeChars with scala.Nothing] = js.native
  
  @js.native
  sealed trait A extends TypeChars
  /* Type.ANON_GAMESERVER */ @js.native
  object A
    extends TopLevel[A with scala.Nothing]
  
  @js.native
  sealed trait C extends TypeChars
  /* Type.CONTENT_SERVER */ @js.native
  object C
    extends TopLevel[C with scala.Nothing]
  
  @js.native
  sealed trait G extends TypeChars
  /* Type.GAMESERVER */ @js.native
  object G
    extends TopLevel[G with scala.Nothing]
  
  @js.native
  sealed trait I extends TypeChars
  /* Type.INVALID */ @js.native
  object I
    extends TopLevel[I with scala.Nothing]
  
  @js.native
  sealed trait M extends TypeChars
  /* Type.MULTISEAT */ @js.native
  object M
    extends TopLevel[M with scala.Nothing]
  
  @js.native
  sealed trait P extends TypeChars
  /* Type.PENDING */ @js.native
  object P
    extends TopLevel[P with scala.Nothing]
  
  @js.native
  sealed trait T extends TypeChars
  /* Type.CHAT */ @js.native
  object T
    extends TopLevel[T with scala.Nothing]
  
  @js.native
  sealed trait U extends TypeChars
  /* Type.INDIVIDUAL */ @js.native
  object U
    extends TopLevel[U with scala.Nothing]
  
  @js.native
  sealed trait a extends TypeChars
  /* Type.ANON_USER */ @js.native
  object a
    extends TopLevel[a with scala.Nothing]
  
  @js.native
  sealed trait g extends TypeChars
  /* Type.CLAN */ @js.native
  object g
    extends TopLevel[g with scala.Nothing]
}

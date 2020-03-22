package typings.steamid.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeChars extends js.Object

// Type chars
@JSImport("steamid", "TypeChars")
@js.native
object TypeChars extends js.Object {
  @js.native
  sealed trait A extends TypeChars
  
  @js.native
  sealed trait C extends TypeChars
  
  @js.native
  sealed trait G extends TypeChars
  
  @js.native
  sealed trait I extends TypeChars
  
  @js.native
  sealed trait M extends TypeChars
  
  @js.native
  sealed trait P extends TypeChars
  
  @js.native
  sealed trait T extends TypeChars
  
  @js.native
  sealed trait U extends TypeChars
  
  @js.native
  sealed trait a extends TypeChars
  
  @js.native
  sealed trait g extends TypeChars
  
  @JSBracketAccess
  def apply(value: scala.Nothing): js.UndefOr[TypeChars with scala.Nothing] = js.native
  /* Type.ANON_GAMESERVER */ @js.native
  object A
    extends TopLevel[A with scala.Nothing]
  
  /* Type.CONTENT_SERVER */ @js.native
  object C
    extends TopLevel[C with scala.Nothing]
  
  /* Type.GAMESERVER */ @js.native
  object G
    extends TopLevel[G with scala.Nothing]
  
  /* Type.INVALID */ @js.native
  object I
    extends TopLevel[I with scala.Nothing]
  
  /* Type.MULTISEAT */ @js.native
  object M
    extends TopLevel[M with scala.Nothing]
  
  /* Type.PENDING */ @js.native
  object P
    extends TopLevel[P with scala.Nothing]
  
  /* Type.CHAT */ @js.native
  object T
    extends TopLevel[T with scala.Nothing]
  
  /* Type.INDIVIDUAL */ @js.native
  object U
    extends TopLevel[U with scala.Nothing]
  
  /* Type.ANON_USER */ @js.native
  object a
    extends TopLevel[a with scala.Nothing]
  
  /* Type.CLAN */ @js.native
  object g
    extends TopLevel[g with scala.Nothing]
  
}


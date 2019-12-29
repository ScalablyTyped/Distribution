package typings.sharepoint.SPAnimation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Attribute extends js.Object

@JSGlobal("SPAnimation.Attribute")
@js.native
object Attribute extends js.Object {
  @js.native
  sealed trait Height extends Attribute
  
  @js.native
  sealed trait Opacity extends Attribute
  
  @js.native
  sealed trait PositionX extends Attribute
  
  @js.native
  sealed trait PositionY extends Attribute
  
  @js.native
  sealed trait Width extends Attribute
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Attribute with Double] = js.native
  /* 2 */ @js.native
  object Height extends TopLevel[Height with Double]
  
  /* 4 */ @js.native
  object Opacity extends TopLevel[Opacity with Double]
  
  /* 0 */ @js.native
  object PositionX extends TopLevel[PositionX with Double]
  
  /* 1 */ @js.native
  object PositionY extends TopLevel[PositionY with Double]
  
  /* 3 */ @js.native
  object Width extends TopLevel[Width with Double]
  
}


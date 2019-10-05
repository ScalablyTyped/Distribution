package typings.sharepoint.SPAnimation

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
  
  /* 2 */ val Height: typings.sharepoint.SPAnimation.Attribute.Height with Double = js.native
  /* 4 */ val Opacity: typings.sharepoint.SPAnimation.Attribute.Opacity with Double = js.native
  /* 0 */ val PositionX: typings.sharepoint.SPAnimation.Attribute.PositionX with Double = js.native
  /* 1 */ val PositionY: typings.sharepoint.SPAnimation.Attribute.PositionY with Double = js.native
  /* 3 */ val Width: typings.sharepoint.SPAnimation.Attribute.Width with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Attribute with Double] = js.native
}


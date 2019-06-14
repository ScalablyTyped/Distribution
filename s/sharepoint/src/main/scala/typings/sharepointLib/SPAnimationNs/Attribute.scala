package typings
package sharepointLib.SPAnimationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Attribute extends js.Object

@JSGlobal("SPAnimation.Attribute")
@js.native
object Attribute extends js.Object {
  @js.native
  sealed trait Height
    extends sharepointLib.SPAnimationNs.Attribute
  
  @js.native
  sealed trait Opacity
    extends sharepointLib.SPAnimationNs.Attribute
  
  @js.native
  sealed trait PositionX
    extends sharepointLib.SPAnimationNs.Attribute
  
  @js.native
  sealed trait PositionY
    extends sharepointLib.SPAnimationNs.Attribute
  
  @js.native
  sealed trait Width
    extends sharepointLib.SPAnimationNs.Attribute
  
  /* 2 */ val Height: Height with scala.Double = js.native
  /* 4 */ val Opacity: Opacity with scala.Double = js.native
  /* 0 */ val PositionX: PositionX with scala.Double = js.native
  /* 1 */ val PositionY: PositionY with scala.Double = js.native
  /* 3 */ val Width: Width with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPAnimationNs.Attribute with scala.Double] = js.native
}


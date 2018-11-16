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
  
  val Height: Height with java.lang.String = js.native
  val Opacity: Opacity with java.lang.String = js.native
  val PositionX: PositionX with java.lang.String = js.native
  val PositionY: PositionY with java.lang.String = js.native
  val Width: Width with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPAnimationNs.Attribute with java.lang.String] = js.native
}


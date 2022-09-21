package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EControllerLayoutType extends StObject
@JSImport("steam-user", "EControllerLayoutType")
@js.native
object EControllerLayoutType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EControllerLayoutType & Double] = js.native
  
  @js.native
  sealed trait Phone
    extends StObject
       with EControllerLayoutType
  /* 0 */ val Phone: typings.steamUser.mod.EControllerLayoutType.Phone & Double = js.native
  
  @js.native
  sealed trait Tablet
    extends StObject
       with EControllerLayoutType
  /* 1 */ val Tablet: typings.steamUser.mod.EControllerLayoutType.Tablet & Double = js.native
}

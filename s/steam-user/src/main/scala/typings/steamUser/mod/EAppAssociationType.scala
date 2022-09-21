package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppAssociationType extends StObject
@JSImport("steam-user", "EAppAssociationType")
@js.native
object EAppAssociationType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppAssociationType & Double] = js.native
  
  @js.native
  sealed trait Developer
    extends StObject
       with EAppAssociationType
  /* 2 */ val Developer: typings.steamUser.mod.EAppAssociationType.Developer & Double = js.native
  
  @js.native
  sealed trait Franchise
    extends StObject
       with EAppAssociationType
  /* 3 */ val Franchise: typings.steamUser.mod.EAppAssociationType.Franchise & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EAppAssociationType
  /* 0 */ val Invalid: typings.steamUser.mod.EAppAssociationType.Invalid & Double = js.native
  
  @js.native
  sealed trait Publisher
    extends StObject
       with EAppAssociationType
  /* 1 */ val Publisher: typings.steamUser.mod.EAppAssociationType.Publisher & Double = js.native
}

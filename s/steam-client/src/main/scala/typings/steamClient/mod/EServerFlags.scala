package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerFlags extends js.Object

@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends js.Object {
  @js.native
  sealed trait Active extends EServerFlags
  
  @js.native
  sealed trait Dedicated extends EServerFlags
  
  @js.native
  sealed trait Linux extends EServerFlags
  
  @js.native
  sealed trait None extends EServerFlags
  
  @js.native
  sealed trait Passworded extends EServerFlags
  
  @js.native
  sealed trait Private extends EServerFlags
  
  @js.native
  sealed trait Secure extends EServerFlags
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags with Double] = js.native
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 4 */ @js.native
  object Dedicated extends TopLevel[Dedicated with Double]
  
  /* 8 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Passworded extends TopLevel[Passworded with Double]
  
  /* 32 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 2 */ @js.native
  object Secure extends TopLevel[Secure with Double]
  
}


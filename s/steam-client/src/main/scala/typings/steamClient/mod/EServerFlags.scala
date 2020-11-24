package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EServerFlags extends js.Object
@JSImport("steam-client", "EServerFlags")
@js.native
object EServerFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags with Double] = js.native
  
  @js.native
  sealed trait Active extends EServerFlags
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  @js.native
  sealed trait Dedicated extends EServerFlags
  /* 4 */ @js.native
  object Dedicated extends TopLevel[Dedicated with Double]
  
  @js.native
  sealed trait Linux extends EServerFlags
  /* 8 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  @js.native
  sealed trait None extends EServerFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait Passworded extends EServerFlags
  /* 16 */ @js.native
  object Passworded extends TopLevel[Passworded with Double]
  
  @js.native
  sealed trait Private extends EServerFlags
  /* 32 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  @js.native
  sealed trait Secure extends EServerFlags
  /* 2 */ @js.native
  object Secure extends TopLevel[Secure with Double]
}

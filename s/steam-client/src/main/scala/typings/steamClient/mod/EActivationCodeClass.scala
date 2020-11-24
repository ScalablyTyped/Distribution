package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EActivationCodeClass extends js.Object
@JSImport("steam-client", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass with Double] = js.native
  
  @js.native
  sealed trait DBLookup extends EActivationCodeClass
  /* 3 */ @js.native
  object DBLookup extends TopLevel[DBLookup with Double]
  
  @js.native
  sealed trait Doom3CDKey extends EActivationCodeClass
  /* 2 */ @js.native
  object Doom3CDKey extends TopLevel[Doom3CDKey with Double]
  
  @js.native
  sealed trait Invalid extends EActivationCodeClass
  /* 4294967295.0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait Max extends EActivationCodeClass
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait Steam2010Key extends EActivationCodeClass
  /* 4 */ @js.native
  object Steam2010Key extends TopLevel[Steam2010Key with Double]
  
  @js.native
  sealed trait Test extends EActivationCodeClass
  /* 2147483647 */ @js.native
  object Test extends TopLevel[Test with Double]
  
  @js.native
  sealed trait ValveCDKey extends EActivationCodeClass
  /* 1 */ @js.native
  object ValveCDKey extends TopLevel[ValveCDKey with Double]
  
  @js.native
  sealed trait WonCDKey extends EActivationCodeClass
  /* 0 */ @js.native
  object WonCDKey extends TopLevel[WonCDKey with Double]
}

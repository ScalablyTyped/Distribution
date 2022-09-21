package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELogFileType extends StObject
@JSImport("steam-user", "ELogFileType")
@js.native
object ELogFileType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELogFileType & Double] = js.native
  
  @js.native
  sealed trait SystemBoot
    extends StObject
       with ELogFileType
  /* 0 */ val SystemBoot: typings.steamUser.mod.ELogFileType.SystemBoot & Double = js.native
  
  @js.native
  sealed trait SystemDebug
    extends StObject
       with ELogFileType
  /* 2 */ val SystemDebug: typings.steamUser.mod.ELogFileType.SystemDebug & Double = js.native
  
  @js.native
  sealed trait SystemReset
    extends StObject
       with ELogFileType
  /* 1 */ val SystemReset: typings.steamUser.mod.ELogFileType.SystemReset & Double = js.native
}

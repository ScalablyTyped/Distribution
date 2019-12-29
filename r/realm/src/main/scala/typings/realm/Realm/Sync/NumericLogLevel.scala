package typings.realm.Realm.Sync

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NumericLogLevel extends js.Object

@JSGlobal("Realm.Sync.NumericLogLevel")
@js.native
object NumericLogLevel extends js.Object {
  @js.native
  sealed trait All extends NumericLogLevel
  
  @js.native
  sealed trait Debug extends NumericLogLevel
  
  @js.native
  sealed trait Detail extends NumericLogLevel
  
  @js.native
  sealed trait Error extends NumericLogLevel
  
  @js.native
  sealed trait Fatal extends NumericLogLevel
  
  @js.native
  sealed trait Info extends NumericLogLevel
  
  @js.native
  sealed trait Off extends NumericLogLevel
  
  @js.native
  sealed trait Trace extends NumericLogLevel
  
  @js.native
  sealed trait Warn extends NumericLogLevel
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NumericLogLevel with Double] = js.native
  /* 0 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Debug extends TopLevel[Debug with Double]
  
  /* 3 */ @js.native
  object Detail extends TopLevel[Detail with Double]
  
  /* 6 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 7 */ @js.native
  object Fatal extends TopLevel[Fatal with Double]
  
  /* 4 */ @js.native
  object Info extends TopLevel[Info with Double]
  
  /* 8 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  /* 1 */ @js.native
  object Trace extends TopLevel[Trace with Double]
  
  /* 5 */ @js.native
  object Warn extends TopLevel[Warn with Double]
  
}


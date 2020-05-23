package typings.realm.Realm.Sync

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
  
}


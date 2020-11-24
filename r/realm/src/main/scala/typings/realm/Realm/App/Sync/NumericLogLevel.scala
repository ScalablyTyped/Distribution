package typings.realm.Realm.App.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NumericLogLevel extends js.Object
@JSGlobal("Realm.App.Sync.NumericLogLevel")
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

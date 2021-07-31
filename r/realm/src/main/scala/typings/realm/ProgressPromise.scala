package typings.realm

import typings.realm.Realm.ProgressNotificationCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressPromise
  extends js.Promise[Realm] {
  
  def cancel(): Unit = js.native
  
  def progress(callback: ProgressNotificationCallback): js.Promise[Realm] = js.native
}

package typings.rx.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrentThreadScheduler extends IScheduler {
  
  def scheduleRequired(): Boolean = js.native
}

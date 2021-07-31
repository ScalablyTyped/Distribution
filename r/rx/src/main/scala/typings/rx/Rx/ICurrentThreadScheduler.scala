package typings.rx.Rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICurrentThreadScheduler
  extends StObject
     with IScheduler {
  
  def scheduleRequired(): Boolean = js.native
}

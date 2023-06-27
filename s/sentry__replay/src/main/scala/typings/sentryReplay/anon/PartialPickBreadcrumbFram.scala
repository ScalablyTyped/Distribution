package typings.sentryReplay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<@sentry/replay.@sentry/replay/types/types/replayFrame.BreadcrumbFrame, 'timestamp'>> */
trait PartialPickBreadcrumbFram extends StObject {
  
  var timestamp: js.UndefOr[Any] = js.undefined
}
object PartialPickBreadcrumbFram {
  
  inline def apply(): PartialPickBreadcrumbFram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickBreadcrumbFram]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPickBreadcrumbFram] (val x: Self) extends AnyVal {
    
    inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}

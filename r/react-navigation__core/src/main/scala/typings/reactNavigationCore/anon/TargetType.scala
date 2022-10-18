package typings.reactNavigationCore.anon

import typings.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetType[EventName /* <: Keyof[js.Object] */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object TargetType {
  
  inline def apply[EventName /* <: Keyof[js.Object] */](`type`: EventName): TargetType[EventName] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetType[EventName]]
  }
  
  extension [Self <: TargetType[?], EventName /* <: Keyof[js.Object] */](x: Self & TargetType[EventName]) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

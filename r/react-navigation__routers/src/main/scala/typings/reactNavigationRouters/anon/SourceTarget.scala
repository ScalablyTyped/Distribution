package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.drawerRouterMod.DrawerActionType
import typings.reactNavigationRouters.reactNavigationRoutersStrings.CLOSE_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.OPEN_DRAWER
import typings.reactNavigationRouters.reactNavigationRoutersStrings.TOGGLE_DRAWER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceTarget
  extends StObject
     with DrawerActionType {
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER
}
object SourceTarget {
  
  @scala.inline
  def apply(`type`: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): SourceTarget = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTarget]
  }
  
  @scala.inline
  implicit class SourceTargetMutableBuilder[Self <: SourceTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: OPEN_DRAWER | CLOSE_DRAWER | TOGGLE_DRAWER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

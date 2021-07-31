package typings.reactNavigationRouters.anon

import typings.reactNavigationRouters.commonActionsMod.Action
import typings.reactNavigationRouters.reactNavigationRoutersStrings.GO_BACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source
  extends StObject
     with Action {
  
  var source: js.UndefOr[String] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: GO_BACK
}
object Source {
  
  @scala.inline
  def apply(): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("GO_BACK")
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: GO_BACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

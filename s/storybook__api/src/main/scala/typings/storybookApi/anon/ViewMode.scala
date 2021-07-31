package typings.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMode extends StObject {
  
  var ref: js.UndefOr[String] = js.undefined
  
  var viewMode: js.UndefOr[typings.storybookApi.modulesStoriesMod.ViewMode] = js.undefined
}
object ViewMode {
  
  @scala.inline
  def apply(): ViewMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMode]
  }
  
  @scala.inline
  implicit class ViewModeMutableBuilder[Self <: ViewMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setViewMode(value: typings.storybookApi.modulesStoriesMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}

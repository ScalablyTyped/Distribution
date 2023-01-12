package typings.sketchHqSketchFileFormatTs.distCjsTypesMod

import typings.sketchHqSketchFileFormatTs.sketchHqSketchFileFormatTsStrings.MSImmutableOverrideProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverrideProperty
  extends StObject
     with AnyObject {
  
  var _class: MSImmutableOverrideProperty
  
  var canOverride: Boolean
  
  var overrideName: OverrideName
}
object OverrideProperty {
  
  inline def apply(canOverride: Boolean, overrideName: OverrideName): OverrideProperty = {
    val __obj = js.Dynamic.literal(_class = "MSImmutableOverrideProperty", canOverride = canOverride.asInstanceOf[js.Any], overrideName = overrideName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverrideProperty] (val x: Self) extends AnyVal {
    
    inline def setCanOverride(value: Boolean): Self = StObject.set(x, "canOverride", value.asInstanceOf[js.Any])
    
    inline def setOverrideName(value: OverrideName): Self = StObject.set(x, "overrideName", value.asInstanceOf[js.Any])
    
    inline def set_class(value: MSImmutableOverrideProperty): Self = StObject.set(x, "_class", value.asInstanceOf[js.Any])
  }
}

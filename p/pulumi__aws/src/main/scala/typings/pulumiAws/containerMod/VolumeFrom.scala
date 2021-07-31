package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeFrom extends StObject {
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var sourceContainer: js.UndefOr[String] = js.undefined
}
object VolumeFrom {
  
  @scala.inline
  def apply(): VolumeFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeFrom]
  }
  
  @scala.inline
  implicit class VolumeFromMutableBuilder[Self <: VolumeFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setSourceContainer(value: String): Self = StObject.set(x, "sourceContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContainerUndefined: Self = StObject.set(x, "sourceContainer", js.undefined)
  }
}

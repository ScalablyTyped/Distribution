package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
  */
@js.native
trait DownwardAPIProjection extends StObject {
  
  /**
    * Items is a list of DownwardAPIVolume file
    */
  var items: js.Array[DownwardAPIVolumeFile] = js.native
}
object DownwardAPIProjection {
  
  @scala.inline
  def apply(items: js.Array[DownwardAPIVolumeFile]): DownwardAPIProjection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIProjection]
  }
  
  @scala.inline
  implicit class DownwardAPIProjectionMutableBuilder[Self <: DownwardAPIProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DownwardAPIVolumeFile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DownwardAPIVolumeFile*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

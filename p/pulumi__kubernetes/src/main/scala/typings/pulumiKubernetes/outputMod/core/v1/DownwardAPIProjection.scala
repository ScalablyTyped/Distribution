package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
  */
@js.native
trait DownwardAPIProjection extends js.Object {
  
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
  implicit class DownwardAPIProjectionOps[Self <: DownwardAPIProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: DownwardAPIVolumeFile*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[DownwardAPIVolumeFile]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
}

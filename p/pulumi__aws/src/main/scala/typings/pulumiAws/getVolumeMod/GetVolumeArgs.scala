package typings.pulumiAws.getVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetVolumeFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVolumeArgs extends js.Object {
  
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-volumes in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetVolumeFilter]] = js.native
  
  /**
    * If more than one result is returned, use the most
    * recent Volume.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * A map of tags for the resource.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetVolumeArgs {
  
  @scala.inline
  def apply(): GetVolumeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVolumeArgs]
  }
  
  @scala.inline
  implicit class GetVolumeArgsOps[Self <: GetVolumeArgs] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: GetVolumeFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetVolumeFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}

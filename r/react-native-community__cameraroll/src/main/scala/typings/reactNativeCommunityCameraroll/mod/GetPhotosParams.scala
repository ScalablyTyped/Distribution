package typings.reactNativeCommunityCameraroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Shape of the param arg for the `getPhotosFast` function.
  */
@js.native
trait GetPhotosParams extends js.Object {
  
  /**
    * A cursor that matches `page_info { end_cursor }` returned from a previous
    * call to `getPhotos`. Note that using this will reduce performance
    * slightly on iOS. An alternative is just using the `fromTime` and `toTime`
    * filters, which have no such impact.
    */
  var after: js.UndefOr[String] = js.native
  
  /**
    * Specifies filter on asset type
    */
  var assetType: js.UndefOr[AssetType] = js.native
  
  /**
    * The number of photos wanted in reverse order of the photo application
    * (i.e. most recent first).
    */
  var first: Double = js.native
  
  /**
    * Filter by creation time with a timestamp in milliseconds. This time is
    * exclusive, so we'll select all photos with `timestamp > fromTime`.
    */
  var fromTime: js.UndefOr[Double] = js.native
  
  /**
    * Specifies filter on group names, like 'Recent Photos' or custom album
    * titles.
    */
  var groupName: js.UndefOr[String] = js.native
  
  /**
    * Specifies which group types to filter the results to.
    */
  var groupTypes: js.UndefOr[GroupType] = js.native
  
  /**
    * Specific fields in the output that we want to include, even though they
    * might have some performance impact.
    */
  var include: js.UndefOr[js.Array[Include]] = js.native
  
  /**
    * Filter by mimetype (e.g. image/jpeg). Note that using this will reduce
    * performance slightly on iOS.
    */
  var mimeTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Filter by creation time with a timestamp in milliseconds. This time is
    * inclusive, so we'll select all photos with `timestamp <= toTime`.
    */
  var toTime: js.UndefOr[Double] = js.native
}
object GetPhotosParams {
  
  @scala.inline
  def apply(first: Double): GetPhotosParams = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhotosParams]
  }
  
  @scala.inline
  implicit class GetPhotosParamsOps[Self <: GetPhotosParams] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfter(value: String): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setAssetType(value: AssetType): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setFromTime(value: Double): Self = this.set("fromTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromTime: Self = this.set("fromTime", js.undefined)
    
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    
    @scala.inline
    def setGroupTypes(value: GroupType): Self = this.set("groupTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupTypes: Self = this.set("groupTypes", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: Include*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[Include]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMimeTypesVarargs(value: String*): Self = this.set("mimeTypes", js.Array(value :_*))
    
    @scala.inline
    def setMimeTypes(value: js.Array[String]): Self = this.set("mimeTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMimeTypes: Self = this.set("mimeTypes", js.undefined)
    
    @scala.inline
    def setToTime(value: Double): Self = this.set("toTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToTime: Self = this.set("toTime", js.undefined)
  }
}

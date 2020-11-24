package typings.projectOxford.mod.VisionResponses

import typings.projectOxford.anon.AccentColor
import typings.projectOxford.anon.AdultScore
import typings.projectOxford.anon.Age
import typings.projectOxford.anon.ClipArtType
import typings.projectOxford.anon.Format
import typings.projectOxford.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analyze extends js.Object {
  
  var adult: AdultScore = js.native
  
  var categories: js.Array[Name] = js.native
  
  var color: AccentColor = js.native
  
  var faces: js.Array[Age] = js.native
  
  var imageType: ClipArtType = js.native
  
  var metadata: Format = js.native
  
  var requestId: String = js.native
}
object Analyze {
  
  @scala.inline
  def apply(
    adult: AdultScore,
    categories: js.Array[Name],
    color: AccentColor,
    faces: js.Array[Age],
    imageType: ClipArtType,
    metadata: Format,
    requestId: String
  ): Analyze = {
    val __obj = js.Dynamic.literal(adult = adult.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], faces = faces.asInstanceOf[js.Any], imageType = imageType.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analyze]
  }
  
  @scala.inline
  implicit class AnalyzeOps[Self <: Analyze] (val x: Self) extends AnyVal {
    
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
    def setAdult(value: AdultScore): Self = this.set("adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesVarargs(value: Name*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[Name]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: AccentColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacesVarargs(value: Age*): Self = this.set("faces", js.Array(value :_*))
    
    @scala.inline
    def setFaces(value: js.Array[Age]): Self = this.set("faces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageType(value: ClipArtType): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Format): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
  }
}

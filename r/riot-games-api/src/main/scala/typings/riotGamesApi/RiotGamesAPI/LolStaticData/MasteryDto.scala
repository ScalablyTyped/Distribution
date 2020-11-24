package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryDto extends js.Object {
  
  var description: js.Array[String] = js.native
  
  var id: Double = js.native
  
  var image: ImageDto = js.native
  
  var masteryTree: String = js.native
  
  var name: String = js.native
  
  var prereq: String = js.native
  
  var ranks: Double = js.native
  
  var sanitizedDescription: js.Array[String] = js.native
}
object MasteryDto {
  
  @scala.inline
  def apply(
    description: js.Array[String],
    id: Double,
    image: ImageDto,
    masteryTree: String,
    name: String,
    prereq: String,
    ranks: Double,
    sanitizedDescription: js.Array[String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], masteryTree = masteryTree.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any], ranks = ranks.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
  
  @scala.inline
  implicit class MasteryDtoOps[Self <: MasteryDto] (val x: Self) extends AnyVal {
    
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
    def setDescriptionVarargs(value: String*): Self = this.set("description", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: js.Array[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasteryTree(value: String): Self = this.set("masteryTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereq(value: String): Self = this.set("prereq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRanks(value: Double): Self = this.set("ranks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescriptionVarargs(value: String*): Self = this.set("sanitizedDescription", js.Array(value :_*))
    
    @scala.inline
    def setSanitizedDescription(value: js.Array[String]): Self = this.set("sanitizedDescription", value.asInstanceOf[js.Any])
  }
}

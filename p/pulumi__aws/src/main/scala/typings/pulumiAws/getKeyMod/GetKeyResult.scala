package typings.pulumiAws.getKeyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetKeyResult extends js.Object {
  
  /**
    * The date and time when the API Key was created.
    */
  val createdDate: String = js.native
  
  /**
    * The description of the API Key.
    */
  val description: String = js.native
  
  /**
    * Specifies whether the API Key is enabled.
    */
  val enabled: Boolean = js.native
  
  /**
    * Set to the ID of the API Key.
    */
  val id: String = js.native
  
  /**
    * The date and time when the API Key was last updated.
    */
  val lastUpdatedDate: String = js.native
  
  /**
    * Set to the name of the API Key.
    */
  val name: String = js.native
  
  /**
    * A map of tags for the resource.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * Set to the value of the API Key.
    */
  val value: String = js.native
}
object GetKeyResult {
  
  @scala.inline
  def apply(
    createdDate: String,
    description: String,
    enabled: Boolean,
    id: String,
    lastUpdatedDate: String,
    name: String,
    tags: StringDictionary[String],
    value: String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyResult]
  }
  
  @scala.inline
  implicit class GetKeyResultOps[Self <: GetKeyResult] (val x: Self) extends AnyVal {
    
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
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: String): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

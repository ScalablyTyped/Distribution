package typings.pulumiAws.getKeyMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any],
    value: String
  ): GetKeyResult = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetKeyResult]
  }
}


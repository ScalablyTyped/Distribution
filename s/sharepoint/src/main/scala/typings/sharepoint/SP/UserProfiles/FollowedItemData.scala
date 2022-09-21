package typings.sharepoint.SP.UserProfiles

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SP.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains additional data that can be attached to a FollowedItem object */
@js.native
trait FollowedItemData
  extends StObject
     with ClientObject {
  
  /** An unordered collection of key/value pairs for custom properties to be set on the item. */
  def get_properties(): StringDictionary[Any] = js.native
}

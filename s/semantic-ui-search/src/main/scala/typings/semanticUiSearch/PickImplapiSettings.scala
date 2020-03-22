package typings.semanticUiSearch

import typings.semanticUiApi.SemanticUI.ApiSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<semantic-ui-search.SemanticUI.SearchSettings._Impl, 'apiSettings'> */
trait PickImplapiSettings extends js.Object {
  var apiSettings: ApiSettings
}

object PickImplapiSettings {
  @scala.inline
  def apply(apiSettings: ApiSettings): PickImplapiSettings = {
    val __obj = js.Dynamic.literal(apiSettings = apiSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PickImplapiSettings]
  }
}


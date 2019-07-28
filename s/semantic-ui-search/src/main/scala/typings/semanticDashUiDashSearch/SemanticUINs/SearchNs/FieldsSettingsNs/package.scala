package typings.semanticDashUiDashSearch.SemanticUINs.SearchNs

import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.action
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.actionText
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.actionURL
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categories
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categoryName
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.categoryResults
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.description
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.image
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.price
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.results
import typings.semanticDashUiDashSearch.semanticDashUiDashSearchStrings.title
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FieldsSettingsNs {
  type Param = (Pick[
    _Impl, 
    categories | categoryName | categoryResults | description | image | price | results | title | action | actionText | actionURL
  ]) with (Partial[
    Pick[
      _Impl, 
      categories | categoryName | categoryResults | description | image | price | results | title | action | actionText | actionURL
    ]
  ])
}

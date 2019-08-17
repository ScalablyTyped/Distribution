package typings.semanticDashUiDashRating.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RatingSettingsNs {
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.className
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.clearable
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.debug
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.error
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.fireOnInit
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.initialRating
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.interactive
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.name
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.namespace
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.onRate
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.performance
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.selector
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.silent
  import typings.semanticDashUiDashRating.semanticDashUiDashRatingStrings.verbose
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    initialRating | fireOnInit | clearable | interactive | onRate | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      initialRating | fireOnInit | clearable | interactive | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}

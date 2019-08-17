package typings.semanticDashUiDashForm.SemanticUINs.FormNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PromptSettingsNs {
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.`match`
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.checked
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.contain
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.containExactly
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.creditCard
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.decimal
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.different
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.doesntContain
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.doesntContainExactly
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.email
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.empty
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.exactCount
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.exactLength
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.integer
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.is
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.isExactly
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.length
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.maxCount
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.maxLength
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.minCount
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.minLength
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.not
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.notExactly
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.number
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.regExp
  import typings.semanticDashUiDashForm.semanticDashUiDashFormStrings.url
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    empty | checked | email | url | regExp | integer | decimal | number | is | isExactly | not | notExactly | contain | containExactly | doesntContain | doesntContainExactly | minLength | length | exactLength | maxLength | `match` | different | creditCard | minCount | exactCount | maxCount
  ]) with (Partial[
    Pick[
      _Impl, 
      empty | checked | email | url | regExp | integer | decimal | number | is | isExactly | not | notExactly | contain | containExactly | doesntContain | doesntContainExactly | minLength | length | exactLength | maxLength | `match` | different | creditCard | minCount | exactCount | maxCount
    ]
  ])
}

package typings.semanticDashUiDashShape.SemanticUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ShapeSettingsNs {
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.beforeChange
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.className
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.debug
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.duration
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.error
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.height
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.name
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.namespace
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.onChange
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.performance
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.selector
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.silent
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.verbose
  import typings.semanticDashUiDashShape.semanticDashUiDashShapeStrings.width
  import typings.std.Partial
  import typings.std.Pick

  type Param = (Pick[
    _Impl, 
    duration | width | height | beforeChange | onChange | selector | className | error | namespace | name | silent | debug | performance | verbose
  ]) with (Partial[
    Pick[
      _Impl, 
      duration | width | height | selector | className | error | namespace | name | silent | debug | performance | verbose
    ]
  ])
}

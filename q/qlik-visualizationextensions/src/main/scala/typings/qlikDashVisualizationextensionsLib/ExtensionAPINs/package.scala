package typings
package qlikDashVisualizationextensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ExtensionAPINs {
  //#region IDefinition
  type ExpressionType = qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.always | qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.optional | qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.Empty
  type ICustomInteger = ICustomNumber
  // ExtensionAPI
  type SelectionModeType = qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.CONFIRM | qlikDashVisualizationextensionsLib.qlikDashVisualizationextensionsLibStrings.QUICK
  type func[T] = js.Function0[T]
  type valueOrfunc[T] = T | func[T]
}

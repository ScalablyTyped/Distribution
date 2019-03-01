package typings
package semanticDashUiDashProgressLib.SemanticUINs.ProgressNs.SelectorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default '> .bar
    */
  var bar: java.lang.String
  /**
    * @default '> .label'
    */
  var label: java.lang.String
  /**
    * @default '.bar > .progress'
    */
  var progress: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(bar: java.lang.String, label: java.lang.String, progress: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bar")(bar)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("progress")(progress)
    __obj.asInstanceOf[_Impl]
  }
}


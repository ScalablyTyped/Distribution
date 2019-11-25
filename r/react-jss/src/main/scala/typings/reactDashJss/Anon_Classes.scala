package typings.reactDashJss

import typings.reactDashJss.reactDashJssMod.WithStyles
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Classes[Props /* <: WithStyles[S] */] extends js.Object {
  var classes: js.UndefOr[
    Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ]
  ] = js.undefined
}

object Anon_Classes {
  @scala.inline
  def apply[Props /* <: WithStyles[S] */](
    classes: Partial[
      /* import warning: importer.ImportType#apply Failed type conversion: Props['classes'] */ js.Any
    ] = null
  ): Anon_Classes[Props] = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Classes[Props]]
  }
}


package typings.semanticUiShape

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-shape.SemanticUI.ShapeSettings._Impl, keyof semantic-ui-shape.SemanticUI.ShapeSettings._Impl>> */
trait PartialPickImplkeyofImpl extends js.Object {
  var beforeChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var className: js.UndefOr[ClassNameSettings] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[ErrorSettings] = js.undefined
  var height: js.UndefOr[next | initial | Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]] = js.undefined
  var performance: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[SelectorSettings] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[next | initial | Double] = js.undefined
}

object PartialPickImplkeyofImpl {
  @scala.inline
  def apply(
    beforeChange: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    className: ClassNameSettings = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    error: ErrorSettings = null,
    height: next | initial | Double = null,
    name: String = null,
    namespace: String = null,
    onChange: js.ThisFunction0[/* this */ JQuery, Unit] = null,
    performance: js.UndefOr[Boolean] = js.undefined,
    selector: SelectorSettings = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    width: next | initial | Double = null
  ): PartialPickImplkeyofImpl = {
    val __obj = js.Dynamic.literal()
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(beforeChange.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (!js.isUndefined(performance)) __obj.updateDynamic("performance")(performance.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickImplkeyofImpl]
  }
}


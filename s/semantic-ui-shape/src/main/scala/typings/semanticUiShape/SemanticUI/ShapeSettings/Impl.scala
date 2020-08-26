package typings.semanticUiShape.SemanticUI.ShapeSettings

import typings.semanticUiShape.SemanticUI.Shape.ClassNameSettings
import typings.semanticUiShape.SemanticUI.Shape.ErrorSettings
import typings.semanticUiShape.SemanticUI.Shape.SelectorSettings
import typings.semanticUiShape.semanticUiShapeStrings.initial
import typings.semanticUiShape.semanticUiShapeStrings.next
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  var className: ClassNameSettings = js.native
  /**
    * Debug output to console
    */
  var debug: Boolean = js.native
  // region Shape Settings
  /**
    * Duration of side change animation
    *
    * @default 700
    */
  var duration: Double = js.native
  // endregion
  // region Debug Settings
  var error: ErrorSettings = js.native
  /**
    * When set to next will use the height of the next side during the shape's animation.
    * When set to initial it will use the height of the shape at initialization.
    * When set to a specific pixel height, will force the height to that height.
    *
    * @default 'initial'
    * @since 2.2
    */
  var height: next | initial | Double = js.native
  // endregion
  // region Debug Settings
  /**
    * Name used in log statements
    */
  var name: String = js.native
  // endregion
  // region Component Settings
  // region DOM Settings
  /**
    * Event namespace. Makes sure module teardown does not effect other events attached to an element.
    */
  var namespace: String = js.native
  /**
    * Show console.table output with performance metrics
    */
  var performance: Boolean = js.native
  // endregion
  // region DOM Settings
  var selector: SelectorSettings = js.native
  /**
    * Silences all console output including error messages, regardless of other debug settings.
    */
  var silent: Boolean = js.native
  /**
    * Debug output includes all internal behaviors
    */
  var verbose: Boolean = js.native
  /**
    * When set to next will use the width of the next side during the shape's animation.
    * When set to initial it will use the width of the shape at initialization.
    * When set to a specific pixel height, will force the width to that height.
    *
    * @default 'initial'
    * @since 2.2
    */
  var width: next | initial | Double = js.native
  // endregion
  // region Callbacks
  /**
    * Is called before side change
    */
  def beforeChange(): Unit = js.native
  /**
    * Is called after visible side change
    */
  def onChange(): Unit = js.native
}

object Impl {
  @scala.inline
  def apply(
    beforeChange: () => Unit,
    className: ClassNameSettings,
    debug: Boolean,
    duration: Double,
    error: ErrorSettings,
    height: next | initial | Double,
    name: String,
    namespace: String,
    onChange: () => Unit,
    performance: Boolean,
    selector: SelectorSettings,
    silent: Boolean,
    verbose: Boolean,
    width: next | initial | Double
  ): Impl = {
    val __obj = js.Dynamic.literal(beforeChange = js.Any.fromFunction0(beforeChange), className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBeforeChange(value: () => Unit): Self = this.set("beforeChange", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: ClassNameSettings): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ErrorSettings): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: next | initial | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorSettings): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: next | initial | Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}


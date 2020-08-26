package typings.simmerjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simmerjs", JSImport.Default)
@js.native
/**
  * @param scope The context in which Simmer should query for elements.
  * Generally speaking this would be the window, which is the default value,
  * but it would be overriden in a situation where you might be using Simmer
  * against a Virtual Dom implementation. If you are using a Virtual DOM, you
  * should provide the Window object of the Virtual DOM
  * @param options Options object allowing you to override the default
  * configuration for Simmer's behaviour.
  * @param query A query engine you wish Simmer to use when evaluating
  * generated selectors. By default Simmer uses the
  * `window.document.querySelectorAll` function and if you provide a window
  * to the scope, Simmer will assume that you want it to use the
  * `document.querySelectorAll` on that window. But if you wish Simmer to use
  * another custom function, such as your own tweaked version of jQuery, you
  * can do so by passing the third argument to the Simmer constructor.
  */
class defaultCls () extends Simmer {
  def this(scope: Scope) = this()
  def this(scope: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(scope: Scope, options: Options) = this()
  def this(scope: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], query: QueryEngine) = this()
  def this(scope: js.UndefOr[scala.Nothing], options: Options, query: QueryEngine) = this()
  def this(scope: Scope, options: js.UndefOr[scala.Nothing], query: QueryEngine) = this()
  def this(scope: Scope, options: Options, query: QueryEngine) = this()
}


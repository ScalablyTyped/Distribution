package typings.simmerjs.simmerjsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimmerConstructor
  extends /**
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
Instantiable0[Simmer]
     with Instantiable1[/* scope */ Scope, Simmer]
     with Instantiable2[/* scope */ Scope, /* options */ Options, Simmer]
     with Instantiable3[/* scope */ Scope, /* options */ Options, /* query */ QueryEngine, Simmer] {
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
  def apply(): Simmer = js.native
  def apply(scope: Scope): Simmer = js.native
  def apply(scope: Scope, options: Options): Simmer = js.native
  def apply(scope: Scope, options: Options, query: QueryEngine): Simmer = js.native
}


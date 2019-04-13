package typings
package reactDashDevDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dev-utils/getCSSModuleLocalIdent", JSImport.Namespace)
@js.native
object getCSSModuleLocalIdentMod extends js.Object {
  /**
    * Creates a class name for CSS Modules that uses either the filename or folder
    * name if named `index.module.css`.
    *
    * For `MyFolder/MyComponent.module.css` and class `MyClass` the output will be
    * `MyComponent.module_MyClass__[hash]`. For `MyFolder/index.module.css` and
    * class `MyClass` the output will be `MyFolder_MyClass__[hash]`
    */
  def apply(
    context: webpackLib.webpackMod.loaderNs.LoaderContext,
    localIdentName: java.lang.String,
    localName: java.lang.String,
    options: js.Object
  ): java.lang.String = js.native
}


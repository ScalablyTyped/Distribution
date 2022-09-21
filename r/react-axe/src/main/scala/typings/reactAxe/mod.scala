package typings.reactAxe

import typings.axeCore.mod.ElementContext
import typings.axeCore.mod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Run axe against all changes made in a React app.
    * @parma {React} _React React instance
    * @param {ReactDOM} _ReactDOM ReactDOM instance
    * @param {Number} _timeout debounce timeout in milliseconds
    * @parma {Spec} conf axe.configure Spec object
    * @param {ElementContext} _context axe ElementContent object
    */
  inline def apply(_React: Any, _ReactDOM: Any, _timeout: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(_React.asInstanceOf[js.Any], _ReactDOM.asInstanceOf[js.Any], _timeout.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(_React: Any, _ReactDOM: Any, _timeout: Double, conf: Unit, _context: ElementContext): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(_React.asInstanceOf[js.Any], _ReactDOM.asInstanceOf[js.Any], _timeout.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], _context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(_React: Any, _ReactDOM: Any, _timeout: Double, conf: Spec): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(_React.asInstanceOf[js.Any], _ReactDOM.asInstanceOf[js.Any], _timeout.asInstanceOf[js.Any], conf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def apply(_React: Any, _ReactDOM: Any, _timeout: Double, conf: Spec, _context: ElementContext): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].apply(_React.asInstanceOf[js.Any], _ReactDOM.asInstanceOf[js.Any], _timeout.asInstanceOf[js.Any], conf.asInstanceOf[js.Any], _context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("react-axe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

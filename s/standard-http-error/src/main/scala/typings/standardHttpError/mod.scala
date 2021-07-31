package typings.standardHttpError

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("standard-http-error", JSImport.Namespace)
  @js.native
  class ^ protected () extends HttpError {
    def this(code: String) = this()
    def this(code: Double) = this()
    def this(code: String, message: String) = this()
    def this(code: String, props: js.Object) = this()
    def this(code: Double, message: String) = this()
    def this(code: Double, props: js.Object) = this()
    def this(code: String, message: String, props: js.Object) = this()
    def this(code: String, message: Unit, props: js.Object) = this()
    def this(code: Double, message: String, props: js.Object) = this()
    def this(code: Double, message: Unit, props: js.Object) = this()
  }
  
  @js.native
  trait HttpError
    extends typings.standardError.mod.^ {
    
    var code: Double = js.native
  }
}

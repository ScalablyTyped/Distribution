package typings.sipJs

import typings.sipJs.parametersMod.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/grammar/uri", JSImport.Namespace)
@js.native
object uriMod extends js.Object {
  
  @js.native
  class URI protected () extends Parameters {
    /**
      * Constructor
      * @param scheme -
      * @param user -
      * @param host -
      * @param port -
      * @param parameters -
      * @param headers -
      */
    def this(scheme: String, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: String, user: String, host: String, port: js.UndefOr[scala.Nothing], parameters: js.Any) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: js.UndefOr[scala.Nothing],
      parameters: js.Any,
      headers: js.Any
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: js.UndefOr[scala.Nothing],
      headers: js.Any
    ) = this()
    def this(scheme: String, user: String, host: String, port: Double, parameters: js.Any, headers: js.Any) = this()
    
    /* private */ def _normal: js.Any = js.native
    
    /* private */ def _raw: js.Any = js.native
    
    var _toString: js.Any = js.native
    
    def aor: String = js.native
    
    def clearHeaders(): Unit = js.native
    
    def deleteHeader(header: String): js.Any = js.native
    
    var escapeUser: js.Any = js.native
    
    def getHeader(name: String): js.UndefOr[String] = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    var headerize: js.Any = js.native
    
    var headers: js.Any = js.native
    
    def host: String = js.native
    def host_=(value: String): Unit = js.native
    
    var normal: js.Any = js.native
    
    def port: js.UndefOr[Double] = js.native
    def port_=(value: js.UndefOr[Double]): Unit = js.native
    
    var raw: js.Any = js.native
    
    def scheme: String = js.native
    def scheme_=(value: String): Unit = js.native
    
    def setHeader(name: String, value: js.Any): Unit = js.native
    
    def toRaw(): String = js.native
    
    def user: js.UndefOr[String] = js.native
    def user_=(value: js.UndefOr[String]): Unit = js.native
  }
}

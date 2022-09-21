package typings.sipJs

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.parametersMod.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriMod {
  
  @JSImport("sip.js/lib/grammar/uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sip.js/lib/grammar/uri", "URI")
  @js.native
  open class URI protected () extends Parameters {
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
    def this(scheme: Unit, user: String, host: String) = this()
    def this(scheme: String, user: String, host: String, port: Double) = this()
    def this(scheme: Unit, user: String, host: String, port: Double) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: String,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Double,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: StringDictionary[String | Double | Null],
      headers: StringDictionary[js.Array[String]]
    ) = this()
    def this(
      scheme: Unit,
      user: String,
      host: String,
      port: Unit,
      parameters: Unit,
      headers: StringDictionary[js.Array[String]]
    ) = this()
    
    /* private */ def _normal: Any = js.native
    
    /* private */ def _raw: Any = js.native
    
    /* private */ var _toString: Any = js.native
    
    def aor: String = js.native
    
    def clearHeaders(): Unit = js.native
    
    def deleteHeader(header: String): js.UndefOr[js.Array[String]] = js.native
    
    /* private */ var escapeUser: Any = js.native
    
    def getHeader(name: String): js.UndefOr[js.Array[String]] = js.native
    
    def hasHeader(name: String): Boolean = js.native
    
    /* private */ var headerize: Any = js.native
    
    var headers: StringDictionary[js.Array[String]] = js.native
    
    def host: String = js.native
    def host_=(value: String): Unit = js.native
    
    /* private */ var normal: Any = js.native
    
    def port: js.UndefOr[Double] = js.native
    def port_=(value: js.UndefOr[Double]): Unit = js.native
    
    /* private */ var raw: Any = js.native
    
    def scheme: String = js.native
    def scheme_=(value: String): Unit = js.native
    
    def setHeader(name: String, value: String): Unit = js.native
    def setHeader(name: String, value: js.Array[String]): Unit = js.native
    
    def toRaw(): String = js.native
    
    def user: js.UndefOr[String] = js.native
    def user_=(value: js.UndefOr[String]): Unit = js.native
  }
  
  inline def equivalentURI(a: URI, b: URI): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equivalentURI")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

package typings.regexpMatchIndices

import typings.regexpMatchIndices.regexpMatchIndicesStrings.`lazy`
import typings.regexpMatchIndices.regexpMatchIndicesStrings.`spec-compliant`
import typings.regexpMatchIndices.typesMod.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(regexp: js.RegExp, string: String): RegExpExecArray | Null = (^.asInstanceOf[js.Dynamic].apply(regexp.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[RegExpExecArray | Null]
  
  @JSImport("regexp-match-indices", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object config {
    
    @JSImport("regexp-match-indices", "config")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("regexp-match-indices", "config.mode")
    @js.native
    def mode: `lazy` | `spec-compliant` = js.native
    inline def mode_=(x: `lazy` | `spec-compliant`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("regexp-match-indices", "getPolyfill")
  @js.native
  def getPolyfill: js.Function0[
    js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null]
  ] = js.native
  inline def getPolyfill_=(
    x: js.Function0[
      js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getPolyfill")(x.asInstanceOf[js.Any])
  
  @JSImport("regexp-match-indices", "implementation")
  @js.native
  def implementation: js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null] = js.native
  inline def implementation_=(x: js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("implementation")(x.asInstanceOf[js.Any])
  
  @JSImport("regexp-match-indices", "native")
  @js.native
  def native: js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null] = js.native
  inline def native_=(x: js.ThisFunction1[/* this */ js.RegExp, /* string */ String, RegExpExecArray | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native")(x.asInstanceOf[js.Any])
  
  @JSImport("regexp-match-indices", "shim")
  @js.native
  def shim: js.Function0[Unit] = js.native
  inline def shim_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shim")(x.asInstanceOf[js.Any])
}

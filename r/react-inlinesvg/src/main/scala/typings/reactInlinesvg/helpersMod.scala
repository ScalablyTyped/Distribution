package typings.reactInlinesvg

import typings.reactInlinesvg.typesMod.PlainObject
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("react-inlinesvg/esm/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object STATUS {
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.FAILED")
    @js.native
    def FAILED: String = js.native
    inline def FAILED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.LOADED")
    @js.native
    def LOADED: String = js.native
    inline def LOADED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADED")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.LOADING")
    @js.native
    def LOADING: String = js.native
    inline def LOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADING")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.PENDING")
    @js.native
    def PENDING: String = js.native
    inline def PENDING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.READY")
    @js.native
    def READY: String = js.native
    inline def READY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READY")(x.asInstanceOf[js.Any])
    
    @JSImport("react-inlinesvg/esm/helpers", "STATUS.UNSUPPORTED")
    @js.native
    def UNSUPPORTED: String = js.native
    inline def UNSUPPORTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED")(x.asInstanceOf[js.Any])
  }
  
  inline def canUseDOM(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canUseDOM")().asInstanceOf[Boolean]
  
  inline def isSupportedEnvironment(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupportedEnvironment")().asInstanceOf[Boolean]
  
  inline def omit[T /* <: PlainObject[Any] */, K /* <: /* keyof T */ String */](input: T, filter: K*): Omit[T, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("omit")(List(input.asInstanceOf[js.Any]).`++`(filter.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Omit[T, K]]
  
  inline def randomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def supportsInlineSVG(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsInlineSVG")().asInstanceOf[Boolean]
}

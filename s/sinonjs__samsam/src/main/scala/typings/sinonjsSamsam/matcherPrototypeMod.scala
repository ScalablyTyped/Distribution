package typings.sinonjsSamsam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object matcherPrototypeMod {
  
  @JSImport("@sinonjs/samsam/types/create-matcher/matcher-prototype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and(valueOrMatcher: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(scala.List(valueOrMatcher.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def or(valueOrMatcher: Any, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(scala.List(valueOrMatcher.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
}

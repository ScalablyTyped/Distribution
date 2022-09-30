package typings.reduxRouter

import typings.history.mod.Pathname
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isActiveMod {
  
  @JSImport("redux-router/lib/isActive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pathname: Pathname): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(
    pathname: Pathname,
    query: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify H.Query */ Any,
    indexOnly: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(pathname: Pathname, query: Unit, indexOnly: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(pathname.asInstanceOf[js.Any], query.asInstanceOf[js.Any], indexOnly.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

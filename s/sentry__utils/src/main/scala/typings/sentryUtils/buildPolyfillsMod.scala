package typings.sentryUtils

import typings.sentryUtils.typesMod.GenericObject
import typings.sentryUtils.typesMod.RequireResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPolyfillsMod {
  
  @JSImport("@sentry/utils/types/buildPolyfills", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asyncNullishCoalesce(lhs: Any, rhsFn: js.Function0[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("_asyncNullishCoalesce")(lhs.asInstanceOf[js.Any], rhsFn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def asyncOptionalChain(ops: js.Array[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("_asyncOptionalChain")(ops.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def asyncOptionalChainDelete(ops: js.Array[Any]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("_asyncOptionalChainDelete")(ops.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def createNamedExportFrom(obj: GenericObject, localName: String, importedName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_createNamedExportFrom")(obj.asInstanceOf[js.Any], localName.asInstanceOf[js.Any], importedName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createStarExport(obj: GenericObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_createStarExport")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def interopDefault(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopDefault")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
  
  inline def interopNamespace(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopNamespace")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
  
  inline def interopNamespaceDefaultOnly(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopNamespaceDefaultOnly")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
  
  inline def interopRequireDefault(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopRequireDefault")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
  
  inline def interopRequireWildcard(requireResult: RequireResult): RequireResult = ^.asInstanceOf[js.Dynamic].applyDynamic("_interopRequireWildcard")(requireResult.asInstanceOf[js.Any]).asInstanceOf[RequireResult]
  
  inline def nullishCoalesce(lhs: Any, rhsFn: js.Function0[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("_nullishCoalesce")(lhs.asInstanceOf[js.Any], rhsFn.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def optionalChain(ops: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_optionalChain")(ops.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def optionalChainDelete(ops: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_optionalChainDelete")(ops.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

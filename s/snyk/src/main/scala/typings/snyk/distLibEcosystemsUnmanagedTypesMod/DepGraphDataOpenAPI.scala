package typings.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepGraphDataOpenAPI extends StObject {
  
  var graph: GraphOpenApi
  
  var pkg_manager: PkgManager
  
  var pkgs: js.Array[Pkg]
  
  var schema_version: String
}
object DepGraphDataOpenAPI {
  
  inline def apply(graph: GraphOpenApi, pkg_manager: PkgManager, pkgs: js.Array[Pkg], schema_version: String): DepGraphDataOpenAPI = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], pkg_manager = pkg_manager.asInstanceOf[js.Any], pkgs = pkgs.asInstanceOf[js.Any], schema_version = schema_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepGraphDataOpenAPI]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepGraphDataOpenAPI] (val x: Self) extends AnyVal {
    
    inline def setGraph(value: GraphOpenApi): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setPkg_manager(value: PkgManager): Self = StObject.set(x, "pkg_manager", value.asInstanceOf[js.Any])
    
    inline def setPkgs(value: js.Array[Pkg]): Self = StObject.set(x, "pkgs", value.asInstanceOf[js.Any])
    
    inline def setPkgsVarargs(value: Pkg*): Self = StObject.set(x, "pkgs", js.Array(value*))
    
    inline def setSchema_version(value: String): Self = StObject.set(x, "schema_version", value.asInstanceOf[js.Any])
  }
}

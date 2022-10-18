package typings.snyk

import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPruneMod {
  
  @JSImport("snyk/dist/lib/prune", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pruneGraph(
    depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any,
    packageManager: SupportedPackageManagers
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pruneGraph")(depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any
  ]]
  inline def pruneGraph(
    depGraph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any,
    packageManager: SupportedPackageManagers,
    pruneIsRequired: Boolean
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("pruneGraph")(depGraph.asInstanceOf[js.Any], packageManager.asInstanceOf[js.Any], pruneIsRequired.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DepGraph */ Any
  ]]
}

package typings.snyk

import org.scalablytyped.runtime.StringDictionary
import typings.snyk.distLibPackageManagersMod.SupportedPackageManagers
import typings.snyk.distLibTypesMod.PolicyOptions
import typings.snyk.snykStrings.cpp
import typings.snyk.snykStrings.docker
import typings.snyk.snykStrings.iac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPolicyFindAndLoadPolicyMod {
  
  @JSImport("snyk/dist/lib/policy/find-and-load-policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAndLoadPolicy(root: String, scanType: docker | iac | cpp, options: PolicyOptions): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: docker | iac | cpp,
    options: PolicyOptions,
    pkg: Unit,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(root: String, scanType: SupportedPackageManagers, options: PolicyOptions): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  inline def findAndLoadPolicy(
    root: String,
    scanType: SupportedPackageManagers,
    options: PolicyOptions,
    pkg: Unit,
    scannedProjectFolder: String
  ): js.Promise[js.UndefOr[Policy]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAndLoadPolicy")(root.asInstanceOf[js.Any], scanType.asInstanceOf[js.Any], options.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], scannedProjectFolder.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Policy]]]
  
  @js.native
  trait Policy extends StObject {
    
    var exclude: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
    
    def filter(vulns: Any): Any = js.native
    def filter(vulns: Any, root: String): Any = js.native
    def filter(vulns: Any, root: String, matchStrategy: String): Any = js.native
    def filter(vulns: Any, root: Unit, matchStrategy: String): Any = js.native
    
    var ignore: js.UndefOr[Any] = js.native
  }
}

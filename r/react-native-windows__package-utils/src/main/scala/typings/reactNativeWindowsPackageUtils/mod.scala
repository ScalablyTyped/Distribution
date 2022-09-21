package typings.reactNativeWindowsPackageUtils

import typings.reactNativeWindowsPackageUtils.anon.SearchPath
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-windows/package-utils/lib-commonjs/packageUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-windows/package-utils/lib-commonjs/packageUtils", "NpmPackage")
  @js.native
  open class NpmPackage protected () extends StObject {
    def this(pkgPath: String, pkgJson: Any) = this()
    
    def json: Any = js.native
    
    def path: String = js.native
    
    /* protected */ var pkgJson: Any = js.native
    
    /* private */ val pkgPath: Any = js.native
  }
  /* static members */
  object NpmPackage {
    
    @JSImport("@react-native-windows/package-utils/lib-commonjs/packageUtils", "NpmPackage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a NpmPackage from a given path to a package
      */
    inline def fromPath(pkgPath: String): js.Promise[NpmPackage | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(pkgPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NpmPackage | Null]]
  }
  
  @JSImport("@react-native-windows/package-utils/lib-commonjs/packageUtils", "WritableNpmPackage")
  @js.native
  open class WritableNpmPackage protected () extends NpmPackage {
    def this(pkgPath: String, pkgJson: Any) = this()
    
    /**
      * Assign properties to the package. Uses Object.assign semantics to assign
      * properties (i.e. shallow merge)
      *
      * @param props key/values to merge into the package.json
      */
    def assignProps(props: Record[String, Any]): js.Promise[Unit] = js.native
    
    /**
      * Assign properties to the package. Uses lodash merge semantics to assign
      * properties (i.e. deep merge instead of shallow)
      *
      * @param props key/values to merge into the package.json
      */
    def mergeProps(props: Record[String, Any]): js.Promise[Unit] = js.native
    
    /**
      * Set new JSON for the package from the given object
      */
    def setJson(jsonObj: Any): js.Promise[Unit] = js.native
  }
  /* static members */
  object WritableNpmPackage {
    
    @JSImport("@react-native-windows/package-utils/lib-commonjs/packageUtils", "WritableNpmPackage")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a WritableNpmPackage from a given path to a package
      */
    inline def fromPath(pkgPath: String): js.Promise[WritableNpmPackage | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")(pkgPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WritableNpmPackage | Null]]
  }
  
  inline def enumerateRepoPackages(): js.Promise[js.Array[WritableNpmPackage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRepoPackages")().asInstanceOf[js.Promise[js.Array[WritableNpmPackage]]]
  inline def enumerateRepoPackages(pred: js.Function1[/* pkg */ NpmPackage, js.Promise[Boolean]]): js.Promise[js.Array[WritableNpmPackage]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRepoPackages")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[WritableNpmPackage]]]
  
  inline def enumerateRepoPackagesSync(): js.Array[WritableNpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRepoPackagesSync")().asInstanceOf[js.Array[WritableNpmPackage]]
  inline def enumerateRepoPackagesSync(pred: js.Function1[/* pkg */ NpmPackage, Boolean]): js.Array[WritableNpmPackage] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateRepoPackagesSync")(pred.asInstanceOf[js.Any]).asInstanceOf[js.Array[WritableNpmPackage]]
  
  inline def findPackage(name: String): js.Promise[NpmPackage | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackage")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[NpmPackage | Null]]
  inline def findPackage(name: String, opts: SearchPath): js.Promise[NpmPackage | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPackage")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NpmPackage | Null]]
  
  inline def findRepoPackage(name: String): js.Promise[WritableNpmPackage | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("findRepoPackage")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WritableNpmPackage | Null]]
  
  inline def findRepoPackageSync(name: String): WritableNpmPackage | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("findRepoPackageSync")(name.asInstanceOf[js.Any]).asInstanceOf[WritableNpmPackage | Null]
}

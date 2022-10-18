package typings.reactNativeCommunityCliTools

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFindPackageDependencyDirMod {
  
  @JSImport("@react-native-community/cli-tools/build/findPackageDependencyDir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findPackageDependencyDir(ref: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageDependencyDir")(ref.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findPackageDependencyDir(ref: String, options: FindPackageDependencyOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPackageDependencyDir")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findPackageDependencyDir(ref: PackageRef): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPackageDependencyDir")(ref.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findPackageDependencyDir(ref: PackageRef, options: FindPackageDependencyOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findPackageDependencyDir")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def pickValues[T](obj: T, keys: js.Array[/* keyof T */ String]): js.UndefOr[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickValues")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Record[String, Any]]]
  inline def pickValues[T](obj: T, keys: js.Array[/* keyof T */ String], names: js.Array[String]): js.UndefOr[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("pickValues")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Record[String, Any]]]
  
  trait FindPackageDependencyOptions extends StObject {
    
    /**
      * Optional flag controlling whether symlinks can be found. Defaults to `true`.
      * When `false`, and the package dependency directory is a symlink, it will not
      * be found.
      */
    var allowSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional flag controlling whether to resolve symlinks. Defaults to `false`.
      * Note that this flag has no effect if `allowSymlinks` is `false`.
      */
    var resolveSymlinks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Optional starting directory for the search. Defaults to `process.cwd()`.
      */
    var startDir: js.UndefOr[String] = js.undefined
  }
  object FindPackageDependencyOptions {
    
    inline def apply(): FindPackageDependencyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindPackageDependencyOptions]
    }
    
    extension [Self <: FindPackageDependencyOptions](x: Self) {
      
      inline def setAllowSymlinks(value: Boolean): Self = StObject.set(x, "allowSymlinks", value.asInstanceOf[js.Any])
      
      inline def setAllowSymlinksUndefined: Self = StObject.set(x, "allowSymlinks", js.undefined)
      
      inline def setResolveSymlinks(value: Boolean): Self = StObject.set(x, "resolveSymlinks", value.asInstanceOf[js.Any])
      
      inline def setResolveSymlinksUndefined: Self = StObject.set(x, "resolveSymlinks", js.undefined)
      
      inline def setStartDir(value: String): Self = StObject.set(x, "startDir", value.asInstanceOf[js.Any])
      
      inline def setStartDirUndefined: Self = StObject.set(x, "startDir", js.undefined)
    }
  }
  
  trait PackageRef extends StObject {
    
    var name: String
    
    var scope: js.UndefOr[String] = js.undefined
  }
  object PackageRef {
    
    inline def apply(name: String): PackageRef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageRef]
    }
    
    extension [Self <: PackageRef](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}

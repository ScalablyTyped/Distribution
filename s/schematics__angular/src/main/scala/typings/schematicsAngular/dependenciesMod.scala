package typings.schematicsAngular

import typings.angularDevkitSchematics.mod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  @JSImport("@schematics/angular/utility/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait NodeDependencyType extends StObject
  @JSImport("@schematics/angular/utility/dependencies", "NodeDependencyType")
  @js.native
  object NodeDependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeDependencyType & String] = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with NodeDependencyType
    /* "dependencies" */ val Default: typings.schematicsAngular.dependenciesMod.NodeDependencyType.Default & String = js.native
    
    @js.native
    sealed trait Dev
      extends StObject
         with NodeDependencyType
    /* "devDependencies" */ val Dev: typings.schematicsAngular.dependenciesMod.NodeDependencyType.Dev & String = js.native
    
    @js.native
    sealed trait Optional
      extends StObject
         with NodeDependencyType
    /* "optionalDependencies" */ val Optional: typings.schematicsAngular.dependenciesMod.NodeDependencyType.Optional & String = js.native
    
    @js.native
    sealed trait Peer
      extends StObject
         with NodeDependencyType
    /* "peerDependencies" */ val Peer: typings.schematicsAngular.dependenciesMod.NodeDependencyType.Peer & String = js.native
  }
  
  inline def addPackageJsonDependency(tree: Tree, dependency: NodeDependency): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPackageJsonDependency")(tree.asInstanceOf[js.Any], dependency.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addPackageJsonDependency(tree: Tree, dependency: NodeDependency, pkgJsonPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPackageJsonDependency")(tree.asInstanceOf[js.Any], dependency.asInstanceOf[js.Any], pkgJsonPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPackageJsonDependency(tree: Tree, name: String): NodeDependency | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonDependency")(tree.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[NodeDependency | Null]
  inline def getPackageJsonDependency(tree: Tree, name: String, pkgJsonPath: String): NodeDependency | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPackageJsonDependency")(tree.asInstanceOf[js.Any], name.asInstanceOf[js.Any], pkgJsonPath.asInstanceOf[js.Any])).asInstanceOf[NodeDependency | Null]
  
  inline def removePackageJsonDependency(tree: Tree, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePackageJsonDependency")(tree.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removePackageJsonDependency(tree: Tree, name: String, pkgJsonPath: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removePackageJsonDependency")(tree.asInstanceOf[js.Any], name.asInstanceOf[js.Any], pkgJsonPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait NodeDependency extends StObject {
    
    var name: String
    
    var overwrite: js.UndefOr[Boolean] = js.undefined
    
    var `type`: NodeDependencyType
    
    var version: String
  }
  object NodeDependency {
    
    inline def apply(name: String, `type`: NodeDependencyType, version: String): NodeDependency = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeDependency]
    }
    
    extension [Self <: NodeDependency](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
      
      inline def setType(value: NodeDependencyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}

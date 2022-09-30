package typings.schematicsAngular

import typings.angularDevkitSchematics.interfaceMod.Rule
import typings.angularDevkitSchematics.mod.Tree
import typings.schematicsAngular.anon.Existing
import typings.schematicsAngular.workspaceMod.WorkspaceDefinition
import typings.schematicsAngular.workspaceModelsMod.Builders
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityMod {
  
  @JSImport("@schematics/angular/utility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@schematics/angular/utility", "AngularBuilder")
  @js.native
  object AngularBuilder extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Builders & String] = js.native
    
    /* "@angular-devkit/build-angular:app-shell" */ val AppShell: typings.schematicsAngular.workspaceModelsMod.Builders.AppShell & String = js.native
    
    /* "@angular-devkit/build-angular:browser" */ val Browser: typings.schematicsAngular.workspaceModelsMod.Builders.Browser & String = js.native
    
    /* "@angular-devkit/build-ng-packagr:build" */ val DeprecatedNgPackagr: typings.schematicsAngular.workspaceModelsMod.Builders.DeprecatedNgPackagr & String = js.native
    
    /* "@angular-devkit/build-angular:dev-server" */ val DevServer: typings.schematicsAngular.workspaceModelsMod.Builders.DevServer & String = js.native
    
    /* "@angular-devkit/build-angular:extract-i18n" */ val ExtractI18n: typings.schematicsAngular.workspaceModelsMod.Builders.ExtractI18n & String = js.native
    
    /* "@angular-devkit/build-angular:karma" */ val Karma: typings.schematicsAngular.workspaceModelsMod.Builders.Karma & String = js.native
    
    /* "@angular-devkit/build-angular:ng-packagr" */ val NgPackagr: typings.schematicsAngular.workspaceModelsMod.Builders.NgPackagr & String = js.native
    
    /* "@angular-devkit/build-angular:protractor" */ val Protractor: typings.schematicsAngular.workspaceModelsMod.Builders.Protractor & String = js.native
    
    /* "@angular-devkit/build-angular:server" */ val Server: typings.schematicsAngular.workspaceModelsMod.Builders.Server & String = js.native
    
    /* "@angular-devkit/build-angular:tslint" */ val TsLint: typings.schematicsAngular.workspaceModelsMod.Builders.TsLint & String = js.native
  }
  
  @JSImport("@schematics/angular/utility", "DependencyType")
  @js.native
  object DependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.schematicsAngular.dependencyMod.DependencyType & String] = js.native
    
    /* "dependencies" */ val Default: typings.schematicsAngular.dependencyMod.DependencyType.Default & String = js.native
    
    /* "devDependencies" */ val Dev: typings.schematicsAngular.dependencyMod.DependencyType.Dev & String = js.native
    
    /* "peerDependencies" */ val Peer: typings.schematicsAngular.dependencyMod.DependencyType.Peer & String = js.native
  }
  
  @JSImport("@schematics/angular/utility", "ExistingBehavior")
  @js.native
  object ExistingBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.schematicsAngular.dependencyMod.ExistingBehavior & Double] = js.native
    
    /* 1 */ val Replace: typings.schematicsAngular.dependencyMod.ExistingBehavior.Replace & Double = js.native
    
    /* 0 */ val Skip: typings.schematicsAngular.dependencyMod.ExistingBehavior.Skip & Double = js.native
  }
  
  @JSImport("@schematics/angular/utility", "InstallBehavior")
  @js.native
  object InstallBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.schematicsAngular.dependencyMod.InstallBehavior & Double] = js.native
    
    /* 2 */ val Always: typings.schematicsAngular.dependencyMod.InstallBehavior.Always & Double = js.native
    
    /* 1 */ val Auto: typings.schematicsAngular.dependencyMod.InstallBehavior.Auto & Double = js.native
    
    /* 0 */ val None: typings.schematicsAngular.dependencyMod.InstallBehavior.None & Double = js.native
  }
  
  inline def addDependency(name: String, specifier: String): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def addDependency(name: String, specifier: String, options: Existing): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
  
  inline def readWorkspace(tree: Tree): js.Promise[WorkspaceDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WorkspaceDefinition]]
  inline def readWorkspace(tree: Tree, path: String): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("readWorkspace")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  
  inline def updateWorkspace(
    updater: js.Function1[/* workspace */ WorkspaceDefinition, Unit | Rule | (PromiseLike[Unit | Rule])]
  ): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspace")(updater.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}

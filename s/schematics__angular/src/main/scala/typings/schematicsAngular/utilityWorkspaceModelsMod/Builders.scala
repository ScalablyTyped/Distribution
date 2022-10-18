package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Builders extends StObject
@JSImport("@schematics/angular/utility/workspace-models", "Builders")
@js.native
object Builders extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Builders & String] = js.native
  
  @js.native
  sealed trait AppShell
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:app-shell" */ val AppShell: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.AppShell & String = js.native
  
  @js.native
  sealed trait Browser
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:browser" */ val Browser: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.Browser & String = js.native
  
  @js.native
  sealed trait DeprecatedNgPackagr
    extends StObject
       with Builders
  /* "@angular-devkit/build-ng-packagr:build" */ val DeprecatedNgPackagr: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.DeprecatedNgPackagr & String = js.native
  
  @js.native
  sealed trait DevServer
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:dev-server" */ val DevServer: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.DevServer & String = js.native
  
  @js.native
  sealed trait ExtractI18n
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:extract-i18n" */ val ExtractI18n: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.ExtractI18n & String = js.native
  
  @js.native
  sealed trait Karma
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:karma" */ val Karma: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.Karma & String = js.native
  
  @js.native
  sealed trait NgPackagr
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:ng-packagr" */ val NgPackagr: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.NgPackagr & String = js.native
  
  @js.native
  sealed trait Protractor
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:protractor" */ val Protractor: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.Protractor & String = js.native
  
  @js.native
  sealed trait Server
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:server" */ val Server: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.Server & String = js.native
  
  @js.native
  sealed trait TsLint
    extends StObject
       with Builders
  /* "@angular-devkit/build-angular:tslint" */ val TsLint: typings.schematicsAngular.utilityWorkspaceModelsMod.Builders.TsLint & String = js.native
}

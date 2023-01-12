package typings.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceTargets[TProjectType /* <: ProjectType */]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var `app-shell`: js.UndefOr[AppShellBuilderTarget] = js.undefined
  
  var build: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: TProjectType extends @schematics/angular.@schematics/angular/utility/workspace-models.ProjectType.Library ? @schematics/angular.@schematics/angular/utility/workspace-models.LibraryBuilderTarget : @schematics/angular.@schematics/angular/utility/workspace-models.BrowserBuilderTarget */ js.Any
  ] = js.undefined
  
  var e2e: js.UndefOr[E2EBuilderTarget] = js.undefined
  
  var `extract-i18n`: js.UndefOr[ExtractI18nBuilderTarget] = js.undefined
  
  var serve: js.UndefOr[ServeBuilderTarget] = js.undefined
  
  var server: js.UndefOr[ServerBuilderTarget] = js.undefined
  
  var test: js.UndefOr[TestBuilderTarget] = js.undefined
}
object WorkspaceTargets {
  
  inline def apply[TProjectType /* <: ProjectType */](): WorkspaceTargets[TProjectType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceTargets[TProjectType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkspaceTargets[?], TProjectType /* <: ProjectType */] (val x: Self & WorkspaceTargets[TProjectType]) extends AnyVal {
    
    inline def `setApp-shell`(value: AppShellBuilderTarget): Self = StObject.set(x, "app-shell", value.asInstanceOf[js.Any])
    
    inline def `setApp-shellUndefined`: Self = StObject.set(x, "app-shell", js.undefined)
    
    inline def setBuild(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TProjectType extends @schematics/angular.@schematics/angular/utility/workspace-models.ProjectType.Library ? @schematics/angular.@schematics/angular/utility/workspace-models.LibraryBuilderTarget : @schematics/angular.@schematics/angular/utility/workspace-models.BrowserBuilderTarget */ js.Any
    ): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
    
    inline def setE2e(value: E2EBuilderTarget): Self = StObject.set(x, "e2e", value.asInstanceOf[js.Any])
    
    inline def setE2eUndefined: Self = StObject.set(x, "e2e", js.undefined)
    
    inline def `setExtract-i18n`(value: ExtractI18nBuilderTarget): Self = StObject.set(x, "extract-i18n", value.asInstanceOf[js.Any])
    
    inline def `setExtract-i18nUndefined`: Self = StObject.set(x, "extract-i18n", js.undefined)
    
    inline def setServe(value: ServeBuilderTarget): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
    
    inline def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
    
    inline def setServer(value: ServerBuilderTarget): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setTest(value: TestBuilderTarget): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}

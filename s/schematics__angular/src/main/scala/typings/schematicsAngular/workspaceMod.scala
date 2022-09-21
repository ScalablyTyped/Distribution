package typings.schematicsAngular

import typings.angularDevkitCore.utilsMod.JsonValue
import typings.angularDevkitSchematics.interfaceMod.Rule
import typings.angularDevkitSchematics.mod.Tree
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workspaceMod {
  
  @JSImport("@schematics/angular/utility/workspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allTargetOptions(target: typings.angularDevkitCore.definitionsMod.TargetDefinition): js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTargetOptions")(target.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]]]
  inline def allTargetOptions(target: typings.angularDevkitCore.definitionsMod.TargetDefinition, skipBaseOptions: Boolean): js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allTargetOptions")(target.asInstanceOf[js.Any], skipBaseOptions.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]]]
  
  inline def allWorkspaceTargets(workspace: typings.angularDevkitCore.definitionsMod.WorkspaceDefinition): js.Iterable[
    js.Tuple4[
      String, 
      typings.angularDevkitCore.definitionsMod.TargetDefinition, 
      String, 
      typings.angularDevkitCore.definitionsMod.ProjectDefinition
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allWorkspaceTargets")(workspace.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[
    js.Tuple4[
      String, 
      typings.angularDevkitCore.definitionsMod.TargetDefinition, 
      String, 
      typings.angularDevkitCore.definitionsMod.ProjectDefinition
    ]
  ]]
  
  inline def buildDefaultPath(project: typings.angularDevkitCore.definitionsMod.ProjectDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDefaultPath")(project.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createDefaultPath(tree: Tree, projectName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultPath")(tree.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getWorkspace(tree: Tree): js.Promise[WorkspaceDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WorkspaceDefinition]]
  inline def getWorkspace(tree: Tree, path: String): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  
  inline def updateWorkspace(
    updater: js.Function1[/* workspace */ WorkspaceDefinition, Unit | Rule | (js.Thenable[Unit | Rule])]
  ): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspace")(updater.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type ProjectDefinition = typings.angularDevkitCore.definitionsMod.ProjectDefinition
  
  type TargetDefinition = typings.angularDevkitCore.definitionsMod.TargetDefinition
  
  type WorkspaceDefinition = typings.angularDevkitCore.definitionsMod.WorkspaceDefinition
}

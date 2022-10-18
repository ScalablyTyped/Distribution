package typings.schematicsAngular

import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitSchematics.mod.Tree
import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.std.PromiseLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityWorkspaceMod {
  
  @JSImport("@schematics/angular/utility/workspace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allTargetOptions(target: typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition): js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allTargetOptions")(target.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]]]
  inline def allTargetOptions(
    target: typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition,
    skipBaseOptions: Boolean
  ): js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allTargetOptions")(target.asInstanceOf[js.Any], skipBaseOptions.asInstanceOf[js.Any])).asInstanceOf[js.Iterable[js.Tuple2[js.UndefOr[String], Record[String, js.UndefOr[JsonValue]]]]]
  
  inline def allWorkspaceTargets(workspace: typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition): js.Iterable[
    js.Tuple4[
      String, 
      typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition, 
      String, 
      typings.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allWorkspaceTargets")(workspace.asInstanceOf[js.Any]).asInstanceOf[js.Iterable[
    js.Tuple4[
      String, 
      typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition, 
      String, 
      typings.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition
    ]
  ]]
  
  inline def buildDefaultPath(project: typings.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDefaultPath")(project.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createDefaultPath(tree: Tree, projectName: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultPath")(tree.asInstanceOf[js.Any], projectName.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def getWorkspace(tree: Tree): js.Promise[WorkspaceDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(tree.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WorkspaceDefinition]]
  inline def getWorkspace(tree: Tree, path: String): js.Promise[WorkspaceDefinition] = (^.asInstanceOf[js.Dynamic].applyDynamic("getWorkspace")(tree.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WorkspaceDefinition]]
  
  inline def updateWorkspace(
    updater: js.Function1[/* workspace */ WorkspaceDefinition, Unit | Rule | (PromiseLike[Unit | Rule])]
  ): Rule = ^.asInstanceOf[js.Dynamic].applyDynamic("updateWorkspace")(updater.asInstanceOf[js.Any]).asInstanceOf[Rule]
  
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def writeWorkspace(tree: Tree, workspace: WorkspaceDefinition, path: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeWorkspace")(tree.asInstanceOf[js.Any], workspace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  type ProjectDefinition = typings.angularDevkitCore.srcWorkspaceDefinitionsMod.ProjectDefinition
  
  type TargetDefinition = typings.angularDevkitCore.srcWorkspaceDefinitionsMod.TargetDefinition
  
  type WorkspaceDefinition = typings.angularDevkitCore.srcWorkspaceDefinitionsMod.WorkspaceDefinition
}

package typings.pulumiPulumi

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.automationStackMod.Stack
import typings.pulumiPulumi.projectSettingsMod.ProjectSettings
import typings.pulumiPulumi.stackSettingsMod.StackSettings
import typings.pulumiPulumi.workspaceMod.PulumiFn
import typings.pulumiPulumi.workspaceMod.Workspace
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localWorkspaceMod {
  
  @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace")
  @js.native
  class LocalWorkspace protected () extends Workspace {
    
    var ready: js.Any = js.native
    
    var runPulumiCmd: js.Any = js.native
  }
  /* static members */
  object LocalWorkspace {
    
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a workspace using the specified options. Used for maximal control and customization
      * of the underlying environment before any stacks are created or selected.
      *
      * @param opts Options used to configure the Workspace
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.create")
    @js.native
    def create(opts: LocalWorkspaceOptions): js.Promise[LocalWorkspace] = js.native
    
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings will be created
      * on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory will default
      * to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createOrSelectStack")
    @js.native
    def createOrSelectStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createOrSelectStack")
    @js.native
    def createOrSelectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
    /**
      * Creates or selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi CLI program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createOrSelectStack")
    @js.native
    def createOrSelectStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createOrSelectStack")
    @js.native
    def createOrSelectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
    
    /**
      * Creates a Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createStack")
    @js.native
    def createStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createStack")
    @js.native
    def createStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
    /**
      * Creates a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createStack")
    @js.native
    def createStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.createStack")
    @js.native
    def createStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
    
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.inlineSourceStackHelper")
    @js.native
    def inlineSourceStackHelper: js.Any = js.native
    @scala.inline
    def inlineSourceStackHelper_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineSourceStackHelper")(x.asInstanceOf[js.Any])
    
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.localSourceStackHelper")
    @js.native
    def localSourceStackHelper: js.Any = js.native
    @scala.inline
    def localSourceStackHelper_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localSourceStackHelper")(x.asInstanceOf[js.Any])
    
    /**
      * Selects an existing Stack with a LocalWorkspace utilizing the specified inline (in process) Pulumi program.
      * This program is fully debuggable and runs in process. If no Project option is specified, default project settings
      * will be created on behalf of the user. Similarly, unless a `workDir` option is specified, the working directory
      * will default to a new temporary directory provided by the OS.
      *
      * @param args A set of arguments to intialize a Stack with and inline `PulumiFn` program that runs in process.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.selectStack")
    @js.native
    def selectStack(args: InlineProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.selectStack")
    @js.native
    def selectStack(args: InlineProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
    /**
      * Selects a Stack with a LocalWorkspace utilizing the local Pulumi CLI program from the specified workDir.
      * This is a way to create drivers on top of pre-existing Pulumi programs. This Workspace will pick up
      * any available Settings files (Pulumi.yaml, Pulumi.<stack>.yaml).
      *
      * @param args A set of arguments to intialize a Stack with a pre-configured Pulumi CLI program that already exists on disk.
      * @param opts Additional customizations to be applied to the Workspace.
      */
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.selectStack")
    @js.native
    def selectStack(args: LocalProgramArgs): js.Promise[Stack] = js.native
    @JSImport("@pulumi/pulumi/x/automation/localWorkspace", "LocalWorkspace.selectStack")
    @js.native
    def selectStack(args: LocalProgramArgs, opts: LocalWorkspaceOptions): js.Promise[Stack] = js.native
  }
  
  @js.native
  trait InlineProgramArgs extends StObject {
    
    /**
      * The inline (in process) Pulumi program to use with Update and Preview operations.
      */
    def program(): js.Promise[(Record[String, _]) | Unit] = js.native
    /**
      * The inline (in process) Pulumi program to use with Update and Preview operations.
      */
    @JSName("program")
    var program_Original: PulumiFn = js.native
    
    /**
      * The name of the associated project
      */
    var projectName: String = js.native
    
    /**
      * The name of the associated Stack
      */
    var stackName: String = js.native
  }
  
  @js.native
  trait LocalProgramArgs extends StObject {
    
    var stackName: String = js.native
    
    var workDir: String = js.native
  }
  object LocalProgramArgs {
    
    @scala.inline
    def apply(stackName: String, workDir: String): LocalProgramArgs = {
      val __obj = js.Dynamic.literal(stackName = stackName.asInstanceOf[js.Any], workDir = workDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalProgramArgs]
    }
    
    @scala.inline
    implicit class LocalProgramArgsMutableBuilder[Self <: LocalProgramArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStackName(value: String): Self = StObject.set(x, "stackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkDir(value: String): Self = StObject.set(x, "workDir", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LocalWorkspaceOptions extends StObject {
    
    /**
      * Environment values scoped to the current workspace. These will be supplied to every Pulumi command.
      */
    var envVars: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      *  The inline program `PulumiFn` to be used for Preview/Update operations if any.
      *  If none is specified, the stack will refer to ProjectSettings for this information.
      */
    var program: js.UndefOr[PulumiFn] = js.native
    
    /**
      * The settings object for the current project.
      */
    var projectSettings: js.UndefOr[ProjectSettings] = js.native
    
    /**
      * The directory to override for CLI metadata
      */
    var pulumiHome: js.UndefOr[String] = js.native
    
    /**
      * The secrets provider to use for encryption and decryption of stack secrets.
      * See: https://www.pulumi.com/docs/intro/concepts/config/#available-encryption-providers
      */
    var secretsProvider: js.UndefOr[String] = js.native
    
    /**
      * A map of Stack names and corresponding settings objects.
      */
    var stackSettings: js.UndefOr[StringDictionary[StackSettings]] = js.native
    
    /**
      * The directory to run Pulumi commands and read settings (Pulumi.yaml and Pulumi.<stack>.yaml)l.
      */
    var workDir: js.UndefOr[String] = js.native
  }
  object LocalWorkspaceOptions {
    
    @scala.inline
    def apply(): LocalWorkspaceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalWorkspaceOptions]
    }
    
    @scala.inline
    implicit class LocalWorkspaceOptionsMutableBuilder[Self <: LocalWorkspaceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvVars(value: StringDictionary[String]): Self = StObject.set(x, "envVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvVarsUndefined: Self = StObject.set(x, "envVars", js.undefined)
      
      @scala.inline
      def setProgram(value: () => js.Promise[(Record[String, js.Any]) | Unit]): Self = StObject.set(x, "program", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      @scala.inline
      def setProjectSettings(value: ProjectSettings): Self = StObject.set(x, "projectSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectSettingsUndefined: Self = StObject.set(x, "projectSettings", js.undefined)
      
      @scala.inline
      def setPulumiHome(value: String): Self = StObject.set(x, "pulumiHome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulumiHomeUndefined: Self = StObject.set(x, "pulumiHome", js.undefined)
      
      @scala.inline
      def setSecretsProvider(value: String): Self = StObject.set(x, "secretsProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretsProviderUndefined: Self = StObject.set(x, "secretsProvider", js.undefined)
      
      @scala.inline
      def setStackSettings(value: StringDictionary[StackSettings]): Self = StObject.set(x, "stackSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackSettingsUndefined: Self = StObject.set(x, "stackSettings", js.undefined)
      
      @scala.inline
      def setWorkDir(value: String): Self = StObject.set(x, "workDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkDirUndefined: Self = StObject.set(x, "workDir", js.undefined)
    }
  }
}

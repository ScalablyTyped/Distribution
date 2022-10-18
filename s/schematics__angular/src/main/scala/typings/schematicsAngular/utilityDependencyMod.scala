package typings.schematicsAngular

import typings.angularDevkitSchematics.srcEngineInterfaceMod.Rule
import typings.schematicsAngular.anon.Existing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilityDependencyMod {
  
  @JSImport("@schematics/angular/utility/dependency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DependencyType extends StObject
  @JSImport("@schematics/angular/utility/dependency", "DependencyType")
  @js.native
  object DependencyType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[DependencyType & String] = js.native
    
    @js.native
    sealed trait Default
      extends StObject
         with DependencyType
    /* "dependencies" */ val Default: typings.schematicsAngular.utilityDependencyMod.DependencyType.Default & String = js.native
    
    @js.native
    sealed trait Dev
      extends StObject
         with DependencyType
    /* "devDependencies" */ val Dev: typings.schematicsAngular.utilityDependencyMod.DependencyType.Dev & String = js.native
    
    @js.native
    sealed trait Peer
      extends StObject
         with DependencyType
    /* "peerDependencies" */ val Peer: typings.schematicsAngular.utilityDependencyMod.DependencyType.Peer & String = js.native
  }
  
  @js.native
  sealed trait ExistingBehavior extends StObject
  @JSImport("@schematics/angular/utility/dependency", "ExistingBehavior")
  @js.native
  object ExistingBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ExistingBehavior & Double] = js.native
    
    /**
      * The dependency's existing specifier will be replaced with the specifier provided in the
      * {@link addDependency} call. A warning will also be shown during schematic execution to
      * notify the user of the replacement.
      */
    @js.native
    sealed trait Replace
      extends StObject
         with ExistingBehavior
    /* 1 */ val Replace: typings.schematicsAngular.utilityDependencyMod.ExistingBehavior.Replace & Double = js.native
    
    /**
      * The dependency will not be added or otherwise changed if it already exists.
      */
    @js.native
    sealed trait Skip
      extends StObject
         with ExistingBehavior
    /* 0 */ val Skip: typings.schematicsAngular.utilityDependencyMod.ExistingBehavior.Skip & Double = js.native
  }
  
  @js.native
  sealed trait InstallBehavior extends StObject
  @JSImport("@schematics/angular/utility/dependency", "InstallBehavior")
  @js.native
  object InstallBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InstallBehavior & Double] = js.native
    
    /**
      * Always schedule a {@link NodePackageInstallTask} when the rule is executed.
      */
    @js.native
    sealed trait Always
      extends StObject
         with InstallBehavior
    /* 2 */ val Always: typings.schematicsAngular.utilityDependencyMod.InstallBehavior.Always & Double = js.native
    
    /**
      * Automatically determine the need to schedule a {@link NodePackageInstallTask} based on
      * previous usage of the {@link addDependency} within the schematic.
      */
    @js.native
    sealed trait Auto
      extends StObject
         with InstallBehavior
    /* 1 */ val Auto: typings.schematicsAngular.utilityDependencyMod.InstallBehavior.Auto & Double = js.native
    
    /**
      * No installation will occur as a result of the rule when specified.
      *
      * NOTE: This does not prevent other rules from scheduling a {@link NodePackageInstallTask}
      * which may install the dependency.
      */
    @js.native
    sealed trait None
      extends StObject
         with InstallBehavior
    /* 0 */ val None: typings.schematicsAngular.utilityDependencyMod.InstallBehavior.None & Double = js.native
  }
  
  inline def addDependency(name: String, specifier: String): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any])).asInstanceOf[Rule]
  inline def addDependency(name: String, specifier: String, options: Existing): Rule = (^.asInstanceOf[js.Dynamic].applyDynamic("addDependency")(name.asInstanceOf[js.Any], specifier.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Rule]
}

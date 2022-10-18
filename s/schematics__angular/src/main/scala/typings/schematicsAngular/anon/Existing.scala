package typings.schematicsAngular.anon

import typings.schematicsAngular.utilityDependencyMod.DependencyType
import typings.schematicsAngular.utilityDependencyMod.ExistingBehavior
import typings.schematicsAngular.utilityDependencyMod.InstallBehavior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Existing extends StObject {
  
  /**
    * The behavior to use when the dependency already exists within the `package.json`.
    * Defaults to {@link ExistingBehavior.Replace}.
    */
  var existing: js.UndefOr[ExistingBehavior] = js.undefined
  
  /**
    * The dependency installation behavior to use to determine whether a
    * {@link NodePackageInstallTask} should be scheduled after adding the dependency.
    * Defaults to {@link InstallBehavior.Auto}.
    */
  var install: js.UndefOr[InstallBehavior] = js.undefined
  
  /**
    * The path of the package manifest file (`package.json`) that will be modified.
    * Defaults to `/package.json`.
    */
  var packageJsonPath: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the dependency determines the section of the `package.json` to which the
    * dependency will be added. Defaults to {@link DependencyType.Default} (`dependencies`).
    */
  var `type`: js.UndefOr[DependencyType] = js.undefined
}
object Existing {
  
  inline def apply(): Existing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Existing]
  }
  
  extension [Self <: Existing](x: Self) {
    
    inline def setExisting(value: ExistingBehavior): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    inline def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    inline def setInstall(value: InstallBehavior): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
    
    inline def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
    
    inline def setPackageJsonPath(value: String): Self = StObject.set(x, "packageJsonPath", value.asInstanceOf[js.Any])
    
    inline def setPackageJsonPathUndefined: Self = StObject.set(x, "packageJsonPath", js.undefined)
    
    inline def setType(value: DependencyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

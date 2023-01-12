package typings.snyk.anon

import typings.snyk.distLibTypesMod.DepTree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsFromContainer extends StObject {
  
  var isFromContainer: Boolean
  
  var packageInfo: js.UndefOr[DepTree] = js.undefined
  
  var scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
}
object IsFromContainer {
  
  inline def apply(
    isFromContainer: Boolean,
    scannedProject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
  ): IsFromContainer = {
    val __obj = js.Dynamic.literal(isFromContainer = isFromContainer.asInstanceOf[js.Any], scannedProject = scannedProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFromContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsFromContainer] (val x: Self) extends AnyVal {
    
    inline def setIsFromContainer(value: Boolean): Self = StObject.set(x, "isFromContainer", value.asInstanceOf[js.Any])
    
    inline def setPackageInfo(value: DepTree): Self = StObject.set(x, "packageInfo", value.asInstanceOf[js.Any])
    
    inline def setPackageInfoUndefined: Self = StObject.set(x, "packageInfo", js.undefined)
    
    inline def setScannedProject(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScannedProject */ Any
    ): Self = StObject.set(x, "scannedProject", value.asInstanceOf[js.Any])
  }
}

package typings.storybookStore.anon

import typings.storybookStore.distTs3Dot9TypesMod.CSFFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsfFileCSFFile[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] extends StObject {
  
  var csfFile: CSFFile[TFramework]
}
object CsfFileCSFFile {
  
  inline def apply[TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */](csfFile: CSFFile[TFramework]): CsfFileCSFFile[TFramework] = {
    val __obj = js.Dynamic.literal(csfFile = csfFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsfFileCSFFile[TFramework]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsfFileCSFFile[?], TFramework /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnyFramework */ Any */] (val x: Self & CsfFileCSFFile[TFramework]) extends AnyVal {
    
    inline def setCsfFile(value: CSFFile[TFramework]): Self = StObject.set(x, "csfFile", value.asInstanceOf[js.Any])
  }
}

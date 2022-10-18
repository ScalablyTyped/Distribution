package typings.reactSketchapp

import typings.reactSketchapp.libModuleTypesMod.SketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsSketchJsonFromSJSONMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/sketchJson/fromSJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSJSON(
    jsonTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyLayer */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any
  ): SketchLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSJSON")(jsonTree.asInstanceOf[js.Any]).asInstanceOf[SketchLayer]
  inline def fromSJSON(
    jsonTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyLayer */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any,
    version: String
  ): SketchLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("fromSJSON")(jsonTree.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[SketchLayer]
}

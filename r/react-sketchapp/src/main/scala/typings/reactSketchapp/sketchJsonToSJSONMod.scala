package typings.reactSketchapp

import typings.reactSketchapp.moduleTypesMod.SketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sketchJsonToSJSONMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/sketchJson/toSJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toSJSON(sketchObject: SketchLayer): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toSJSON")(sketchObject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any) | Null]
}

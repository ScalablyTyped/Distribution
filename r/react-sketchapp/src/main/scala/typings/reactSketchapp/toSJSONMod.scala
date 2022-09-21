package typings.reactSketchapp

import typings.reactSketchapp.libTypesMod.SketchLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toSJSONMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/sketchJson/toSJSON", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toSJSON(sketchObject: SketchLayer): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toSJSON")(sketchObject.asInstanceOf[js.Any]).asInstanceOf[(/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.AnyObject */ Any) | Null]
}

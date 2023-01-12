package typings.snyk.anon

import typings.snyk.distLibPluginsRubygemsInspectorsMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgemfile extends StObject {
  
  def canHandle(file: String): Boolean
  
  def gatherSpecs(root: String, target: String, options: typings.snyk.distLibPluginsTypesMod.Options): js.Promise[Spec]
}
object Typeofgemfile {
  
  inline def apply(
    canHandle: String => Boolean,
    gatherSpecs: (String, String, typings.snyk.distLibPluginsTypesMod.Options) => js.Promise[Spec]
  ): Typeofgemfile = {
    val __obj = js.Dynamic.literal(canHandle = js.Any.fromFunction1(canHandle), gatherSpecs = js.Any.fromFunction3(gatherSpecs))
    __obj.asInstanceOf[Typeofgemfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofgemfile] (val x: Self) extends AnyVal {
    
    inline def setCanHandle(value: String => Boolean): Self = StObject.set(x, "canHandle", js.Any.fromFunction1(value))
    
    inline def setGatherSpecs(value: (String, String, typings.snyk.distLibPluginsTypesMod.Options) => js.Promise[Spec]): Self = StObject.set(x, "gatherSpecs", js.Any.fromFunction3(value))
  }
}

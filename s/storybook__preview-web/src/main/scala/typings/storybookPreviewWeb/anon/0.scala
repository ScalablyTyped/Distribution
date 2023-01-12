package typings.storybookPreviewWeb.anon

import typings.storybookPreviewWeb.distTs3Dot9PreviewMod.MaybePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def getProjectAnnotations(): MaybePromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ]
}
object `0` {
  
  inline def apply(
    getProjectAnnotations: () => MaybePromise[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
    ]
  ): `0` = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = js.Any.fromFunction0(getProjectAnnotations))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setGetProjectAnnotations(
      value: () => MaybePromise[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
        ]
    ): Self = StObject.set(x, "getProjectAnnotations", js.Any.fromFunction0(value))
  }
}
